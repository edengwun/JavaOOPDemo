package com.example.user.istpandroidproject;
import android.util.Log;

/**
 * Created by KTChou on 2016/8/21.
 */
public class Person {

    Ridable mRidable;
    int mAge;
    String mName = "Anonymous";

    public Person(int age) {
        mAge = age;
    }

    public Person(int age, String name) {
        this(age); //call Person(age);
        mName = name;
    }

    public void ride(Ridable ridable) {
        if(ridable.getClass().equals(Motorcycle.class)) {
            if(mAge < 18) {
                Log.d("OOP", "it's illegal");
            }
            else {
                ridable.setRider(mName);
                Log.d("OOP", ridable.getRiderName() + " is riding a " + Motorcycle.class.getSimpleName());
            }
        }
    }

}
