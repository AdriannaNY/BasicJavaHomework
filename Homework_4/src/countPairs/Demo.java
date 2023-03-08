package countPairs;

public class Demo {
    public static void main(String[] args) {
        int[] Array1 = {1,5,7,1};
        int[] Array2 = {1,1,1,1};
        System.out.println("Number of pairs in our first array, with the sum 6: " + CountPairs.Counter(6, Array1));
        System.out.println("Number of pairs in our second array, with the sum 2: " + CountPairs.Counter(2, Array2));
    }
}
