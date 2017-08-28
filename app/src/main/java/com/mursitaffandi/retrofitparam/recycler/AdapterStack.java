package com.mursitaffandi.retrofitparam.recycler;

import android.content.Context;
import android.content.pm.LabeledIntent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mursitaffandi.retrofitparam.R;
import com.mursitaffandi.retrofitparam.model.Item;

import java.util.List;

/**
 * Created by Ingat Mati on 23/08/2017.
 */

public class AdapterStack extends RecyclerView.Adapter<AdapterStack.ViewHolderIN> {

    private final RecyclerView.OnItemTouchListener mPasdiDemok;
    private List<Item> mItem;
    private Context mContext;

    public AdapterStack(RecyclerView.OnItemTouchListener mPasdiDemok, List<Item> mItem, Context mContext) {
        this.mPasdiDemok = mPasdiDemok;
        this.mItem = mItem;
        this.mContext = mContext;
    }

    @Override
    public AdapterStack.ViewHolderIN onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_stack, null);
        return new ViewHolderIN(v);
    }

    @Override
    public void onBindViewHolder(AdapterStack.ViewHolderIN holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolderIN extends RecyclerView.ViewHolder {
        public ViewHolderIN(View itemView) {
            super(itemView);
        }
    }
}
