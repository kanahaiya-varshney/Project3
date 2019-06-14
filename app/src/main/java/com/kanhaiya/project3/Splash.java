package com.kanhaiya.project3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.w3c.dom.Text;

public class Splash extends AppCompatActivity {

    public static int Time=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
                Intent intent2=new Intent(Splash.this,MainActivity.class);
                startActivity(intent2);
                finish();
            }
        },Time);
    }
}
