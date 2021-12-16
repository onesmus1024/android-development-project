package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount=0;
    private TextView mShowConnt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowConnt = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUP(View view) {
        ++mCount;
        if(mShowConnt!=null)
        {
            mShowConnt.setText(Integer.toString(mCount));
        }
    }

    public void Reset(View view) {
        if(mShowConnt!=null) {
            mCount=0;
            mShowConnt.setText(Integer.toString(mCount));

        }
    }
}