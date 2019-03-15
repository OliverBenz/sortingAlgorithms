package Algorithms;

import Interfaces.Sorter;

public class selectionSort implements Sorter {

    @Override
    public int[] sort(int[] array) {
        if(array.length == 1){
            return array;
        }

        for(int i = 0; i < array.length; i++){
            for (int a = i; a < array.length; a++){
                if(array[a] < array[i]){
                    int temp = array[i];
                    array[i] = array[a];
                    array[a] = temp;
                }
            }
        }

        return array;
    }
}
