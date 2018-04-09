package com.example.asus_x550z.praktikumpbb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.asus_x550z.praktikumpbb.modul1.homeModul1;
import com.example.asus_x550z.praktikumpbb.modul2.homeModul2;
import com.example.asus_x550z.praktikumpbb.modul3.homeModul3;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.Button1);
        btn2 = (Button)findViewById(R.id.Button2);
        btn3 = (Button)findViewById(R.id.Button3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,homeModul1.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,homeModul2.class);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,homeModul3.class);
                startActivity(intent);
            }
        });
    }
}