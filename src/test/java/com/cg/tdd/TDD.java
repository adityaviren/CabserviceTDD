package com.cg.tdd;

import org.junit.Assert;
import org.junit.Test;

public class TDD {

    @Test
    public void givenMinutesKilometers_shouldReturnFare() {
        CabService cabService = new CabService();
        cabService.fare(5,0);
        cabService.fare(10,1);
        cabService.fare(5,9);
        Assert.assertEquals(120,cabService.aggregateFare);
    }
}
