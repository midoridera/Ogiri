package app.midoridera.ogiri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent1: Intent = Intent(this, ReasonActivity::class.java)

        val randomInt: Int = intent.getIntExtra("number",0)

        if (randomInt == 0) {
            imageView.setImageResource(R.drawable.kowai)
            happenText.text = "怖がっている?"
        }

        if (randomInt == 1) {
            imageView.setImageResource(R.drawable.moetsuki)
            happenText.text = "燃え尽きている?"
        }

        if (randomInt == 2) {
            imageView.setImageResource(R.drawable.odoroki)
            happenText.text = "驚いている?"
        }

        startButton.setOnClickListener {
            val randomInt1: Int = Random.nextInt(5)
            val randomInt2: Int = Random.nextInt(5)
            intent1.putExtra("number1", randomInt1)
            intent1.putExtra("number2", randomInt2)
            startActivity(intent1)
        }

    }
}
