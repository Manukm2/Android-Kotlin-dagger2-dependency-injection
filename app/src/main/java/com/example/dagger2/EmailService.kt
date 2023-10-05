package com.example.dagger2

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface  NotificationService {
    fun send(from : String , to : String , body : String?)
}

@Singleton
class EmailService @Inject constructor() : NotificationService{
    override fun send(from : String, to : String, body : String?){
        Log.d("","-----------------------Email Sent--------------------------------")
    }
}

class MessageService(private val retryCount : Int) : NotificationService{
    override fun send(from : String, to : String, body : String?){
        Log.d("","-----------------------Message Sent->${retryCount}-------------------------------")
    }
}