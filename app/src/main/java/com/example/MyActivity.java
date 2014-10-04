package com.example;

import android.app.Activity;
import android.os.Bundle;

import com.example.mypackage.MyClass;

import main.java.com.mindscapehq.android.raygun4android.RaygunClient;


public class MyActivity extends Activity {

    private MyClass myClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        RaygunClient.Init(getApplicationContext());
        RaygunClient.AttachExceptionHandler();
    }

    //here we will cause a crash to happen
    @Override
    protected void onResume() {
        super.onResume();

        myClass = new MyClass();
        int result = myClass.myMethod(null);
    }



}
