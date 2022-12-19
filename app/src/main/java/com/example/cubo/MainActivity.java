package com.example.cubo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView ivFront, ivTop, ivSide;
    ImageButton ibTopLeft, ibTop, ibLeft, ibRight, ibBottom, ibBottomRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivFront = findViewById(R.id.front);
        ivTop = findViewById(R.id.top);
        ivSide = findViewById(R.id.side);

        ibTopLeft = findViewById(R.id.arrow_top_left);
        ibTop = findViewById(R.id.arrow_top);
        ibLeft = findViewById(R.id.arrow_left);
        ibRight = findViewById(R.id.arrow_right);
        ibBottom = findViewById(R.id.arrow_bottom);
        ibBottomRight = findViewById(R.id.arrow_bottom_right);

        ibTopLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (ivFront.getTag().toString()){
                    case "celeste":
                        switch (ivTop.getTag().toString()){
                            case "amarillo":
                                ivTop.setImageResource(R.drawable.arriba_rojo);
                                ivTop.setTag("rojo");
                                ivSide.setImageResource(R.drawable.costado_verde);
                                ivSide.setTag("verde");
                                break;
                            case "rojo":
                                ivTop.setImageResource(R.drawable.arriba_verde);
                                ivTop.setTag("verde");
                                ivSide.setImageResource(R.drawable.costado_naranja);
                                ivSide.setTag("naranja");
                                break;
                            case "verde":
                                ivTop.setImageResource(R.drawable.arriba_naranja);
                                ivTop.setTag("naranja");
                                ivSide.setImageResource(R.drawable.costado_amarillo);
                                ivSide.setTag("amarillo");
                                break;
                            case "naranja":
                                ivTop.setImageResource(R.drawable.arriba_amarillo);
                                ivTop.setTag("amarillo");
                                ivSide.setImageResource(R.drawable.costado_rojo);
                                ivSide.setTag("rojo");
                                break;
                        }
                        break;
                    case "amarillo":
                        switch (ivTop.getTag().toString()){
                            case "azul":
                                ivTop.setImageResource(R.drawable.arriba_rojo);
                                ivTop.setTag("rojo");
                                ivSide.setImageResource(R.drawable.costado_celeste);
                                ivSide.setTag("celeste");
                                break;
                            case "rojo":
                                ivTop.setImageResource(R.drawable.arriba_celeste);
                                ivTop.setTag("celeste");
                                ivSide.setImageResource(R.drawable.costado_naranja);
                                ivSide.setTag("naranja");
                                break;
                            case "celeste":
                                ivTop.setImageResource(R.drawable.arriba_naranja);
                                ivTop.setTag("naranja");
                                ivSide.setImageResource(R.drawable.costado_azul);
                                ivSide.setTag("azul");
                                break;
                            case "naranja":
                                ivTop.setImageResource(R.drawable.arriba_azul);
                                ivTop.setTag("azul");
                                ivSide.setImageResource(R.drawable.costado_rojo);
                                ivSide.setTag("rojo");
                                break;
                        }
                        break;
                    case "rojo":
                        switch (ivTop.getTag().toString()){
                            case "amarillo":
                                ivTop.setImageResource(R.drawable.arriba_azul);
                                ivTop.setTag("azul");
                                ivSide.setImageResource(R.drawable.costado_verde);
                                ivSide.setTag("verde");
                                break;
                            case "azul":
                                ivTop.setImageResource(R.drawable.arriba_verde);
                                ivTop.setTag("verde");
                                ivSide.setImageResource(R.drawable.costado_celeste);
                                ivSide.setTag("celeste");
                                break;
                            case "verde":
                                ivTop.setImageResource(R.drawable.arriba_celeste);
                                ivTop.setTag("celeste");
                                ivSide.setImageResource(R.drawable.costado_amarillo);
                                ivSide.setTag("amarillo");
                                break;
                            case "celeste":
                                ivTop.setImageResource(R.drawable.arriba_amarillo);
                                ivTop.setTag("amarillo");
                                ivSide.setImageResource(R.drawable.costado_azul);
                                ivSide.setTag("azul");
                                break;
                        }
                        break;
                    case "naranja":
                        switch (ivTop.getTag().toString()){
                            case "amarillo":
                                ivTop.setImageResource(R.drawable.arriba_celeste);
                                ivTop.setTag("celeste");
                                ivSide.setImageResource(R.drawable.costado_verde);
                                ivSide.setTag("verde");
                                break;
                            case "celeste":
                                ivTop.setImageResource(R.drawable.arriba_verde);
                                ivTop.setTag("verde");
                                ivSide.setImageResource(R.drawable.costado_azul);
                                ivSide.setTag("azul");
                                break;
                            case "verde":
                                ivTop.setImageResource(R.drawable.arriba_azul);
                                ivTop.setTag("azul");
                                ivSide.setImageResource(R.drawable.costado_amarillo);
                                ivSide.setTag("amarillo");
                                break;
                            case "azul":
                                ivTop.setImageResource(R.drawable.arriba_amarillo);
                                ivTop.setTag("amarillo");
                                ivSide.setImageResource(R.drawable.costado_celeste);
                                ivSide.setTag("celeste");
                                break;
                        }
                        break;
                    case "verde":
                        switch (ivTop.getTag().toString()){
                            case "azul":
                                ivTop.setImageResource(R.drawable.arriba_naranja);
                                ivTop.setTag("naranja");
                                ivSide.setImageResource(R.drawable.costado_celeste);
                                ivSide.setTag("celeste");
                                break;
                            case "naranja":
                                ivTop.setImageResource(R.drawable.arriba_celeste);
                                ivTop.setTag("celeste");
                                ivSide.setImageResource(R.drawable.costado_rojo);
                                ivSide.setTag("rojo");
                                break;
                            case "celeste":
                                ivTop.setImageResource(R.drawable.arriba_rojo);
                                ivTop.setTag("rojo");
                                ivSide.setImageResource(R.drawable.costado_azul);
                                ivSide.setTag("azul");
                                break;
                            case "rojo":
                                ivTop.setImageResource(R.drawable.arriba_azul);
                                ivTop.setTag("azul");
                                ivSide.setImageResource(R.drawable.costado_naranja);
                                ivSide.setTag("naranja");
                                break;
                        }
                        break;
                    case "azul":
                        switch (ivTop.getTag().toString()){
                            case "amarillo":
                                ivTop.setImageResource(R.drawable.arriba_naranja);
                                ivTop.setTag("naranja");
                                ivSide.setImageResource(R.drawable.costado_verde);
                                ivSide.setTag("verde");
                                break;
                            case "naranja":
                                ivTop.setImageResource(R.drawable.arriba_verde);
                                ivTop.setTag("verde");
                                ivSide.setImageResource(R.drawable.costado_rojo);
                                ivSide.setTag("rojo");
                                break;
                            case "verde":
                                ivTop.setImageResource(R.drawable.arriba_rojo);
                                ivTop.setTag("rojo");
                                ivSide.setImageResource(R.drawable.costado_amarillo);
                                ivSide.setTag("amarillo");
                                break;
                            case "rojo":
                                ivTop.setImageResource(R.drawable.arriba_amarillo);
                                ivTop.setTag("amarillo");
                                ivSide.setImageResource(R.drawable.costado_naranja);
                                ivSide.setTag("naranja");
                                break;
                        }
                        break;
                }
            }
        });
    }
}