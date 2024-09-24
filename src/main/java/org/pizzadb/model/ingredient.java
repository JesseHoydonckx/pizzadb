package org.pizzadb.model;

public class ingredient {
    private int ingredientId;
    private String name;
    private int dietary;
    private double price;

    public ingredient(int ingredientId, String name, int dietary, double price) {
        this.ingredientId = ingredientId;
        this.name = name;
        this.dietary = dietary;
        this.price = price;
    }

    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDietary() {
        return dietary;
    }

    public void setDietary(int dietary) {
        this.dietary = dietary;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
