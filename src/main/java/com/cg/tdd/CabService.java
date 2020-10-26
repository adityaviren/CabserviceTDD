package com.cg.tdd;

public class CabService {

    public long fare(Integer minutes, Integer kilometers){
        try {
            long fare = minutes + kilometers * 10;
            if (fare < 5)
                return 5;
            else
                return fare;
        }catch(NullPointerException e){
            e.printStackTrace();
            return 0;
        }
    }
}
