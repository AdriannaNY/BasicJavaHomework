package task2;

import task2.TaskUtil;

public class TaskDemo {
    public static void main(String[] args) {

        TaskUtil util = new TaskUtil();

        int fromRange = util.inputData("from");
        int toRange = util.inputData("to");
        int sizeArray = util.inputData("size");

        int[] ourArray = util.createArray(sizeArray);
        util.fillArray(ourArray,fromRange,toRange);
        util.printArray("Array of 5 random elements from 10 to 99:", ourArray);
        util.checkArray(ourArray,fromRange,toRange);
    }
}

