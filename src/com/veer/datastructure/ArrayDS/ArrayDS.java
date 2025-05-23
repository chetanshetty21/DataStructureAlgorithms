package com.veer.datastructure.ArrayDS;

public class ArrayDS {

    public static void main(String[] args) {

        // An array is a container object that holds a
        // fixed number of values of a single type.
        // The length of an array is established when the array is created.

        // declares an array of integers

        int[] array;

        // allocates memory for 10 integers while creating of an array
        array = new int[3];

        // initialize first element

        array[0] = 100;


        array[1] = 200;
        array[2] = 300;

        //  Each array element is accessed by its numerical index:
        System.out.println("Element 1 at index 0: " + array[0]);
        System.out.println("Element 2 at index 1: " + array[1]);
        System.out.println("Element 3 at index 2: " + array[2]);

        //reinitialize the array
        array[1] = 400;
        System.out.println("reinitialize 2 at index 1: " + array[1]);

        //the shortcut syntax to create and initialize an array:

        int[] anArray = {
                100, 200, 300,
                400, 500, 600,
                700, 800, 900, 1000
        };

    }




}
