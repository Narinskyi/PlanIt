package com.planittesting.cloud.jupiter.data.model;

public class Item {
    private final String name;
    private String price;
    private final int quantity;

    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPriceValue() {
        return Double.parseDouble(this.price.replaceAll("\\$", ""));
    }

    public String getPriceString() {
        return price;
    }

    public double getSubtotalValue() {
        return getPriceValue() * quantity;
    }

    public String getSubtotalString() {
        return "$".concat(String.valueOf(getSubtotalValue()));
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
