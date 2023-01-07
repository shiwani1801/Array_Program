package com.bridgelabz.array;

public class FreqArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 2, 5, 5, 6, 7, 2};
        int[] freq = new int[arr.length];//store freq of element
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = visited;//avoid counting same element
                }

            }

            if (freq[i] != visited)
                freq[i] = count;
        }//display freq
        System.out.println("element | frequency");
        for(int i=0;i<freq.length;i++){
            if( freq[i]!= visited)
                System.out.println(""+arr[i]+"  |  "+freq[i]);
        }
    }
}