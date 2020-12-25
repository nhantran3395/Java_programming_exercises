package com.exercise.TravelAgencyConsoleApplication;

import java.math.BigDecimal;
import java.util.Objects;

public class Tour {
    private String name;
    private String location;
    private String operator;
    private Integer lengthInDay;
    private BigDecimal price;

    public Tour(String name, String location, String operator, Integer lengthInDay, BigDecimal price) {
        this.name = name;
        this.location = location;
        this.operator = operator;
        this.lengthInDay = lengthInDay;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Integer getLengthInDay() {
        return lengthInDay;
    }

    public void setLengthInDay(Integer lengthInDay) {
        this.lengthInDay = lengthInDay;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return Objects.equals(name, tour.name) && Objects.equals(location, tour.location) && Objects.equals(operator, tour.operator) && Objects.equals(lengthInDay, tour.lengthInDay) && Objects.equals(price, tour.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, operator, lengthInDay, price);
    }

    @Override
    public String toString() {
        return "Tour{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", operator='" + operator + '\'' +
                ", lengthInDay=" + lengthInDay +
                ", price=" + price +
                '}';
    }
}
