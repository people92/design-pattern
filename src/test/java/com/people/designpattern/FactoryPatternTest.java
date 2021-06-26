package com.people.designpattern;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static com.people.designpattern.StockGroup.*;
@SpringBootTest
public class FactoryPatternTest {

    @Autowired
    StockServiceFactory stockServiceFactory;

    @Test
    public void beanInjectionTest() {
        StockService appleService = stockServiceFactory.getSerivce(APPLE);
        StockService airbnbService = stockServiceFactory.getSerivce(AIRBNB);
        StockService samsungService = stockServiceFactory.getSerivce(SAMSUNG);
        StockService naverService = stockServiceFactory.getSerivce(NAVER);

        Assertions.assertEquals(appleService.getStockGroup(), APPLE);
        Assertions.assertEquals(airbnbService.getStockGroup(), AIRBNB);
        Assertions.assertEquals(samsungService.getStockGroup(), SAMSUNG);
        Assertions.assertEquals(naverService.getStockGroup(), NAVER);
    }
    @Test
    public void getKoreanNameTest() {
        String appleKoreanName = stockServiceFactory.getSerivce(APPLE).findKoreanName();
        String airbnbKoreanName = stockServiceFactory.getSerivce(AIRBNB).findKoreanName();
        String samsungKoreanName = stockServiceFactory.getSerivce(SAMSUNG).findKoreanName();
        String naverKoreanName = stockServiceFactory.getSerivce(NAVER).findKoreanName();

        Assertions.assertEquals(appleKoreanName, APPLE.getKoreanName());
        Assertions.assertEquals(airbnbKoreanName, AIRBNB.getKoreanName());
        Assertions.assertEquals(samsungKoreanName, SAMSUNG.getKoreanName());
        Assertions.assertEquals(naverKoreanName, NAVER.getKoreanName());
    }
}
