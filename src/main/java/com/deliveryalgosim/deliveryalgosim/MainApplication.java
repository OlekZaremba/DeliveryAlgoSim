package com.deliveryalgosim.deliveryalgosim;

import com.deliveryalgosim.deliveryalgosim.model.Order;
import com.deliveryalgosim.deliveryalgosim.model.PromiseTime;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDateTime;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 710,471 );
        stage.setTitle("Delivery System Simulator with algorithms");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
//        PromiseTime promiseTime = new PromiseTime(LocalDateTime.now());
//        System.out.println(promiseTime.getPromiseTime());
//        Order order = new Order();
//        order.setGridId(order.randomGridId());
//        order.setGoodsOrdered(order.randomGoods());
//        System.out.println(order);
        launch();
    }
}