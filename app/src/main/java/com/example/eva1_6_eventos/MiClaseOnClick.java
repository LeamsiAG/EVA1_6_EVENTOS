package com.example.eva1_6_eventos;

import android.view.View;
import android.widget.Toast;

public class  MiClaseOnClick implements View.OnClickListener {
    MainActivity Clase;
    @Override
    public void onClick(View v) {
Toast.makeText(Clase,"Lo logramos Dora! por clase",Toast.LENGTH_SHORT).show();
    }
    public MiClaseOnClick (MainActivity Clase){
this.Clase=Clase;
    }
}
