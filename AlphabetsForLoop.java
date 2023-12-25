public class AlphabetsForLoop {
    public static void main(String[] args) {
        // Print alphabets from 'a' to 'z' with Unicode
        System.out.println("Alphabets from a to z with Unicode:");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch + " - Unicode: " + (int) ch);
        }

        // Print reverse alphabets from 'Z' to 'A' with Unicode
        System.out.println("\nReverse Alphabets from Z to A with Unicode:");
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            System.out.println(ch + " - Unicode: " + (int) ch);

        }
    }
}



//public class AlphabetPrint {
//
//    public static void main(String[] args) {
//        // Using for loop
//        System.out.println("Using For Loop:");
//        forLoopAlphabets();
//
//        // Using while loop
//        System.out.println("\nUsing While Loop:");
//        whileLoopAlphabets();
//
//        // Using do-while loop
//        System.out.println("\nUsing Do-While Loop:");
//        doWhileLoopAlphabets();
//    }
//
//    // Function to print alphabets using for loop
//    public static void forLoopAlphabets() {
//        for (char ch = 'a'; ch <= 'z'; ch++) {
//            System.out.print(ch + " ");
//        }
//
//        for (char ch = 'Z'; ch >= 'A'; ch--) {
//            System.out.print(ch + " ");
//        }
//    }
//
//    // Function to print alphabets using while loop
//    public static void whileLoopAlphabets() {
//        char ch = 'a';
//        while (ch <= 'z') {
//            System.out.print(ch + " ");
//            ch++;
//        }
//
//        ch = 'Z';
//        while (ch >= 'A') {
//            System.out.print(ch + " ");
//            ch--;
//        }
//    }
//
//    // Function to print alphabets using do-while loop
//    public static void doWhileLoopAlphabets() {
//        char ch = 'a';
//        do {
//            System.out.print(ch + " ");
//            ch++;
//        } while (ch <= 'z');
//
//        ch = 'Z';
//        do {
//            System.out.print(ch + " ");
//            ch--;
//        } while (ch >= 'A');
//    }
//}
