package com.cg.tdd;

import java.util.ArrayList;
import java.util.TreeMap;

public class CabService {

    public long aggregateFare = 0,numberOfRides=0;
    public TreeMap<String,ArrayList<Long>> ridesMap = new TreeMap<>();
    public ArrayList<Long> rides;
    public long fare(String userId,Integer minutes, Integer kilometers){
        ArrayList<Long> rides = new ArrayList<>();
        try {
            long fare = calculateFare(minutes,kilometers);
            if(ridesMap.containsKey(userId)) {
                rides = ridesMap.get(userId);
                rides.add(fare);
                ridesMap.put(userId, rides);
            }
            else{
                rides.add(fare);
                ridesMap.put(userId, rides);
            }
            aggregateFare+=fare;
            numberOfRides++;
            return fare;
        }catch(NullPointerException e){
            e.printStackTrace();
            return 0;
        }
    }

    public long calculateFare(Integer minutes, Integer kilometers) throws NullPointerException{
        long fare = minutes + kilometers * 10;
        if (fare < 5) {
            return 5;
        }

        else {
            return fare;
        }
    }
    public double averageFare(){
        return aggregateFare/numberOfRides;
    }

    public Invoice rideRepostitory(String userId){
        rides=ridesMap.get(userId);
        for(long l : rides){
            System.out.println("Fare for ride : " + l);
        }
        return invoiceReturn(userId,rides);
    }

    public Invoice invoiceReturn(String userId,ArrayList<Long> list){

        long totalFare = list.stream().mapToLong(r -> r).sum();
        long number = list.size();
        double average = totalFare/number;
        return new Invoice(userId,totalFare,number,average);
    }

}
class Invoice{
    public long aggregateFare ,numberOfRides;
    private String userId;
    public double averageFare;

    Invoice(String userId,long aggregateFare, long numberOfRides, double averageFare){
        this.userId=userId;
        this.aggregateFare=aggregateFare;
        this.numberOfRides=numberOfRides;
        this.averageFare=averageFare;
    }

    @Override
    public String toString(){
        return "UserId : " + userId + ", Aggregate Fare : " + aggregateFare +
                ", Number of rides : " + numberOfRides + ", Average Fare : " + averageFare;
    }
}
