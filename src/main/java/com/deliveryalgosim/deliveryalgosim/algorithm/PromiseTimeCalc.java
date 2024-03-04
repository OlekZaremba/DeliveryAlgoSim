package com.deliveryalgosim.deliveryalgosim.algorithm;

import com.deliveryalgosim.deliveryalgosim.model.Order;
import java.time.LocalDateTime;
import java.util.List;

public class PromiseTimeCalc {

    public int calculateAdditionalTime(List<Order> orders, double distance, boolean isBadWeather, boolean isPeakTime) {
        int additionalTime = 0;

        if (orders.size() > 10) {
            additionalTime += 30;
        } else if (orders.size() > 5) {
            additionalTime += 20;
        } else if (orders.size() > 0) {
            additionalTime += 10;
        }

        if (distance > 10) {
            additionalTime += 15;
        } else if (distance > 5) {
            additionalTime += 10;
        }

        if (isBadWeather) {
            additionalTime += 20;
        }

        if (isPeakTime) {
            additionalTime += 15;
        }

        for (Order order : orders) {
            if (order.isPriority()) {
                additionalTime -= 5;
                break;
            }
        }

        return additionalTime;
    }
}
