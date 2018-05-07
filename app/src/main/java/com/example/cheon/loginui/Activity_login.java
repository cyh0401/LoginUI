package com.example.cheon.loginui;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Activity_login extends AppCompatActivity implements View.OnClickListener {

    RelativeLayout rellay1, rellay2;
    Button btn_login;

    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            rellay1.setVisibility(View.VISIBLE);
            rellay2.setVisibility(View.VISIBLE);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        rellay1 = (RelativeLayout) findViewById(R.id.rellay1);
        rellay2 = (RelativeLayout) findViewById(R.id.rellay2);
        btn_login = (Button) findViewById(R.id.btn_login);

        btn_login.setOnClickListener(this);

        handler.postDelayed(runnable, 2000); //2000 is the timeout for splash
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                Toast.makeText(v.getContext(), "Click Login Button", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
