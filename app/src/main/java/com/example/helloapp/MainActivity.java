package com.example.helloapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.widget.Toast;
import android.util.Log;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "onCreate Toast!";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
    @Override
    protected void onStart() {
        super.onStart();
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "onStart Toast!";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.i(TAG, "onCreate");
        Log.d(TAG, "Debug");
        Log.w(TAG, "Warning");
        Log.v(TAG, "Verbose");
        Log.wtf(TAG, "Verbose");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "onStart Toast!";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.i(TAG, "onStart");
        Log.d(TAG, "Debug");
        Log.w(TAG, "Warning");
        Log.v(TAG, "Verbose");
        Log.wtf(TAG, "Verbose");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "onPause Toast!";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.i(TAG, "onPause");
        Log.d(TAG, "Debug");
        Log.w(TAG, "Warning");
        Log.v(TAG, "Verbose");
        Log.wtf(TAG, "Verbose");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "onStop Toast!";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.i(TAG, "onStop");
        Log.d(TAG, "Debug");
        Log.w(TAG, "Warning");
        Log.v(TAG, "Verbose");
        Log.wtf(TAG, "Verbose");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "onDestroy Toast!";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.i(TAG, "onDestroy");
        Log.d(TAG, "Debug");
        Log.w(TAG, "Warning");
        Log.v(TAG, "Verbose");
        Log.wtf(TAG, "Verbose");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "onRestart Toast!";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.i(TAG, "onRestart");
        Log.d(TAG, "Debug");
        Log.w(TAG, "Warning");
        Log.v(TAG, "Verbose");
        Log.wtf(TAG, "Verbose");
    }
}