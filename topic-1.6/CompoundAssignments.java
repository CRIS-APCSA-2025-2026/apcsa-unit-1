/*
 * Compound Assignments
 */
public class CompoundAssignments {
    public static void main(String args[]) {
        // intialize an int
        int num = 0;

        // assign a new value
        num = 1;
        System.out.println("num = 1");

        // add to the current value
        num = num + 1;  // 2
        System.out.println("num = num + 1; // " + num);

        // compound addition
        num += 1; // 3
        System.out.println("num += 1; // " + num);

        // posfix increment by 1
        num++; // 4
        System.out.println("num++; // " + num);

        // the three previous statements showed three to add 1

        // subtract to the current value
        num = num - 1;  // 3
        System.out.println("num = num - 1; // " + num);

        // compound addition
        num -= 1; // 2
        System.out.println("num -= 1; // " + num);

        // posfix increment by 1
        num--; // 1
        System.out.println("num--; // " + num);

        // compound operator exist for other operators:
        //   +=, -=, *=, /=, %=

        // initialize empty string
        String greeting = "";

        // initialize two parts of a greeting
        String str1 = "Hello";
        String str2 = "World";

        // three ways to concatenate

        // 1. not compound
        greeting = str1 + ", " + str2;
        System.out.println("str1 + \", \" + str2; // " + greeting); // Hello, World

       // 2. use current value and concatenate
       greeting = str1;
       greeting = greeting + ", " + str2; 
       System.out.println("greeting = greeting + \", \" + str2; // " + greeting); // Hello, World

       // 3. use current value and compound operator to concatenate
       greeting = str1;
       greeting += ", " + str2;
       System.out.println("greeting += \", \" + str2; // " + greeting); // Hello, World
    }
}