package com.northrivergrilles.nrg;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startOrderButton= (Button)findViewById(R.id.StartOrderButton);

        startOrderButton.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent tutorialPage = new Intent (MainActivity.this, Menu.class);
                                                startActivity(tutorialPage);
                                                }
                                        });

        /*Button startOrderButton = (Button) findViewById(R.id.StartOrderButton);
        startOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Menu.class));

                });*/






    }
}
