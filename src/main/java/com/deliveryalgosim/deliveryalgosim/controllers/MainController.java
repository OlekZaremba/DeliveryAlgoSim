package com.deliveryalgosim.deliveryalgosim.controllers;

import com.deliveryalgosim.deliveryalgosim.model.Order;

import java.util.ArrayList;
import java.util.List;


public class MainController {

    private List<Order> listOfOrders = new ArrayList<>();


    public MainController() {
    }


    public void addOrder(){
        Order order = new Order();
        order.setGridId(order.randomGridId());
        order.setGoodsOrdered(order.randomGoods());
        listOfOrders.add(order);
    }

    public void showOrder() {
        System.out.println(listOfOrders);
    }
}
