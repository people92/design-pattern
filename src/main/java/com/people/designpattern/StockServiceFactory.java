package com.people.designpattern;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class StockServiceFactory {

    private final Map<StockGroup, StockService> serviceMap = new HashMap<>();

    public StockServiceFactory(List<StockService> stockServices) {

        for(StockService stockService : stockServices) {
            this.serviceMap.put(stockService.getStockGroup(), stockService);
        }
    }

    public StockService getSerivce(StockGroup stockGroup) {
        return this.serviceMap.get(stockGroup);
    }
}