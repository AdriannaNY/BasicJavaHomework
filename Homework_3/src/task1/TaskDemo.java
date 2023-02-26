package task1;

public class TaskDemo {
    public static void main(String[] args) {

        TaskUtil util = new TaskUtil();

        int fromRange = util.inputData("from");
        int toRange = util.inputData("to");
        int sizeArray = util.inputData("size");

        int[] originalArray = util.createArray(sizeArray);
        util.fillArray(originalArray,fromRange,toRange);
        util.printArray("Array of 8 random elements from 1 to 50:", originalArray);

        int[] modifiedArray = originalArray.clone();
        util.modifyIndexes(modifiedArray);
        util.printArray("Array elements with odd indexes replaced with zero:", modifiedArray);
    }
}
