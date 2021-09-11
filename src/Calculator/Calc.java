package Calculator;

public class Calc {
    public static int calculate(int fNumber, int sNumber, char operand) {
        int result = 0;
        switch (operand){
            case '+':
                result = fNumber+sNumber;
                break;
            case '-':
                result = fNumber-sNumber;
                break;
            case '*':
                result = fNumber*sNumber;
                break;
            case '/':
                try {
                    result = fNumber / sNumber;
                } catch (ArithmeticException e) {
                    System.out.println("деление на ноль невозможно");

                    break;
                }
                break;

        }
        return result;
    }
}

