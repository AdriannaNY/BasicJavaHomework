package colba;

public class Colba {
    private int temp1;
    private int temp2;

    private int rangeForFirst;

    private int rangeForSecond;

    public Colba(int rangeForFirst, int rangeForSecond) {
        this.rangeForFirst = rangeForFirst;
        this.rangeForSecond = rangeForSecond;
    }

    public void setTemp1(int temp1) {
        this.temp1 = temp1;
    }

    public void setTemp2(int temp2) {
        this.temp2 = temp2;
    }

    private boolean checkTemp(){
        return (temp1 >= rangeForFirst) && (temp2 <= rangeForSecond);
    }

    public void printCheckResult() {
        System.out.println("Your system is work correct  - " + checkTemp());
    }
}
