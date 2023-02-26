package task1;

import java.util.Arrays;

public class TaskUtil {
    public int inputData(String input) {
        if (input.equals("from")) {
            return 1;
        }
        if (input.equals("to")) {
            return 50;
        }
        if (input.equals("size")) {
            return 8;
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

    public void modifyIndexes(int[] arrayForModifying) {
        for (int i = 0; i < arrayForModifying.length; i++) {
            if (i % 2 != 0) {
                arrayForModifying[i] = 0;
            }
        }
    }

    public void printArray( String message, int[] arrayForPrinting) {
        System.out.println(message);
        System.out.println(Arrays.toString(arrayForPrinting));
    }
}




