package sg.edu.rp.c346.id18016204.demokotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGetAge.setOnClickListener {
            val userDOB = etDOB.text.toString();
            if(userDOB.isNotEmpty()) {
                val year = Calendar.getInstance().get(Calendar.YEAR)
                val age = year - userDOB.toInt();
                tvShowAge.text = "Your age is $age"

                var output = "";
                /*
                if(age<18){
                    output = "under age"
                }else if(age in 18..65){
                    output = "Young people"
                }else if(age in 66..79){
                    output = "Middle-age"
                }else if(age in 80..99){
                    output = "elderly"
                }else{
                    output = "Long lived - elderly"
                }
                tvPeople.text = "$output"
*/

                when(age) {
                    in 0..17 -> output = "underage"
                    in 18..65 -> output = "Young people"
                    in 66..79 -> output = "Middle-aged"
                    in 80..99 -> output = "Elderly"
                else -> {
                        output = "Long-lived elderly"
                    }
                }
                tvPeople.text = "$output"
            }else{
                Toast.makeText(this,"Please enter your birthyear " , Toast.LENGTH_LONG).show()
            }

        }
    }
}