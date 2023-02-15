package tablo;

public class Tablo {
    public static void main(String[] args) {

        double random1 =  Math.random() *  (28800 - 0 + 1) + 0;
        int n = (int) Math.round(random1);
        int h = n/3600;

        if (n < 3600){
            System.out.println("Till the end: " + n + " seconds");
            System.out.println("Till the end is less then 1 hour");
        }
        else if (n == 3600){
            System.out.println("Till the end: " + n + " seconds");
            System.out.println("Till the end is 1 hour");
        }
        else if (n == 0){
            System.out.println("Time to go home!");
        }
        else {
            System.out.println("Till the end: " + n + " seconds");
            System.out.println("Till the end: " + h + " hours");
        }
    }
}
