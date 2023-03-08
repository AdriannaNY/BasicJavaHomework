package countPairs;

public class CountPairs {
    public static int Counter (int k, int[] OurArray) {
        int count = 0;

        for (int i = 0; i < OurArray.length; i++) {
            int value1 = OurArray[i];
            for (int j = i+1; j < OurArray.length; j++) {
                int value2 = OurArray[j];
                int sum = value1+value2;
                if (sum==k){
                    count++;
                }
            }
        }
        return count;
    }
}
