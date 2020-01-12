package suresh.alphabets.education

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        next.setOnClickListener(this)
        previous.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v == next) {
            //To change body of created functions use File | Settings | File Templates.
            viewFlipper.showNext()
        }

        if (v == previous) {
            viewFlipper.showPrevious()
        }
    }
}
