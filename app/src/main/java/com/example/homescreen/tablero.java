package com.example.homescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.lang.reflect.Array;

public class tablero extends AppCompatActivity {
    public char turn = 0;
    private final String tableroArray[] = new String[9];
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablero);

    }

    public void handleBtn0 (View view){
        ImageView img = (ImageView)findViewById(R.id.casilla0);

        process(img, 0);
        turn++;
    }
    public void handleBtn1 (View view){
        ImageView img = (ImageView)findViewById(R.id.casilla1);
        process(img,1);
        turn++;
    }
    public void handleBtn2 (View view){
        ImageView img = (ImageView)findViewById(R.id.casilla2);
        process(img,2);
        turn++;
    }
    public void handleBtn3 (View view){
        ImageView img = (ImageView)findViewById(R.id.casilla3);
        process(img,3);
        turn++;
    }
    public void handleBtn4 (View view){
        ImageView img = (ImageView)findViewById(R.id.casilla4);
        process(img,4);
        turn++;
    }
    public void handleBtn5 (View view){
        ImageView img = (ImageView)findViewById(R.id.casilla5);
        process(img,5);
        turn++;
    }
    public void handleBtn6 (View view){
        ImageView img = (ImageView)findViewById(R.id.casilla6);
        process(img,6);
        turn++;
    }
    public void handleBtn7 (View view){
        ImageView img = (ImageView)findViewById(R.id.casilla7);
        process(img,7);
        turn++;
    }
    public void handleBtn8 (View view){
        ImageView img = (ImageView)findViewById(R.id.casilla8);
        process(img,8);
        turn++;
    }

    public void process(ImageView img, int position){
        if(img.getTag() != "circle" && img.getTag() != "cross" ){
            if(turn %2 == 0){
                img.setImageResource(R.drawable.x);
                img.setTag("cross");
                tableroArray[position] = "cross";
                winner("cross");
            }else{
                img.setImageResource(R.drawable.circle);
                img.setTag("circle");
                tableroArray[position] = "circle";
                winner("circle");
            }

        }
    }
    public void winner(String player){
        // true es cruz y false es circulo
        if(tableroArray[0] == "cross" && tableroArray[4] == "cross" && tableroArray[8] == "cross"){
            //cruz
            Log.d("TAG", "winner: 1"+player);
            for (int i=0; i < tableroArray.length; i++){
                tableroArray[i] = "";
            }

        }else if(tableroArray[0] == "circle" && tableroArray[4] == "circle" && tableroArray[8] == "circle"){
            //circulo
            Log.d("TAG", "winner: 2"+tableroArray[0]+tableroArray[4]+tableroArray[8]);

            for (int i = 0; i < tableroArray.length; i++){
                tableroArray[i] = "";
            }


        }else if(tableroArray[0] == "cross" && tableroArray[3] == "cross" && tableroArray[6] == "cross"){
            //cruz
            Log.d("TAG", "winner: 3"+player);
            for (int i=0; i < tableroArray.length; i++){
                tableroArray[i] = "";
            }
        }else if(tableroArray[0] == "circle" && tableroArray[3] == "circle" && tableroArray[6] == "circle"){
            //circulo
            Log.d("TAG", "winner:4 "+player);
            for (int i=0; i < tableroArray.length; i++){
                tableroArray[i] = "";
            }

        }else if(tableroArray[1] == "cross" && tableroArray[4] == "cross" && tableroArray[7] == "cross"){
            //cruz
            Log.d("TAG", "winner:5 "+player);
            for (int i=0; i < tableroArray.length; i++){
                tableroArray[i] = "";
            }

        }else if(tableroArray[1] == "circle" && tableroArray[4] == "circle" && tableroArray[7] == "circle"){
            //circulo
            Log.d("TAG", "winner: "+player);
            for (int i=0; i < tableroArray.length; i++){
                tableroArray[i] = "";
            }

        }else if(tableroArray[2] == "cross" && tableroArray[5] == "cross" && tableroArray[8] == "cross"){
            //cruz
            Log.d("TAG", "winner: "+player);
            for (int i=0; i < tableroArray.length; i++){
                tableroArray[i] = "";
            }

        }else if(tableroArray[2] == "circle" && tableroArray[5] == "circle" && tableroArray[8] == "circle"){
            //circulo
            Log.d("TAG", "winner: "+player);
            for (int i=0; i < tableroArray.length; i++){
                tableroArray[i] = "";
            }
        }else if(tableroArray[0] == "cross" && tableroArray[1] == "cross" && tableroArray[2] == "cross"){
            //cruz
            Log.d("TAG", "winner: "+player);
            for (int i=0; i < tableroArray.length; i++){
                tableroArray[i] = "";
            }

        }else if(tableroArray[0] == "circle" && tableroArray[1] == "circle" && tableroArray[2] == "circle"){
            //circulo
            Log.d("TAG", "winner: "+player);
            for (int i=0; i < tableroArray.length; i++){
                tableroArray[i] = "";
            }
        }else if(tableroArray[3] == "cross" && tableroArray[4] == "cross" && tableroArray[5] == "cross"){
            //cruz
            Log.d("TAG", "winner: "+player);
            for (int i=0; i < tableroArray.length; i++){
                tableroArray[i] = "";
            }

        }else if(tableroArray[3] == "circle" && tableroArray[4] == "circle" && tableroArray[5] == "circle"){
            //circulo
            Log.d("TAG", "winner: "+player);
            for (int i=0; i < tableroArray.length; i++){
                tableroArray[i] = "";
            }
        }else if(tableroArray[6] == "cross" && tableroArray[7] == "cross" && tableroArray[8] == "cross"){
            //cruz
            Log.d("TAG", "winner: "+player);
            for (int i=0; i < tableroArray.length; i++){
                tableroArray[i] = "";
            }

        }else if(tableroArray[6] == "circle" && tableroArray[7] == "circle" && tableroArray[8] == "circle"){
            //circulo
            Log.d("TAG", "winner: "+player);
            for (int i=0; i < tableroArray.length; i++){
                tableroArray[i] = "";
            }
        }else if(tableroArray[2] == "cross" && tableroArray[4] == "cross" && tableroArray[6] == "cross"){
            //cruz
            Log.d("TAG", "winner: "+player);
            for (int i=0; i < tableroArray.length; i++){
                tableroArray[i] = "";
            }

        }else if(tableroArray[2] == "circle" && tableroArray[4] == "circle" && tableroArray[6] == "circle"){
            //circulo
            Log.d("TAG", "winner: "+player);
            for (int i=0; i < tableroArray.length; i++){
                tableroArray[i] = "";
            }
        }else{
            if(turn > 7){
                Log.d("TAG", "empate");
            }
        }

    }

}