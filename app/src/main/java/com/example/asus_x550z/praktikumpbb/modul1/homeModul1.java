package com.example.asus_x550z.praktikumpbb.modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.asus_x550z.praktikumpbb.R;

public class homeModul1 extends AppCompatActivity {

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_modul1);
        btn1 = (Button) findViewById(R.id.info);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homeModul1.this,modul1.class);
                Toast.makeText(homeModul1.this, "Hallo, Deni Rahmat Prasetia 140411100058", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}
