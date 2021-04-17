package com.example.eva1_6_eventos;

    import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btnListener, btnClaseAnonima,btnPorClase;
MainActivity Clase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnListener = findViewById(R.id.btn_listen);
        btnListener.setOnClickListener(this);
        btnClaseAnonima = findViewById(R.id.btnClaseAnonima);
        btnPorClase = findViewById(R.id.btnClass);
        btnClaseAnonima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
         Toast.makeText(btnClaseAnonima.getContext(), "Lo logramos Dora!, por Anonima",Toast.LENGTH_LONG).show();
            }
        });
        Clase = this;
        btnPorClase.setOnClickListener(new MiClaseOnClick(Clase));
    }
    //USANDO LA PROPIEDAD android:onclick DEL WIDGET
    //NOMBREDELMETODO(View arg){}
    public void tuClick(View arg){
        //MOSTRAR UN MENSAJE (TOAST)
        Toast.makeText(this,"LO LOGRAMOS DORA!",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,"LO LOGRAMOS DORA POR LISTENER",Toast.LENGTH_LONG).show();
    }
}


