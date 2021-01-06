package com.company.lebensmittel.fleisch;

public class Schweinfleisch extends AbstractLebensmittel {
    public Schweinfleisch(int amount){
        super(amount);
    }


    { setName("Schweinfleisch");
        setWeight(500);
        setPrice(2.99);
    }

     @Override
    public void sayAboutMe() {
        System.out.println("Name of product:"+getName()+"\n Price of product:"+getPrice()+ "Eur"+"\n Weight of product:"+getWeight()+"g" );
    }
}
