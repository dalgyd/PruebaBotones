package com.example.pruebabotones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Switch switch3, switch4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //No tienen el metodo onClick
        switch3 = findViewById(R.id.switch3);
        switch4 = findViewById(R.id.switch4);
    }

    public void activo (View vi){

        if (switch3.isChecked())
            Toast.makeText(this,"Wifi activo", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, "Wifi inactivo", Toast.LENGTH_LONG).show();
        if (switch4.isChecked())
            Toast.makeText(this, "Luz activa", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, "Luz inaciva", Toast.LENGTH_LONG).show();

    }

    public void verificarW (View v){
        if (switch3.isChecked())
            Toast.makeText(this, "Activo el wifi", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this,"Desactivo el wifi", Toast.LENGTH_SHORT).show();
    }
    public void verificarL (View vl){
        if (switch4.isChecked())
            Toast.makeText(this, "Activo la luz", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this,"Desactivo la luz", Toast.LENGTH_SHORT).show();
    }

}