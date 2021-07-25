package com.people.designpattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class EnumValueTest {

    @Test
    public void getEnumValueFromYml() {

        System.out.println(StockGroup.APPLE.getKoreanName());
        System.out.println(StockGroup.APPLE.getStockId());
        Assertions.assertEquals(StockGroup.APPLE.getKoreanName(), "애플");
        Assertions.assertEquals(StockGroup.APPLE.getStockId(), "1001");
    }
}
