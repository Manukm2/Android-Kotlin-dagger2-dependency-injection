package com.example.dagger2

import android.util.Log
import javax.inject.Inject

interface UserRepository{
    fun saveUser(Email : String , Password : String)
}

@ActivityScope
class SQLRepository @Inject constructor(val analyticsService: AnalyticsService) : UserRepository {
    override fun  saveUser(Email : String, Password : String){
        Log.d("","-----------------------User Saved in DB--------------------------------")
        analyticsService.trackEvent("Save User","CREATE")
    }
}

class FirebaseRepository(val analyticsService: AnalyticsService)  : UserRepository {
    override fun   saveUser(Email : String, Password : String){
        Log.d("","-----------------------User Saved in Firebase--------------------------------")
        analyticsService.trackEvent("Save User","CREATE")
    }
}