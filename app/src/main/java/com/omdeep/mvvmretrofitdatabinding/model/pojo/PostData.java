package com.omdeep.mvvmretrofitdatabinding.model.pojo;

import androidx.databinding.BaseObservable;

import com.google.gson.annotations.SerializedName;
import com.omdeep.mvvmretrofitdatabinding.BR;

public class PostData extends BaseObservable {

    @SerializedName("userId")
    private String userId;

    @SerializedName("id")
    private String id;

    @SerializedName("title")
    private String title;

    @SerializedName("body")
    private String body;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
//        notifyPropertyChanged(BR.userId);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
//        notifyPropertyChanged(BR.id);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
//        notifyPropertyChanged(BR.title);
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
//        notifyPropertyChanged(BR.body);
    }
}