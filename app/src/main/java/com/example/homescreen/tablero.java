package com.example.homescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.Toast;

public class tablero extends AppCompatActivity {
    public char turn = 0;


    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablero);
        dialog = new Dialog(this);
        Button btnWind =findViewById(R.id.ganador);
        btnWind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWinDialog();
            }


        });




    }

    private void openWinDialog() {
        dialog.setContentView(R.layout.win_layout_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView imageViewClose= dialog.findViewById(R.id.imageViewClose);
        Button btnSalir= dialog.findViewById(R.id.btnSalir);
        imageViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(tablero.this, "Dialog close",Toast.LENGTH_SHORT).show();
            }
        });
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(tablero.this, "Button salir",Toast.LENGTH_SHORT).show();
            }
        });
        dialog.show();

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