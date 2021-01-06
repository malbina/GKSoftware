package com.company.lebensmittel.fleisch;

public class Rindfleisch extends AbstractLebensmittel {
     private  int amount ;
      public Rindfleisch(int amount){
          this.amount = amount;
      }

    { setName("Rindfleisch");
     setWeight(500);
     setPrice(3.87);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void sayAboutMe() {
        System.out.println("Name of product:"+getName()+"\n Price of product:"+getPrice()+"Euro"+"\n Weight of product:"+getWeight()+"g");
    }
}

