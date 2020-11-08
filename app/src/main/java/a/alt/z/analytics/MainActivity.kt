package a.alt.z.analytics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.analytics.ktx.logEvent
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {

    private lateinit var analytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        analytics = Firebase.analytics

        analytics.logEvent(FirebaseAnalytics.Event.SELECT_ITEM) {
            param(FirebaseAnalytics.Param.ITEM_ID, 0L)
            param(FirebaseAnalytics.Param.ITEM_NAME, "item_name")
            param(FirebaseAnalytics.Param.CONTENT_TYPE, "text")
        }

        analytics.logEvent(FirebaseAnalytics.Event.SELECT_ITEM) { param(FirebaseAnalytics.Param.ITEM_NAME, "happy") }

        analytics.logEvent(FirebaseAnalytics.Event.SCREEN_VIEW) { param(FirebaseAnalytics.Param.SCREEN_CLASS, "MainActivity") }
    }
}