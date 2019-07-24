package com.example.myapplication.Interfaces

import com.example.myapplication.Models.FriendsApiModel
import io.reactivex.Single

interface ApiService {
    fun getFriends(): Single<List<FriendsApiModel>>
}