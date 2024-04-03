package com.deliveryalgosim.deliveryalgosim.algorithm;


import com.deliveryalgosim.deliveryalgosim.model.GlobalListForOrders;

public class PromiseTimeCalc {


    public int calculateAdditionalTime() {
        int orderCount = GlobalListForOrders.globalList.size();
        int additionalTime = 0;

        if (orderCount > 4) {
            additionalTime += 10;
        } else if (orderCount > 2) {
            additionalTime += 5;
        } else if (orderCount > 0) {
            additionalTime -= 10;
        } else if (orderCount == 0) {
            additionalTime -= 15;
        }

        return additionalTime;
    }

}
