package com.example.asus_x550z.praktikumpbb.modul6;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.asus_x550z.praktikumpbb.R;

/**
 * Created by ASUS - X550Z on 5/2/2018.
 */

public class homeModul6 extends Activity implements myDialogFragment.UserNameListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_home_modul6);
    }

    @Override
    public void onFinishUserDialog(String user) {
        Toast.makeText(this, "Hello, " + user, Toast.LENGTH_SHORT).show();
    }

    public void onClick(View view) {
        FragmentManager manager = getFragmentManager();
        Fragment frag = manager.findFragmentByTag( "fragment_edit_name" );
        if (frag != null) {
            manager.beginTransaction().remove( frag ).commit();
        }
        switch (view.getId()){
            case R.id.showCustomFragment:
                myDialogFragment editNameMyDialog = new myDialogFragment();
                editNameMyDialog.show( manager, "fragment_edit_name" );
                break;
            case R.id.showAlertDialogFragment:
                myDialogFragment alertDialogFragment = new myDialogFragment();
                alertDialogFragment.show( manager, "fragmen_edit_name" );

        }
    }
}
