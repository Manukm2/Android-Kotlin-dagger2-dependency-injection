package com.example.dagger2

import android.util.Log
import javax.inject.Inject

interface UserRepository {
    fun saveUser(Email : String , Password : String)
}

class SQLRepository @Inject constructor() : UserRepository {
    override fun saveUser(Email : String , Password : String){
        Log.d("","-----------------------User Saved in SQL-DB--------------------------------")
    }
}

class MongoDBRepository @Inject constructor() : UserRepository {
    override fun saveUser(Email : String , Password : String){
        Log.d("","-----------------------User Saved in Mongo-DB--------------------------------")
    }
}