package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreelancerServiceTest {
    @Test
    public void testCalculateRest1() {
        FreelancerService service = new FreelancerService();

        int actual = service.calculate(10000, 3000, 20000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateRest2() {
        FreelancerService service = new FreelancerService();

        int actual = service.calculate(100000, 60000, 150000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

}