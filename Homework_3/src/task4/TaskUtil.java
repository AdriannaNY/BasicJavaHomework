package task4;

import java.util.Arrays;

    public class TaskUtil {

        int indexMax = -1;
        int indexMin = -1;
        public int inputData(String input) {
            if (input.equals("from")) {
                return 1;
            }
            if (input.equals("to")) {
                return 100;
            }
            if (input.equals("size")) {
                return 30;
            }
            return 0;
        }

        public int[] createArray(int arraySize) {
            int[] createdArray = new int[arraySize];
            return createdArray;
        }

        public void fillArray(int[] arrayForFilling, int fromRange, int toRange) {
            for (int i = 0; i < arrayForFilling.length; i++) {
                arrayForFilling[i] = randomValue(fromRange, toRange);
            }
        }

        public int randomValue(int fromNumber, int toNumber) {
            int Random = (int) (Math.random() * (toNumber - fromNumber + 1) + fromNumber);
            return Random;
        }

        public int findMax(int[] Array) {
            int max = Array[0];
            for (int i = 0; i < Array.length; i++) {
                if (Array[i] > max) {
                    max = Array[i];
                    indexMax = i;
                }
            }
            return max;
        }

        public int findMin(int[] Array) {
            int min = Array[0];
            for (int i = 0; i < Array.length; i++) {
                if (Array[i] < min) {
                    min = Array[i];
                    indexMin = i;
                }
            }
            return min;
        }

        public int findAverage(int[] Array) {
            int average = 0;
            int sum = 0;
            for (int i = 0; i < Array.length; i++) {
                sum += Array[i];
            }
            average = sum / Array.length;
            return average;
        }

        public boolean isPrime(int number){
            boolean checkPrime = true;

            for (int i = 2; i < number ; i++) {
                if (number%i == 0){
                    checkPrime = false;
                    break;
                }
            }
            return checkPrime;
        }

        public int countPrime(int[] Array){
            int counter = 0 ;
            for (int i = 0; i < Array.length; i++) {
                if  ((Array[i] != 1) && (isPrime(Array[i]))) {
                    counter++;
                }
            }
            return counter;
        }

        public int findPrime(int[] Array, boolean direction){
            int primeElement = -1;
            boolean flag = true;
            int counter;

            if (direction) {
                counter = 0;
            } else {
                counter = Array.length-1;
            }

            while (flag){
                if ((Array[counter] != 1) && (isPrime(Array[counter]))){
                    primeElement = Array[counter];
                    flag = false;
                }

                if (direction) {
                    counter++;
                } else {
                    counter--;
                }
            }
            return primeElement;
        }

        public void printArray(int[] Array) {
            System.out.println("Array of 30 random elements from 1 to 100:");
            System.out.println(Arrays.toString(Array));
            System.out.println("Max element: " + findMax(Array));
            System.out.println("Min element: " + findMin(Array));
            System.out.println("Number of elements between max and min: " + (indexMax - indexMin - 1));
            System.out.println("Average: " + findAverage(Array));
            System.out.println("First prime number in our array is " + findPrime(Array,true));
            System.out.println("Last prime number in our array is " + findPrime(Array,false));
            System.out.println("Prime number counter - " + countPrime(Array));
        }
    }





