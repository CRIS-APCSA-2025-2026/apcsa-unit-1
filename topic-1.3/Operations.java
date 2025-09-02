/*
 * Arithmetic Expressions & Operations
 * - Compile and run this program
 * - Study the code and expression
 * - Verify your understanding by studying the output
 */
public class Operations {
    public static void main(String args[]) {
        System.out.println("Integer Division:");
        System.out.println("7 / 2");
        System.out.println(7 / 2);

        System.out.println("Float or Double Division:");
        System.out.println("7.0 / 2");
        System.out.println(7.0 / 2);

        System.out.println("Remainder of Division Operation:");
        System.out.println("7 % 2");
        System.out.println(7 % 2);

        System.out.println("Remainder of (Negative) Division Operation:");
        System.out.println("7 % -2");
        System.out.println(7 % -2);

        System.out.println("Integer Division:");
        System.out.println("5 + 1 / 2");
        System.out.println(5 + 1 / 2);

        System.out.println("Float Promotion:");
        System.out.println("5 + 1.0 / 2");
        System.out.println(5 + 1.0 / 2);

        System.out.println("Integer Division: decimal value cut off");
        System.out.println("(6 + 1) / 2");
        System.out.println((6 + 1) / 2); // 3 not 3.5!

        System.out.println("Integer Expressions - Order of Operations");
        System.out.println("=========================================");

        System.out.println("int x = 5;");
        System.out.println("int y = 2;");
        System.out.println("int z = 3;");

        int x = 5;
        int y = 2;
        int z = 3;

        System.out.println("x + y * z");
        System.out.println(x + y * z);

        System.out.println("(x + y) * z");
        System.out.println((x + y) * z);

        System.out.println("x + y * z / 2");
        System.out.println(x + y * z / 2);

        System.out.println("x % y + z");
        System.out.println(x % y + z);

        System.out.println("(x + y) / y + z");
        System.out.println((x + y) / y + z);

        System.out.println("Double Expressions");
        System.out.println("==================");


        int whole = 7;
        double decimal = 2.5;

        System.out.println("int whole = 7;");
        System.out.println("double decimal = 2.5;");

        System.out.println("whole + decimal");
        System.out.println(whole + decimal);

        System.out.println("whole / 3");
        System.out.println(whole / 3);

        System.out.println("whole / 3.0");
        System.out.println(whole / 3.0);

        System.out.println("Cast integer to double");

        System.out.println("(double) whole / 3 ");
        System.out.println((double) whole / 3 );

        System.out.println("Negative Values (unary operator)");
        System.out.println("================================");

        System.out.println("-3 + 2");
        System.out.println(-3 + 2);

        System.out.println("-5 * -2");
        System.out.println(-5 * -2);

        System.out.println("(-5 + 2) * -2 / 3");
        System.out.println((-5 + 2) * -2 / 3);

        System.out.println("Division by Zero");
        System.out.println("================");

        System.out.println("5 / 0");
        System.out.println(5 / 0);
    }
}