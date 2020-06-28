package com.example.scoreboardapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    TextView tv2;
    Button a1;
    Button a2;
    Button a3;
    Button b1;
    Button b2;
    Button b3;
    Button reset;
    int a;
    int b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a1=findViewById(R.id.a1);
        a2=findViewById(R.id.a2);
        a3=findViewById(R.id.a3);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        reset=findViewById(R.id.RESET);

        tv1=findViewById(R.id.A_COUNT);
        tv2=findViewById(R.id.B_COUNT);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a++;
                tv1.setText(""+a);
            }
        });

        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a+=2;
                tv1.setText(""+a);
            }
        });

        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a+=3;
                tv1.setText(""+a);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b++;
                tv2.setText(""+b);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b+=2;
                tv2.setText(""+b);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b+=3;
                tv2.setText(""+b);
            }
        });
        reset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                b=0;
                tv2.setText(""+b);
                a=0;
                tv1.setText(""+a);
            }
        });
        if(savedInstanceState!=null) {
            String s = savedInstanceState.getString("deepika");
            String s1 = savedInstanceState.getString("deepu");
            tv1.setText(s);
            tv2.setText(s1);
        }

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("deepika",tv1.getText().toString());
        outState.putString("deepu",tv2.getText().toString());
    }
}
