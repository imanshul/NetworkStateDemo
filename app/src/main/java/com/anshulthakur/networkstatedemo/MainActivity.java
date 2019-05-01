package com.anshulthakur.networkstatedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.anshulthakur.networkstatechecker.InternetStateChecker;

public class MainActivity extends AppCompatActivity {

    InternetStateChecker checker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checker = new InternetStateChecker.Builder(this).build();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        checker.stop();
    }
}
