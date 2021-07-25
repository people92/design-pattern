package com.people.designpattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class EnumValueTest {

    @Test
    public void getEnumValueFromYml() {

        Assertions.assertEquals(StockGroup.APPLE.getKoreanName(), "애플");
        Assertions.assertEquals(StockGroup.APPLE.getStockId(), "1001");

        Assertions.assertEquals(StockGroup.SAMSUNG.getKoreanName(), "삼성");
        Assertions.assertEquals(StockGroup.SAMSUNG.getStockId(), "0010");
    }
}
