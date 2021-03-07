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
        ImageView img0 = (ImageView)findViewById(R.id.casilla0);
        if(img0.getTag() != "circle" || img0.getTag() != "cross" ){
            if(turn %2 == 0){
                img0.setImageResource(R.drawable.x);
                img0.setTag("cross");
            }else{
                img0.setImageResource(R.drawable.circle);
                img0.setTag("circle");
            }
        }
    }

}