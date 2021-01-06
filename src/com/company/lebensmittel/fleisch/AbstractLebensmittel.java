package com.company.lebensmittel.fleisch;

public  abstract class AbstractLebensmittel {
    private double weight;
    private double price;
    private String name;
    private int amount =0;

    public AbstractLebensmittel(double weight, double price, String name, int amount) {
        this.weight = weight;
        this.price = price;
        this.name = name;
        this.amount = amount;
    }
    public AbstractLebensmittel (int amount){}
    public AbstractLebensmittel() {
    }


    public int getAmountOfProduct() {
        return amount;
    }

    public void setAmountOfProduct(int amount) {
        this.amount = amount;
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

    public abstract void sayAboutMe();


}