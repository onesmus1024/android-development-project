package com.example.twoactivities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private  static final String LOG_TAG = MainActivity.class.getSimpleName();
    public  static  final  String EXTRA_MESSAGE = "com.example.android.twoactivities.extra.MESSAGE";
    public static  final  int TEXT_REQUEST = 1;
    private TextView mReplyHeadTextView;
    private TextView mReplyTextView;
    private EditText mMessageEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOG_TAG, "onCreate: _______");
        mMessageEditText = (EditText) findViewById(R.id.editText_main);
        mReplyHeadTextView = (TextView) findViewById(R.id.text_header_reply);
        mReplyTextView = (TextView) findViewById(R.id.text_message_reply);

        if(savedInstanceState !=null)
        {
            boolean isVisible = savedInstanceState.getBoolean("reply_visible");
            if(isVisible)
            {
                mReplyHeadTextView.setVisibility(View.VISIBLE);
                mReplyHeadTextView.setText(savedInstanceState.getString("reply_text"));
                mReplyTextView.setVisibility(View.VISIBLE);
            }
        }

    }

    public void LaunchSecondActivity(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        String message = mMessageEditText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivityForResult(intent,TEXT_REQUEST);
        Log.d(LOG_TAG, "button clicked ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume: ");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if(mReplyHeadTextView.getVisibility()== View.VISIBLE)
        {
            outState.putBoolean("reply_visible",true);
            outState.putString("reply_text",mReplyHeadTextView.getText().toString());
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop: ");
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy: ");
    }



    @Override
    public void onActivityResult(int requestCode,int resultCode, Intent data)
    {
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode == TEXT_REQUEST)
        {
            if(resultCode == RESULT_OK)
            {
                String reply = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                mReplyHeadTextView.setVisibility(View.VISIBLE);
                mReplyHeadTextView.setText(reply);
                mReplyTextView.setVisibility(View.VISIBLE);

            }
        }
    }
}