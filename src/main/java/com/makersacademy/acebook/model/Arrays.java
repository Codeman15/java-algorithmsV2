package com.makersacademy.acebook.model;

import java.util.ArrayList;
import java.util.Random;

public class Arrays {

    public static ArrayList<Integer> newArray(int range) { //creates an array filled with random numbers
        ArrayList<Integer> array = new ArrayList<>();
        Random rand = new Random();
        for (int count = 0; count < range; count++) {
            array.add(rand.nextInt(1000)); //adds the rand to the array
        }
        return array;
    }

    public static ArrayList<Integer> newRange(){ //creates an array where each element increases by 5000
        ArrayList<Integer> range = new ArrayList<>();
        for(int count = 5000; count < 100001; count+=5000) {
            range.add(count); //adds the count to the array
        }
        return range;
    }
}
