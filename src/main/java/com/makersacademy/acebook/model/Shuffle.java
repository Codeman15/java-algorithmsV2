package com.makersacademy.acebook.model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Random;

import static com.makersacademy.acebook.model.Arrays.newArray;
import static com.makersacademy.acebook.model.Arrays.newRange;

public class Shuffle {

    public static String shuffleArray() {
        ArrayList<Integer> array;                       //declaring a variable (an array) called array
        ArrayList<Integer> range = newRange();          //declaring a variable (an array) called range

        JSONObject obj = new JSONObject();              //create a new json object called obj
        JSONArray arr = new JSONArray();                //create a new json array called arr

        obj.put("x", range);                            //puts the range into the json object and calls it x

        for (int arraySize: range) {                    //for each element in the range array, create a new array. arraySize is the name of each element in the 'map'
            array = newArray(arraySize);                //creates the new array using the newArray method taking in arraySize (each element in the 'map')
            long startTime = System.nanoTime();
            ArrayList<Integer> result = shuffleMethod(array);     //calling the shuffleMethod and saving to the variable result (variable not actually used)
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            arr.put(duration);                          //adding each duration to the json array
        }
        obj.put("y", arr);                              //putting the json array into the json object.  1 object with 2 arrays
        return obj.toString();
    }


    public static ArrayList<Integer> shuffleMethod (ArrayList <Integer> arrayToShuffle ) {
        for (int index = 0; index < arrayToShuffle.size(); index++) {
            Random rand = new Random();
            int newIndex = rand.nextInt(4);
            int swapElement = arrayToShuffle.get(index);
            arrayToShuffle.set(index, arrayToShuffle.get(newIndex));
            arrayToShuffle.set(newIndex, swapElement);
        }
        return arrayToShuffle;
    }
}
