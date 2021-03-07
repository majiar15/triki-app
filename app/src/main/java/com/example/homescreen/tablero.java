package com.example.homescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class tablero extends AppCompatActivity {
    public char turn = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablero);

    }

    public void handleBtn0 (View view){
        ImageView img = (ImageView)findViewById(R.id.casilla0);
        process(img);
        turn++;
    }
    public void handleBtn1 (View view){
        ImageView img = (ImageView)findViewById(R.id.casilla1);
        process(img);
        turn++;
    }
    public void handleBtn2 (View view){
        ImageView img = (ImageView)findViewById(R.id.casilla2);
        process(img);
        turn++;
    }
    public void handleBtn3 (View view){
        ImageView img = (ImageView)findViewById(R.id.casilla3);
        process(img);
        turn++;
    }
    public void handleBtn4 (View view){
        ImageView img = (ImageView)findViewById(R.id.casilla4);
        process(img);
        turn++;
    }
    public void handleBtn5 (View view){
        ImageView img = (ImageView)findViewById(R.id.casilla5);
        process(img);
        turn++;
    }
    public void handleBtn6 (View view){
        ImageView img = (ImageView)findViewById(R.id.casilla6);
        process(img);
        turn++;
    }
    public void handleBtn7 (View view){
        ImageView img = (ImageView)findViewById(R.id.casilla7);
        process(img);
        turn++;
    }
    public void handleBtn8 (View view){
        ImageView img = (ImageView)findViewById(R.id.casilla8);
        process(img);
        turn++;
    }

    public void process(ImageView img){
        if(img.getTag() != "circle" || img.getTag() != "cross" ){
            if(turn %2 == 0){
                img.setImageResource(R.drawable.x);
                img.setTag("cross");
            }else{
                img.setImageResource(R.drawable.circle);
                img.setTag("circle");
            }
        }
    }

}