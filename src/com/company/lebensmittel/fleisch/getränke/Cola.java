package com.company.lebensmittel.fleisch.getränke;

import com.company.lebensmittel.fleisch.AbstractLebensmittel;

public class Cola extends AbstractLebensmittel {
    public Cola (int amount){
        super(amount);
    }

    { setName("Cola");
        setWeight(1.0);
        setPrice(1.80);
    }

    @Override
    public void sayAboutMe() {
        System.out.println("Name of product:"+getName()+"\n Price of product:"+getPrice()+"Euro"+"\n Weight of product:"+getWeight()+"l");
    }
}
