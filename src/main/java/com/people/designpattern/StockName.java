package com.people.designpattern;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StockName {

    public static String appleKoreanName;
    public static String appleStockId;

    @Value("${stock.apple.korean-name}")
    public void setAppleKoreanName(String appleKoreanName) {
       this.appleKoreanName = appleKoreanName;
    }
    @Value("${stock.apple.stock-id}")
    public void setAppleStockId(String appleStockId) {
        this.appleStockId = appleStockId;
    }
}
