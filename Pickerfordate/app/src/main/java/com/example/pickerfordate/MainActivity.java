package com.example.pickerfordate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ShowDatePicker(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(),"datePicker");
    }

    public  void  DateProcessing(int year,int month, int day)
    {
        String year_string = Integer.toString(year);
        String month_string = Integer.toString(month);
        String day_string = Integer.toString(day);
        String date = (year_string + "/"+month_string + "/" + day_string);

        Toast.makeText(getApplicationContext(),"date: " + date,Toast.LENGTH_SHORT).show();
    }
}