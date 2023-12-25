import java.util.Scanner;

public class ReverseDigitsPalindromeDoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int originalNumber = scanner.nextInt();
        int number = originalNumber;
        int reversedNumber = 0;

        do {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        } while (number != 0);

        System.out.println("Reversed number: " + reversedNumber);

        if (originalNumber == reversedNumber) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }

        scanner.close();
    }
}


//------------------------------------ for-loop  -----------------------------
//public class PalindromeCheckForLoop {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//        int originalNumber = number;
//        int reversedNumber = 0;
//
//        for (; number != 0; number /= 10) {
//            int digit = number % 10;
//            reversedNumber = reversedNumber * 10 + digit;
//        }
//
//        System.out.println("Original Number: " + originalNumber);
//        System.out.println("Reversed Number: " + reversedNumber);
//
//        if (originalNumber == reversedNumber) {
//            System.out.println("The number is a palindrome.");
//        } else {
//            System.out.println("The number is not a palindrome.");
//        }
//
//        scanner.close();
//    }
//}


//-------------------------------while-loop--------------------------------------------------------------------------

//public class PalindromeCheckWhileLoop {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//        int originalNumber = number;
//        int reversedNumber = 0;
//
//        while (number != 0) {
//            int digit = number % 10;
//            reversedNumber = reversedNumber * 10 + digit;
//            number /= 10;
//        }
//
//        System.out.println("Original Number: " + originalNumber);
//        System.out.println("Reversed Number: " + reversedNumber);
//
//        if (originalNumber == reversedNumber) {
//            System.out.println("The number is a palindrome.");
//        } else {
//            System.out.println("The number is not a palindrome.");
//        }
//
//        scanner.close();
//    }
//}

