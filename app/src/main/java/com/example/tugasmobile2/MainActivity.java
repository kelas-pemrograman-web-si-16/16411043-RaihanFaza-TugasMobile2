package com.example.tugasmobile2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText edNPM;
    EditText edNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        edNPM = (EditText) findViewById(R.id.edNPM);
        edNama = (EditText) findViewById(R.id.edNama);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String npm = edNPM.getText().toString();
                String nama = edNama.getText().toString();

                if (npm.equals("16411043") && nama.equals("Raihan Faza")) {
                    Intent a = new Intent(MainActivity.this, Main2Activity.class);
                    a.putExtra("npm" , npm);
                    a.putExtra("nama", nama);
                    startActivity(a);
                    finish();

                } else if (npm.equals("16411043") && nama.equals("Raihan")) {
                    Intent a = new Intent(MainActivity.this, Main2Activity.class);
                    a.putExtra("npm" , npm);
                    a.putExtra("nama", nama);
                    startActivity(a);
                    finish();

                } else {
                    Toast.makeText(getApplicationContext(),"Maaf inputan salah", Toast.LENGTH_LONG)
                            .show();

                }


            }
        });
    }
}
