package com.bridgelabz.array;

public class LargestElement {
    public static void main(String[] args) {
        int arr[]={2,1,10,11};
        int maximum =arr[0];    //initialize
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maximum) //compare element
                maximum=arr[i];
        }
        System.out.println("largrst element is:"+maximum);
    }
}
