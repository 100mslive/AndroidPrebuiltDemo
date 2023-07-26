package live.hms.prebuiltdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import live.hms.roomkit.ui.HMSRoomKit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        HMSRoomKit.launchPrebuilt("tmz-qdi-cyp", this)
    }
}