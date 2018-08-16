package fanzhen.first.com.myphoto

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.facebook.drawee.backends.pipeline.Fresco
import com.zfdang.multiple_images_selector.ImagesSelectorActivity
import com.zfdang.multiple_images_selector.SelectorSettings


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Fresco.initialize(applicationContext)
        val intent = Intent(this, ImagesSelectorActivity::class.java)
        intent.putExtra(SelectorSettings.SELECTOR_MAX_IMAGE_NUMBER, 5)
        intent.putExtra(SelectorSettings.SELECTOR_MIN_IMAGE_SIZE, 100000)
        intent.putExtra(SelectorSettings.SELECTOR_SHOW_CAMERA, true)
        startActivityForResult(intent, 1)
    }
}
