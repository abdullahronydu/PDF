package com.ronyjony.pdf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {
                    Intent i=new Intent(MainActivity.this,PDF.class);
                    startActivity(i);
                    finish();
            }
        });

                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                        public void onClick(View view) {
                            Intent i=new Intent(MainActivity.this,Downloadtoview.class);
                            startActivity(i);
                            finish();
                        }
                    });



                }
}

