package id.ac.id.telkomuniversity.tass.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityKetiga extends AppCompatActivity {

    Button btnreset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ketiga);

        btnreset = findViewById(R.id.buttonreset);
    }

    public void  halamanutama(View V){
        Intent i = new Intent(ActivityKetiga.this, MainActivity.class);
        ActivityKetiga.this.startActivity(i);
    }
}