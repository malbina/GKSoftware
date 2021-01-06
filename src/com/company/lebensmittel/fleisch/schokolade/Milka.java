package com.company.lebensmittel.fleisch.schokolade;

import com.company.lebensmittel.fleisch.AbstractLebensmittel;

public class Milka extends AbstractLebensmittel {
    public Milka(int amount){
        super(amount);
    }

    { setName("Milka");
        setWeight(0.65);
        setPrice(1.75);
    }

    @Override
    public void sayAboutMe() {
        System.out.println("Name of product:"+getName()+"\n Price of product:"+getPrice()+"Euro"+"\n Weight of product:"+getWeight()+"g");
    }

}
