package task3;

import java.util.Arrays;

public class TaskUtil {

    public int[] Array1(int arraySize) {
        int[] Array = new int[arraySize];
        for (int i = 1; i <= arraySize; i++) {
            Array[i - 1] = i * 2;
        }
        return Array;
    }

    public int[] Array2(int arraySize) {
        int[] Array = new int[arraySize];
        for (int i = 1; i <= arraySize; i++) {
            Array[i - 1] = i * 2 - 1;
        }
        return Array;
    }

    public int[] Array3(int arraySize) {
        int[] Array = new int[arraySize];
        for (int i = 1; i <= arraySize; i++) {
            Array[i - 1] = i * i;
        }
        return Array;
    }

    public int[] Array4(int arraySize) {
        int[] Array = new int[arraySize];
        for (int i = 1; i <= arraySize; i++) {
            Array[i - 1] = i * i * i;
        }
        return Array;
    }

    public int[] Array5(int arraySize) {
        int[] Array = new int[arraySize];
        for (int i = 1; i <= arraySize; i++) {
            Array[i - 1] = (int) Math.pow((-1), (i - 1));
        }
        return Array;
    }

    public int[] Array6(int arraySize) {
        int[] Array = new int[arraySize];
        for (int i = 1; i <= arraySize; i++) {
            Array[i - 1] = (int) Math.pow((-1), (i - 1)) * i;
        }
        return Array;
    }

    public int[] Array7(int arraySize) {
        int[] Array = new int[arraySize];
        for (int i = 1; i <= arraySize; i++) {
            Array[i - 1] = (int) Math.pow((-1), (i - 1)) * i * i;
        }
        return Array;
    }

    public int[] Array8(int arraySize) {
        int[] Array = new int[arraySize];
        for (int i = 1; i <= arraySize; i = i + 2) {
            Array[i - 1] = (i + 1) / 2;
        }
        return Array;
    }

//    public int[] Array9(int arraySize) {
//        int[] Array = new int[arraySize];
//        Array[0] = 1;
//        for (int i = 1; i <= arraySize; i++) {
//            Array[i - 1] *= i;
//        }
//        return Array;
//    }

    public int[] Array10(int arraySize) {
        int[] Array = new int[arraySize];
        Array[0] = 1;
        Array[1] = 1;
        for (int i = 2; i < arraySize; i++) {
            Array[i] = Array[i - 1] + Array[i - 2];
        }
        return Array;
    }

    public void printArrays() {
        System.out.println(Arrays.toString(Array1(10)));
        System.out.println(Arrays.toString(Array2(10)));
        System.out.println(Arrays.toString(Array3(10)));
        System.out.println(Arrays.toString(Array4(10)));
        System.out.println(Arrays.toString(Array5(10)));
        System.out.println(Arrays.toString(Array6(10)));
        System.out.println(Arrays.toString(Array7(10)));
        System.out.println(Arrays.toString(Array8(10)));
//        System.out.println(Arrays.toString(Array9(10)));
        System.out.println(Arrays.toString(Array10(10)));
    }
}



