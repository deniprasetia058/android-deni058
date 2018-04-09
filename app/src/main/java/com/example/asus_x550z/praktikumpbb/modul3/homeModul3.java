package com.example.asus_x550z.praktikumpbb.modul3;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;


import com.example.asus_x550z.praktikumpbb.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class homeModul3 extends AppCompatActivity {

    EditText e1,e2,e4,e5, tanggal;
    Button bt, tgl;
    Spinner s;
    SimpleDateFormat dateFormatter;


    String[]Jurusan={"INFORMASI","INFORMATIKA","SIPIL","MESIN","INDUSTRI"};
    String name, nim, jurusan, kota, hobi, tglLahir;

    public void tampil(){
        Calendar newCalender = Calendar.getInstance ();
        DatePickerDialog datePickerDialog = new DatePickerDialog ( this, new DatePickerDialog.OnDateSetListener () {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                Calendar newDate = Calendar.getInstance ();
                newDate.set ( year, month, dayOfMonth );

                tanggal.setText ( dateFormatter.format ( newDate.getTime () ) );
            }
        }, newCalender.get ( Calendar.YEAR ), newCalender.get ( Calendar.MONTH ), newCalender.get ( Calendar.DAY_OF_MONTH ));
        datePickerDialog.show ();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_home_modul3);

        e1 = (EditText) findViewById(R.id.editName);
        e2 = (EditText) findViewById(R.id.editNim);
        e4 = (EditText) findViewById(R.id.editTempat);
        e5 = (EditText) findViewById(R.id.editHobi);
        tanggal = (EditText) findViewById(R.id.editTanggal);
        bt = (Button) findViewById(R.id.tombl);
        s = (Spinner) findViewById(R.id.spinner);

        dateFormatter = new SimpleDateFormat ( "dd-MM-yyyy", Locale.US );
        tanggal = (EditText) findViewById(R.id.editTanggal);
        tgl = (Button) findViewById(R.id.btnTanggal);

        ArrayAdapter adapter=new ArrayAdapter ( homeModul3.this, android.R.layout.simple_spinner_item,Jurusan);
        s.setAdapter ( adapter );

        bt.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                name = e1.getText ().toString ();
                nim = e2.getText ().toString ();
                tglLahir = tanggal.getText ().toString ();
                kota = e4.getText ().toString ();
                hobi = e5.getText ().toString ();
                jurusan = s.getSelectedItem ().toString ();

                Intent i = new Intent ( homeModul3.this, outputModul3.class );

                i.putExtra ( "name_key", name );
                i.putExtra ( "nim_key", nim );
                i.putExtra ( "jurusan_key", jurusan );
                i.putExtra ( "lahir_key", tglLahir );
                i.putExtra ( "kota_key", kota );
                i.putExtra ( "hobi_key",hobi );

                startActivity ( i );
            }
        } );

        dateFormatter = new SimpleDateFormat ( "dd-MM-yyyy", Locale.US );
        tanggal =(EditText) findViewById ( R.id.editTanggal );
        tgl = (Button) findViewById ( R.id.btnTanggal );
        tgl.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                tampil();
            }
        } );
    }
}