package org.pizzadb.model;

public class Adress {

    private long adressId;
    private short postal;
    private String street;
    private int number;

    public Adress(long adressId, short postal, String street, int number) {
        this.adressId = adressId;
        this.postal = postal;
        this.street = street;
        this.number = number;
    }

    public long getadressId() {
        return adressId;
    }

    public int getNumber() {
        return number;
    }

    public short getPostal() {
        return postal;
    }

    public String getStreet() {
        return street;
    }

    public void setId(long adressId) {
        this.adressId = adressId;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPostal(short postal) {
        this.postal = postal;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
