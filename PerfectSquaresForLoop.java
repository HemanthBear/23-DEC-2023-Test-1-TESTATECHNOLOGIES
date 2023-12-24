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
