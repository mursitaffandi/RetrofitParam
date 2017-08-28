
package com.mursitaffandi.retrofitparam.model;

import java.util.ArrayList;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StackOverFlow implements Parcelable
{

    @SerializedName("items")
    @Expose
    private List<Item> items = new ArrayList<Item>();
    @SerializedName("has_more")
    @Expose
    private Boolean hasMore;
    @SerializedName("quota_max")
    @Expose
    private Integer quotaMax;
    @SerializedName("quota_remaining")
    @Expose
    private Integer quotaRemaining;
    public final static Parcelable.Creator<StackOverFlow> CREATOR = new Creator<StackOverFlow>() {


        @SuppressWarnings({
            "unchecked"
        })
        public StackOverFlow createFromParcel(Parcel in) {
            StackOverFlow instance = new StackOverFlow();
            in.readList(instance.items, (Item.class.getClassLoader()));
            instance.hasMore = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
            instance.quotaMax = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.quotaRemaining = ((Integer) in.readValue((Integer.class.getClassLoader())));
            return instance;
        }

        public StackOverFlow[] newArray(int size) {
            return (new StackOverFlow[size]);
        }

    }
    ;

    /**
     * No args constructor for use in serialization
     * 
     */
    public StackOverFlow() {
    }

    /**
     * 
     * @param hasMore
     * @param quotaMax
     * @param items
     * @param quotaRemaining
     */
    public StackOverFlow(List<Item> items, Boolean hasMore, Integer quotaMax, Integer quotaRemaining) {
        super();
        this.items = items;
        this.hasMore = hasMore;
        this.quotaMax = quotaMax;
        this.quotaRemaining = quotaRemaining;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    public Integer getQuotaMax() {
        return quotaMax;
    }

    public void setQuotaMax(Integer quotaMax) {
        this.quotaMax = quotaMax;
    }

    public Integer getQuotaRemaining() {
        return quotaRemaining;
    }

    public void setQuotaRemaining(Integer quotaRemaining) {
        this.quotaRemaining = quotaRemaining;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(items);
        dest.writeValue(hasMore);
        dest.writeValue(quotaMax);
        dest.writeValue(quotaRemaining);
    }

    public int describeContents() {
        return  0;
    }

}
