package com.example.parentview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {
    private ImageView gambar1, gambar2, gambar3, gambar4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        gambar1= (ImageView) findViewById(R.id.image1);
        gambar2=(ImageView)findViewById(R.id.image2);
        gambar3=(ImageView)findViewById(R.id.image3);
        gambar4=(ImageView)findViewById(R.id.image4);

        gambar1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View a) {
                tekang1(a);
            }
        });
        gambar2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View b) {
                tekang2(b);
            }
        });
        gambar3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View c) {
                tekang3(c);
            }
        });
        gambar4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View d) {
                tekang4(d);
            }
        });
    }
    private void tekang1 (View a){
        Intent g1 = new Intent(Main2Activity.this, Main3Activity.class);
        startActivity(g1);
    }
    private void tekang2 (View b){
        Intent g2 = new Intent(Main2Activity.this, Main4Activity.class);
        startActivity(g2);
    }
    private void tekang3 (View c){
        Intent g3 = new Intent(Main2Activity.this, Main5Activity.class);
        startActivity(g3);
    }
    private void tekang4 (View d){
        Intent g4 = new Intent(Main2Activity.this, Main6Activity.class);
        startActivity(g4);
    }
}
