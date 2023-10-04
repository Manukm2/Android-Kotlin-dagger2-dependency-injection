package com.example.dagger2

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor() {
    fun saveUser(Email : String , Password : String){
        Log.d("","-----------------------User Saved in DB--------------------------------")
    }
}