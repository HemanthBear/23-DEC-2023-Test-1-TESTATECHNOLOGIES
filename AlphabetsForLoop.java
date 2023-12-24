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
