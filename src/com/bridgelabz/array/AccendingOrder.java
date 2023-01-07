package com.bridgelabz.array;

public class AccendingOrder {
    public static void main(String[] args)
    {
        int temp;
        int arr[] = {10, 30, 40, 20, 60, 50};
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println("assending order:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}