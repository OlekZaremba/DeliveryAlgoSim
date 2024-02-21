package com.deliveryalgosim.deliveryalgosim.model;

import java.util.Random;

public class Order extends Grid {

    private String goodsOrdered;


    public Order() {
    }

    public void setGoodsOrdered(String goodsOrdered) {
        this.goodsOrdered = goodsOrdered;
    }

    public String randomGoods () {

        String[] solids = {"Chicken Burger", "Cheeseburger", "Chicken nuggets", "Chicken wings", "Chicken tenders",
                "Chicken thighs", "Chicken quesadilla", "Fries"};
        String[] drinks = {"Cola", "Fanta", "Sprite", "Ice tea lemon", "Ice tea peach"};
        Random random = new Random();
        StringBuilder solidsOrdered = new StringBuilder();
        int numberOfSolids = random.nextInt(1,5);
        for (int i = 0; i<=numberOfSolids; i++) {
            int solidsId = random.nextInt(solids.length);
            solidsOrdered.append(solids[solidsId]);
            solidsOrdered.append(", ");
        }

        StringBuilder drinksOrdered = new StringBuilder();
        int numberOfDrinks = random.nextInt(1,3);
        for (int i = 1; i<=numberOfDrinks; i++){
            int drinksId = random.nextInt(drinks.length);
            drinksOrdered.append(drinks[drinksId]);
            drinksOrdered.append(" ");
        }



        return solidsOrdered + "with " + drinksOrdered;
    }

    @Override
    public String toString() {
        return "Order: " + goodsOrdered + "from " + super.toString() + "\n";
    }
}
