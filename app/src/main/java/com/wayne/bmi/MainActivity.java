package com.wayne.bmi;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bmi(View view){
        System.out.println("123");
        Log.d("MainActivity","testing bmi method ");
        EditText edweight = (EditText) findViewById(R.id.ed_weight);
        EditText edheight = (EditText) findViewById(R.id.ed_height);
        float weight = Float.parseFloat(edweight.getText().toString());
        float height = Float.parseFloat(edheight.getText().toString());
        float bmi = weight / (height*height);
        /*Log.d("MainActivity","Your bmi is:"+bmi);
        Toast.makeText(this,"Your bmi is" + bmi, Toast.LENGTH_LONG).show();*/
        new AlertDialog.Builder(this)
                .setMessage("Yout BMI is "+bmi)
                .setTitle("my titile")
                .setPositiveButton("OK",null)
                .show();
    }
}
