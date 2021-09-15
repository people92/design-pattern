package com.people.designpattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.people.designpattern.StockGroup.*;
import static com.people.designpattern.StockGroup.NAVER;

@SpringBootTest
public class AbstractPatternTest {


    @Autowired
    StockServiceFactory stockServiceFactory;

    @Test
    public void findCommonTypeTest() {
        String appleService = stockServiceFactory.getSerivce(APPLE).findCommonType();
        String airbnbService = stockServiceFactory.getSerivce(AIRBNB).findCommonType();
        String samsungService = stockServiceFactory.getSerivce(SAMSUNG).findCommonType();
        String naverService = stockServiceFactory.getSerivce(NAVER).findCommonType();

        Assertions.assertEquals(appleService, "STOCK");
        Assertions.assertEquals(airbnbService, "STOCK");
        Assertions.assertEquals(samsungService, "STOCK");
        Assertions.assertEquals(naverService, "STOCK");
    }
}
