package com.facci.restaurantdl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivityDL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_dl);
        //langosta,hamburguesa, hotdog, chuzo, pizza , pollo , snacks
    }
    public void Click1 (View v){
        Toast.makeText(MainActivityDL.this,"Usted a seleccionado Bandeja de mariscos",Toast.LENGTH_SHORT).show();
    }
    public void Click2 (View v){
        Toast.makeText(MainActivityDL.this,"Usted a seleccionado Caldo de gallina",Toast.LENGTH_SHORT).show();
    }
    public void Click3 (View v){
        Toast.makeText(MainActivityDL.this,"Usted a seleccionado Ceviche de camarón",Toast.LENGTH_SHORT).show();
    }
    public void Click4 (View v){
        Toast.makeText(MainActivityDL.this,"Usted a seleccionado Corviche",Toast.LENGTH_SHORT).show();
    }
    public void Click5 (View v){
        Toast.makeText(MainActivityDL.this,"Usted a seleccionado Pescado frito",Toast.LENGTH_SHORT).show();
    }
    public void Click6 (View v){
        Toast.makeText(MainActivityDL.this,"Usted a seleccionado Salprieta",Toast.LENGTH_SHORT).show();
    }
    public void Click7 (View v){
        Toast.makeText(MainActivityDL.this,"Usted a seleccionado Arroz de mariscos",Toast.LENGTH_SHORT).show();
    }

}
