package com.makersacademy.acebook.model;

import java.util.Random;

public class Shuffle {
    public static void shuffle()

    {
        int[] arr = {1, 2, 3, 4, 5};

        for (int index = 0; index < arr.length; index++) {
            Random rand = new Random();
            int newIndex = rand.nextInt(4);
            int var = arr[index];
            arr[index] = arr[newIndex];
            arr[newIndex] = var;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args){
            shuffle();
    }
}
