package com.bridgelabz.array;

public class OddPosition {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5 };

        System.out.println("Elements present on odd position");
        for(int i=0;i<arr.length;i=i+2)
        {
            System.out.println(arr[i]);

        }

    }
}
