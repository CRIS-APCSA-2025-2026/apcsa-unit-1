/**
 * Fix Logic Error
 * Fix the code so that it is logical (makes sense)
 *
 * @author 
 */
public class LogicError {
    public static void main(String[] args) {
        String text = "ABCDE";           // sequence of characters
        char c = text.charAt(1);         // character in string

        // Does this output make sense?
        System.out.println("The first character in " + text + " is " + c);
    }
}