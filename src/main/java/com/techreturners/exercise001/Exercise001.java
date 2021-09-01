package com.techreturners.exercise001;

import java.text.NumberFormat;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        return Character.toUpperCase(firstName.charAt(0)) +"."+Character.toUpperCase(lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        //Create NumberFormat object so can format double to 2 decimal places
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        //Calculate price with VAT added and store in double
        Double d=  originalPrice + (originalPrice*(vatRate/100));
        //return double formatted to 2 decimal places
        return Double.parseDouble(nf.format(d));
    }

    public String reverse(String sentence) {
        // Add your code here
        //Store the string in a char array
        char[] ch = sentence.toCharArray();
        //Declare string to store reversed string
        String reversed = new String();
        //Loop thru char array from end to beginning and store in reversed
        for(int i=ch.length-1;i>=0;--i){
            reversed +=ch[i];
        }
        return reversed;
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        return 0;
    }
}
