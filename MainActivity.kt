package com.example.juan_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val name =findViewById<EditText>(R.id.editTextTextPersonName)
        val radioButton=findViewById<RadioGroup>(R.id.radios)

        val checkBox=findViewById<CheckBox>(R.id.checkBox)
        val toggle=findViewById<ToggleButton>(R.id.toggleButton)
        val switch=findViewById<Switch>(R.id.switch2)
        val imgButton=findViewById<ImageButton>(R.id.imageButton3)
        val button=findViewById<Button>(R.id.button)
        var text="You selected: "
        var radioId=0
        radioButton.setOnCheckedChangeListener {RadioGroup,  checkedId ->
            radioId=checkedId


        }





        fun show(){
            text=" \n" + "You selected: "+ if (R.id.radioButton3 == radioId) " \n" +"female" else " \n" +"male"



            if(name.length()>0){
                text+=" \n" +name.getText().toString()

            }
            if(checkBox.isChecked){
                text+=" \n" +checkBox.getText().toString()


            }
            if(toggle.isChecked){
                text+=" \n" +toggle.getText().toString()


            }
            if(switch.isChecked){
                text+=" \n" +switch.getText().toString()


            }


            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()

            text="You selected: "





        }
        button.setOnClickListener{ show()}
    }



}
