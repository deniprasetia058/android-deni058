package com.example.asus_x550z.praktikumpbb.modul6;


import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import com.example.asus_x550z.praktikumpbb.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class myDialogFragment extends DialogFragment implements TextView.OnEditorActionListener{
    private EditText mEditText;

    public void show(FragmentManager manager, String fragment_edit_name) {
    }

    public interface UserNameListener {
        void onFinishUserDialog(String user);
    }

    public myDialogFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.fragment_username, container);
        mEditText = (EditText) view.findViewById(R.id.username);
        mEditText.setOnEditorActionListener(this);
        mEditText.requestFocus();
        getDialog().getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
        getDialog().setTitle("Please enter username");
        return view;
    }

    @Override
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        UserNameListener activity = (UserNameListener) getActivity();
        activity.onFinishUserDialog(mEditText.getText().toString());
        this.dismiss();
        return true;
    }
}
