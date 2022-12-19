package com.example.cubo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

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

        /*
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
        ibBottomRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (ivFront.getTag().toString()){
                    case "celeste":
                        switch (ivTop.getTag().toString()){
                            case "verde":
                                ivTop.setImageResource(R.drawable.arriba_rojo);
                                ivTop.setTag("rojo");
                                ivSide.setImageResource(R.drawable.costado_verde);
                                ivSide.setTag("verde");
                                break;
                            case "naranja":
                                ivTop.setImageResource(R.drawable.arriba_verde);
                                ivTop.setTag("verde");
                                ivSide.setImageResource(R.drawable.costado_naranja);
                                ivSide.setTag("naranja");
                                break;
                            case "amarillo":
                                ivTop.setImageResource(R.drawable.arriba_naranja);
                                ivTop.setTag("naranja");
                                ivSide.setImageResource(R.drawable.costado_amarillo);
                                ivSide.setTag("amarillo");
                                break;
                            case "rojo":
                                ivTop.setImageResource(R.drawable.arriba_amarillo);
                                ivTop.setTag("amarillo");
                                ivSide.setImageResource(R.drawable.costado_rojo);
                                ivSide.setTag("rojo");
                                break;
                        }
                        break;
                    case "amarillo":
                        switch (ivTop.getTag().toString()){
                            case "celeste":
                                ivTop.setImageResource(R.drawable.arriba_rojo);
                                ivTop.setTag("rojo");
                                ivSide.setImageResource(R.drawable.costado_celeste);
                                ivSide.setTag("celeste");
                                break;
                            case "naranja":
                                ivTop.setImageResource(R.drawable.arriba_celeste);
                                ivTop.setTag("celeste");
                                ivSide.setImageResource(R.drawable.costado_naranja);
                                ivSide.setTag("naranja");
                                break;
                            case "azul":
                                ivTop.setImageResource(R.drawable.arriba_naranja);
                                ivTop.setTag("naranja");
                                ivSide.setImageResource(R.drawable.costado_azul);
                                ivSide.setTag("azul");
                                break;
                            case "rojo":
                                ivTop.setImageResource(R.drawable.arriba_azul);
                                ivTop.setTag("azul");
                                ivSide.setImageResource(R.drawable.costado_rojo);
                                ivSide.setTag("rojo");
                                break;
                        }
                        break;
                    case "rojo":
                        switch (ivTop.getTag().toString()){
                            case "verde":
                                ivTop.setImageResource(R.drawable.arriba_azul);
                                ivTop.setTag("azul");
                                ivSide.setImageResource(R.drawable.costado_verde);
                                ivSide.setTag("verde");
                                break;
                            case "celeste":
                                ivTop.setImageResource(R.drawable.arriba_verde);
                                ivTop.setTag("verde");
                                ivSide.setImageResource(R.drawable.costado_celeste);
                                ivSide.setTag("celeste");
                                break;
                            case "amarillo":
                                ivTop.setImageResource(R.drawable.arriba_celeste);
                                ivTop.setTag("celeste");
                                ivSide.setImageResource(R.drawable.costado_amarillo);
                                ivSide.setTag("amarillo");
                                break;
                            case "azul":
                                ivTop.setImageResource(R.drawable.arriba_amarillo);
                                ivTop.setTag("amarillo");
                                ivSide.setImageResource(R.drawable.costado_azul);
                                ivSide.setTag("azul");
                                break;
                        }
                        break;
                    case "naranja":
                        switch (ivTop.getTag().toString()){
                            case "verde":
                                ivTop.setImageResource(R.drawable.arriba_celeste);
                                ivTop.setTag("celeste");
                                ivSide.setImageResource(R.drawable.costado_verde);
                                ivSide.setTag("verde");
                                break;
                            case "azul":
                                ivTop.setImageResource(R.drawable.arriba_verde);
                                ivTop.setTag("verde");
                                ivSide.setImageResource(R.drawable.costado_azul);
                                ivSide.setTag("azul");
                                break;
                            case "amarillo":
                                ivTop.setImageResource(R.drawable.arriba_azul);
                                ivTop.setTag("azul");
                                ivSide.setImageResource(R.drawable.costado_amarillo);
                                ivSide.setTag("amarillo");
                                break;
                            case "celeste":
                                ivTop.setImageResource(R.drawable.arriba_amarillo);
                                ivTop.setTag("amarillo");
                                ivSide.setImageResource(R.drawable.costado_celeste);
                                ivSide.setTag("celeste");
                                break;
                        }
                        break;
                    case "verde":
                        switch (ivTop.getTag().toString()){
                            case "celeste":
                                ivTop.setImageResource(R.drawable.arriba_naranja);
                                ivTop.setTag("naranja");
                                ivSide.setImageResource(R.drawable.costado_celeste);
                                ivSide.setTag("celeste");
                                break;
                            case "rojo":
                                ivTop.setImageResource(R.drawable.arriba_celeste);
                                ivTop.setTag("celeste");
                                ivSide.setImageResource(R.drawable.costado_rojo);
                                ivSide.setTag("rojo");
                                break;
                            case "azul":
                                ivTop.setImageResource(R.drawable.arriba_rojo);
                                ivTop.setTag("rojo");
                                ivSide.setImageResource(R.drawable.costado_azul);
                                ivSide.setTag("azul");
                                break;
                            case "naranja":
                                ivTop.setImageResource(R.drawable.arriba_azul);
                                ivTop.setTag("azul");
                                ivSide.setImageResource(R.drawable.costado_naranja);
                                ivSide.setTag("naranja");
                                break;
                        }
                        break;
                    case "azul":
                        switch (ivTop.getTag().toString()){
                            case "verde":
                                ivTop.setImageResource(R.drawable.arriba_naranja);
                                ivTop.setTag("naranja");
                                ivSide.setImageResource(R.drawable.costado_verde);
                                ivSide.setTag("verde");
                                break;
                            case "rojo":
                                ivTop.setImageResource(R.drawable.arriba_verde);
                                ivTop.setTag("verde");
                                ivSide.setImageResource(R.drawable.costado_rojo);
                                ivSide.setTag("rojo");
                                break;
                            case "amarillo":
                                ivTop.setImageResource(R.drawable.arriba_rojo);
                                ivTop.setTag("rojo");
                                ivSide.setImageResource(R.drawable.costado_amarillo);
                                ivSide.setTag("amarillo");
                                break;
                            case "naranja":
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

        ibTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (ivSide.getTag().toString()){
                    case "celeste":
                        switch (ivTop.getTag().toString()){
                            case "amarillo":
                                ivTop.setImageResource(R.drawable.arriba_naranja);
                                ivTop.setTag("naranja");
                                ivFront.setImageResource(R.drawable.frente_verde);
                                ivFront.setTag("verde");
                                break;
                            case "naranja":
                                ivTop.setImageResource(R.drawable.arriba_verde);
                                ivTop.setTag("verde");
                                ivFront.setImageResource(R.drawable.frente_rojo);
                                ivFront.setTag("rojo");
                                break;
                            case "verde":
                                ivTop.setImageResource(R.drawable.arriba_rojo);
                                ivTop.setTag("rojo");
                                ivFront.setImageResource(R.drawable.frente_amarillo);
                                ivFront.setTag("amarillo");
                                break;
                            case "rojo":
                                ivTop.setImageResource(R.drawable.arriba_amarillo);
                                ivTop.setTag("amarillo");
                                ivFront.setImageResource(R.drawable.frente_naranja);
                                ivFront.setTag("naranja");
                                break;
                        }
                        break;
                    case "amarillo":
                        switch (ivTop.getTag().toString()){
                            case "azul":
                                ivTop.setImageResource(R.drawable.arriba_naranja);
                                ivTop.setTag("naranja");
                                ivFront.setImageResource(R.drawable.frente_celeste);
                                ivFront.setTag("celeste");
                                break;
                            case "naranja":
                                ivTop.setImageResource(R.drawable.arriba_celeste);
                                ivTop.setTag("celeste");
                                ivFront.setImageResource(R.drawable.frente_rojo);
                                ivFront.setTag("rojo");
                                break;
                            case "celeste":
                                ivTop.setImageResource(R.drawable.arriba_rojo);
                                ivTop.setTag("rojo");
                                ivFront.setImageResource(R.drawable.frente_azul);
                                ivFront.setTag("azul");
                                break;
                            case "rojo":
                                ivTop.setImageResource(R.drawable.arriba_azul);
                                ivTop.setTag("azul");
                                ivFront.setImageResource(R.drawable.frente_naranja);
                                ivFront.setTag("naranja");
                                break;
                        }
                        break;
                    case "rojo":
                        switch (ivTop.getTag().toString()){
                            case "amarillo":
                                ivTop.setImageResource(R.drawable.arriba_celeste);
                                ivTop.setTag("celeste");
                                ivFront.setImageResource(R.drawable.frente_verde);
                                ivFront.setTag("verde");
                                break;
                            case "celeste":
                                ivTop.setImageResource(R.drawable.arriba_verde);
                                ivTop.setTag("verde");
                                ivFront.setImageResource(R.drawable.frente_azul);
                                ivFront.setTag("azul");
                                break;
                            case "verde":
                                ivTop.setImageResource(R.drawable.arriba_azul);
                                ivTop.setTag("azul");
                                ivFront.setImageResource(R.drawable.frente_amarillo);
                                ivFront.setTag("amarillo");
                                break;
                            case "azul":
                                ivTop.setImageResource(R.drawable.arriba_amarillo);
                                ivTop.setTag("amarillo");
                                ivFront.setImageResource(R.drawable.frente_celeste);
                                ivFront.setTag("celeste");
                                break;
                        }
                        break;
                    case "naranja":
                        switch (ivTop.getTag().toString()){
                            case "amarillo":
                                ivTop.setImageResource(R.drawable.arriba_azul);
                                ivTop.setTag("azul");
                                ivFront.setImageResource(R.drawable.frente_verde);
                                ivFront.setTag("verde");
                                break;
                            case "azul":
                                ivTop.setImageResource(R.drawable.arriba_verde);
                                ivTop.setTag("verde");
                                ivFront.setImageResource(R.drawable.frente_celeste);
                                ivFront.setTag("celeste");
                                break;
                            case "verde":
                                ivTop.setImageResource(R.drawable.arriba_celeste);
                                ivTop.setTag("celeste");
                                ivFront.setImageResource(R.drawable.frente_amarillo);
                                ivFront.setTag("amarillo");
                                break;
                            case "celeste":
                                ivTop.setImageResource(R.drawable.arriba_amarillo);
                                ivTop.setTag("amarillo");
                                ivFront.setImageResource(R.drawable.frente_azul);
                                ivFront.setTag("azul");
                                break;
                        }
                        break;
                    case "verde":
                        switch (ivTop.getTag().toString()){
                            case "azul":
                                ivTop.setImageResource(R.drawable.arriba_rojo);
                                ivTop.setTag("rojo");
                                ivFront.setImageResource(R.drawable.frente_celeste);
                                ivFront.setTag("celeste");
                                break;
                            case "rojo":
                                ivTop.setImageResource(R.drawable.arriba_celeste);
                                ivTop.setTag("celeste");
                                ivFront.setImageResource(R.drawable.frente_naranja);
                                ivFront.setTag("naranja");
                                break;
                            case "celeste":
                                ivTop.setImageResource(R.drawable.arriba_naranja);
                                ivTop.setTag("naranja");
                                ivFront.setImageResource(R.drawable.frente_azul);
                                ivFront.setTag("azul");
                                break;
                            case "naranja":
                                ivTop.setImageResource(R.drawable.arriba_azul);
                                ivTop.setTag("azul");
                                ivFront.setImageResource(R.drawable.frente_rojo);
                                ivFront.setTag("rojo");
                                break;
                        }
                        break;
                    case "azul":
                        switch (ivTop.getTag().toString()){
                            case "amarillo":
                                ivTop.setImageResource(R.drawable.arriba_rojo);
                                ivTop.setTag("rojo");
                                ivFront.setImageResource(R.drawable.frente_verde);
                                ivFront.setTag("verde");
                                break;
                            case "rojo":
                                ivTop.setImageResource(R.drawable.arriba_verde);
                                ivTop.setTag("verde");
                                ivFront.setImageResource(R.drawable.frente_naranja);
                                ivFront.setTag("naranja");
                                break;
                            case "verde":
                                ivTop.setImageResource(R.drawable.arriba_naranja);
                                ivTop.setTag("naranja");
                                ivFront.setImageResource(R.drawable.frente_amarillo);
                                ivFront.setTag("amarillo");
                                break;
                            case "naranja":
                                ivTop.setImageResource(R.drawable.arriba_amarillo);
                                ivTop.setTag("amarillo");
                                ivFront.setImageResource(R.drawable.frente_rojo);
                                ivFront.setTag("rojo");
                                break;
                        }
                        break;
                }
            }
        });
        ibBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (ivSide.getTag().toString()){
                    case "celeste":
                        switch (ivTop.getTag().toString()){
                            case "amarillo":
                                ivTop.setImageResource(R.drawable.arriba_rojo);
                                ivTop.setTag("rojo");
                                ivFront.setImageResource(R.drawable.frente_amarillo);
                                ivFront.setTag("amarillo");
                                break;
                            case "naranja":
                                ivTop.setImageResource(R.drawable.arriba_amarillo);
                                ivTop.setTag("amarillo");
                                ivFront.setImageResource(R.drawable.frente_naranja);
                                ivFront.setTag("naranja");
                                break;
                            case "verde":
                                ivTop.setImageResource(R.drawable.arriba_naranja);
                                ivTop.setTag("naranja");
                                ivFront.setImageResource(R.drawable.frente_verde);
                                ivFront.setTag("verde");
                                break;
                            case "rojo":
                                ivTop.setImageResource(R.drawable.arriba_verde);
                                ivTop.setTag("verde");
                                ivFront.setImageResource(R.drawable.frente_rojo);
                                ivFront.setTag("rojo");
                                break;
                        }
                        break;
                    case "amarillo":
                        switch (ivTop.getTag().toString()){
                            case "azul":
                                ivTop.setImageResource(R.drawable.arriba_rojo);
                                ivTop.setTag("rojo");
                                ivFront.setImageResource(R.drawable.frente_azul);
                                ivFront.setTag("azul");
                                break;
                            case "naranja":
                                ivTop.setImageResource(R.drawable.arriba_azul);
                                ivTop.setTag("azul");
                                ivFront.setImageResource(R.drawable.frente_naranja);
                                ivFront.setTag("naranja");
                                break;
                            case "celeste":
                                ivTop.setImageResource(R.drawable.arriba_naranja);
                                ivTop.setTag("naranja");
                                ivFront.setImageResource(R.drawable.frente_celeste);
                                ivFront.setTag("celeste");
                                break;
                            case "rojo":
                                ivTop.setImageResource(R.drawable.arriba_celeste);
                                ivTop.setTag("celeste");
                                ivFront.setImageResource(R.drawable.frente_rojo);
                                ivFront.setTag("rojo");
                                break;
                        }
                        break;
                    case "rojo":
                        switch (ivTop.getTag().toString()){
                            case "verde":
                                ivTop.setImageResource(R.drawable.arriba_celeste);
                                ivTop.setTag("celeste");
                                ivFront.setImageResource(R.drawable.frente_verde);
                                ivFront.setTag("verde");
                                break;
                            case "azul":
                                ivTop.setImageResource(R.drawable.arriba_verde);
                                ivTop.setTag("verde");
                                ivFront.setImageResource(R.drawable.frente_azul);
                                ivFront.setTag("azul");
                                break;
                            case "amarillo":
                                ivTop.setImageResource(R.drawable.arriba_azul);
                                ivTop.setTag("azul");
                                ivFront.setImageResource(R.drawable.frente_amarillo);
                                ivFront.setTag("amarillo");
                                break;
                            case "celeste":
                                ivTop.setImageResource(R.drawable.arriba_amarillo);
                                ivTop.setTag("amarillo");
                                ivFront.setImageResource(R.drawable.frente_celeste);
                                ivFront.setTag("celeste");
                                break;
                        }
                        break;
                    case "naranja":
                        switch (ivTop.getTag().toString()){
                            case "verde":
                                ivTop.setImageResource(R.drawable.arriba_azul);
                                ivTop.setTag("azul");
                                ivFront.setImageResource(R.drawable.frente_verde);
                                ivFront.setTag("verde");
                                break;
                            case "celeste":
                                ivTop.setImageResource(R.drawable.arriba_verde);
                                ivTop.setTag("verde");
                                ivFront.setImageResource(R.drawable.frente_celeste);
                                ivFront.setTag("celeste");
                                break;
                            case "amarillo":
                                ivTop.setImageResource(R.drawable.arriba_celeste);
                                ivTop.setTag("celeste");
                                ivFront.setImageResource(R.drawable.frente_amarillo);
                                ivFront.setTag("amarillo");
                                break;
                            case "azul":
                                ivTop.setImageResource(R.drawable.arriba_amarillo);
                                ivTop.setTag("amarillo");
                                ivFront.setImageResource(R.drawable.frente_azul);
                                ivFront.setTag("azul");
                                break;
                        }
                        break;
                    case "verde":
                        switch (ivTop.getTag().toString()){
                            case "celeste":
                                ivTop.setImageResource(R.drawable.arriba_rojo);
                                ivTop.setTag("rojo");
                                ivFront.setImageResource(R.drawable.frente_celeste);
                                ivFront.setTag("celeste");
                                break;
                            case "naranja":
                                ivTop.setImageResource(R.drawable.arriba_celeste);
                                ivTop.setTag("celeste");
                                ivFront.setImageResource(R.drawable.frente_naranja);
                                ivFront.setTag("naranja");
                                break;
                            case "azul":
                                ivTop.setImageResource(R.drawable.arriba_naranja);
                                ivTop.setTag("naranja");
                                ivFront.setImageResource(R.drawable.frente_azul);
                                ivFront.setTag("azul");
                                break;
                            case "rojo":
                                ivTop.setImageResource(R.drawable.arriba_azul);
                                ivTop.setTag("azul");
                                ivFront.setImageResource(R.drawable.frente_rojo);
                                ivFront.setTag("rojo");
                                break;
                        }
                        break;
                    case "azul":
                        switch (ivTop.getTag().toString()){
                            case "verde":
                                ivTop.setImageResource(R.drawable.arriba_rojo);
                                ivTop.setTag("rojo");
                                ivFront.setImageResource(R.drawable.frente_verde);
                                ivFront.setTag("verde");
                                break;
                            case "naranja":
                                ivTop.setImageResource(R.drawable.arriba_verde);
                                ivTop.setTag("verde");
                                ivFront.setImageResource(R.drawable.frente_naranja);
                                ivFront.setTag("naranja");
                                break;
                            case "amarillo":
                                ivTop.setImageResource(R.drawable.arriba_naranja);
                                ivTop.setTag("naranja");
                                ivFront.setImageResource(R.drawable.frente_amarillo);
                                ivFront.setTag("amarillo");
                                break;
                            case "rojo":
                                ivTop.setImageResource(R.drawable.arriba_amarillo);
                                ivTop.setTag("amarillo");
                                ivFront.setImageResource(R.drawable.frente_rojo);
                                ivFront.setTag("rojo");
                                break;
                        }
                        break;
                }
            }
        });

        ibLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (ivTop.getTag().toString()){
                    case "celeste":
                        switch (ivFront.getTag().toString()){
                            case "amarillo":
                                ivFront.setImageResource(R.drawable.frente_naranja);
                                ivFront.setTag("naranja");
                                ivSide.setImageResource(R.drawable.costado_verde);
                                ivSide.setTag("verde");
                                break;
                            case "naranja":
                                ivFront.setImageResource(R.drawable.frente_verde);
                                ivFront.setTag("verde");
                                ivSide.setImageResource(R.drawable.costado_rojo);
                                ivSide.setTag("rojo");
                                break;
                            case "verde":
                                ivFront.setImageResource(R.drawable.frente_rojo);
                                ivFront.setTag("rojo");
                                ivSide.setImageResource(R.drawable.costado_amarillo);
                                ivSide.setTag("amarillo");
                                break;
                            case "rojo":
                                ivFront.setImageResource(R.drawable.frente_amarillo);
                                ivFront.setTag("amarillo");
                                ivSide.setImageResource(R.drawable.costado_naranja);
                                ivSide.setTag("naranja");
                                break;
                        }
                        break;
                    case "amarillo":
                        switch (ivFront.getTag().toString()){
                            case "celeste":
                                ivFront.setImageResource(R.drawable.frente_rojo);
                                ivFront.setTag("rojo");
                                ivSide.setImageResource(R.drawable.costado_azul);
                                ivSide.setTag("azul");
                                break;
                            case "rojo":
                                ivFront.setImageResource(R.drawable.frente_azul);
                                ivFront.setTag("azul");
                                ivSide.setImageResource(R.drawable.costado_naranja);
                                ivSide.setTag("naranja");
                                break;
                            case "azul":
                                ivFront.setImageResource(R.drawable.frente_naranja);
                                ivFront.setTag("naranja");
                                ivSide.setImageResource(R.drawable.costado_celeste);
                                ivSide.setTag("celeste");
                                break;
                            case "naranja":
                                ivFront.setImageResource(R.drawable.frente_celeste);
                                ivFront.setTag("celeste");
                                ivSide.setImageResource(R.drawable.costado_rojo);
                                ivSide.setTag("rojo");
                                break;
                        }
                        break;
                    case "rojo":
                        switch (ivFront.getTag().toString()){
                            case "verde":
                                ivFront.setImageResource(R.drawable.frente_azul);
                                ivFront.setTag("azul");
                                ivSide.setImageResource(R.drawable.costado_amarillo);
                                ivSide.setTag("amarillo");
                                break;
                            case "azul":
                                ivFront.setImageResource(R.drawable.frente_amarillo);
                                ivFront.setTag("amarillo");
                                ivSide.setImageResource(R.drawable.costado_celeste);
                                ivSide.setTag("celeste");
                                break;
                            case "amarillo":
                                ivFront.setImageResource(R.drawable.frente_celeste);
                                ivFront.setTag("celeste");
                                ivSide.setImageResource(R.drawable.costado_verde);
                                ivSide.setTag("verde");
                                break;
                            case "celeste":
                                ivFront.setImageResource(R.drawable.frente_verde);
                                ivFront.setTag("verde");
                                ivSide.setImageResource(R.drawable.costado_azul);
                                ivSide.setTag("azul");
                                break;
                        }
                        break;
                    case "naranja":
                        switch (ivFront.getTag().toString()){
                            case "verde":
                                ivFront.setImageResource(R.drawable.frente_celeste);
                                ivFront.setTag("celeste");
                                ivSide.setImageResource(R.drawable.costado_amarillo);
                                ivSide.setTag("amarillo");
                                break;
                            case "celeste":
                                ivFront.setImageResource(R.drawable.frente_amarillo);
                                ivFront.setTag("amarillo");
                                ivSide.setImageResource(R.drawable.costado_azul);
                                ivSide.setTag("azul");
                                break;
                            case "amarillo":
                                ivFront.setImageResource(R.drawable.frente_azul);
                                ivFront.setTag("azul");
                                ivSide.setImageResource(R.drawable.costado_verde);
                                ivSide.setTag("verde");
                                break;
                            case "azul":
                                ivFront.setImageResource(R.drawable.frente_verde);
                                ivFront.setTag("verde");
                                ivSide.setImageResource(R.drawable.costado_celeste);
                                ivSide.setTag("celeste");
                                break;
                        }
                        break;
                    case "verde":
                        switch (ivFront.getTag().toString()){
                            case "celeste":
                                ivFront.setImageResource(R.drawable.frente_naranja);
                                ivFront.setTag("naranja");
                                ivSide.setImageResource(R.drawable.costado_azul);
                                ivSide.setTag("azul");
                                break;
                            case "naranja":
                                ivFront.setImageResource(R.drawable.frente_azul);
                                ivFront.setTag("azul");
                                ivSide.setImageResource(R.drawable.costado_rojo);
                                ivSide.setTag("rojo");
                                break;
                            case "azul":
                                ivFront.setImageResource(R.drawable.frente_rojo);
                                ivFront.setTag("rojo");
                                ivSide.setImageResource(R.drawable.costado_celeste);
                                ivSide.setTag("celeste");
                                break;
                            case "rojo":
                                ivFront.setImageResource(R.drawable.frente_celeste);
                                ivFront.setTag("celeste");
                                ivSide.setImageResource(R.drawable.costado_naranja);
                                ivSide.setTag("naranja");
                                break;
                        }
                        break;
                    case "azul":
                        switch (ivFront.getTag().toString()){
                            case "verde":
                                ivFront.setImageResource(R.drawable.frente_naranja);
                                ivFront.setTag("naranja");
                                ivSide.setImageResource(R.drawable.costado_amarillo);
                                ivSide.setTag("amarillo");
                                break;
                            case "naranja":
                                ivFront.setImageResource(R.drawable.frente_amarillo);
                                ivFront.setTag("amarillo");
                                ivSide.setImageResource(R.drawable.costado_rojo);
                                ivSide.setTag("rojo");
                                break;
                            case "amarillo":
                                ivFront.setImageResource(R.drawable.frente_rojo);
                                ivFront.setTag("rojo");
                                ivSide.setImageResource(R.drawable.costado_verde);
                                ivSide.setTag("verde");
                                break;
                            case "rojo":
                                ivFront.setImageResource(R.drawable.frente_verde);
                                ivFront.setTag("verde");
                                ivSide.setImageResource(R.drawable.costado_naranja);
                                ivSide.setTag("naranja");
                                break;
                        }
                        break;
                }
            }
        });
        ibRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (ivTop.getTag().toString()){
                    case "celeste":
                        switch (ivFront.getTag().toString()){
                            case "amarillo":
                                ivFront.setImageResource(R.drawable.frente_rojo);
                                ivFront.setTag("rojo");
                                ivSide.setImageResource(R.drawable.costado_amarillo);
                                ivSide.setTag("amarillo");
                                break;
                            case "naranja":
                                ivFront.setImageResource(R.drawable.frente_amarillo);
                                ivFront.setTag("amarillo");
                                ivSide.setImageResource(R.drawable.costado_naranja);
                                ivSide.setTag("naranja");
                                break;
                            case "verde":
                                ivFront.setImageResource(R.drawable.frente_naranja);
                                ivFront.setTag("naranja");
                                ivSide.setImageResource(R.drawable.costado_verde);
                                ivSide.setTag("verde");
                                break;
                            case "rojo":
                                ivFront.setImageResource(R.drawable.frente_verde);
                                ivFront.setTag("verde");
                                ivSide.setImageResource(R.drawable.costado_rojo);
                                ivSide.setTag("rojo");
                                break;
                        }
                        break;
                    case "amarillo":
                        switch (ivFront.getTag().toString()){
                            case "celeste":
                                ivFront.setImageResource(R.drawable.frente_naranja);
                                ivFront.setTag("naranja");
                                ivSide.setImageResource(R.drawable.costado_celeste);
                                ivSide.setTag("celeste");
                                break;
                            case "rojo":
                                ivFront.setImageResource(R.drawable.frente_celeste);
                                ivFront.setTag("celeste");
                                ivSide.setImageResource(R.drawable.costado_rojo);
                                ivSide.setTag("rojo");
                                break;
                            case "azul":
                                ivFront.setImageResource(R.drawable.frente_rojo);
                                ivFront.setTag("rojo");
                                ivSide.setImageResource(R.drawable.costado_azul);
                                ivSide.setTag("azul");
                                break;
                            case "naranja":
                                ivFront.setImageResource(R.drawable.frente_azul);
                                ivFront.setTag("azul");
                                ivSide.setImageResource(R.drawable.costado_naranja);
                                ivSide.setTag("naranja");
                                break;
                        }
                        break;
                    case "rojo":
                        switch (ivFront.getTag().toString()){
                            case "verde":
                                ivFront.setImageResource(R.drawable.frente_celeste);
                                ivFront.setTag("celeste");
                                ivSide.setImageResource(R.drawable.costado_verde);
                                ivSide.setTag("verde");
                                break;
                            case "azul":
                                ivFront.setImageResource(R.drawable.frente_verde);
                                ivFront.setTag("verde");
                                ivSide.setImageResource(R.drawable.costado_azul);
                                ivSide.setTag("azul");
                                break;
                            case "amarillo":
                                ivFront.setImageResource(R.drawable.frente_azul);
                                ivFront.setTag("azul");
                                ivSide.setImageResource(R.drawable.costado_amarillo);
                                ivSide.setTag("amarillo");
                                break;
                            case "celeste":
                                ivFront.setImageResource(R.drawable.frente_amarillo);
                                ivFront.setTag("amarillo");
                                ivSide.setImageResource(R.drawable.costado_celeste);
                                ivSide.setTag("celeste");
                                break;
                        }
                        break;
                    case "naranja":
                        switch (ivFront.getTag().toString()){
                            case "verde":
                                ivFront.setImageResource(R.drawable.frente_azul);
                                ivFront.setTag("azul");
                                ivSide.setImageResource(R.drawable.costado_verde);
                                ivSide.setTag("verde");
                                break;
                            case "celeste":
                                ivFront.setImageResource(R.drawable.frente_verde);
                                ivFront.setTag("verde");
                                ivSide.setImageResource(R.drawable.costado_celeste);
                                ivSide.setTag("celeste");
                                break;
                            case "amarillo":
                                ivFront.setImageResource(R.drawable.frente_celeste);
                                ivFront.setTag("celeste");
                                ivSide.setImageResource(R.drawable.costado_amarillo);
                                ivSide.setTag("amarillo");
                                break;
                            case "azul":
                                ivFront.setImageResource(R.drawable.frente_amarillo);
                                ivFront.setTag("amarillo");
                                ivSide.setImageResource(R.drawable.costado_azul);
                                ivSide.setTag("azul");
                                break;
                        }
                        break;
                    case "verde":
                        switch (ivFront.getTag().toString()){
                            case "celeste":
                                ivFront.setImageResource(R.drawable.frente_rojo);
                                ivFront.setTag("rojo");
                                ivSide.setImageResource(R.drawable.costado_celeste);
                                ivSide.setTag("celeste");
                                break;
                            case "naranja":
                                ivFront.setImageResource(R.drawable.frente_celeste);
                                ivFront.setTag("celeste");
                                ivSide.setImageResource(R.drawable.costado_naranja);
                                ivSide.setTag("naranja");
                                break;
                            case "azul":
                                ivFront.setImageResource(R.drawable.frente_naranja);
                                ivFront.setTag("naranja");
                                ivSide.setImageResource(R.drawable.costado_azul);
                                ivSide.setTag("azul");
                                break;
                            case "rojo":
                                ivFront.setImageResource(R.drawable.frente_azul);
                                ivFront.setTag("azul");
                                ivSide.setImageResource(R.drawable.costado_rojo);
                                ivSide.setTag("rojo");
                                break;
                        }
                        break;
                    case "azul":
                        switch (ivFront.getTag().toString()){
                            case "verde":
                                ivFront.setImageResource(R.drawable.frente_rojo);
                                ivFront.setTag("rojo");
                                ivSide.setImageResource(R.drawable.costado_verde);
                                ivSide.setTag("verde");
                                break;
                            case "naranja":
                                ivFront.setImageResource(R.drawable.frente_verde);
                                ivFront.setTag("verde");
                                ivSide.setImageResource(R.drawable.costado_naranja);
                                ivSide.setTag("naranja");
                                break;
                            case "amarillo":
                                ivFront.setImageResource(R.drawable.frente_naranja);
                                ivFront.setTag("naranja");
                                ivSide.setImageResource(R.drawable.costado_amarillo);
                                ivSide.setTag("amarillo");
                                break;
                            case "rojo":
                                ivFront.setImageResource(R.drawable.frente_amarillo);
                                ivFront.setTag("amarillo");
                                ivSide.setImageResource(R.drawable.costado_rojo);
                                ivSide.setTag("rojo");
                                break;
                        }
                        break;
                }
            }
        });
        */

        ibTopLeft.setOnClickListener(v -> {
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
        });
        ibBottomRight.setOnClickListener(v -> {
            switch (ivFront.getTag().toString()){
                case "celeste":
                    switch (ivTop.getTag().toString()){
                        case "verde":
                            ivTop.setImageResource(R.drawable.arriba_rojo);
                            ivTop.setTag("rojo");
                            ivSide.setImageResource(R.drawable.costado_verde);
                            ivSide.setTag("verde");
                            break;
                        case "naranja":
                            ivTop.setImageResource(R.drawable.arriba_verde);
                            ivTop.setTag("verde");
                            ivSide.setImageResource(R.drawable.costado_naranja);
                            ivSide.setTag("naranja");
                            break;
                        case "amarillo":
                            ivTop.setImageResource(R.drawable.arriba_naranja);
                            ivTop.setTag("naranja");
                            ivSide.setImageResource(R.drawable.costado_amarillo);
                            ivSide.setTag("amarillo");
                            break;
                        case "rojo":
                            ivTop.setImageResource(R.drawable.arriba_amarillo);
                            ivTop.setTag("amarillo");
                            ivSide.setImageResource(R.drawable.costado_rojo);
                            ivSide.setTag("rojo");
                            break;
                    }
                    break;
                case "amarillo":
                    switch (ivTop.getTag().toString()){
                        case "celeste":
                            ivTop.setImageResource(R.drawable.arriba_rojo);
                            ivTop.setTag("rojo");
                            ivSide.setImageResource(R.drawable.costado_celeste);
                            ivSide.setTag("celeste");
                            break;
                        case "naranja":
                            ivTop.setImageResource(R.drawable.arriba_celeste);
                            ivTop.setTag("celeste");
                            ivSide.setImageResource(R.drawable.costado_naranja);
                            ivSide.setTag("naranja");
                            break;
                        case "azul":
                            ivTop.setImageResource(R.drawable.arriba_naranja);
                            ivTop.setTag("naranja");
                            ivSide.setImageResource(R.drawable.costado_azul);
                            ivSide.setTag("azul");
                            break;
                        case "rojo":
                            ivTop.setImageResource(R.drawable.arriba_azul);
                            ivTop.setTag("azul");
                            ivSide.setImageResource(R.drawable.costado_rojo);
                            ivSide.setTag("rojo");
                            break;
                    }
                    break;
                case "rojo":
                    switch (ivTop.getTag().toString()){
                        case "verde":
                            ivTop.setImageResource(R.drawable.arriba_azul);
                            ivTop.setTag("azul");
                            ivSide.setImageResource(R.drawable.costado_verde);
                            ivSide.setTag("verde");
                            break;
                        case "celeste":
                            ivTop.setImageResource(R.drawable.arriba_verde);
                            ivTop.setTag("verde");
                            ivSide.setImageResource(R.drawable.costado_celeste);
                            ivSide.setTag("celeste");
                            break;
                        case "amarillo":
                            ivTop.setImageResource(R.drawable.arriba_celeste);
                            ivTop.setTag("celeste");
                            ivSide.setImageResource(R.drawable.costado_amarillo);
                            ivSide.setTag("amarillo");
                            break;
                        case "azul":
                            ivTop.setImageResource(R.drawable.arriba_amarillo);
                            ivTop.setTag("amarillo");
                            ivSide.setImageResource(R.drawable.costado_azul);
                            ivSide.setTag("azul");
                            break;
                    }
                    break;
                case "naranja":
                    switch (ivTop.getTag().toString()){
                        case "verde":
                            ivTop.setImageResource(R.drawable.arriba_celeste);
                            ivTop.setTag("celeste");
                            ivSide.setImageResource(R.drawable.costado_verde);
                            ivSide.setTag("verde");
                            break;
                        case "azul":
                            ivTop.setImageResource(R.drawable.arriba_verde);
                            ivTop.setTag("verde");
                            ivSide.setImageResource(R.drawable.costado_azul);
                            ivSide.setTag("azul");
                            break;
                        case "amarillo":
                            ivTop.setImageResource(R.drawable.arriba_azul);
                            ivTop.setTag("azul");
                            ivSide.setImageResource(R.drawable.costado_amarillo);
                            ivSide.setTag("amarillo");
                            break;
                        case "celeste":
                            ivTop.setImageResource(R.drawable.arriba_amarillo);
                            ivTop.setTag("amarillo");
                            ivSide.setImageResource(R.drawable.costado_celeste);
                            ivSide.setTag("celeste");
                            break;
                    }
                    break;
                case "verde":
                    switch (ivTop.getTag().toString()){
                        case "celeste":
                            ivTop.setImageResource(R.drawable.arriba_naranja);
                            ivTop.setTag("naranja");
                            ivSide.setImageResource(R.drawable.costado_celeste);
                            ivSide.setTag("celeste");
                            break;
                        case "rojo":
                            ivTop.setImageResource(R.drawable.arriba_celeste);
                            ivTop.setTag("celeste");
                            ivSide.setImageResource(R.drawable.costado_rojo);
                            ivSide.setTag("rojo");
                            break;
                        case "azul":
                            ivTop.setImageResource(R.drawable.arriba_rojo);
                            ivTop.setTag("rojo");
                            ivSide.setImageResource(R.drawable.costado_azul);
                            ivSide.setTag("azul");
                            break;
                        case "naranja":
                            ivTop.setImageResource(R.drawable.arriba_azul);
                            ivTop.setTag("azul");
                            ivSide.setImageResource(R.drawable.costado_naranja);
                            ivSide.setTag("naranja");
                            break;
                    }
                    break;
                case "azul":
                    switch (ivTop.getTag().toString()){
                        case "verde":
                            ivTop.setImageResource(R.drawable.arriba_naranja);
                            ivTop.setTag("naranja");
                            ivSide.setImageResource(R.drawable.costado_verde);
                            ivSide.setTag("verde");
                            break;
                        case "rojo":
                            ivTop.setImageResource(R.drawable.arriba_verde);
                            ivTop.setTag("verde");
                            ivSide.setImageResource(R.drawable.costado_rojo);
                            ivSide.setTag("rojo");
                            break;
                        case "amarillo":
                            ivTop.setImageResource(R.drawable.arriba_rojo);
                            ivTop.setTag("rojo");
                            ivSide.setImageResource(R.drawable.costado_amarillo);
                            ivSide.setTag("amarillo");
                            break;
                        case "naranja":
                            ivTop.setImageResource(R.drawable.arriba_amarillo);
                            ivTop.setTag("amarillo");
                            ivSide.setImageResource(R.drawable.costado_naranja);
                            ivSide.setTag("naranja");
                            break;
                    }
                    break;
            }
        });

        ibTop.setOnClickListener(v -> {
            switch (ivSide.getTag().toString()){
                case "celeste":
                    switch (ivTop.getTag().toString()){
                        case "amarillo":
                            ivTop.setImageResource(R.drawable.arriba_naranja);
                            ivTop.setTag("naranja");
                            ivFront.setImageResource(R.drawable.frente_verde);
                            ivFront.setTag("verde");
                            break;
                        case "naranja":
                            ivTop.setImageResource(R.drawable.arriba_verde);
                            ivTop.setTag("verde");
                            ivFront.setImageResource(R.drawable.frente_rojo);
                            ivFront.setTag("rojo");
                            break;
                        case "verde":
                            ivTop.setImageResource(R.drawable.arriba_rojo);
                            ivTop.setTag("rojo");
                            ivFront.setImageResource(R.drawable.frente_amarillo);
                            ivFront.setTag("amarillo");
                            break;
                        case "rojo":
                            ivTop.setImageResource(R.drawable.arriba_amarillo);
                            ivTop.setTag("amarillo");
                            ivFront.setImageResource(R.drawable.frente_naranja);
                            ivFront.setTag("naranja");
                            break;
                    }
                    break;
                case "amarillo":
                    switch (ivTop.getTag().toString()){
                        case "azul":
                            ivTop.setImageResource(R.drawable.arriba_naranja);
                            ivTop.setTag("naranja");
                            ivFront.setImageResource(R.drawable.frente_celeste);
                            ivFront.setTag("celeste");
                            break;
                        case "naranja":
                            ivTop.setImageResource(R.drawable.arriba_celeste);
                            ivTop.setTag("celeste");
                            ivFront.setImageResource(R.drawable.frente_rojo);
                            ivFront.setTag("rojo");
                            break;
                        case "celeste":
                            ivTop.setImageResource(R.drawable.arriba_rojo);
                            ivTop.setTag("rojo");
                            ivFront.setImageResource(R.drawable.frente_azul);
                            ivFront.setTag("azul");
                            break;
                        case "rojo":
                            ivTop.setImageResource(R.drawable.arriba_azul);
                            ivTop.setTag("azul");
                            ivFront.setImageResource(R.drawable.frente_naranja);
                            ivFront.setTag("naranja");
                            break;
                    }
                    break;
                case "rojo":
                    switch (ivTop.getTag().toString()){
                        case "amarillo":
                            ivTop.setImageResource(R.drawable.arriba_celeste);
                            ivTop.setTag("celeste");
                            ivFront.setImageResource(R.drawable.frente_verde);
                            ivFront.setTag("verde");
                            break;
                        case "celeste":
                            ivTop.setImageResource(R.drawable.arriba_verde);
                            ivTop.setTag("verde");
                            ivFront.setImageResource(R.drawable.frente_azul);
                            ivFront.setTag("azul");
                            break;
                        case "verde":
                            ivTop.setImageResource(R.drawable.arriba_azul);
                            ivTop.setTag("azul");
                            ivFront.setImageResource(R.drawable.frente_amarillo);
                            ivFront.setTag("amarillo");
                            break;
                        case "azul":
                            ivTop.setImageResource(R.drawable.arriba_amarillo);
                            ivTop.setTag("amarillo");
                            ivFront.setImageResource(R.drawable.frente_celeste);
                            ivFront.setTag("celeste");
                            break;
                    }
                    break;
                case "naranja":
                    switch (ivTop.getTag().toString()){
                        case "amarillo":
                            ivTop.setImageResource(R.drawable.arriba_azul);
                            ivTop.setTag("azul");
                            ivFront.setImageResource(R.drawable.frente_verde);
                            ivFront.setTag("verde");
                            break;
                        case "azul":
                            ivTop.setImageResource(R.drawable.arriba_verde);
                            ivTop.setTag("verde");
                            ivFront.setImageResource(R.drawable.frente_celeste);
                            ivFront.setTag("celeste");
                            break;
                        case "verde":
                            ivTop.setImageResource(R.drawable.arriba_celeste);
                            ivTop.setTag("celeste");
                            ivFront.setImageResource(R.drawable.frente_amarillo);
                            ivFront.setTag("amarillo");
                            break;
                        case "celeste":
                            ivTop.setImageResource(R.drawable.arriba_amarillo);
                            ivTop.setTag("amarillo");
                            ivFront.setImageResource(R.drawable.frente_azul);
                            ivFront.setTag("azul");
                            break;
                    }
                    break;
                case "verde":
                    switch (ivTop.getTag().toString()){
                        case "azul":
                            ivTop.setImageResource(R.drawable.arriba_rojo);
                            ivTop.setTag("rojo");
                            ivFront.setImageResource(R.drawable.frente_celeste);
                            ivFront.setTag("celeste");
                            break;
                        case "rojo":
                            ivTop.setImageResource(R.drawable.arriba_celeste);
                            ivTop.setTag("celeste");
                            ivFront.setImageResource(R.drawable.frente_naranja);
                            ivFront.setTag("naranja");
                            break;
                        case "celeste":
                            ivTop.setImageResource(R.drawable.arriba_naranja);
                            ivTop.setTag("naranja");
                            ivFront.setImageResource(R.drawable.frente_azul);
                            ivFront.setTag("azul");
                            break;
                        case "naranja":
                            ivTop.setImageResource(R.drawable.arriba_azul);
                            ivTop.setTag("azul");
                            ivFront.setImageResource(R.drawable.frente_rojo);
                            ivFront.setTag("rojo");
                            break;
                    }
                    break;
                case "azul":
                    switch (ivTop.getTag().toString()){
                        case "amarillo":
                            ivTop.setImageResource(R.drawable.arriba_rojo);
                            ivTop.setTag("rojo");
                            ivFront.setImageResource(R.drawable.frente_verde);
                            ivFront.setTag("verde");
                            break;
                        case "rojo":
                            ivTop.setImageResource(R.drawable.arriba_verde);
                            ivTop.setTag("verde");
                            ivFront.setImageResource(R.drawable.frente_naranja);
                            ivFront.setTag("naranja");
                            break;
                        case "verde":
                            ivTop.setImageResource(R.drawable.arriba_naranja);
                            ivTop.setTag("naranja");
                            ivFront.setImageResource(R.drawable.frente_amarillo);
                            ivFront.setTag("amarillo");
                            break;
                        case "naranja":
                            ivTop.setImageResource(R.drawable.arriba_amarillo);
                            ivTop.setTag("amarillo");
                            ivFront.setImageResource(R.drawable.frente_rojo);
                            ivFront.setTag("rojo");
                            break;
                    }
                    break;
            }
        });
        ibBottom.setOnClickListener(v -> {
            switch (ivSide.getTag().toString()){
                case "celeste":
                    switch (ivTop.getTag().toString()){
                        case "amarillo":
                            ivTop.setImageResource(R.drawable.arriba_rojo);
                            ivTop.setTag("rojo");
                            ivFront.setImageResource(R.drawable.frente_amarillo);
                            ivFront.setTag("amarillo");
                            break;
                        case "naranja":
                            ivTop.setImageResource(R.drawable.arriba_amarillo);
                            ivTop.setTag("amarillo");
                            ivFront.setImageResource(R.drawable.frente_naranja);
                            ivFront.setTag("naranja");
                            break;
                        case "verde":
                            ivTop.setImageResource(R.drawable.arriba_naranja);
                            ivTop.setTag("naranja");
                            ivFront.setImageResource(R.drawable.frente_verde);
                            ivFront.setTag("verde");
                            break;
                        case "rojo":
                            ivTop.setImageResource(R.drawable.arriba_verde);
                            ivTop.setTag("verde");
                            ivFront.setImageResource(R.drawable.frente_rojo);
                            ivFront.setTag("rojo");
                            break;
                    }
                    break;
                case "amarillo":
                    switch (ivTop.getTag().toString()){
                        case "azul":
                            ivTop.setImageResource(R.drawable.arriba_rojo);
                            ivTop.setTag("rojo");
                            ivFront.setImageResource(R.drawable.frente_azul);
                            ivFront.setTag("azul");
                            break;
                        case "naranja":
                            ivTop.setImageResource(R.drawable.arriba_azul);
                            ivTop.setTag("azul");
                            ivFront.setImageResource(R.drawable.frente_naranja);
                            ivFront.setTag("naranja");
                            break;
                        case "celeste":
                            ivTop.setImageResource(R.drawable.arriba_naranja);
                            ivTop.setTag("naranja");
                            ivFront.setImageResource(R.drawable.frente_celeste);
                            ivFront.setTag("celeste");
                            break;
                        case "rojo":
                            ivTop.setImageResource(R.drawable.arriba_celeste);
                            ivTop.setTag("celeste");
                            ivFront.setImageResource(R.drawable.frente_rojo);
                            ivFront.setTag("rojo");
                            break;
                    }
                    break;
                case "rojo":
                    switch (ivTop.getTag().toString()){
                        case "verde":
                            ivTop.setImageResource(R.drawable.arriba_celeste);
                            ivTop.setTag("celeste");
                            ivFront.setImageResource(R.drawable.frente_verde);
                            ivFront.setTag("verde");
                            break;
                        case "azul":
                            ivTop.setImageResource(R.drawable.arriba_verde);
                            ivTop.setTag("verde");
                            ivFront.setImageResource(R.drawable.frente_azul);
                            ivFront.setTag("azul");
                            break;
                        case "amarillo":
                            ivTop.setImageResource(R.drawable.arriba_azul);
                            ivTop.setTag("azul");
                            ivFront.setImageResource(R.drawable.frente_amarillo);
                            ivFront.setTag("amarillo");
                            break;
                        case "celeste":
                            ivTop.setImageResource(R.drawable.arriba_amarillo);
                            ivTop.setTag("amarillo");
                            ivFront.setImageResource(R.drawable.frente_celeste);
                            ivFront.setTag("celeste");
                            break;
                    }
                    break;
                case "naranja":
                    switch (ivTop.getTag().toString()){
                        case "verde":
                            ivTop.setImageResource(R.drawable.arriba_azul);
                            ivTop.setTag("azul");
                            ivFront.setImageResource(R.drawable.frente_verde);
                            ivFront.setTag("verde");
                            break;
                        case "celeste":
                            ivTop.setImageResource(R.drawable.arriba_verde);
                            ivTop.setTag("verde");
                            ivFront.setImageResource(R.drawable.frente_celeste);
                            ivFront.setTag("celeste");
                            break;
                        case "amarillo":
                            ivTop.setImageResource(R.drawable.arriba_celeste);
                            ivTop.setTag("celeste");
                            ivFront.setImageResource(R.drawable.frente_amarillo);
                            ivFront.setTag("amarillo");
                            break;
                        case "azul":
                            ivTop.setImageResource(R.drawable.arriba_amarillo);
                            ivTop.setTag("amarillo");
                            ivFront.setImageResource(R.drawable.frente_azul);
                            ivFront.setTag("azul");
                            break;
                    }
                    break;
                case "verde":
                    switch (ivTop.getTag().toString()){
                        case "celeste":
                            ivTop.setImageResource(R.drawable.arriba_rojo);
                            ivTop.setTag("rojo");
                            ivFront.setImageResource(R.drawable.frente_celeste);
                            ivFront.setTag("celeste");
                            break;
                        case "naranja":
                            ivTop.setImageResource(R.drawable.arriba_celeste);
                            ivTop.setTag("celeste");
                            ivFront.setImageResource(R.drawable.frente_naranja);
                            ivFront.setTag("naranja");
                            break;
                        case "azul":
                            ivTop.setImageResource(R.drawable.arriba_naranja);
                            ivTop.setTag("naranja");
                            ivFront.setImageResource(R.drawable.frente_azul);
                            ivFront.setTag("azul");
                            break;
                        case "rojo":
                            ivTop.setImageResource(R.drawable.arriba_azul);
                            ivTop.setTag("azul");
                            ivFront.setImageResource(R.drawable.frente_rojo);
                            ivFront.setTag("rojo");
                            break;
                    }
                    break;
                case "azul":
                    switch (ivTop.getTag().toString()){
                        case "verde":
                            ivTop.setImageResource(R.drawable.arriba_rojo);
                            ivTop.setTag("rojo");
                            ivFront.setImageResource(R.drawable.frente_verde);
                            ivFront.setTag("verde");
                            break;
                        case "naranja":
                            ivTop.setImageResource(R.drawable.arriba_verde);
                            ivTop.setTag("verde");
                            ivFront.setImageResource(R.drawable.frente_naranja);
                            ivFront.setTag("naranja");
                            break;
                        case "amarillo":
                            ivTop.setImageResource(R.drawable.arriba_naranja);
                            ivTop.setTag("naranja");
                            ivFront.setImageResource(R.drawable.frente_amarillo);
                            ivFront.setTag("amarillo");
                            break;
                        case "rojo":
                            ivTop.setImageResource(R.drawable.arriba_amarillo);
                            ivTop.setTag("amarillo");
                            ivFront.setImageResource(R.drawable.frente_rojo);
                            ivFront.setTag("rojo");
                            break;
                    }
                    break;
            }
        });

        ibLeft.setOnClickListener(v -> {
            switch (ivTop.getTag().toString()){
                case "celeste":
                    switch (ivFront.getTag().toString()){
                        case "amarillo":
                            ivFront.setImageResource(R.drawable.frente_naranja);
                            ivFront.setTag("naranja");
                            ivSide.setImageResource(R.drawable.costado_verde);
                            ivSide.setTag("verde");
                            break;
                        case "naranja":
                            ivFront.setImageResource(R.drawable.frente_verde);
                            ivFront.setTag("verde");
                            ivSide.setImageResource(R.drawable.costado_rojo);
                            ivSide.setTag("rojo");
                            break;
                        case "verde":
                            ivFront.setImageResource(R.drawable.frente_rojo);
                            ivFront.setTag("rojo");
                            ivSide.setImageResource(R.drawable.costado_amarillo);
                            ivSide.setTag("amarillo");
                            break;
                        case "rojo":
                            ivFront.setImageResource(R.drawable.frente_amarillo);
                            ivFront.setTag("amarillo");
                            ivSide.setImageResource(R.drawable.costado_naranja);
                            ivSide.setTag("naranja");
                            break;
                    }
                    break;
                case "amarillo":
                    switch (ivFront.getTag().toString()){
                        case "celeste":
                            ivFront.setImageResource(R.drawable.frente_rojo);
                            ivFront.setTag("rojo");
                            ivSide.setImageResource(R.drawable.costado_azul);
                            ivSide.setTag("azul");
                            break;
                        case "rojo":
                            ivFront.setImageResource(R.drawable.frente_azul);
                            ivFront.setTag("azul");
                            ivSide.setImageResource(R.drawable.costado_naranja);
                            ivSide.setTag("naranja");
                            break;
                        case "azul":
                            ivFront.setImageResource(R.drawable.frente_naranja);
                            ivFront.setTag("naranja");
                            ivSide.setImageResource(R.drawable.costado_celeste);
                            ivSide.setTag("celeste");
                            break;
                        case "naranja":
                            ivFront.setImageResource(R.drawable.frente_celeste);
                            ivFront.setTag("celeste");
                            ivSide.setImageResource(R.drawable.costado_rojo);
                            ivSide.setTag("rojo");
                            break;
                    }
                    break;
                case "rojo":
                    switch (ivFront.getTag().toString()){
                        case "verde":
                            ivFront.setImageResource(R.drawable.frente_azul);
                            ivFront.setTag("azul");
                            ivSide.setImageResource(R.drawable.costado_amarillo);
                            ivSide.setTag("amarillo");
                            break;
                        case "azul":
                            ivFront.setImageResource(R.drawable.frente_amarillo);
                            ivFront.setTag("amarillo");
                            ivSide.setImageResource(R.drawable.costado_celeste);
                            ivSide.setTag("celeste");
                            break;
                        case "amarillo":
                            ivFront.setImageResource(R.drawable.frente_celeste);
                            ivFront.setTag("celeste");
                            ivSide.setImageResource(R.drawable.costado_verde);
                            ivSide.setTag("verde");
                            break;
                        case "celeste":
                            ivFront.setImageResource(R.drawable.frente_verde);
                            ivFront.setTag("verde");
                            ivSide.setImageResource(R.drawable.costado_azul);
                            ivSide.setTag("azul");
                            break;
                    }
                    break;
                case "naranja":
                    switch (ivFront.getTag().toString()){
                        case "verde":
                            ivFront.setImageResource(R.drawable.frente_celeste);
                            ivFront.setTag("celeste");
                            ivSide.setImageResource(R.drawable.costado_amarillo);
                            ivSide.setTag("amarillo");
                            break;
                        case "celeste":
                            ivFront.setImageResource(R.drawable.frente_amarillo);
                            ivFront.setTag("amarillo");
                            ivSide.setImageResource(R.drawable.costado_azul);
                            ivSide.setTag("azul");
                            break;
                        case "amarillo":
                            ivFront.setImageResource(R.drawable.frente_azul);
                            ivFront.setTag("azul");
                            ivSide.setImageResource(R.drawable.costado_verde);
                            ivSide.setTag("verde");
                            break;
                        case "azul":
                            ivFront.setImageResource(R.drawable.frente_verde);
                            ivFront.setTag("verde");
                            ivSide.setImageResource(R.drawable.costado_celeste);
                            ivSide.setTag("celeste");
                            break;
                    }
                    break;
                case "verde":
                    switch (ivFront.getTag().toString()){
                        case "celeste":
                            ivFront.setImageResource(R.drawable.frente_naranja);
                            ivFront.setTag("naranja");
                            ivSide.setImageResource(R.drawable.costado_azul);
                            ivSide.setTag("azul");
                            break;
                        case "naranja":
                            ivFront.setImageResource(R.drawable.frente_azul);
                            ivFront.setTag("azul");
                            ivSide.setImageResource(R.drawable.costado_rojo);
                            ivSide.setTag("rojo");
                            break;
                        case "azul":
                            ivFront.setImageResource(R.drawable.frente_rojo);
                            ivFront.setTag("rojo");
                            ivSide.setImageResource(R.drawable.costado_celeste);
                            ivSide.setTag("celeste");
                            break;
                        case "rojo":
                            ivFront.setImageResource(R.drawable.frente_celeste);
                            ivFront.setTag("celeste");
                            ivSide.setImageResource(R.drawable.costado_naranja);
                            ivSide.setTag("naranja");
                            break;
                    }
                    break;
                case "azul":
                    switch (ivFront.getTag().toString()){
                        case "verde":
                            ivFront.setImageResource(R.drawable.frente_naranja);
                            ivFront.setTag("naranja");
                            ivSide.setImageResource(R.drawable.costado_amarillo);
                            ivSide.setTag("amarillo");
                            break;
                        case "naranja":
                            ivFront.setImageResource(R.drawable.frente_amarillo);
                            ivFront.setTag("amarillo");
                            ivSide.setImageResource(R.drawable.costado_rojo);
                            ivSide.setTag("rojo");
                            break;
                        case "amarillo":
                            ivFront.setImageResource(R.drawable.frente_rojo);
                            ivFront.setTag("rojo");
                            ivSide.setImageResource(R.drawable.costado_verde);
                            ivSide.setTag("verde");
                            break;
                        case "rojo":
                            ivFront.setImageResource(R.drawable.frente_verde);
                            ivFront.setTag("verde");
                            ivSide.setImageResource(R.drawable.costado_naranja);
                            ivSide.setTag("naranja");
                            break;
                    }
                    break;
            }
        });
        ibRight.setOnClickListener(v -> {
            switch (ivTop.getTag().toString()){
                case "celeste":
                    switch (ivFront.getTag().toString()){
                        case "amarillo":
                            ivFront.setImageResource(R.drawable.frente_rojo);
                            ivFront.setTag("rojo");
                            ivSide.setImageResource(R.drawable.costado_amarillo);
                            ivSide.setTag("amarillo");
                            break;
                        case "naranja":
                            ivFront.setImageResource(R.drawable.frente_amarillo);
                            ivFront.setTag("amarillo");
                            ivSide.setImageResource(R.drawable.costado_naranja);
                            ivSide.setTag("naranja");
                            break;
                        case "verde":
                            ivFront.setImageResource(R.drawable.frente_naranja);
                            ivFront.setTag("naranja");
                            ivSide.setImageResource(R.drawable.costado_verde);
                            ivSide.setTag("verde");
                            break;
                        case "rojo":
                            ivFront.setImageResource(R.drawable.frente_verde);
                            ivFront.setTag("verde");
                            ivSide.setImageResource(R.drawable.costado_rojo);
                            ivSide.setTag("rojo");
                            break;
                    }
                    break;
                case "amarillo":
                    switch (ivFront.getTag().toString()){
                        case "celeste":
                            ivFront.setImageResource(R.drawable.frente_naranja);
                            ivFront.setTag("naranja");
                            ivSide.setImageResource(R.drawable.costado_celeste);
                            ivSide.setTag("celeste");
                            break;
                        case "rojo":
                            ivFront.setImageResource(R.drawable.frente_celeste);
                            ivFront.setTag("celeste");
                            ivSide.setImageResource(R.drawable.costado_rojo);
                            ivSide.setTag("rojo");
                            break;
                        case "azul":
                            ivFront.setImageResource(R.drawable.frente_rojo);
                            ivFront.setTag("rojo");
                            ivSide.setImageResource(R.drawable.costado_azul);
                            ivSide.setTag("azul");
                            break;
                        case "naranja":
                            ivFront.setImageResource(R.drawable.frente_azul);
                            ivFront.setTag("azul");
                            ivSide.setImageResource(R.drawable.costado_naranja);
                            ivSide.setTag("naranja");
                            break;
                    }
                    break;
                case "rojo":
                    switch (ivFront.getTag().toString()){
                        case "verde":
                            ivFront.setImageResource(R.drawable.frente_celeste);
                            ivFront.setTag("celeste");
                            ivSide.setImageResource(R.drawable.costado_verde);
                            ivSide.setTag("verde");
                            break;
                        case "azul":
                            ivFront.setImageResource(R.drawable.frente_verde);
                            ivFront.setTag("verde");
                            ivSide.setImageResource(R.drawable.costado_azul);
                            ivSide.setTag("azul");
                            break;
                        case "amarillo":
                            ivFront.setImageResource(R.drawable.frente_azul);
                            ivFront.setTag("azul");
                            ivSide.setImageResource(R.drawable.costado_amarillo);
                            ivSide.setTag("amarillo");
                            break;
                        case "celeste":
                            ivFront.setImageResource(R.drawable.frente_amarillo);
                            ivFront.setTag("amarillo");
                            ivSide.setImageResource(R.drawable.costado_celeste);
                            ivSide.setTag("celeste");
                            break;
                    }
                    break;
                case "naranja":
                    switch (ivFront.getTag().toString()){
                        case "verde":
                            ivFront.setImageResource(R.drawable.frente_azul);
                            ivFront.setTag("azul");
                            ivSide.setImageResource(R.drawable.costado_verde);
                            ivSide.setTag("verde");
                            break;
                        case "celeste":
                            ivFront.setImageResource(R.drawable.frente_verde);
                            ivFront.setTag("verde");
                            ivSide.setImageResource(R.drawable.costado_celeste);
                            ivSide.setTag("celeste");
                            break;
                        case "amarillo":
                            ivFront.setImageResource(R.drawable.frente_celeste);
                            ivFront.setTag("celeste");
                            ivSide.setImageResource(R.drawable.costado_amarillo);
                            ivSide.setTag("amarillo");
                            break;
                        case "azul":
                            ivFront.setImageResource(R.drawable.frente_amarillo);
                            ivFront.setTag("amarillo");
                            ivSide.setImageResource(R.drawable.costado_azul);
                            ivSide.setTag("azul");
                            break;
                    }
                    break;
                case "verde":
                    switch (ivFront.getTag().toString()){
                        case "celeste":
                            ivFront.setImageResource(R.drawable.frente_rojo);
                            ivFront.setTag("rojo");
                            ivSide.setImageResource(R.drawable.costado_celeste);
                            ivSide.setTag("celeste");
                            break;
                        case "naranja":
                            ivFront.setImageResource(R.drawable.frente_celeste);
                            ivFront.setTag("celeste");
                            ivSide.setImageResource(R.drawable.costado_naranja);
                            ivSide.setTag("naranja");
                            break;
                        case "azul":
                            ivFront.setImageResource(R.drawable.frente_naranja);
                            ivFront.setTag("naranja");
                            ivSide.setImageResource(R.drawable.costado_azul);
                            ivSide.setTag("azul");
                            break;
                        case "rojo":
                            ivFront.setImageResource(R.drawable.frente_azul);
                            ivFront.setTag("azul");
                            ivSide.setImageResource(R.drawable.costado_rojo);
                            ivSide.setTag("rojo");
                            break;
                    }
                    break;
                case "azul":
                    switch (ivFront.getTag().toString()){
                        case "verde":
                            ivFront.setImageResource(R.drawable.frente_rojo);
                            ivFront.setTag("rojo");
                            ivSide.setImageResource(R.drawable.costado_verde);
                            ivSide.setTag("verde");
                            break;
                        case "naranja":
                            ivFront.setImageResource(R.drawable.frente_verde);
                            ivFront.setTag("verde");
                            ivSide.setImageResource(R.drawable.costado_naranja);
                            ivSide.setTag("naranja");
                            break;
                        case "amarillo":
                            ivFront.setImageResource(R.drawable.frente_naranja);
                            ivFront.setTag("naranja");
                            ivSide.setImageResource(R.drawable.costado_amarillo);
                            ivSide.setTag("amarillo");
                            break;
                        case "rojo":
                            ivFront.setImageResource(R.drawable.frente_amarillo);
                            ivFront.setTag("amarillo");
                            ivSide.setImageResource(R.drawable.costado_rojo);
                            ivSide.setTag("rojo");
                            break;
                    }
                    break;
            }
        });
    }
}