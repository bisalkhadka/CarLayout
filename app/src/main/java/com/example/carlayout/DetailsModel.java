package com.example.carlayout;
public class DetailsModel {
    private String make,year,color,price,engine;

    public DetailsModel(String make, String year, String color, String price, String engine) {
        this.make = make;
        this.year = year;
        this.color = color;
        this.price = price;
        this.engine = engine;
    }
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return  "\r\n Make=" + make +
                "\r\n year=" + year +
                "\r\n color=" + color +
                "\r\n price=" + price +
                "\r\n engine=" + engine;
    }
}
