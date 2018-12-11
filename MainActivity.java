package com.example.akaybanez.ybanez_4;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button gameBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gameBtn = findViewById(R.id.gameBtn);
        gameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoGame();
            }
        });
    }

    public void gotoGame() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
        /*gameBtn = (Button) findViewById(R.id.gameBtn);
        gameBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openGameActivity();
                }*/

        /*Button quitBtn = (Button) findViewById(R.id.quitBtn);
        quitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }

    public void openGameActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);




    }*/
