package Algorithms;

import Interfaces.Sorter;

import java.util.Arrays;

public class insertionSort implements Sorter {
    // TODO: NOT SWAP BUT ARRAY CUT
    // Aufzeichnen

    @Override
    public int[] sort(int[] array) {
        if(array.length == 1){
            return array;
        }

        for(int i = 1; i < array.length; i++) {
            int a = i;
            while(a >= 1 && array[a] < array[a - 1]){
                int temp = array[a - 1];
                array[a - 1] = array[a];
                array[a] = temp;

                a--;
            }
        }
        return array;
    }
    /*
    private int[] partArray(int[] array, int position, int size){
        int[] newArray = new int[size];
        System.arraycopy(array, position, newArray, 0, size);

        return newArray;
    }
    */
}