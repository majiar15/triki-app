package com.example.homescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class tablero extends AppCompatActivity {
    public int turn = 0;
    public int player1Win = 0;
    public int player2Win = 0;
    TextView counterCruz, counterCircle;
    private final String[] taberArray = new String[9];

    Dialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablero);
        dialog = new Dialog(this);
    }

    private void openWinDialog(String player) {
        dialog.setContentView(R.layout.win_layout_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView imageViewClose= dialog.findViewById(R.id.imageViewClose);
        Button btnSalir= dialog.findViewById(R.id.btnSalir);
        TextView nameWiner = dialog.findViewById(R.id.nombreWin);
        nameWiner.setText(player);
        imageViewClose.setOnClickListener(v -> {
            dialog.dismiss();
            Toast.makeText(tablero.this, "Dialog close",Toast.LENGTH_SHORT).show();
        });
        btnSalir.setOnClickListener((View v) -> {
            dialog.dismiss();
            Toast.makeText(tablero.this, "Button salir",Toast.LENGTH_SHORT).show();
        });
        dialog.show();

    }
    private void openEmpateDialog() {
        dialog.setContentView(R.layout.empate_layout);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView imageViewClose= dialog.findViewById(R.id.imageViewClose);
        Button btnSalir= dialog.findViewById(R.id.btnSalir);

        imageViewClose.setOnClickListener(v -> {
            dialog.dismiss();
            Toast.makeText(tablero.this, "Dialog close",Toast.LENGTH_SHORT).show();
        });
        btnSalir.setOnClickListener((View v) -> {
            dialog.dismiss();
            Toast.makeText(tablero.this, "Button salir",Toast.LENGTH_SHORT).show();
        });
        dialog.show();

    }
    

    public void handleBtn0 (View view){
        ImageView img = findViewById(R.id.casilla0);
        
        process(img, 0);
        turn++;
    }
    public void handleBtn1 (View view){
        ImageView img = findViewById(R.id.casilla1);
        process(img,1);
        turn++;
    }
    public void handleBtn2 (View view){
        ImageView img = findViewById(R.id.casilla2);
        process(img,2);
        turn++;
    }
    public void handleBtn3 (View view){
        ImageView img = findViewById(R.id.casilla3);
        process(img,3);
        turn++;
    }
    public void handleBtn4 (View view){
        ImageView img = findViewById(R.id.casilla4);
        process(img,4);
        turn++;
    }
    public void handleBtn5 (View view){
        ImageView img = findViewById(R.id.casilla5);
        process(img,5);
        turn++;
    }
    public void handleBtn6 (View view){
        ImageView img = findViewById(R.id.casilla6);
        process(img,6);
        turn++;
    }
    public void handleBtn7 (View view){
        ImageView img = findViewById(R.id.casilla7);
        process(img,7);
        turn++;
    }
    public void handleBtn8 (View view){
        ImageView img = findViewById(R.id.casilla8);
        process(img,8);
        turn++;
    }

    public void process(ImageView img, int position){
        if(img.getTag() != "circle" && img.getTag() != "cross" ){

            if(turn %2 == 0){
                img.setImageResource(R.drawable.x);
                img.setTag("cross");
                taberArray[position] = "cross";
                winner("Cruz");
            }else{
                img.setImageResource(R.drawable.circle);
                img.setTag("circle");
                taberArray[position] = "circle";
                winner("Circulo");
            }

        }
    }
    public void winner(String player){
        // true es cruz y false es circulo
        if(taberArray[0] == "cross" && taberArray[4] == "cross" && taberArray[8] == "cross"){
            //cruz
            openWinDialog(player);
            player1Win++;
            resetTablero();
            
            for (int i = 0; i < taberArray.length; i++){
                taberArray[i] = "";
            }

        }else if(taberArray[0] == "circle" && taberArray[4] == "circle" && taberArray[8] == "circle"){
            //circulo
            openWinDialog(player);
            player2Win++;
            resetTablero();

            for (int i = 0; i < taberArray.length; i++){
                taberArray[i] = "";
            }


        }else if(taberArray[0] == "cross" && taberArray[3] == "cross" && taberArray[6] == "cross"){
            //cruz
            openWinDialog(player);
            player1Win++;
            resetTablero();

            for (int i = 0; i < taberArray.length; i++){
                taberArray[i] = "";
            }
        }else if(taberArray[0] == "circle" && taberArray[3] == "circle" && taberArray[6] == "circle"){
            //circulo
            openWinDialog(player);
            player2Win++;

            resetTablero();

            for (int i = 0; i < taberArray.length; i++){
                taberArray[i] = "";
            }

        }else if(taberArray[1] == "cross" && taberArray[4] == "cross" && taberArray[7] == "cross"){
            //cruz
            openWinDialog(player);
            player1Win++;
            resetTablero();

            for (int i = 0; i < taberArray.length; i++){
                taberArray[i] = "";
            }

        }else if(taberArray[1] == "circle" && taberArray[4] == "circle" && taberArray[7] == "circle"){
            //circulo
            openWinDialog(player);
            player2Win++;
            resetTablero();

            for (int i = 0; i < taberArray.length; i++){
                taberArray[i] = "";
            }

        }else if(taberArray[2] == "cross" && taberArray[5] == "cross" && taberArray[8] == "cross"){
            //cruz
            openWinDialog(player);
            player1Win++;
            resetTablero();

            for (int i = 0; i < taberArray.length; i++){
                taberArray[i] = "";
            }

        }else if(taberArray[2] == "circle" && taberArray[5] == "circle" && taberArray[8] == "circle"){
            //circulo
            openWinDialog(player);
            player2Win++;
            resetTablero();

            for (int i = 0; i < taberArray.length; i++){
                taberArray[i] = "";
            }
        }else if(taberArray[0] == "cross" && taberArray[1] == "cross" && taberArray[2] == "cross"){
            //cruz
            openWinDialog(player);
            player1Win++;
            resetTablero();

            for (int i = 0; i < taberArray.length; i++){
                taberArray[i] = "";
            }

        }else if(taberArray[0] == "circle" && taberArray[1] == "circle" && taberArray[2] == "circle"){
            //circulo
            openWinDialog(player);
            player2Win++;
            resetTablero();

            for (int i = 0; i < taberArray.length; i++){
                taberArray[i] = "";
            }
        }else if(taberArray[3] == "cross" && taberArray[4] == "cross" && taberArray[5] == "cross"){
            //cruz
            openWinDialog(player);
            player1Win++;
            resetTablero();

            for (int i = 0; i < taberArray.length; i++){
                taberArray[i] = "";
            }

        }else if(taberArray[3] == "circle" && taberArray[4] == "circle" && taberArray[5] == "circle"){
            //circulo
            openWinDialog(player);
            player2Win++;
            resetTablero();

            for (int i = 0; i < taberArray.length; i++){
                taberArray[i] = "";
            }
        }else if(taberArray[6] == "cross" && taberArray[7] == "cross" && taberArray[8] == "cross"){
            //cruz
            openWinDialog(player);
            player1Win++;
            resetTablero();

            for (int i = 0; i < taberArray.length; i++){
                taberArray[i] = "";
            }

        }else if(taberArray[6] == "circle" && taberArray[7] == "circle" && taberArray[8] == "circle"){
            //circulo
            openWinDialog(player);
            player2Win++;
            resetTablero();

            for (int i = 0; i < taberArray.length; i++){
                taberArray[i] = "";
            }
        }else if(taberArray[2] == "cross" && taberArray[4] == "cross" && taberArray[6] == "cross"){
            //cruz
            openWinDialog(player);
            player1Win++;
            resetTablero();

            for (int i = 0; i < taberArray.length; i++){
                taberArray[i] = "";
            }

        }else if(taberArray[2] == "circle" && taberArray[4] == "circle" && taberArray[6] == "circle"){
            //circulo
            openWinDialog(player);
            player2Win++;
            resetTablero();

            for (int i = 0; i < taberArray.length; i++){
                taberArray[i] = "";
            }
        }else{
            if(turn > 7){
                openEmpateDialog();
                for (int i = 0; i < taberArray.length; i++){
                    taberArray[i] = "";

                }
                resetTablero();
            }
        }

    }
    public  void resetTablero(){
        turn = -1;

        counterCruz = findViewById(R.id.txtCounterCurz);
        counterCircle = findViewById(R.id.txtCounterCircle);
        counterCruz.setText(String.valueOf(player1Win));
        counterCircle.setText(String.valueOf(player2Win));

        ImageView img = findViewById(R.id.casilla0);
        img.setImageResource(R.drawable.bg_transparent);
        img.setTag(" ");

        ImageView img1 = findViewById(R.id.casilla1);
        img1.setImageResource(R.drawable.bg_transparent);
        img1.setTag(" ");

        ImageView img2 = findViewById(R.id.casilla2);
        img2.setImageResource(R.drawable.bg_transparent);
        img2.setTag(" ");

        ImageView img3 = findViewById(R.id.casilla3);
        img3.setImageResource(R.drawable.bg_transparent);
        img3.setTag(" ");

        ImageView img4 = findViewById(R.id.casilla4);
        img4.setImageResource(R.drawable.bg_transparent);
        img4.setTag(" ");

        ImageView img5 = findViewById(R.id.casilla5);
        img5.setImageResource(R.drawable.bg_transparent);
        img5.setTag(" ");

        ImageView img6 = findViewById(R.id.casilla6);
        img6.setImageResource(R.drawable.bg_transparent);
        img6.setTag(" ");

        ImageView img7 = findViewById(R.id.casilla7);
        img7.setImageResource(R.drawable.bg_transparent);
        img7.setTag(" ");

        ImageView img8 = findViewById(R.id.casilla8);
        img8.setImageResource(R.drawable.bg_transparent);
        img8.setTag(" ");
    }
    public void handleButtonMenu(View view){
        finish();
    }
    public void handleButtonReset(View view){
        player1Win = 0;
        player2Win = 0;
        resetTablero();
        turn = 0;

    }
}