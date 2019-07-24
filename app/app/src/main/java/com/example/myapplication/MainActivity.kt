package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.Controllers.RemoteDataSource
import com.example.myapplication.Models.FriendsApiModel
import com.github.kittinunf.fuel.Fuel
import io.reactivex.Single

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getFriendsRemote() {
        RemoteDataSource.getFriends(){result->
            val i = 0;
            // Todo: Mostrar nuestros amigos en el breakpoint
        }

    }

    fun getFriendsBtn_onClick(view: View) {
        getFriendsRemote()
    }
}
