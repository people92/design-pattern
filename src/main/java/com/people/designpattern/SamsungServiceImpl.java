package com.people.designpattern;

import org.springframework.stereotype.Service;

@Service
public class SamsungServiceImpl extends StockAbstractFactory {
    @Override
    public StockGroup getStockGroup() {
        return StockGroup.SAMSUNG;
    }

    @Override
    public String findKoreanName() {
        return StockGroup.SAMSUNG.getKoreanName();
    }
}
