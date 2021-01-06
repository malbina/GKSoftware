package com.company.lebensmittel.fleisch.obst;

import com.company.lebensmittel.fleisch.AbstractLebensmittel;

public class Heidelbeere extends AbstractLebensmittel {
    public Heidelbeere (int amount){
        super(amount);
    }

    { setName("Erdbeeren");
        setWeight(245);
        setPrice(2.27);
    }

    @Override
    public void sayAboutMe() {
        System.out.println("Name of product:"+getName()+"\n Price of product:"+getPrice()+"Euro"+"\n Weight of product:"+getWeight()+"g");
    }
}
