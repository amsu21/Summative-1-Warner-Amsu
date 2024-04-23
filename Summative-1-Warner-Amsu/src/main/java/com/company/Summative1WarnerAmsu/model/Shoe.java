package com.company.Summative1WarnerAmsu.model;

public class Shoe {
    private String brand;
    private String name;
    private int year;

    public Shoe() {}

    // CONSTRUCTOR
    public Shoe(String brand, String name, int year) {
        this.brand = brand;
        this.name = name;
        this.year = year;
    }

    // GETTERS AND SETTERS
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
