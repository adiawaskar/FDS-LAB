import java.util.Scanner;
/**
 * The `DecimalToBinary` class is used to convert a decimal number to its binary representation.
 * It utilizes a stack data structure to perform this conversion.
 */
public class DecimalToBinary extends ArrayStack {

    /**
     * Constructs a `DecimalToBinary` object with the specified size.
     *
     * @param size The size of the stack to be used for conversion.
     */
    public DecimalToBinary(int size) {
        super(size);
    }

    /**
     * Converts a decimal number to its binary representation.
     *
     * @param decimal The decimal number to be converted to binary.
     * @return The binary representation of the input decimal number as a string.
     */
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        ArrayStack<Integer> stack = new ArrayStack<>(10);

        while (decimal > 0) {
            int remainder = decimal % 2;
            stack.push(remainder);
            decimal = decimal / 2;
        }

        StringBuilder binaryStr = new StringBuilder();
        while (!stack.isEmpty()) {
            binaryStr.append(stack.pop());
        }
        return binaryStr.toString();
    }

    /**
     * The main method of the program. Reads a decimal number from the user and prints its binary representation.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        System.out.print("Enter a decimal number: ");
        Scanner sc = new Scanner(System.in);
        int decimalNumber = sc.nextInt();
        String binaryRepresentation = decimalToBinary(decimalNumber);
        System.out.print("Binary representation: " + binaryRepresentation);
    }
}
