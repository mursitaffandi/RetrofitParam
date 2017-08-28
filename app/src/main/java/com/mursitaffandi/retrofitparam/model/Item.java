
package com.mursitaffandi.retrofitparam.model;

import java.util.ArrayList;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item implements Parcelable
{

    @SerializedName("tags")
    @Expose
    private List<String> tags = new ArrayList<String>();
    @SerializedName("owner")
    @Expose
    private Owner owner;
    @SerializedName("is_answered")
    @Expose
    private Boolean isAnswered;
    @SerializedName("view_count")
    @Expose
    private Integer viewCount;
    @SerializedName("answer_count")
    @Expose
    private Integer answerCount;
    @SerializedName("score")
    @Expose
    private Integer score;
    @SerializedName("last_activity_date")
    @Expose
    private Integer lastActivityDate;
    @SerializedName("creation_date")
    @Expose
    private Integer creationDate;
    @SerializedName("last_edit_date")
    @Expose
    private Integer lastEditDate;
    @SerializedName("question_id")
    @Expose
    private Integer questionId;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("accepted_answer_id")
    @Expose
    private Integer acceptedAnswerId;
    @SerializedName("bounty_amount")
    @Expose
    private Integer bountyAmount;
    @SerializedName("bounty_closes_date")
    @Expose
    private Integer bountyClosesDate;
    public final static Parcelable.Creator<Item> CREATOR = new Creator<Item>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Item createFromParcel(Parcel in) {
            Item instance = new Item();
            in.readList(instance.tags, (java.lang.String.class.getClassLoader()));
            instance.owner = ((Owner) in.readValue((Owner.class.getClassLoader())));
            instance.isAnswered = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
            instance.viewCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.answerCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.score = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.lastActivityDate = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.creationDate = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.lastEditDate = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.questionId = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.link = ((String) in.readValue((String.class.getClassLoader())));
            instance.title = ((String) in.readValue((String.class.getClassLoader())));
            instance.acceptedAnswerId = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.bountyAmount = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.bountyClosesDate = ((Integer) in.readValue((Integer.class.getClassLoader())));
            return instance;
        }

        public Item[] newArray(int size) {
            return (new Item[size]);
        }

    }
    ;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item() {
    }

    /**
     * 
     * @param tags
     * @param bountyClosesDate
     * @param questionId
     * @param bountyAmount
     * @param lastActivityDate
     * @param link
     * @param score
     * @param lastEditDate
     * @param creationDate
     * @param title
     * @param answerCount
     * @param isAnswered
     * @param owner
     * @param acceptedAnswerId
     * @param viewCount
     */
    public Item(List<String> tags, Owner owner, Boolean isAnswered, Integer viewCount, Integer answerCount, Integer score, Integer lastActivityDate, Integer creationDate, Integer lastEditDate, Integer questionId, String link, String title, Integer acceptedAnswerId, Integer bountyAmount, Integer bountyClosesDate) {
        super();
        this.tags = tags;
        this.owner = owner;
        this.isAnswered = isAnswered;
        this.viewCount = viewCount;
        this.answerCount = answerCount;
        this.score = score;
        this.lastActivityDate = lastActivityDate;
        this.creationDate = creationDate;
        this.lastEditDate = lastEditDate;
        this.questionId = questionId;
        this.link = link;
        this.title = title;
        this.acceptedAnswerId = acceptedAnswerId;
        this.bountyAmount = bountyAmount;
        this.bountyClosesDate = bountyClosesDate;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Boolean getIsAnswered() {
        return isAnswered;
    }

    public void setIsAnswered(Boolean isAnswered) {
        this.isAnswered = isAnswered;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(Integer answerCount) {
        this.answerCount = answerCount;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getLastActivityDate() {
        return lastActivityDate;
    }

    public void setLastActivityDate(Integer lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    public Integer getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Integer creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getLastEditDate() {
        return lastEditDate;
    }

    public void setLastEditDate(Integer lastEditDate) {
        this.lastEditDate = lastEditDate;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getAcceptedAnswerId() {
        return acceptedAnswerId;
    }

    public void setAcceptedAnswerId(Integer acceptedAnswerId) {
        this.acceptedAnswerId = acceptedAnswerId;
    }

    public Integer getBountyAmount() {
        return bountyAmount;
    }

    public void setBountyAmount(Integer bountyAmount) {
        this.bountyAmount = bountyAmount;
    }

    public Integer getBountyClosesDate() {
        return bountyClosesDate;
    }

    public void setBountyClosesDate(Integer bountyClosesDate) {
        this.bountyClosesDate = bountyClosesDate;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(tags);
        dest.writeValue(owner);
        dest.writeValue(isAnswered);
        dest.writeValue(viewCount);
        dest.writeValue(answerCount);
        dest.writeValue(score);
        dest.writeValue(lastActivityDate);
        dest.writeValue(creationDate);
        dest.writeValue(lastEditDate);
        dest.writeValue(questionId);
        dest.writeValue(link);
        dest.writeValue(title);
        dest.writeValue(acceptedAnswerId);
        dest.writeValue(bountyAmount);
        dest.writeValue(bountyClosesDate);
    }

    public int describeContents() {
        return  0;
    }

}
