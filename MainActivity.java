package com.example.dismoveis;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void BtLoginTP(View view) {
        Intent intent = new Intent(this, Tela3.class);
        startActivity(intent);
        finish();
    }

    public void BtCriarConta(View view) {
        Intent intent = new Intent(this, CreateAccount.class);
        startActivity(intent);
    }
}
