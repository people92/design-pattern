package com.people.designpattern;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {


    @GetMapping("/stock-info")
    public String getStockInfo() {
        String stockInfo = StockGroup.APPLE.getStockId() + " " + StockGroup.APPLE.getKoreanName();

        return stockInfo;
    }
}
