package com.example.asus_x550z.praktikumpbb.modul5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.asus_x550z.praktikumpbb.R;
import com.example.asus_x550z.praktikumpbb.modul5.DrawingActivity;
import com.example.asus_x550z.praktikumpbb.modul5.FragmentTwo;

public class homeModul5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_home_modul5 );
    }

    public void onButtonClick(View view) {
        FragmentTwo fragmentTwo = (FragmentTwo) getSupportFragmentManager ().findFragmentById ( R.id.fragment_two);

        switch ( view. getId ()) {
            case R. id . btn_one_create_new :
                if ( fragmentTwo == null ) {

                    Intent i = new Intent ( this , DrawingActivity. class );
                    startActivity ( i );
                } else {

                    Toast. makeText ( this , "Will be implemented later" , Toast. LENGTH_SHORT ) . show ();
                }
                break ;
            case R. id . btn_one_open_existing :
                Toast. makeText ( this , "Will be implemented later" , Toast. LENGTH_SHORT ) . show ();
                break ;
            default :
        }
    }
}
