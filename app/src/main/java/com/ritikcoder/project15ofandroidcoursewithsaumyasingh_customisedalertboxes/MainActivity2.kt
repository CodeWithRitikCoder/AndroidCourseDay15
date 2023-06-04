package com.ritikcoder.project15ofandroidcoursewithsaumyasingh_customisedalertboxes

import android.app.Dialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {

    //Create a variable of type Dialog.
    lateinit var dialog: Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val buttonClickMe: Button= findViewById(R.id.buttonForClickMe)

        dialog= Dialog(this)
        dialog.setContentView(R.layout.custom_dialogue1)
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.alert_box_background))

        //Creating variables for the custom dialog.xml design
        var buttonFeedback: Button= dialog.findViewById(R.id.buttonForFeedback)
        var buttonTooGood: Button= dialog.findViewById(R.id.buttonForTooGood)

        buttonFeedback.setOnClickListener {
            Toast.makeText(applicationContext, "Feedback button is clicked", Toast.LENGTH_SHORT).show()
        }
        buttonTooGood.setOnClickListener {
            dialog.dismiss()
        }

        buttonClickMe.setOnClickListener {
            dialog.show()
        }


    }
}