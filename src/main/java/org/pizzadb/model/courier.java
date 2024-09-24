package org.pizzadb.model;

public class courier {
    private int courierID;
    private short postal;
    private String status;
    private String timeLastDelivery;

    public courier(int courierID, short postal, String status, String timeLastDelivery) {

        this.courierID = courierID;
        this.postal = postal;
        this.status = status;
        this.timeLastDelivery = timeLastDelivery;
    }
    public int getCourierID(){
        return courierID;
    }

    public short getPostal() {
        return postal;
    }

    public String getStatus() {
        return status;
    }

    public String getTimeLastDelivery() {
        return timeLastDelivery;
    }

    public void setPostal(short postal) {
        this.postal = postal;
    }

    public void setCourierID(int courierID) {
        this.courierID = courierID;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTimeLastDelivery(String timeLastDelivery) {
        this.timeLastDelivery = timeLastDelivery;
    }
}
