package com.example.dagger2

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor() {
    fun sendMail(from : String , to : String , body : String?){
        Log.d("","-----------------------Email Sent--------------------------------")
    }
}