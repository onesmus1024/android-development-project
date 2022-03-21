package com.example.onesjavatest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int Count=0;
    private TextView ShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShowCount = (TextView) findViewById(R.id.count_view);
    }

    public void increment(View view) {
        Count++;
        if(ShowCount != null){
            ShowCount.setText(Integer.toString(Count));
        }
//        Toast.makeText(this, "you have incremented by 1", Toast.LENGTH_SHORT).show();
    }
}