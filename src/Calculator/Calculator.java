package Calculator;

import java.util.Scanner;

class Calculator {


    public static void main(String[] args) throws Exception {
        System.out.println("Введите выражение:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().replaceAll(" ", "");

        //разделяю строку по операнду на две строки(два числа):
        String[] numbers = input.split("[-+*/]");

        //находим операнд.
        char operand = 0;

        if (input.contains("-")) {
            operand = '-';
        } else if (input.contains("+")) {
            operand = '+';
        } else if (input.contains("/")) {
            operand = '/';
        } else if (input.contains("*")) {
            operand = '*';
        }

        //условие для принимаемой строки(арабские числа):
        if (input.matches(".*\\d.*")) {
            int firstNumber = Integer.parseInt(numbers[0]);
            int secondNumber = Integer.parseInt(numbers[1]);

            if (firstNumber < 0 || secondNumber < 0) {
                System.out.println("Введенное из чисел(или оба) меньше ноля.");
            } else if (firstNumber > 10 || secondNumber > 10) {
                System.out.println("Введенное из чисел(или оба) больше десяти.");
            } else {
                System.out.println(Calc.calculate(firstNumber, secondNumber, operand));
            }
        }

        //условие для римских чисел:
        else {
            int result;
            int firstNumber = RomanConvert.romanToInt(numbers[0]);
            int secondNumber = RomanConvert.romanToInt(numbers[1]);
            result = Calc.calculate(firstNumber, secondNumber, operand);
            if(result>0) {

                System.out.println(Roman.values()[result]);
            }
            else{
                throw new Exception("Неверный формат данных");
            }
        }


    }

}

