import java.util.Scanner;

public class PowerWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base and exponent from the user
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        // Calculate power using a while loop
        double result = 1;
        int count = 0;

        while (count < Math.abs(exponent)) {
            if (exponent > 0) {
                result *= base;
            } else {
                result /= base;
            }
            count++;
        }

        // Print the result from the loop
        System.out.println("Result using while loop: " + result);

        // Verify the result using Math.pow()
        double mathPowResult = Math.pow(base, exponent);

        // Print the result from Math.pow()
        System.out.println("Result using Math.pow(): " + mathPowResult);

        // Check if the results match within a small tolerance
        double tolerance = 1e-10;
        if (Math.abs(result - mathPowResult) < tolerance) {
            System.out.println("Results match!");
        } else {
            System.out.println("Results do not match!");
        }

        scanner.close();
    }
}





//--------------------------------------------- for-loop ----------------------------------------------------------------
//public class PowerCalculationForLoop {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the base number: ");
//        double base = scanner.nextDouble();
//
//        System.out.print("Enter the exponent: ");
//        double exponent = scanner.nextDouble();
//
//        double result = 1;
//
//        for (int i = 1; i <= exponent; i++) {
//            result *= base;
//        }
//
//        System.out.println("Result using loop: " + result);
//        System.out.println("Result using Math.pow(): " + Math.pow(base, exponent));
//
//        scanner.close();
//    }
//}

//-------------------------------------------------- do-while-loop  ------------------------------------------

//public class PowerCalculationDoWhile {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the base number: ");
//        double base = scanner.nextDouble();
//
//        System.out.print("Enter the exponent: ");
//        double exponent = scanner.nextDouble();
//
//        double result = 1;
//        int i = 1;
//
//        do {
//            result *= base;
//            i++;
//        } while (i <= exponent);
//
//        System.out.println("Result using loop: " + result);
//        System.out.println("Result using Math.pow(): " + Math.pow(base, exponent));
//
//        scanner.close();
//    }
//}

