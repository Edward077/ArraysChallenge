package com.Edward;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // create a private fileds

        //create a integer array
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntgers(myIntegers);
        printArray(sorted);

    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter" + capacity + " Integers values:");

        // application of the for statement
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element" + i + "Content" + array);

        }
    }

    public static int[] sortIntgers(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i=0; i<sortedArray.length-1; i++){
                temp= sortedArray[i];
                sortedArray [i] = sortedArray[i+1];
                sortedArray[i+1] = temp;
                flag = true;

            }

        }
        return sortedArray;
    }
}