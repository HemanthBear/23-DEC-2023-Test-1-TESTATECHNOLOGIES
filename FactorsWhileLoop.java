import java.util.Scanner;

public class FactorsWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        System.out.println("Factors of " + num + ":");
        int i = 1;

        while (i <= num) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        scanner.close();
    }
}


//-------------------------------------------------for loop -----------------------------------------------
//public class FactorsForLoop {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a positive integer: ");
//        int num = scanner.nextInt();
//
//        System.out.println("Factors of " + num + " are:");
//
//        for (int i = 1; i <= num; i++) {
//            if (num % i == 0) {
//                System.out.print(i + " ");
//            }
//        }
//
//        scanner.close();
//    }
//}


//-------------------------------------------------------do while  ----------------------------------------------

//public class FactorsDoWhileLoop {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a positive integer: ");
//        int num;
//
//        // Input validation to ensure a positive integer is entered
//        do {
//            while (!scanner.hasNextInt()) {
//                System.out.println("Invalid input. Please enter a positive integer.");
//                scanner.next();
//            }
//            num = scanner.nextInt();
//        } while (num <= 0);
//
//        System.out.println("Factors of " + num + " are:");
//        int i = 1;
//
//        do {
//            if (num % i == 0) {
//                System.out.print(i + " ");
//            }
//            i++;
//        } while (i <= num);
//
//        scanner.close();
//    }
//}
