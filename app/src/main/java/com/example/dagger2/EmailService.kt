package com.example.dagger2

import android.util.Log
import javax.inject.Inject

interface NotificationService {
    fun send(from : String , to : String , body : String?)
}

class EmailService @Inject constructor() : NotificationService {
    override fun send(from : String , to : String , body : String?){
        Log.d("","-----------------------Email Sent--------------------------------")
    }
}

class SMSService(private val retryCount : Int) : NotificationService {
    override fun send(from: String, to: String, body: String?) {
        Log.d("","-----------------------SMS Sent--Retry count ${retryCount}------------------------------")
    }
}