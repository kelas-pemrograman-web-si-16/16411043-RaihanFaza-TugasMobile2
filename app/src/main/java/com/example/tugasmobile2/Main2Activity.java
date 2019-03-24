package com.example.tugasmobile2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView txtNPM;
    TextView txtNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtNPM = (TextView) findViewById(R.id.txtPassingData);
        txtNama = (TextView) findViewById(R.id.txtPassingData2);

        Intent intent = getIntent();
        String npm = intent.getStringExtra("npm");
        txtNPM.setText(npm);
        String nama = intent.getStringExtra("nama");
        txtNama.setText(nama);
    }
}
