package com.cg.tdd;

public class CabService {

    public long aggregateFare = 0,numberOfRides=0;
    public long fare(Integer minutes, Integer kilometers){
        try {
            long fare = minutes + kilometers * 10;
            if (fare < 5) {
                aggregateFare += 5;
                numberOfRides++;
                return 5;
            }

            else {
                aggregateFare += fare;
                numberOfRides++;
                return fare;
            }
        }catch(NullPointerException e){
            e.printStackTrace();
            return 0;
        }
    }
    public double averageFare(){
        return aggregateFare/numberOfRides;
    }

}
