import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.driuft.androidkotlindebugging.R
import java.text.SimpleDateFormat // Import required for formatting
import java.util.*
import java.util.Locale // Import for Locale

// ... other imports

class CurrentDayActivity : AppCompatActivity() {

    private lateinit var currentDayText: TextView
    private val cal: Calendar = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_current_day)

        currentDayText = findViewById(R.id.current_day_text)
        currentDayText.text = getCurrentDayName() // Call the new function
    }

    // You can keep this if you need the day of the month number elsewhere
    private fun getDayOfMonth(): Int {
        return cal.get(Calendar.DAY_OF_MONTH)
    }

    // New function to get the day name
    private fun getCurrentDayName(): String {
        // "EEEE" gives the full day name (e.g., "Monday")
        // "EEE" would give the short name (e.g., "Mon")
        val sdf = SimpleDateFormat("EEEE", Locale.getDefault())
        return sdf.format(cal.time)
    }
}
