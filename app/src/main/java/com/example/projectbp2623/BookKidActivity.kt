package com.example.projectbp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.projectbp2623.FableFragment
import com.example.projectbp2623.FairyFragment
import com.example.projectbp2623.R
import com.example.projectbp2623.ScienceFragment

class BookKidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_kid)

        //instance
        val btnFairy:Button = findViewById(R.id.buttonFairy)
        val btnFable:Button = findViewById(R.id.buttonFable)
        val btnScience:Button = findViewById(R.id.buttonScience)

        //event button fairy
        btnFairy.setOnClickListener{
            replacefragment(FairyFragment())
        }
        //event button Fable
        btnFable.setOnClickListener{
            replacefragment(FableFragment())
        }
        //event button Fable
        btnScience.setOnClickListener{
            replacefragment(ScienceFragment())
        }

    }
    //create method replace fragment
    private fun  replacefragment(frg:Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fragmentKidBook,frg)
        fragmentTrx.commit()
    }
}