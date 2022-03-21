package com.example.interactive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String MainActivityKey = "main";
    private TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = (TextView) findViewById(R.id.view2);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(MainActivity.class.getSimpleName(),"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(MainActivity.class.getSimpleName(),"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(MainActivity.class.getSimpleName(),"onPaused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(MainActivity.class.getSimpleName(),"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(MainActivity.class.getSimpleName(),"Destroy");
    }

    public void detail(View view) {
        Intent Detail =new Intent(this, com.example.interactive.Detail.class);
        Detail.putExtra(MainActivityKey,text1.getText().toString());
        startActivity(Detail);
    }
}