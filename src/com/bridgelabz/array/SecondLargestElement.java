package com.bridgelabz.array;

public class SecondLargestElement {
    public static int get2ndLargeNo(int a[],int i){
        int temp;
        for (i=0;i<a.length;i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[1];
    }

    public static void main(String[] args) {
        int a[]={6,7,1,4,10,9};
        int n=a.length;
        System.out.println("no="+get2ndLargeNo(a,a.length));
    }
}