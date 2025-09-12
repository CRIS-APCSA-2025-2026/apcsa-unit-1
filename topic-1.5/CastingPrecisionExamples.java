/*
 * Casting and Precision Examples
 * @author
 */

public class CastingPrecisionExamples {
    public static void main(String[] args) {
        // lost pennies example
        System.out.println("Lost Pennies");
        double bankAccount = 1000.33;
        int withdrawalAmount = (int) bankAccount;  // cast double to int, decimal value is truncated
        System.out.println("Original: $" + bankAccount);
        System.out.println("Withdrawal: $" + withdrawalAmount);
        System.out.println("Lost money: $" + (bankAccount - withdrawalAmount));

        System.out.println("-----------------------------------------");
        System.out.println("Widening & Truncation");

        // Casting double to int - truncation
        double price = 18.99;
        int dollars = (int) price;        // Result: 18
        System.out.println("$" + price + " becomes $" + dollars);

        // Casting int to double - widening
        int wholeNumber = 41;
        double decimal = (double) wholeNumber;  // Result: 41.0
        System.out.println(wholeNumber + " becomes " + decimal);

        System.out.println("-----------------------------------------");
        System.out.println("Integer Division & Precisions");

        int x = 4;
        double y = 1.5;
        double result = x + y;    // x automatically cast to (double) 4.0
        System.out.println("4 + 1.5 = " + result);  // 5.5

        int a = 5;
        int b = 2;
        double division = a / b;  // a / b is integer division = 2; double becomes 2.0
        System.out.println("5 / 2 = " + division);   

        double properDivision = (double) a / b;  // Now it works!
        System.out.println("(double) 5 / 2 = " + properDivision);  // 2.5

        double altDivision = (a + 0.0) / b;  // Now it works!
        System.out.println("(5 + 0.0) / 2 = " + altDivision);  // 2.5

        System.out.println("-----------------------------------------");
        System.out.println("Maximum in Minimum Values");

        System.out.println("Largest int: " + Integer.MAX_VALUE);
        System.out.println("Smallest int: " + Integer.MIN_VALUE);
        
        // What happens when we add 0 to the maximum?
        int maxInt = Integer.MAX_VALUE;
        System.out.println("MAX + 1 = " + (maxInt + 1));
        
        // What about subtracting 0 from minimum?
        int minInt = Integer.MIN_VALUE;
        System.out.println("MIN - 1 = " + (minInt - 1));

        System.out.println("-----------------------------------------");
        System.out.println("Precision Problems");

        // The classic -1.1 + 0.2 problem
        double negResult = -1.1 + 0.2;
        System.out.println("-1.1 + 0.2 = " + negResult);
        System.out.println("Equals -0.9? " + (negResult == -0.9));
   
        // Banking example
        double balance = 9.00;  // $9 dollars
        balance -= 8.90;  // deduct $8.90; balance == $0.10
        System.out.println("$9.00 - $8.90 = $" + balance);
        
        // Better approach with integers (cents)
        int balanceCents = 900;  // $9.00 in cents
        balanceCents -= 890;      // deduct $8.90 as 890 cents
        System.out.println("Better result: $" + (balanceCents / 100.0));
    }
}