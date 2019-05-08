package com.makersacademy.acebook.model;

import java.util.ArrayList;
import java.util.Collections;                           //imports collections (array methods)

public class Arrays {

    public static ArrayList<Integer> newArray(int n) {  //creates an array where each element increases by 1 then shuffles the order
        ArrayList<Integer> array = new ArrayList<>();
        for (int count = 0; count < n; count++) {
            array.add(count);                           //adds the count to the array
        }
        Collections.shuffle(array);
        return array;
    }

    public static ArrayList<Integer> newRange(){        //creates an array where each element increases by 5000
        ArrayList<Integer> range = new ArrayList<>();
        for(int count = 5000; count < 100001; count+=5000) {
            range.add(count);                           //adds the count to the array
        }
        System.out.println(range);
        return range;
    }


}
