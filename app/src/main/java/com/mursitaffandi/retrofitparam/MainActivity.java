package com.mursitaffandi.retrofitparam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.mursitaffandi.retrofitparam.model.Item;
import com.mursitaffandi.retrofitparam.model.StackOverFlow;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
Button btnFetch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFetch = (Button) findViewById(R.id.btnProses);
        btnFetch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fetchStackOverFlow(
                        "desc",
                        "android",
                        "stackoverflow",
                        "activity"
                );
            }
        });
    }

    private void fetchStackOverFlow(
            String Order,
            String Tag,
            String Site,
            String Sort
    ){
//        Create Service
        StackExchangeAPI exchangeAPI = StackExchangeAPI.client.create(StackExchangeAPI.class);

        // create parameter request GET
        Call<StackOverFlow> call = exchangeAPI.getQeustion(Order, Sort, Tag, Site);

        call.enqueue(new Callback<StackOverFlow>() {
            @Override
            public void onResponse(Call<StackOverFlow> call, Response<StackOverFlow> response) {
                StackOverFlow stackOverFlow = response.body();
                List<Item> items = stackOverFlow.getItems();
                Item item = items.get(0);
                Log.d("Main", item.toString());
            }

            @Override
            public void onFailure(Call<StackOverFlow> call, Throwable t) {

            }
        });
    }
}
