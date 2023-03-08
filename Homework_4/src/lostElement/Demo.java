package lostElement;

public class Demo {
    public static void main(String[] args) {
        int[] Array1 = {1, 2, 3, 5};
        int[] Array2 = {6, 1, 2, 8, 3, 4, 7, 10, 5};
        System.out.println("Your first missing number is " + LostElement.FindLostElement(Array1));
        System.out.println("Your second missing number is " + LostElement.FindLostElement(Array2));
    }
}
