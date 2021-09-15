package com.people.designpattern;

import org.springframework.stereotype.Service;

@Service
public class AppleServiceImpl extends StockAbstractFactory {
    @Override
    public StockGroup getStockGroup() {
        return StockGroup.APPLE;
    }

    @Override
    public String findKoreanName() {
        return StockGroup.APPLE.getKoreanName();
    }
}
