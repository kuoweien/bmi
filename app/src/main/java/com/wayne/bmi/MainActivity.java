package com.wayne.bmi;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edweight;
    private EditText edheight;
    private Button bHelp;
    // String s = new String("abc");
   // View.OnClickListener listener = new View.OnClickListener() {
   //    @Override
    //   public void onClick(View view) {

    //   }
  // };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getResources().getString(R.string.app_name);
      //  bHelp = (Button)findViewById(R.id.b_help);
        bHelp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("X")
                        .setMessage("BMI原來是.............")
                        .setPositiveButton("OK",null)
                        .show();
            }
        });

    }
    public void bmi(View view){
    //    System.out.println("123");
        Log.d("MainActivity","testing bmi method ");
        findView();
        float weight = Float.parseFloat(edweight.getText().toString());
        float height = Float.parseFloat(edheight.getText().toString());
        float bmi = weight / (height*height);

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("BMI_EXTRA", bmi);
        startActivity(intent);

        Log.d("MainActivity","onCreate");

        /*Log.d("MainActivity","Your bmi is:"+bmi);
        Toast.makeText(this,"Your bmi is" + bmi, Toast.LENGTH_LONG).show();*/

        /* new AlertDialog.Builder(this)
                    .setMessage(getString(R.string.your_bmi_is) + bmi)
                    .setTitle(R.string.my_title)
                    .setPositiveButton(R.string.OK, null)
                    .show();*/
       /* if(bmi<=20){
            Toast.makeText(this,"請多吃點",Toast.LENGTH_LONG).show();
        }*/
       /* if(R.id.ed_height>3){
            new AlertDialog.Builder(this)
                    .setMessage("身高單位應為公尺")
                    .setPositiveButton("OK",null)
                    .show();
        }*/
    }

    private void findView() {
        edweight = (EditText) findViewById(R.id.ed_weight);
        edheight = (EditText) findViewById(R.id.ed_height);
        bHelp = (Button)findViewById(R.id.b_help);
    }
}
