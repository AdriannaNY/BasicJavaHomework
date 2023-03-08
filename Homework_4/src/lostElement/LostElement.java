package lostElement;

import java.sql.Array;

public class LostElement {

    public static int FindLostElement(int[] OurArray){

    int sumWithoutLostElement = 0;
    int sumWithLostElement = 0;
    int count = 1;

    for (int value: OurArray) {
        sumWithoutLostElement += value;
        sumWithLostElement += count;
        count++;
        }
    sumWithLostElement += count;
    int lostElement = sumWithLostElement - sumWithoutLostElement;
    return lostElement;
    }
}
