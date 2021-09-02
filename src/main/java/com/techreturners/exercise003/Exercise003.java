package com.techreturners.exercise003;

import java.util.ArrayList;

public class Exercise003 {
    //declare string array to store all ice cream flavours
    private String[] iceCreamFlavours = {"Pistachio","Raspberry Ripple","Vanilla","Mint Chocolate Chip","Chocolate","Mango Sorbet"};

    int getIceCreamCode(String iceCreamFlavour) {
        int code=0;
        //iterate iceCreamFlavours to see if match to iceCreamFlavour
        for(int i=0;i<iceCreamFlavours.length;i++){
            if (iceCreamFlavour.equals(iceCreamFlavours[i])){
                //store the code for the flavour
                code = i;
            }
            // should I throw an exception here if there is no matching flavour?
        }
        return code;

    }

    String[] iceCreamFlavours() {
        return iceCreamFlavours;

    }

}
