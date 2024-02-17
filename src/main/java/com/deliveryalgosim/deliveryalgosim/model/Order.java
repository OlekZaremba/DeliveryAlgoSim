package com.deliveryalgosim.deliveryalgosim.model;

public class Order {

    private int grid;
    private String goodsOrdered;

    public Order(String goodsOrdered) {
        Grid grid1 = new Grid();
        this.grid = grid1.randomGridId();
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
