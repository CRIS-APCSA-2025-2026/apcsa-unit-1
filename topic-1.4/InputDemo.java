/* Demonstrate the Scanner class
 * to capture keyboard input (STDIN)
 */

import java.util.Scanner;  // import Scanner class into this program
public class InputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // create a scanner for STDIN
        System.out.print("Enter your age: "); // prompt user (give user instructions)
        int age = sc.nextInt(); // read integer from STDIN until newline
        System.out.println("You are " + age + " years old."); // output results (String + int + String) concatenation
        sc.close(); // close or else resource leak
    }
}