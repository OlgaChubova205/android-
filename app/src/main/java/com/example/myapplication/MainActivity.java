package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void siz(View v){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void otr(View v){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void FLOW(View v){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://olgachubova205.github.io/Kaski/"));
        startActivity(browserIntent);
    }
}