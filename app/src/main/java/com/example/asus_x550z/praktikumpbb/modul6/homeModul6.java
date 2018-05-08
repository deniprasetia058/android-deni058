package com.example.asus_x550z.praktikumpbb.modul6;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.asus_x550z.praktikumpbb.R;

public class homeModul6 extends Activity implements MyDialogFragment.UserNameListener, View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_home_modul6 );
        Button btn= (Button)findViewById(R.id.showCustomFragment);
        btn.setOnClickListener ( this );
        Button btn1= (Button)findViewById(R.id.showAlertDialogFragment);
        btn1.setOnClickListener ( this );
    }

    @Override
    public void onClick(View view) {
        // close existing dialog fragments
        FragmentManager manager = getFragmentManager();
        Fragment frag = manager.findFragmentByTag("fragment_edit_name");
        if (frag != null) {
            manager.beginTransaction().remove(frag).commit();
        }
        switch (view.getId()) {
            case R.id.showCustomFragment:
                MyDialogFragment editNameDialog = new MyDialogFragment();
                editNameDialog.show(manager, "fragment_edit_name");
                break;
            case R.id.showAlertDialogFragment:
                AlertDialogFragment alertDialogFragment = new AlertDialogFragment();
                alertDialogFragment.show(manager, "fragment_edit_name");
                break;
        }
    }

    @Override
    public void onFinishUserDialog(String user) {
        Toast.makeText(this, "Hai, " + user, Toast.LENGTH_SHORT).show();
    }
}
