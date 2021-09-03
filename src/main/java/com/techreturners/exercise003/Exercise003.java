package com.techreturners.exercise003;


import java.util.LinkedHashMap;

public class Exercise003 {

    //re-factored code with LinkedHashMap to store ice cream flavours
    //Used LinkedHashMap so method iceCreamFlavours will return the key set as String array with the right order
    private final LinkedHashMap<String, Integer> iceCreamFlavours = new LinkedHashMap<>();

    public Exercise003() {
        iceCreamFlavours.put("Pistachio", 0);
        iceCreamFlavours.put("Raspberry Ripple", 1);
        iceCreamFlavours.put("Vanilla", 2);
        iceCreamFlavours.put("Mint Chocolate Chip", 3);
        iceCreamFlavours.put("Chocolate", 4);
        iceCreamFlavours.put("Mango Sorbet", 5);
    }

    int getIceCreamCode(String iceCreamFlavour) {
        if (iceCreamFlavours.containsKey(iceCreamFlavour)) {
            return iceCreamFlavours.get(iceCreamFlavour);
        } else {
            throw new RuntimeException("No such ice cream flavour");
        }
    }

    String[] iceCreamFlavours() {
        return iceCreamFlavours.keySet().toArray(new String[0]);
    }

}
