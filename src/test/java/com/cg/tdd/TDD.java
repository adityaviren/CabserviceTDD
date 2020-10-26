package com.cg.tdd;

import org.junit.Assert;
import org.junit.Test;

public class TDD {

    @Test
    public void givenMinutesKilometers_shouldReturnAggregateFare() {
        CabService cabService = new CabService();
        cabService.fare(5,0);
        cabService.fare(10,1);
        cabService.fare(5,9);
        Assert.assertEquals(120,cabService.aggregateFare);
    }
    @Test
    public void givenMinutesKilometers_shouldReturnFare() {
        CabService cabService = new CabService();
        long fare = cabService.fare(5,0);
        Assert.assertEquals(5,fare);
    }
    @Test
    public void givenMinutesKilometers_shouldReturnAtleast5() {
        CabService cabService = new CabService();
        long fare = cabService.fare(1,0);
        Assert.assertEquals(5,fare);
    }

    @Test
    public void givenMinutesNull_shouldReturnZero() {
        CabService cabService = new CabService();
        long fare = cabService.fare(null,0);
        Assert.assertEquals(0,fare);
    }
}
