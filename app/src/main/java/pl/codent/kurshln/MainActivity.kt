package pl.codent.kurshln

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.system.measureNanoTime

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txtvw = findViewById<TextView>(R.id.tekst_v)
        stringExample()

        var timep = measureNanoTime { stringExample() }

        var person1 =Person("jan","kowalski")
        txtvw.text="first name ${person1.name} \n last name ${person1.surname} \n ${person1.getTime()} "
    }
    private fun stringExample(){
        var str: String? = null
        if (str != null){
            str="ok"
        }
        var sl :Int = str?.length ?: 0


    }
}