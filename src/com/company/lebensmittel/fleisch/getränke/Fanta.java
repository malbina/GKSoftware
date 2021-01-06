package com.company.lebensmittel.fleisch.getränke;

import com.company.lebensmittel.fleisch.AbstractLebensmittel;

public class Fanta extends AbstractLebensmittel {
    public Fanta(int amount){
        super(amount);
    }

    { setName("Fanta");
        setWeight(1.0);
        setPrice(1.76);
    }

    @Override
    public void sayAboutMe() {
        System.out.println("Name of product:"+getName()+"\n Price of product:"+getPrice()+"Euro"+"\n Weight of product:"+getWeight()+"l");
    }

}
