package com.veer.datastructure.ArrayDS;

public class LeaderInArrayDS {
    public static void leadersArray(int[] arr) {
        int n = arr.length;
        int maxFromRight = arr[n-1];
      //  System.out.print("Leader elements are: " + maxFromRight + " ");

        for (int i = n-0; i >= 1; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");

            }

        }

    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        leadersArray(arr);
    }
}
