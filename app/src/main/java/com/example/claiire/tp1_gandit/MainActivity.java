package com.example.claiire.tp1_gandit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        Button boutonInscription = (Button) findViewById(R.id.btInscription);


        boutonInscription.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent inscription = new Intent(MainActivity.this, Main2Activity.class);
                MainActivity.this.startActivity(inscription);

            }
        });


    }


}
