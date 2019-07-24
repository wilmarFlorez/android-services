package com.example.myapplication.Controllers

import com.example.myapplication.Interfaces.ApiService
import com.example.myapplication.Models.FriendsApiModel
import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.fuel.core.FuelManager
import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.fuel.rx.rxObject
import io.reactivex.Single

object RemoteDataSource {

    init {
        FuelManager.instance.basePath = "https://37f2d5da.ngrok.io/"
    }

    fun getFriends(myCallback: (result: String?) -> Unit){
        Fuel.get(FuelManager.instance.basePath + "/get-my-friends")
            .response { request, response, result ->
                println(request)
                println(response)
                // TODO: Hacer serialización de result hacia List<Friends>
                //myCallback.invoke(response)
            }

    }

}