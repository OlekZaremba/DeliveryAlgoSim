package com.deliveryalgosim.deliveryalgosim.algorithm;

import com.deliveryalgosim.deliveryalgosim.model.Order;
import java.time.LocalDateTime;
import java.util.List;

public class PromiseTimeCalc {

    public int calc(List<Order> orders) {
            try {
                if (orders.size() > 6) {
                    return 20;
                } else if (orders.size() >=3) {
                    return 10;
                } else if (orders.size() >= 1) {
                    return -15;
                } else if (orders.isEmpty()) {
                    return -20;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        return 0;
    }
}
