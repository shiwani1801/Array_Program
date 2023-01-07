package com.bridgelabz.array;

public class DublicateElement {
    public static void main(String[] args)
    {
        int arr[]={2,2,5,3,3,5,7};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println("Duplicate element:"+arr[i]);
                }
            }
        }
    }
}
