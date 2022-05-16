package com.omdeep.mvvmretrofitdatabinding.model.pojo

import androidx.databinding.BaseObservable
import com.google.gson.annotations.SerializedName

class CommentData : BaseObservable() {

    @SerializedName("postId")
    private val postId: String? = null

    @SerializedName("id")
    private val id: String? = null

    @SerializedName("name")
    private val name: String? = null

    @SerializedName("email")
    private val email: String? = null

    @SerializedName("body")
    private val body: String? = null
}