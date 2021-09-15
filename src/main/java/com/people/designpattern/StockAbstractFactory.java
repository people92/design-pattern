package com.people.designpattern;

import org.springframework.stereotype.Service;

@Service
abstract class StockAbstractFactory implements StockService{

    @Override
    public String findCommonType() {
        return "STOCK";
    }
}
