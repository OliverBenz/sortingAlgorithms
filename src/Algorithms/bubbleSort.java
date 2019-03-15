package Algorithms;

import Interfaces.Sorter;

public class bubbleSort implements Sorter {

    @Override
    public int[] sort(int[] array) {
        if(array.length == 1){
            return array;
        }
        for(int i = 0; i < array.length; i++){
            for(int a = 1; a < array.length; a++){
                if(array[a - 1] > array[a]){
                    int temp = array[a - 1];
                    array[a - 1] = array[a];
                    array[a] = temp;
                }
            }
        }
        return array;
    }
}
