package org.example.entity;

public class Cab {
    private String cabType;

    private int cabNumber;

    private int distance;

    private int time;

    public Cab(String cabType, int cabNumber, int distance, int time) {
        this.cabType = cabType;
        this.cabNumber = cabNumber;
        this.distance = distance;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Cab{" +
                "cabType='" + cabType + '\'' +
                ", cabNumber=" + cabNumber +
                ", distance=" + distance +
                ", time=" + time +
                '}';
    }

    public String getCabType() {
        return cabType;
    }

    public void setCabType(String cabType) {
        this.cabType = cabType;
    }

    public int getCabNumber() {
        return cabNumber;
    }

    public void setCabNumber(int cabNumber) {
        this.cabNumber = cabNumber;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
