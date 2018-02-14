package com.williamgdev.example.ndkproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private GL2JNIView gl2JNIView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gl2JNIView = new GL2JNIView(getApplication());
        setContentView(gl2JNIView);
    }

    @Override
    protected void onPause() {
        super.onPause();
        gl2JNIView.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        gl2JNIView.onResume();
    }
}
