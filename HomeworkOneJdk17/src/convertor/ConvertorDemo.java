package convertor;

public class ConvertorDemo {
    public static void main(String[] args) {
        Convertor enterSumEuro = new Convertor();
        System.out.println("How much Euro would you like to convert in US Dollars? - ");
        int sumInEuro = enterSumEuro.sumEuro();
        double course = 1.07;
        System.out.println(sumInEuro + " Euro = " + sumInEuro*course + " US Dollars");
    }
}
