package com.people.designpattern;

import org.springframework.stereotype.Service;

@Service
public class AirbnbServiceImpl implements StockService{
    @Override
    public StockGroup getStockGroup() {
        return StockGroup.AIRBNB;
    }

    @Override
    public String findKoreanName() {
        return StockGroup.AIRBNB.getKoreanName();
    }
}
