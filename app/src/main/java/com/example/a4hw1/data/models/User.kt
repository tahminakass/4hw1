package com.example.a4hw1.data.models

import java.io.Serializable

data class User(
    val name: String,
    val email:String,
    val password:Int
):Serializable
