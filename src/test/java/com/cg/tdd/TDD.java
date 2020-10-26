package com.cg.tdd;

import org.junit.Assert;
import org.junit.Test;

public class TDD {

    @Test
    public void givenMinutesKilometers_shouldReturnFare() {
        CabService cabService = new CabService();
        long fare = cabService.fare(1,0);
        Assert.assertEquals(5,fare);
    }
}
