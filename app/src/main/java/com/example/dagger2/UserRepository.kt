package com.example.dagger2

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface UserRepository{
    fun saveUser(Email : String , Password : String)
}

@Singleton
class SQLRepository @Inject constructor() : UserRepository {
    override fun  saveUser(Email : String, Password : String){
        Log.d("","-----------------------User Saved in DB--------------------------------")
    }
}

class FirebaseRepository  : UserRepository {
    override fun   saveUser(Email : String, Password : String){
        Log.d("","-----------------------User Saved in Firebase--------------------------------")
    }
}