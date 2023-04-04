public class main {
    /*  write a function that will take in the length of a word and add a exclamation point to the string if it is odd. and if it is even return it */
   static void oddLength(String str) {
        if (str.length() % 2 == 0) {
            System.out.println(str);
        }else{
            System.out.println(str + "! ");
        }
        
    }

    /* Write a method isTired that states if the user is tired or not. A user is tired if the amount of sleep they got is less than 8 hours. If they’ve slept at least 5 hours, but have had coffee, the user is not tired*/
    public static void isTired(int hoursOfSleep, boolean hadCoffee) {
        if (hoursOfSleep == 8){
            System.out.println("The User is Not Tired");
        }else if (hoursOfSleep == 5 && hadCoffee){
            System.out.println("The User is  Not Tired");
        }else {
            System.out.println("This User is Tired");
        }
    }
    

    public static void main(String[] args) { 
        oddLength("now");
        isTired(4, true);
    }

    
} 
