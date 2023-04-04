public class main {
    /*
     * write a function that will take in the length of a word and add a exclamation
     * point to the string if it is odd. and if it is even return it
     */
    static void oddLength(String str) {
        if (str.length() % 2 == 0) {
            System.out.println(str);
        } else {
            System.out.println(str + "! ");
        }

    }

    /*
     * Write a method isTired that states if the user is tired or not. A user is
     * tired if the amount of sleep they got is less than 8 hours. If they’ve slept
     * at least 5 hours, but have had coffee, the user is not tired
     */
    public static void isTired(int hoursOfSleep, boolean hadCoffee) {
        if (hoursOfSleep == 8) {
            System.out.println("The User is Not Tired");
        } else if (hoursOfSleep == 5 && hadCoffee) {
            System.out.println("The User is  Not Tired");
        } else {
            System.out.println("This User is Tired");
        }
    }

    /*
     * Write a method that takes in two numbers that represent hours worked and
     * hourly pay. The function should return the total amount paid for the hours
     * entered. For any hours over 40, you should receive overtime pay, which is 1.5
     * times the regular pay.
     */
    public static double payDay(int hours, double pay) {
        double totalPay;
        if (hours <= 40) {
            totalPay = hours * pay;
        } else {
            totalPay = hours * pay;
            totalPay = (hours - 40) * (1.5 * pay) + (40 * pay);
        }
        System.out.println(totalPay);
        return totalPay;
    }

    /*
     * Write a method luckyThirteen that takes in two values and returns whichever
     * number is closest to 13 without going over the value 13.
     * 
     * For example, luckyThirteen(9, 12) would return 12, whereas luckyThirteen(1,
     * 14) would return 1.
     * 
     * If both values are above 13, then return the value 0.
     */
    public static int lucky13(int x, int y) {
        if (x > 13 && y > 13) {
            return 0;
        } else if (x <= 13 && y > 13) {
            return x;
        }
        if (x <= 13 && y > 13) {
            return y;
        }
        return x > y ? x : y;
    }

    public static int sqrtTwo(int digit) {

        // Compute the square root of 2 to the specified number of decimal places

        double sqrtTwo = Math.sqrt(2);

        String sqrtTwoString = String.format("%." + digit + "f", sqrtTwo);

        // Extract the requested digit from the result and return it as an integer

        return Character.getNumericValue(sqrtTwoString.charAt(digit + 1));

    }

    public static void main(String[] args) {
        oddLength("now");
        isTired(4, true);
        payDay(50, 10);
        lucky13(7, 12);
        sqrtTwo(5);
    }

}
