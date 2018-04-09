package com.example.asus_x550z.praktikumpbb.modul2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.asus_x550z.praktikumpbb.R;

public class homeModul2 extends AppCompatActivity {

    int ch1=1;
    int ch2=1;
    float font=30;
    Button btn1, btn2,btn3;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_modul2);
        final TextView text = (TextView)findViewById(R.id.tulis);
        btn1 = (Button) findViewById(R.id.Button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setTextSize(font);
                font = font + 5;
                if (font == 50)
                    font = 30;
            }
        });
        btn2 = (Button) findViewById(R.id.Button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (ch1){
                    case 1:
                        text.setTextColor(Color.RED);
                        break;
                    case 2:
                        text.setTextColor(Color.BLUE);
                        break;
                    case 3:
                        text.setTextColor(Color.GREEN);
                        break;
                    case 4:
                        text.setTextColor(Color.CYAN);
                        break;
                    case 5:
                        text.setTextColor(Color.YELLOW);
                        break;
                    case 6:
                        text.setTextColor(Color.MAGENTA);
                        break;
                }
                ch1++;
                if (ch1 == 7)
                    ch1 = 1;
            }
        });
        btn3 = (Button) findViewById(R.id.Button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (ch2){
                    case 1:
                        text.setText("Sholat Shubuh");
                        break;
                    case 2:
                        text.setText("Sholat Dhuzur");
                        break;
                    case 3:
                        text.setText("Sholet Ashar");
                        break;
                    case 4:
                        text.setText("Sholat Magrib");
                        break;
                    case 5:
                        text.setText("Sholat Is'ya");
                        break;
                        default:
                            text.setText("Hello !");
                            ch2=0;
                            break;
                }
                ch2++;
            }
        });
    }
}
