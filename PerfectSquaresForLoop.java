import java.util.Scanner;

public class PerfectSquaresForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int end = scanner.nextInt();

        System.out.println("Perfect squares between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            double squareRoot = Math.sqrt(i);
            if (squareRoot == (int) squareRoot) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}


//--------------------------------- while-loop ---------------------------------------------------

//public class PerfectSquaresWhileLoop {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the first number: ");
//        int start = scanner.nextInt();
//
//        System.out.print("Enter the second number: ");
//        int end = scanner.nextInt();
//
//        System.out.println("Perfect squares between " + start + " and " + end + " are:");
//
//        int i = (int) Math.ceil(Math.sqrt(start)); // Find the first perfect square greater than or equal to start
//
//        while (i * i <= end) {
//            System.out.print(i * i + " ");
//            i++;
//        }
//
//        scanner.close();
//    }
//}

//----------------------------------------------- do-while-loop ------------------------------------------------

//public class PerfectSquaresDoWhileLoop {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the first number: ");
//        int start = scanner.nextInt();
//
//        System.out.print("Enter the second number: ");
//        int end = scanner.nextInt();
//
//        System.out.println("Perfect squares between " + start + " and " + end + " are:");
//
//        int i = (int) Math.ceil(Math.sqrt(start)); // Find the first perfect square greater than or equal to start
//
//        do {
//            System.out.print(i * i + " ");
//            i++;
//        } while (i * i <= end);
//
//        scanner.close();
//    }
//}
