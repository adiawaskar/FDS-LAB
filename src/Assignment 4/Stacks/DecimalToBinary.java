import java.util.Scanner;

public class DecimalToBinary extends ArrayStack {
    public DecimalToBinary(int size) {
        super(size);
    }

    public static String decimalToBinary(int decimal) {
        if(decimal == 0){
            return "0";
        }
        ArrayStack<Integer> stack = new ArrayStack<>(10);

        while(decimal > 0){

            int remainder = decimal % 2;
            stack.push(remainder);
            decimal = decimal / 2;

        }
        StringBuilder binaryStr = new StringBuilder();
        while(!stack.isEmpty()){
            binaryStr.append(stack.pop());
        }
        return binaryStr.toString();
    }

    public static void main(String[] args) {
        System.out.print("Enter a decimal number: ");
        Scanner sc = new Scanner(System.in);
        int decimalNumber = sc.nextInt();
        String binaryRepresentation = decimalToBinary(decimalNumber);
        System.out.print("Binary representation: " + binaryRepresentation);
    }
}
