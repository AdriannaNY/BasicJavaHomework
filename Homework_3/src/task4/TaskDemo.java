package task4;

import task4.TaskUtil;

public class TaskDemo {
    public static void main(String[] args) {

        TaskUtil util = new TaskUtil();

        int fromRange = util.inputData("from");
        int toRange = util.inputData("to");
        int sizeArray = util.inputData("size");

        int[] Array = util.createArray(sizeArray);
        util.fillArray(Array,fromRange,toRange);
        util.printArray(Array);







    }
}
