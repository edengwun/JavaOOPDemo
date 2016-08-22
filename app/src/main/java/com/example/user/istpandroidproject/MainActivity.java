package com.example.user.istpandroidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.user.istpandroidproject.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person bob = new Person(16, "bob");
        Person anonymousOne = new Person(18);

        Motorcycle mcA = new Motorcycle();
        Motorcycle mcB = new Motorcycle(10);

        //it's legal but now you can only access the method declared under Ridable
        Ridable ridable = mcA;
        bob.ride(mcA);
        anonymousOne.ride(mcA);
    }
}
