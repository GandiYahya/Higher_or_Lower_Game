package com.example.higherorlowergame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;

    public void randomNumberGenerator(){
        Random rand = new Random();
        randomNumber = rand.nextInt();
    }

    public void onGuess(View view){
        String message;
        EditText editTextNumber = (EditText) findViewById(R.id.editTextNumber);
        int guessNumber = Integer.parseInt(editTextNumber.getText().toString());
        if(guessNumber < randomNumber)
            message = "Higgher !!";
        else if(guessNumber > randomNumber)
            message = "lowwer !!";
        else {
            message = "You got me!!";
            randomNumberGenerator();
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }
}