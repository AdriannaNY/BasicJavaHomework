package colba;

public class ColbaDemo {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        Colba colba = new Colba(100,100);

        colba.setTemp1(ui.userInputInteger("Please enter first flask temp - "));

        int temp2 = ui.userInputInteger("Please enter second flask temp - ");
        colba.setTemp2(temp2);

        colba.printCheckResult();
    }
}

