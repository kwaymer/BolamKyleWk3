package com.example.kylebolam.bolamkylewk3;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private ImageButton bt1;
    private ImageButton bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialView();
        initialListener();
    }

    private void initialView(){

        bt1 = (ImageButton) findViewById(R.id.button1);
        bt3 = (ImageButton) findViewById(R.id.button3);
    }

    private void initialListener(){

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Button 1 was clicked", Toast.LENGTH_LONG).show();
            }
        });


        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ListViewActivity.class);
                startActivity(intent);
            }
        });
    }

    public void onClick(View v){

        Toast.makeText(this, "Button 2 was clicked", Toast.LENGTH_LONG).show();
    }

}
