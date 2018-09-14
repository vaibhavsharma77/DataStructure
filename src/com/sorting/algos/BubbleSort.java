package com.sorting.algos;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[]={2,5,2,3,45,33};
        for(int i=(a.length-1);i>=0;i--){
            for(int j=1;j<=i;j++){
                if(a[j-1]>a[j]){
                    int temp=a[j-1];
                    a[j-1]=a[j];
                   a[j]= temp;
                }
            }

       }
        System.out.println(Arrays.toString(a));
    }
}
