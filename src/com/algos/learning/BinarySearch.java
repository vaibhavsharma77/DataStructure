package com.algos.learning;

public class BinarySearch {

    public static void main(String[] args) {
        int a[]={2,3,5,6,89,96};
        int low=0;
        int high=a.length-1;
        int search=89;
        System.out.println(a.length-1);
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==search){
                System.out.println("element found at index "+mid);
                break;
            }else if(a[mid]>search){
                high=mid-1;
            }else if(a[mid]<search){
                  low =mid+1;
            }
        }
        if(low>high){
            System.out.println("not element found");
        }

    }
}
