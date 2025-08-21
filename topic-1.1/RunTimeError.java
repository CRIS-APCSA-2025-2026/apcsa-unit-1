public class RuntimeErrorDemo {
    public static void main(String[] args) {
        // indexes: 0, 1, 2
        int[] numbers = {1, 2, 3};
        // accessing an element outside array produces a run-time error (Exception)
        System.out.println(numbers[5]); 
    }
}