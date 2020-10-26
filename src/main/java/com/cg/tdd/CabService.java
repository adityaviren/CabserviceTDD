package com.cg.tdd;

public class CabService {

    public long aggregateFare = 0,aggregateMinutes=0,aggregateKilometers=0;
    public long fare(Integer minutes, Integer kilometers){
        try {
            long fare = minutes + kilometers * 10;
            if (fare < 5) {
                aggregateFare += 5;
                return 5;
            }

            else {
                aggregateFare += fare;
                return fare;
            }
        }catch(NullPointerException e){
            e.printStackTrace();
            return 0;
        }
    }

}
