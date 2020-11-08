package a.alt.z.analytics

import android.app.Application
import com.google.firebase.FirebaseApp

class AnalyticsApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        FirebaseApp.initializeApp(this)
    }
}