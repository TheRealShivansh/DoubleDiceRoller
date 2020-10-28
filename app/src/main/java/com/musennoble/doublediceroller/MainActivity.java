package com.musennoble.doublediceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView image1, image2;
    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1 = findViewById(R.id.Img1);
        image2 = findViewById(R.id.Img2);
    }

    public void BtnClicked(View view) {
        int random1 = random.nextInt(6) + 1;
        int random2 = random.nextInt(6) + 1;
        switch (random1) {
            case 1:
                image1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                image1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                image1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                image1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                image1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                image1.setImageResource(R.drawable.dice6);
                break;
        }
        switch (random2) {
            case 1:
                image2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                image2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                image2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                image2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                image2.setImageResource(R.drawable.dice5);
                break;
            case 6:
                image2.setImageResource(R.drawable.dice6);
                break;
        }
    }
}