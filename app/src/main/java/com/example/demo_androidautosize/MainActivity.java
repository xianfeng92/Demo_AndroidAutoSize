package com.example.demo_androidautosize;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.autosize.AutoSize;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AutoSize.autoConvertDensityOfGlobal(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: "+getResources().getDisplayMetrics().density);
    }

    public void clickButton(View view){
        startActivity(new Intent(MainActivity.this,SecActivity.class));
    }

}
