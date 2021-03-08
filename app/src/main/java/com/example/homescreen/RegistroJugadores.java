package com.example.homescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegistroJugadores extends AppCompatActivity {
    private String p1,p2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_jugadores);
        Button btnJugar = (Button) findViewById(R.id.Jugar);
        btnJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), tablero.class);
                TextView tv1 = findViewById(R.id.jugador1);
                TextView tv2 = findViewById(R.id.jugador2);
                p1 = tv1.getText().toString();
                p2 = tv2.getText().toString();
                intent.putExtra("player1",p1);
                intent.putExtra("player2",p2);
                startActivityForResult(intent, 0);
            }
        });
    }
}