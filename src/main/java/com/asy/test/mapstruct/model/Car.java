package com.asy.test.mapstruct.model;

/**
 * Created by asy
 */
public class Car {

    private String carName;
    private int numberOfSeats;
    private CarType type;
    private Price price;

    public Car() {
    }

    public Car(String carName, int numberOfSeats, CarType type, Price price) {
        this.carName = carName;
        this.numberOfSeats = numberOfSeats;
        this.type = type;
        this.price = price;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
}
