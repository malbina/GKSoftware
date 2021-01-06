package com.company.kasse.user;

import com.company.lebensmittel.fleisch.AbstractLebensmittel;
import com.company.lebensmittel.fleisch.Rindfleisch;
import com.company.lebensmittel.fleisch.Schweinfleisch;
import com.company.lebensmittel.fleisch.schokolade.Schogetten;



public class Main {

    public static void main(String[] args) {
        Rindfleisch  rind = new Rindfleisch(3);
        Schogetten schogetten = new Schogetten(2);
        System.out.println(" Price: " + rind.getPrice() +" Amount of product:" +rind.getAmount());
        System.out.println(" Price: " + schogetten.getPrice() +" Amount of product:" +schogetten.getAmount());
        System.out.println( rind.getAmount());


    }

    }
