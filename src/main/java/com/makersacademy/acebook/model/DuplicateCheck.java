package com.makersacademy.acebook.model;

import java.util.ArrayList; //allows you to use arraylist methods

public class DuplicateCheck {

    public static void duplicateChecker() {

        String[] arrayToCheck = {"cat", "cat", "dog", "dog", "mouse"};
        ArrayList<String> emptyArray = new ArrayList<>(); //creates an empty array called emptyArray

        for(int index = 0; index < arrayToCheck.length; index++) {
            if (!emptyArray.contains(arrayToCheck[index])) {
                for (int index2 = 0; index2 < arrayToCheck.length; index2++) {
                    if (index != index2) {
                        if (arrayToCheck[index2] == arrayToCheck[index]) {
                            emptyArray.add(arrayToCheck[index]);
                        }
                    }
                }
            }
        }

        System.out.println(emptyArray);
    }
    public static void main(String[] args) {
        duplicateChecker();
    }
}
