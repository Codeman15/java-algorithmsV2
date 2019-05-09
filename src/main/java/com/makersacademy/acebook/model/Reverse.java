package com.makersacademy.acebook.model;

public class Reverse {
    public static void reverse() {
        int[] arr = {1,2,3,4,5};

        for (int index = 0; index < arr.length / 2; index++) {
            int swapElement = arr[index];
            arr[index] = arr[arr.length - index - 1]; //swaps with the last element in the array, then the 2nd last ect
            arr[arr.length - index - 1] = swapElement;
        }

        for (int element : arr) {
            System.out.println(element);
        }
    }

    public static void main(String[] args){
        reverse();
    }
}


