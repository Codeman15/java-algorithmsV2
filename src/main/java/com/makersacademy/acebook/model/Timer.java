package com.makersacademy.acebook.model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;                           //imports collections (array methods)

public class Timer {

    public static String collectionTimer() {
        ArrayList<Integer> array;                       //declaring a variable (an array) called array
        ArrayList<Integer> range = newRange();          //declaring a variable (an array) called range

        JSONObject obj = new JSONObject();              //create a new json object called obj
        JSONArray arr = new JSONArray();                //create a new json array called arr

        obj.put("x", range);                         //puts the range into the json object and calls it x

        for (int arraySize: range) {                    //for each element in the range array, create a new array. arraySize is the name of each element in the 'map'
            array = newArray(arraySize);                //creates the new array using the newArray method taking in arraySize (each element in the 'map')
            long startTime = System.nanoTime();
            Collections.sort(array);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            arr.put(duration);                          //adding each duration to the json array
            System.out.println(duration);
        }
        obj.put("y", arr);                           //putting the json array into the json object.  1 object with 2 arrays
        return obj.toString();
    }

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
