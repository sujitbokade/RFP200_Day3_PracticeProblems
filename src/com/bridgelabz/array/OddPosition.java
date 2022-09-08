package com.bridgelabz.array;

public class OddPosition {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 7, 2, 6, 4, 5, 1};

        for (int i = 1; i < arr.length; i = i + 2) {
            System.out.println("At Index " + i + " Value is " + arr[i]);
        }
    }
}
