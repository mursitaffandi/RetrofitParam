
package com.mursitaffandi.retrofitparam.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Owner implements Parcelable
{

    @SerializedName("reputation")
    @Expose
    private Integer reputation;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("user_type")
    @Expose
    private String userType;
    @SerializedName("profile_image")
    @Expose
    private String profileImage;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("accept_rate")
    @Expose
    private Integer acceptRate;
    public final static Parcelable.Creator<Owner> CREATOR = new Creator<Owner>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Owner createFromParcel(Parcel in) {
            Owner instance = new Owner();
            instance.reputation = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.userId = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.userType = ((String) in.readValue((String.class.getClassLoader())));
            instance.profileImage = ((String) in.readValue((String.class.getClassLoader())));
            instance.displayName = ((String) in.readValue((String.class.getClassLoader())));
            instance.link = ((String) in.readValue((String.class.getClassLoader())));
            instance.acceptRate = ((Integer) in.readValue((Integer.class.getClassLoader())));
            return instance;
        }

        public Owner[] newArray(int size) {
            return (new Owner[size]);
        }

    }
    ;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Owner() {
    }

    /**
     * 
     * @param profileImage
     * @param link
     * @param userId
     * @param reputation
     * @param displayName
     * @param acceptRate
     * @param userType
     */
    public Owner(Integer reputation, Integer userId, String userType, String profileImage, String displayName, String link, Integer acceptRate) {
        super();
        this.reputation = reputation;
        this.userId = userId;
        this.userType = userType;
        this.profileImage = profileImage;
        this.displayName = displayName;
        this.link = link;
        this.acceptRate = acceptRate;
    }

    public Integer getReputation() {
        return reputation;
    }

    public void setReputation(Integer reputation) {
        this.reputation = reputation;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getAcceptRate() {
        return acceptRate;
    }

    public void setAcceptRate(Integer acceptRate) {
        this.acceptRate = acceptRate;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(reputation);
        dest.writeValue(userId);
        dest.writeValue(userType);
        dest.writeValue(profileImage);
        dest.writeValue(displayName);
        dest.writeValue(link);
        dest.writeValue(acceptRate);
    }

    public int describeContents() {
        return  0;
    }

}
