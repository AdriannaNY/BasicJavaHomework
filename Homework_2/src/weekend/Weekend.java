package weekend;

public class Weekend {
    public static void main(String[] args) {
        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk;

        if (isWeekend && !isRain) {
            canWalk = true;
            System.out.println("You can walk! - is " + canWalk);
            System.out.println("Today is a weekend and there is no rain.");
        }

        if (isWeekend && isRain) {
            canWalk = false;
            System.out.println("You can walk! - is " + canWalk);
            System.out.println("You can't walk! Today is rainy.");
        }

        if (!isWeekend && !isRain) {
            canWalk = false;
            System.out.println("You can walk! - is " + canWalk);
            System.out.println("You can't walk! Today is not a weekend.");
        }

        if (!isWeekend && isRain) {
            canWalk = false;
            System.out.println("You can walk! - is " + canWalk);
            System.out.println("You can't walk! Today is not a weekend and it's rainy!");
        }
    }
}
