package com.project.rollroll;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageHelper;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.InputQueue;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = (Button)findViewById(R.id.rollButton);
        final ImageView leftDice = (ImageView)findViewById(R.id.image_leftDice);
        final ImageView rightDice = (ImageView)findViewById(R.id.image_rightDice);
        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };
        //ccreating a listner

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("roll&roll","button has been clicked!");

                Random generateRandom = new Random();
                int leftDiceRandom=generateRandom.nextInt(6);
                int rightDiceRandom = generateRandom.nextInt(6);

                Log.d("roll&roll","first random= "+leftDiceRandom+"\nsecond random= "+rightDiceRandom);
                leftDice.setImageResource(diceArray[leftDiceRandom]);
                rightDice.setImageResource(diceArray[rightDiceRandom]);

            }
        });


    }
}
