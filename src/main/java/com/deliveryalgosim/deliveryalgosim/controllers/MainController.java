package com.deliveryalgosim.deliveryalgosim.controllers;

import com.deliveryalgosim.deliveryalgosim.model.GlobalListForOrders;
import com.deliveryalgosim.deliveryalgosim.model.Order;
import java.util.stream.Collectors;



public class MainController {


    public MainController() {
    }

    public void addOrder(){
        Order order = new Order();
        order.setGridId(order.randomGridId());
        order.setGoodsOrdered(order.randomGoods());
        GlobalListForOrders.globalList.add(order);
    }

    public void showOrder() {
        String result = GlobalListForOrders.globalList.stream()
                .map(Object::toString)
                .collect(Collectors.joining(""));
        System.out.println(result);

    }
}
