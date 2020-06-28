package com.virej.splityourbill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {


      public static Float billamount;
      EditText amountInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button nextbutton = (Button) findViewById(R.id.nextbutton) ;

        amountInput = (EditText) findViewById(R.id.billamount);



            nextbutton.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    billamount = Float.valueOf(amountInput.getText().toString());

                    Log.d("split_bill", "onClick: bill_amount: "+billamount);

                    Intent intent = new Intent(MainActivity.this , MainActivity2.class);
                    startActivity(intent);

                }
            });

    }
}