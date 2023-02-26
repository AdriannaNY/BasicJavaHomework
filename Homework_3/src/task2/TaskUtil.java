package task2;

import java.util.Arrays;

public class TaskUtil {
    public int inputData(String input) {
        if (input.equals("from")) {
            return 10;
        }
        if (input.equals("to")) {
            return 99;
        }
        if (input.equals("size")) {
            return 5;
        }
        return 0;
    }

    public int[] createArray(int arraySize) {
        int[] createdArray = new int[arraySize];
        return createdArray;
    }

    public void fillArray(int[] arrayForFilling, int fromRange, int toRange) {
        for (int i = 0; i < arrayForFilling.length; i++) {
            arrayForFilling[i] = randomValue(fromRange,toRange);
        }
    }

    public int randomValue(int fromNumber, int toNumber){
        int Random = (int) (Math.random()*(toNumber - fromNumber + 1) + fromNumber);
        return Random;
    }

    public void checkArray(int[] arrayForChecking, int fromRange, int toRange) {
        for (int i = 1; i < arrayForChecking.length; i++) {
            if (arrayForChecking[i] <= arrayForChecking[i - 1]) {
                System.out.println("Массив не является строго возрастающей последовательностью.");
                break;
            }
            if (arrayForChecking[i] > arrayForChecking[i - 1]) {
                System.out.println("Массив является строго возрастающей последовательностью.");
                break;
            }
        }
    }

    public void printArray( String message, int[] arrayForPrinting) {
        System.out.println(message);
        System.out.println(Arrays.toString(arrayForPrinting));
    }
}



