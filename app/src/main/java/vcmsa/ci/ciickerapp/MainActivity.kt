package vcmsa.ci.ciickerapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import vcmsa.ci.ciickerapp.R

class MainActivity : AppCompatActivity() {
    private var count = 0

    @SuppressLint("SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counterText = findViewById<TextView>(R.id.counterText)
        val clickButton = findViewById<Button>(R.id.clickButton)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val exitButton = findViewById<Button>(R.id.exitButton)

        clickButton.setOnClickListener {
            count++
            counterText.text = "Count: $count"
        }

        resetButton.setOnClickListener {
            count = 0
            counterText.text = "Count: $count"
        }

        exitButton.setOnClickListener {
            finish()
        }
    }
}