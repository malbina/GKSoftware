package com.company;

public  abstract class AbstractLebensmittel {
   private double weight;
   private double price;
   private String name;

    public AbstractLebensmittel (){}

    public AbstractLebensmittel(double weight, double price, String name) {
        this.weight = weight;
        this.price = price;
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
