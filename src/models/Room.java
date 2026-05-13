package models;

public class Room {
    String roomName;
    double roomPrice;

    public Room(String roomName, double roomPrice) {
        this.roomName = roomName;
        this.roomPrice = roomPrice;
    }

    public String getRoomName() {
        return roomName;
    }

    public double getRoomPrice() {
        return roomPrice;
    }
}