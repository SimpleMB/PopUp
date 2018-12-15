package com.example.hp.popup;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PopUp extends AppCompatActivity {
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up);
        myDialog = new Dialog(this);


    }

    public void ShowPopup (View view) {
        TextView txtclose;
        Button btnFollow;
        myDialog.setContentView(R.layout.custopopup);
        txtclose = (TextView) myDialog.findViewById(R.id.closePopup);
        btnFollow = (Button) myDialog.findViewById(R.id.followMe);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.show();

    }
}
