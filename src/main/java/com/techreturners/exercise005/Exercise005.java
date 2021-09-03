package com.techreturners.exercise005;

public class Exercise005 {

    boolean[] alphabetArray = new boolean[26];

    public boolean isPangram(String input) {

        char[] sentence = input.toCharArray();
        int position;
        for (int i = 0; i < sentence.length; i++) {
            //check if letter is upper case letter
            if ('A' <= sentence[i] && sentence[i] <= 'Z') {
                //if uppercase letter then minus 'A' to get the position of the letter in the alphabet
                position = sentence[i] - 'A';
                alphabetArray[position] = true;
            } else if ('a' <= sentence[i] && sentence[i] <= 'z') {
                //if lowercase letter then minus 'a' to get the position of the letter in the alphabet
                position = sentence[i] - 'a';
                alphabetArray[position] = true;
            }
        }
        //iterate alphabetArray and see if true set for all 26 items which represent position of letters in the alphabet e.g. a=1
        for (boolean b : alphabetArray) {
            if (!b) {
                return false;
            }
        }

        return true;

    }

}
