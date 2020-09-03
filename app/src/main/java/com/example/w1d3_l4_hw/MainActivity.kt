package com.example.w1d3_l4_hw

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TableRow
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addBTN.setOnClickListener {
            var version = androidVersion.text.toString()
            var code = codeName.text.toString()

            if (version.isNotEmpty() && code.isNotEmpty())
                addNewRow(version, code)
            // else toast

        }
    }

    fun addNewRow( version:String,  code:String){


        // Create a new table row.
        val tableRow = TableRow(getApplicationContext())
        // Set new table row layout parameters.
        val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT)
        tableRow.setLayoutParams(layoutParams)
        tableRow.setBackgroundColor(Color.BLACK)
        tableRow.setPadding(3,3,3,3)


        val verTextView = TextView(this)
        verTextView.textSize = 20f
        verTextView.text = version

        verTextView.setBackgroundColor(Color.RED)

        val codeTextView = TextView(this)
        codeTextView.textSize = 20f
        codeTextView.text = code
        codeTextView.setBackgroundColor(Color.RED)

        // add values into row by calling addView()
        tableRow.addView(verTextView,0)
        tableRow.addView(codeTextView,1)
        // Finally add the created row row into layout


        androidTable.addView(tableRow) // id from Layout_file




    }
}