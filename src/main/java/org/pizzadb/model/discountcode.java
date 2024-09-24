package org.pizzadb.model;

public class discountcode {
    private int discountID;
    private int discount;

    public discountcode(int discountID, int discount) {
        this.discountID = discountID;
        this.discount = discount;
    }

    public int getDiscountID() {
        return discountID;
    }

    public void setDiscountID(int discountID) {
        this.discountID = discountID;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
