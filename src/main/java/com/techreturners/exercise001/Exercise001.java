package com.techreturners.exercise001;

import java.text.NumberFormat;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return Character.toUpperCase(firstName.charAt(0)) + "." + Character.toUpperCase(lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {
        //Create NumberFormat object so can format double to 2 decimal places
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        //Calculate price with VAT added and store in double
        Double d = originalPrice + (originalPrice * (vatRate / 100));
        //return double formatted to 2 decimal places
        return Double.parseDouble(nf.format(d));
    }

    public String reverse(String sentence) {
        //Store the string in a char array
        char[] ch = sentence.toCharArray();
        //Declare string to store reversed string
        StringBuilder reversed = new StringBuilder();
        //Iterate char array from end to beginning and store in reversed
        for (int i = ch.length - 1; i >= 0; --i) {
            reversed.append(ch[i]);
        }
        return reversed.toString();
    }

    public int countLinuxUsers(List<User> users) {
        int count = 0;
        //Iterate users and increment count if type is "Linux"
        for (User u : users) {
            if (u.getType().equals("Linux")) {
                count++;
            }
        }
        return count;
    }
}
