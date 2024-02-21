package com.deliveryalgosim.deliveryalgosim.model;

import java.util.Random;

public class Grid {

    private int gridId;

    public Grid() {
    }

    public void setGridId(int gridId) {
        this.gridId = gridId;
    }

    public int randomGridId() {
        Random random = new Random();
        return random.nextInt(1,10);
    }

    @Override
    public String toString() {
        return "grid: " + gridId;
    }
}
