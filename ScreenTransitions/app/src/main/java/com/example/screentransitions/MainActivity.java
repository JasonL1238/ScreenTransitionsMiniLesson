package com.example.screentransitions;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button right = findViewById(R.id.rightButton);
        Button in = findViewById(R.id.fadeIn);
        Button out = findViewById(R.id.fadeOut);


        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeCustomAnimation(MainActivity.this, R.anim.slide_in_right, R.anim.slide_in_left);
                startActivity(intent, options.toBundle());
            }
        });

        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeCustomAnimation(MainActivity.this, R.anim.fade_in, R.anim.fade_out);
                startActivity(intent, options.toBundle());
            }
        });

        out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeCustomAnimation(MainActivity.this, R.anim.fade_in, R.anim.fade_out);
                startActivity(intent, options.toBundle());
            }
        });
    }
}
