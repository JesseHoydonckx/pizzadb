package org.pizzadb.model;

public class menu {
    private int menuId;
    private int menuItemId;
    private int id;
    private String name;

    public menu(int menuId, int menuItemId, int id, String name) {
        this.menuId = menuId;
        this.menuItemId = menuItemId;
        this.id = id;
        this.name = name;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public int getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(int menuItemId) {
        this.menuItemId = menuItemId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
