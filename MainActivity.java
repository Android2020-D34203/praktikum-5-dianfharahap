package id.ac.id.telkomuniversity.tass.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText user_name, pass;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user_name = findViewById(R.id.username);
        pass = findViewById(R.id.pwd);
        btnlogin = findViewById(R.id.masuk);
    }

    public  void halaman1(View V){
        String usernamekey = user_name.getText().toString();
        String passwordkey = pass.getText().toString();

        Intent i = new Intent(this, ActivityKedua.class);
        i.putExtra("username", usernamekey);
        i.putExtra("password", passwordkey);
        startActivity(i);
    }

    public void  halaman2(View V){
        Intent i = new Intent(MainActivity.this, ActivityKetiga.class);
        MainActivity.this.startActivity(i);
    }
}