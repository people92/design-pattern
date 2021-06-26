package com.people.designpattern;

import org.springframework.stereotype.Service;

@Service
public class NaverServiceImpl implements StockService{
    @Override
    public StockGroup getStockGroup() {
        return StockGroup.NAVER;
    }

    @Override
    public String findKoreanName() {
        return StockGroup.NAVER.getKoreanName();
    }
}
