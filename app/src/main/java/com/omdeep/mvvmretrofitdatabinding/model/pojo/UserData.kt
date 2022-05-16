package com.omdeep.mvvmretrofitdatabinding.model.pojo

import androidx.databinding.BaseObservable
import com.google.gson.annotations.SerializedName

class UsersData : BaseObservable(){

    @SerializedName("id")
    private val id: String? = null

    @SerializedName("name")
    private val name: String? = null

    @SerializedName("username")
    private val username: String? = null

    @SerializedName("email")
    private val email: String? = null

    @SerializedName("address")
    private var address: AddressUserResponse? = null

    @SerializedName("phone")
    private var phone: String? = null

    @SerializedName("website")
    private var website: String? =null

    @SerializedName("company")
    private var company: Company? = null
}