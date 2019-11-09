package app.midoridera.ogiri

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_reason.*
import kotlin.random.Random

class ReasonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reason)

        val mediaPlayer1 = MediaPlayer.create(this, R.raw.taiko)
        val mediaPlayer2 = MediaPlayer.create(this, R.raw.symbal)

        val intent2: Intent = Intent(this, MainActivity::class.java)

        val randomInt1: Int = intent.getIntExtra("number1",0)
        val randomInt2: Int = intent.getIntExtra("number2",0)

        goodButton.setOnClickListener {
                mediaPlayer1.start()
        }

        retryButton.setOnClickListener {
                mediaPlayer2.start()
        }

        //理由１
        if (randomInt1 == 0){
            reasonImage1.setImageResource(R.drawable.banana)
        }
        if (randomInt1 == 1){
            reasonImage1.setImageResource(R.drawable.dog)
        }

        if (randomInt1 == 2){
            reasonImage1.setImageResource(R.drawable.driver)
        }

        if (randomInt1 == 3){
            reasonImage1.setImageResource(R.drawable.kyouryu)
        }

        if (randomInt1 == 4){
            reasonImage1.setImageResource(R.drawable.shinju)
        }

        //理由２
        if (randomInt2 == 0){
            reasonImage2.setImageResource(R.drawable.banana)
        }

        if (randomInt2 == 1){
            reasonImage2.setImageResource(R.drawable.dog)
        }

        if (randomInt2 == 2){
            reasonImage2.setImageResource(R.drawable.driver)
        }

        if (randomInt2 == 3){
            reasonImage2.setImageResource(R.drawable.kyouryu)
        }

        if (randomInt2 == 4){
            reasonImage2.setImageResource(R.drawable.shinju)
        }

        nextButton.setOnClickListener {
            val randomId: Int = Random.nextInt(3)
            intent2.putExtra("number", randomId)
            startActivity(intent2)
        }
    }
}
