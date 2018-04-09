package com.example.asus_x550z.praktikumpbb.modul3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.asus_x550z.praktikumpbb.R;

public class outputModul3 extends AppCompatActivity {

    TextView t1,t2,t3, t4,t5, t6;
    String name, nim, jurusan, kota, hobi, tglLahir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_output_modul3 );

        t1=(TextView) findViewById ( R.id.textName );
        t2=(TextView) findViewById ( R.id.textNim );
        t3=(TextView) findViewById ( R.id.textJurusan );
        t4=(TextView) findViewById ( R.id.textTtl );
        t5=(TextView )findViewById ( R.id.textKl );
        t6=(TextView )findViewById ( R.id.textHobi);

        Intent i = getIntent ();

        name = i.getStringExtra ( "name_key" );
        nim = i.getStringExtra ( "nim_key" );
        jurusan = i.getStringExtra ( "jurusan_key" );
        tglLahir = i.getStringExtra ( "lahir_key" );
        kota = i.getStringExtra ( "kota_key" );
        hobi = i.getStringExtra ( "hobi_key" );

        t1.setText ( name );
        t2.setText ( nim );
        t3.setText ( jurusan );
        t4.setText ( tglLahir );
        t5.setText ( kota );
        t6.setText ( hobi );

    }

}