package com.deliveryalgosim.deliveryalgosim.model;

import java.util.Random;

public class Order extends Grid {

    private String goodsOrdered;


    public Order() {
    }



    public String getGoodsOrdered() {
        return goodsOrdered;
    }

    public void setGoodsOrdered(String goodsOrdered) {
        this.goodsOrdered = goodsOrdered;
    }

    public String randomGoods () {

        String[] solids = {"Chicken Burger", "Cheeseburger","Chicken nuggets", "Chicken wings", "Chicken tenders",
                "Chicken thighs", "Chicken quesadilla"};
        String[] drinks = {"Fies", "Cola", "Fanta", "Sprite", "Ice tea lemon", "Ice tea peach"};
        Random random = new Random();
        StringBuilder solidsOrdered = new StringBuilder();
        int numberOfSolids = random.nextInt(1,5);
        for (int i = 1; i<=numberOfSolids; i++){
            int solidsId = random.nextInt(1, 7);
            solidsOrdered.append(solids[solidsId]);


        }
        return null;
    }


}
