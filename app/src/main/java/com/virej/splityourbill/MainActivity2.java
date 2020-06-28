package com.virej.splityourbill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    public static int n_people;
    EditText peopleInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button finishbutton = (Button) findViewById(R.id.finishbutton);
        peopleInput = (EditText) findViewById(R.id.n_people_input);




            finishbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    n_people = Integer.parseInt(peopleInput.getText().toString());

                    Log.d("splitthebill", "onClick: n of people: " + n_people);

                    Intent intent1 = new Intent(MainActivity2.this, FinalActivity3.class);
                    startActivity(intent1);

                }
            });


        }
    }
