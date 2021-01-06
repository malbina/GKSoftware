package com.company.lebensmittel.fleisch.schokolade;

import com.company.lebensmittel.fleisch.AbstractLebensmittel;

public class Schogetten extends AbstractLebensmittel {
    private int amount ;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Schogetten (int amount){
        this.amount=amount;
    }

    { setName("Schogetten");
        setWeight(0.50);
        setPrice(0.75);
    }

    @Override
    public void sayAboutMe() {
        System.out.println("Name of product:"+getName()+"\n Price of product:"+getPrice()+"Euro"+"\n Weight of product:"+getWeight()+"g");
    }

}
