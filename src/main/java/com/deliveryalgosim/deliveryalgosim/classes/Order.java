package com.deliveryalgosim.deliveryalgosim.classes;

public class Order {

    private int grid;
    private String goodsOrdered;

    public Order(int grid, String goodsOrdered) {
        this.grid = grid;
        this.goodsOrdered = goodsOrdered;
    }

    public int getGrid() {
        return grid;
    }

    public void setGrid(int grid) {
        this.grid = grid;
    }


    public String getGoodsOrdered() {
        return goodsOrdered;
    }

    public void setGoodsOrdered(String goodsOrdered) {
        this.goodsOrdered = goodsOrdered;
    }

}
