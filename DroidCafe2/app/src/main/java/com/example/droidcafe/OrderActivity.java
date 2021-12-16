package com.example.droidcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Spinner spinner =(Spinner) findViewById(R.id.label_spinner);
        if(spinner !=null)
        {
            spinner.setOnItemClickListener(this::onItemSelected);
        }
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.labels_array, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        if(spinner !=null)
        {
            spinner.setAdapter(adapter);
        }
        textView =  findViewById(R.id.order_textView);
        //Intent intent = getIntent();
        //String message = intent.getStringExtra(MainActivity.EXTRA);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String spinnerlabel;
        spinnerlabel = adapterView.getItemAtPosition(i).toString();
        //textView.setText(spinnerlabel);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}