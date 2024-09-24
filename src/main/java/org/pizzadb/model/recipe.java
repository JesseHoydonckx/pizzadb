package org.pizzadb.model;

public class recipe {
    private int menuItemId;
    private int ingredientId;

    public recipe(int menuItemId, int ingredientId) {
        this.menuItemId = menuItemId;
        this.ingredientId = ingredientId;
    }

    public int getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(int menuItemId) {
        this.menuItemId = menuItemId;
    }

    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }
}
