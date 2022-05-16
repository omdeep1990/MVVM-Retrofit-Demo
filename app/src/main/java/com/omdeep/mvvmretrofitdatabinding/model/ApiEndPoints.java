package com.omdeep.mvvmretrofitdatabinding.model;

import com.omdeep.mvvmretrofitdatabinding.model.pojo.AlbumData;
import com.omdeep.mvvmretrofitdatabinding.model.pojo.CommentData;
import com.omdeep.mvvmretrofitdatabinding.model.pojo.PostData;
import com.omdeep.mvvmretrofitdatabinding.model.pojo.ToDoData;
import com.omdeep.mvvmretrofitdatabinding.model.pojo.UsersData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiEndPoints {
    @GET("/posts")
    Call<List<PostData>> getPostsData();

    @GET("/comments")
    Call<List<CommentData>> getCommentsData();

    @GET("/albums")
    Call<List<AlbumData>> getAlbumsData();

    @GET("/todos")
    Call<List<ToDoData>> getToDoData();

    @GET("/users")
    Call<List<UsersData>> getUsersData();
//
//    @GET("/users")
//    Call<List<UserResponse>> getUsersData(String userName);
}
