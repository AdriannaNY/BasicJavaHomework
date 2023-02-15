package shops;

public class Shops {
    public static void main(String[] args) {
         boolean isEdekaOpen = true;
         boolean isReweOpen = false;
         boolean canBuy;

         if (isEdekaOpen && isReweOpen) {
             canBuy = true;
             System.out.println("You can buy a food - is " + canBuy);
             System.out.println("You can buy a food in Edeka or Rewe.");
         }
        if (!isEdekaOpen && !isReweOpen) {
            canBuy = false;
            System.out.println("You can buy a food - is " + canBuy);
            System.out.println("You can't buy a food! Shops Edeka and Rewe are closed!");
        }

        if (!isEdekaOpen && isReweOpen) {
            canBuy = true;
            System.out.println("You can buy a food - is " + canBuy);
            System.out.println("You can buy a food in Rewe.");
        }

        if (isEdekaOpen && !isReweOpen) {
            canBuy = true;
            System.out.println("You can buy a food - is " + canBuy);
            System.out.println("You can buy a food in Edeka.");
        }
    }
}
