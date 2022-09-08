package com.bridgelabz.array;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 7, 2, 6, 4};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest Element is " + max);
    }
}
