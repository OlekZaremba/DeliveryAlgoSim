package com.deliveryalgosim.deliveryalgosim.model;

import java.util.Random;

public class Grid {

    private int gridId;

    public int getGridId() {
        return gridId;
    }

    public Grid() {
    }

    public void setGridId(int gridId) {
        this.gridId = gridId;
    }

    public int randomGridId() {
        Random random = new Random();
        return random.nextInt(1,10);
    }
}