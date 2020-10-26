package com.cg.tdd;

public class CabService {

    public long fare(int minutes, int kilometers){
        long fare = minutes + kilometers*10;
        if(fare<5)
            return 5;
        else
            return fare;
    }
}
