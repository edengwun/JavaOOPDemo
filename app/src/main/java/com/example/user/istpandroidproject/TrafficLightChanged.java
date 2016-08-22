package com.example.user.istpandroidproject;

/**
 * Created by KTChou on 2016/8/21.
 */
public interface TrafficLightChanged {
    enum Signal {
        green,
        red,
        yellow
    }

    void onLightChanged(Signal signal);
}
