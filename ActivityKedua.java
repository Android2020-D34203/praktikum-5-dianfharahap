package id.ac.id.telkomuniversity.tass.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityKedua extends AppCompatActivity {

    TextView nama, sandi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        nama = findViewById(R.id.uname);
        sandi = findViewById(R.id.psw);


        Intent i = getIntent();
        nama.setText(i.getStringExtra("username"));
        sandi.setText(i.getStringExtra("password"));

    }
}