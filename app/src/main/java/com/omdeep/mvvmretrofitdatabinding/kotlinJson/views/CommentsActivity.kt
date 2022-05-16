package com.omdeep.mvvmretrofitdatabinding.kotlinJson.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.omdeep.mvvmretrofitdatabinding.R
import com.omdeep.mvvmretrofitdatabinding.databinding.ActivityCommentsBinding

class CommentsActivity : AppCompatActivity() {
    private lateinit var binding : ActivityCommentsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityCommentsBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_comments)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_comments)
    }
}