package Classes;

import java.util.Arrays;
import java.util.Random;


public class NumberGenerator {
    public static Random random = new Random();

    public static int[][] getNumbers(int rep, int count) {
        int[][] numbers = new int[rep][count];
        for (int i = 0; i < rep; i++) {
            for (int a = 0; a < count; a++) {
                numbers[i][a] = random.nextInt();
            }
        }
        return numbers;
    }

    // ------------------------------------------------------------

    public static int[][] getNumbers(int rep, int count, int min, int max) {
        int[][] numbers = new int[rep][count];

        for (int i = 0; i < rep; i++) {
            for (int a = 0; a < count; a++) {
                numbers[i][a] = (int) (Math.random() * (max - min) + min);
            }
        }

        return numbers;
    }

    // ------------------------------------------------------------

    public static void printNumbers(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }
}

