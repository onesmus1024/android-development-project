package com.example.interactive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Detail extends AppCompatActivity {

    private TextView detailTextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        detailTextview = (TextView) findViewById(R.id.textViewSecondScreen);
        Intent getDetail = getIntent();
        detailTextview.setText(getDetail.getStringExtra(MainActivity.MainActivityKey).toString());
    }
}