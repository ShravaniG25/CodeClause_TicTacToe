package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class first extends AppCompatActivity {

    ImageView logo;
    Animation logoanim;
    Button b1;
    TextView ttt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_first);

        logo = findViewById(R.id.logo);
        b1 = findViewById(R.id.button);
        ttt = findViewById(R.id.textView);

        logoanim = AnimationUtils.loadAnimation(this,R.anim.logoanim);

        logo.setAnimation(logoanim);
        ttt.setAnimation(logoanim);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                b1.setVisibility(View.VISIBLE);
            }
        }, 1700);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(first.this,MainActivity.class);
                startActivity(intent);

            }
        });

    }
}