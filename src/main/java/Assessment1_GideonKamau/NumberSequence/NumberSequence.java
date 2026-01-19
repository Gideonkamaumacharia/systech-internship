package Assessment1_GideonKamau.NumberSequence;

public class NumberSequence {
    public static void main(String[] args) {
        printNumbers();
    }

    public static void printNumbers() {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int number : numbers) {
            if (number % 5 == 0) {
                System.out.println("Multiple of 5");
            }else if (number % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
}
