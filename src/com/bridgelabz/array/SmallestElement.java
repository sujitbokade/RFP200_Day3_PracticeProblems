package com.bridgelabz.array;

public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 7, 2, 6, 4};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Smallest Element is " + min);
    }

}
