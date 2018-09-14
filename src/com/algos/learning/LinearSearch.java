package com.algos.learning;

public class LinearSearch {

    public static void main(String[] args) {
        int a[] = {2, 5, 12, 54, 32};
        int key = 32;
        boolean found;
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                found = true;
                index = i;

            }
        }
        if (found = true) {
            System.out.println("element is found at location:" + index);
        } else {
            System.out.println("no match");
        }
    }
}