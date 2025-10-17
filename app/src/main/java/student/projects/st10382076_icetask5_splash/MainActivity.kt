package student.projects.st10382076_icetask5_splash

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameInput = findViewById<EditText>(R.id.etName)
        val submitBtn = findViewById<Button>(R.id.btnStart)

        submitBtn.setOnClickListener {
            val name = nameInput.text.toString().trim()

            // Send name to welcome screen
            val intent = Intent(this, WelcomeScreen::class.java)
            intent.putExtra("user_name", name)
            startActivity(intent)
        }
    }
}
