public class main {
    /*  write a function that will take in the length of a word and add a space to the string if it is odd. and if it is even return it */
   static void oddLength(String str) {
        if (str.length() % 2 == 0) {
            System.out.println(str);
        }else{
            System.out.println(str + ' ');
        }
        
    }

    public static void main(String[] args) { 
        oddLength("hello");
    }

    
} 
