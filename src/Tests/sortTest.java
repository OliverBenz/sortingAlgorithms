package Tests;

import Algorithms.*;
import Classes.*;
import Classes.Stopwatch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class sortTest {

    private int repeat = 20;
    private int count = 10000000;

    private int[][] numbers = NumberGenerator.getNumbers(repeat, count);

    // Tests
    private static final boolean bubble = false;
    private static final boolean selection = false;
    private static final boolean insertion = false;
    private static final boolean merge = true;
    private static final boolean radix = true;

    @Test
    public void bubbleSort(){
        if(this.bubble == true){
            bubbleSort bs = new bubbleSort();

            double[] time = new double[repeat];

            for(int i = 0; i < repeat; i++){
                Stopwatch sw = new Stopwatch();
                int[] array = bs.sort(numbers[i]);
                time[i] = sw.elapsedTime();

                // Test
                check(array);
            }
            printResult("Bubble Sort", calcAVG(time));

        }
    }

    // ------------------------------------------------------------

    @Test
    public void selectionSort(){
        if(this.selection == true){
            selectionSort ss = new selectionSort();

            double[] time = new double[repeat];

            for(int i = 0; i < repeat; i++){
                Stopwatch sw = new Stopwatch();
                int[] array = ss.sort(numbers[i]);
                time[i] = sw.elapsedTime();

                // Test
                check(array);
            }
            printResult("Selection Sort", calcAVG(time));
        }
    }

    @Test
    public void insertionSort(){
        if(this.insertion == true){
            insertionSort is = new insertionSort();

            double[] time = new double[repeat];

            for(int i = 0; i < repeat; i++){
                Stopwatch sw = new Stopwatch();
                int[] array = is.sort(numbers[i]);
                time[i] = sw.elapsedTime();

                // Test
                check(array);
            }
            printResult("Insertion Sort", calcAVG(time));
        }
    }

    @Test
    public void mergeSort(){
        if(this.merge == true){
            mergeSort ms = new mergeSort();

            double[] time = new double[repeat];

            for(int i = 0; i < repeat; i++){
                Stopwatch sw = new Stopwatch();
                int[] array = ms.sort(numbers[i]);
                time[i] = sw.elapsedTime();

                // Test
                check(array);
            }
            printResult("Merge Sort", calcAVG(time));
        }
    }

    @Test
    public void radixTest(){
        if(this.radix == true){
            radixSort rs = new radixSort();

            double[] time = new double[repeat];

            for(int i = 0; i < repeat; i++){
                Stopwatch sw = new Stopwatch();
                int[] array = rs.sort(numbers[i]);
                time[i] = sw.elapsedTime();

                // Test
                check(array);
            }
            printResult("Radix Sort", calcAVG(time));
        }
    }

    // ------------------------------------------------------------

    private void check(int[] array){
        for(int i = 1; i < array.length; i++){
            if(array[i] < array[i - 1]){
                fail("Failed Test. Error at: " + array[i - 1] + " - " + array[i]);
            }
        }
    }

    // ------------------------------------------------------------

    private void printResult(String type, double time){
        System.out.println();

        System.out.println(type + ": " + (float)time + " seconds");
    }

    private double calcAVG(double[] time){
        double result = 0;
        for(int i = 0; i < time.length; i++){
            result += time[i];
        }
        return result/time.length;
    }
}
