package com.example.habitstracker

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "profile")
data class Item (
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
//    @ColumnInfo(name = "name")
//    var name: String,
    @ColumnInfo(name = "login")
    var login: String,
//    @ColumnInfo(name = "email")
//    var email: Int,
//    @ColumnInfo(name = "age")
//    var age: String,
    @ColumnInfo(name = "password")
    var password: String,
)