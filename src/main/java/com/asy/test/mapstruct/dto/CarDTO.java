package com.asy.test.mapstruct.dto;

/**
 * Created by asy
 */
public class CarDTO {

    private String name;
    private String seatCount;
    private String type;
    private String price;

    public CarDTO() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(String seatCount) {
        this.seatCount = seatCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
