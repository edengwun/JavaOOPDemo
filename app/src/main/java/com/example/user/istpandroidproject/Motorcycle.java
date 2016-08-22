package com.example.user.istpandroidproject;
import android.util.Log;

/**
 * Created by KTChou on 2016/8/21.
 */
//a class can only extends one class but is capable of implementing many interface
public class Motorcycle extends Vehicle implements Ridable, TrafficLightChanged {

    String mRiderName;
    int maxSpeed = 80;

    public Motorcycle() {
        super(); //Vehicle's constructor
        speed = 20;
        printSpeed();
    }

    public Motorcycle(int newSpeed) { //function overloading, function with same name but different parameters
        this.speed = newSpeed; //the keyword "this" indicate the Bike object, depending on which class the function locates in.
        printSpeed();
    }

    public void printSpeed() {
        Log.d(debug_tag, getClass().getSimpleName() + ":current speed " + speed);
    }

    //only public and protected function can be overridden.
    @Override
    protected void printType() {
        super.printType(); //printType in Vehicle
        Log.d(debug_tag, "In MotorCycle, name: " + getClass().getSimpleName());
    }

    @Override
    public void onLightChanged(Signal signal) {
        if(signal == Signal.green) {
            speed = maxSpeed;
        }
        else if(signal == Signal.red){
            speed = 0;
        }
    }

    @Override
    public void setRider(String name) {
        mRiderName = name;
    }

    @Override
    public String getRiderName() {
        return mRiderName;
    }

}
