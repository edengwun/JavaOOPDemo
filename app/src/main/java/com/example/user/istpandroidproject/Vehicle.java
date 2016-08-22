package com.example.user.istpandroidproject;

import android.util.Log;

/**
 * Created by KTChou on 2016/8/21.
 */
public class Vehicle {
    //public
    public static String classVariable = "this is a class-level variable";
    public static final String classConstant = "this is a class-level constant";
    public final String objectConstant = "this is a object-level constant";

    public Vehicle() { //constructor
        //objectConstant = null; //invalid because it's a constant
        Log.d(debug_tag, objectConstant);
        Log.d(debug_tag, Vehicle.classConstant); //access class-level constant through class
        Log.d(debug_tag, Vehicle.classVariable); //access class-level variable through class

        speed = -1;
    }

    //protected
    static final String debug_tag = "OOP"; //it's a protected variable
    protected int speed;

    void omitProtected() {
        Log.d(debug_tag, "this function is protected");
    }

    protected void printType() {
        Log.d(debug_tag, "In Vehicle,name: " + getClass().getSimpleName());
    }

    //private
    private void cannotBeOverridden() {
        Log.d(debug_tag, "overriding this function is considered invalid");
    }
}
