import java.util.Scanner;

class Calc {
    static Scanner scan = new Scanner(System.in);
    static int operand1, operand2;
    static int result;

    public static void main(String[] args) throws Exception {
        String[] input = scan.nextLine().split(" ");
        if (input.length != 3) {
            throw new Exception("Два операнда и один оператор (+,-,*,/)");
        }
        if (input[0].equals("I") || input[0].equals("II") || input[0].equals("III") || input[0].equals("IV") || input[0].equals("V") || input[0].equals("VI") || input[0].equals("VII") || input[0].equals("VIII") || input[0].equals("IX") || input[0].equals("X") && input[2].equals("I") || input[2].equals("II") || input[2].equals("III") || input[2].equals("IV") || input[2].equals("V") || input[2].equals("VI") || input[2].equals("VII") || input[2].equals("VIII") || input[2].equals("IX") || input[2].equals("X")) {
            operand1 = romanToArab(input[0]);
            operand2 = romanToArab(input[2]);

            if (operand1 > 0 && operand1 < 11 && operand2 > 0 && operand2 < 11) {
                result = calc(operand1, operand2, input[1]);
                if (result > 0) {
                    String resultRomanNum = convertArabToRoman(result);
                    System.out.println(resultRomanNum);
                } else {
                    throw new Exception("Римское число не может быть 0 или отрицательным!");
                }
            }
        } else {
            operand1 = Integer.parseInt(input[0]);
            operand2 = Integer.parseInt(input[2]);
            if (operand1 < 11 && operand1 > 0 && operand2 < 11 && operand2 > 0) {
                result = calc(operand1, operand2, input[1]);
                System.out.println(result);
            } else {
                throw new Exception("Вводить нужно только от 1 до 10 включительно!");
            }
        }
    }

    static int romanToArab(String str) throws Exception {
        if (str.equals("I") || str.equals("II") || str.equals("III") || str.equals("IV") || str.equals("V") || str.equals("VI") || str.equals("VII") || str.equals("VIII") || str.equals("IX") || str.equals("X")) {
            switch (str) {
                case "I":
                    return 1;
                case "II":
                    return 2;
                case "III":
                    return 3;
                case "IV":
                    return 4;
                case "V":
                    return 5;
                case "VI":
                    return 6;
                case "VII":
                    return 7;
                case "VIII":
                    return 8;
                case "IX":
                    return 9;
                case "X":
                    return 10;
            }
        } else {
            throw new Exception("Используются одновременно разные системы счисления!");
        }
        return 0;
    }

    static String convertArabToRoman(int arabic) {
        int[] values = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanLiterals = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (arabic >= values[i]) {
                arabic -= values[i];
                roman.append(romanLiterals[i]);
            }
        }
        return roman.toString();
    }

    static int calc(int a, int b, String operator) {
        int result;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                try {
                    result = a / b;
                } catch (ArithmeticException e) {
                    throw new ArithmeticException("Нельзя делить на 0");
                }
                break;
            default:
                throw new IllegalArgumentException("Не верный знак операции: " + operator);
        }
        return result;
    }
}
