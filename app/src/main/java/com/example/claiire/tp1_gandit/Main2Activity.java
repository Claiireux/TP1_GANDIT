package com.example.claiire.tp1_gandit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);

        Button boutonAnnuler = (Button) findViewById(R.id.btAnnuler);

        boutonAnnuler.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent annuler = new Intent(Main2Activity.this, MainActivity.class);
                Main2Activity.this.startActivity(annuler);

            }
        });
    }
}
