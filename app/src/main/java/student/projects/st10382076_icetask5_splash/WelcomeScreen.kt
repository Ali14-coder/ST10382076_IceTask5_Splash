package student.projects.st10382076_icetask5_splash

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WelcomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_screen)

        val name = intent.getStringExtra("user_name")
        val welcomeText = findViewById<TextView>(R.id.lblName)

        welcomeText.text = "${name ?: "Guest"}!"
    }
}
