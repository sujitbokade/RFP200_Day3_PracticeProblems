package com.bridgelabz.array;

public class ReverseOrder {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 7, 2, 6, 4, 5, 1};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
