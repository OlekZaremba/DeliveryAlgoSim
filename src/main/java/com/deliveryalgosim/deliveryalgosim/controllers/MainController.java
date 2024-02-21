package com.deliveryalgosim.deliveryalgosim.controllers;

import com.deliveryalgosim.deliveryalgosim.model.Order;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class MainController {

    @FXML
    public Button b1;


    public void addOrder(){
        Order order = new Order();

        order.setGridId(order.randomGridId());



    }
}
