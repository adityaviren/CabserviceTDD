package com.cg.tdd;

import org.junit.Assert;
import org.junit.Test;

public class TDD {

    @Test
    public void givenMinutesKilometers_shouldReturnFare() {
        CabService cabService = new CabService();
        cabService.aggregateFare(5,0);
        cabService.aggregateFare(10,1);
        long fare = cabService.aggregateFare(5,9);
        Assert.assertEquals(120,fare);
    }
}
