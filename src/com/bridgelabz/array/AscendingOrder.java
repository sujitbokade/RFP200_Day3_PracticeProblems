package com.bridgelabz.array;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 7, 2, 3, 5, 1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}
