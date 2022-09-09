package com.bridgelabz.array;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 7, 2, 6, 4, 5, 1};
        System.out.print("Duplicate Elements are: ");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
