package com.cg.tdd;

import org.junit.Assert;
import org.junit.Test;

public class TDD {

    @Test
    public void givenMinutesKilometers_shouldReturnAggregateFare() {
        CabService cabService = new CabService();
        cabService.fare("AA",5,0);
        cabService.fare("AA",10,1);
        cabService.fare("AA",5,9);
        Assert.assertEquals(120,cabService.aggregateFare);
    }
    @Test
    public void givenMinutesKilometers_shouldReturnFare() {
        CabService cabService = new CabService();
        long fare = cabService.fare("AA",5,0);
        Assert.assertEquals(5,fare);
    }
    @Test
    public void givenMinutesKilometers_shouldReturnAtleast5() {
        CabService cabService = new CabService();
        long fare = cabService.fare("AA",1,0);
        Assert.assertEquals(5,fare);
    }

    @Test
    public void givenMinutesNull_shouldReturnZero() {
        CabService cabService = new CabService();
        long fare = cabService.fare("AA",null,0);
        Assert.assertEquals(0,fare);
    }
    @Test
    public void givenManyRides_shouldReturnAverageFare() {
        CabService cabService = new CabService();
        cabService.fare("AA",5,0);
        cabService.fare("AA",10,1);
        cabService.fare("AA",5,9);
        Assert.assertEquals(40.0,cabService.averageFare(),0);
    }
    @Test
    public void givenManyRides_shouldReturnNumberOfRides() {
        CabService cabService = new CabService();
        cabService.fare("AA",5,0);
        cabService.fare("AA",10,1);
        cabService.fare("AA",5,9);
        Assert.assertEquals(3,cabService.numberOfRides);
    }

    @Test
    public void givenUserId_shouldReturnInvoice() {
        CabService cabService = new CabService();
        cabService.fare("AA",5,0);
        cabService.fare("AA",10,1);
        cabService.fare("AA",5,9);
        cabService.fare("BB",5,9);
        long number = cabService.rideRepostitory("AA").numberOfRides;
        Assert.assertEquals(3,number);
    }



}
