package com.virej.splityourbill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;


public class FinalActivity3 extends AppCompatActivity {

    private static DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final3);


        float billamount;
        billamount = MainActivity.billamount;

        int numberofpeople;
        numberofpeople = MainActivity2.n_people;

        float answer;
        answer = billamount / numberofpeople;

        //This helps to round the final answer to 2 decimal places.
        BigDecimal bd = new BigDecimal(answer).setScale(2, RoundingMode.HALF_UP);
        double finalanswer = bd.doubleValue();


        String solution = Double.toString(finalanswer);

        setContentView(R.layout.activity_final3);
        TextView answertextview = (TextView) findViewById(R.id.answer);
        answertextview.setText(solution);


        Button calculateagainbutton = findViewById(R.id.calculateagainbutton);
        calculateagainbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainactivityintent = new Intent(FinalActivity3.this, MainActivity.class);
                startActivity(mainactivityintent);
            }
        });


        Button creatorbutton = findViewById(R.id.creatorbutton);
        creatorbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent creatorintent = new Intent(FinalActivity3.this,CreatorActivity.class);
                startActivity(creatorintent);

            }
        });

    }
}