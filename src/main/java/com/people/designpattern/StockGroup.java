package com.people.designpattern;

import java.util.Arrays;

public enum StockGroup {

    APPLE(StockName.appleKoreanName,StockName.appleStockId),
    NAVER("네이버","1002"),
    AIRBNB("에어비앤비","1003"),
    SAMSUNG("삼성","1004"),
    EMPTY("없음", "0000");

    private String koreanName;
    private String stockId;

    StockGroup(String koreanName, String stockId){
        this.koreanName = koreanName;
        this.stockId = stockId;
    }

    public static StockGroup findByStockId(String stockId) {
        return Arrays.stream(StockGroup.values())
                .filter(stockGroup -> stockId.equals(stockGroup.stockId))
                .findAny().orElse(EMPTY);
    }

    public String getKoreanName() {
        return koreanName;
    }

    public String getStockId() {
        return stockId;
    }
}
