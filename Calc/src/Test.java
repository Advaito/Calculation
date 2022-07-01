import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws Exception{
        Test2 sc = new Test2();
        int a = sc.romanToInt(Main.arrays[0]);
        if (a<1 || a > 10) {
            throw new IOException("ot I do X");
        }
        int b = sc.romanToInt(Main.arrays[2]);
        if (b < 1 || b > 10) {
            throw new IOException("ot I do X");
        }
        if (Main.arrays.length!=3){
            throw new IOException("2 числа и знак +-*/");
        }

        int res;
        switch (Main.arrays[1]) {
            case "+" -> {
                res = a + b;
                Test2.intToRoman(res);
                //System.out.println(res);
            }
            case "-" -> {
                res = a - b;
                Test2.intToRoman(res);
               // System.out.println(res);
            }
            case "*" -> {
                res = a * b;
                Test2.intToRoman(res);
               // System.out.println(res);
            }
            case "/" -> {
                res = a / b;
                Test2.intToRoman(res);
               // System.out.println(res);
            }
        }
    }
    public static class Test2 {
        Map<Character, Integer> map = new HashMap<>();
        {
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
        }
        public int romanToInt(String s) {
            int result = 0;
            int prev = 0;

            for (int i = s.length() - 1; i >= 0; i--) {
                int curr = map.get(s.charAt(i));
                if (curr < prev) {
                    result -= curr;
                } else {
                    result += curr;
                }
                prev = curr;
            }
            return result;
        }
        public static void intToRoman(int num){
            int[] values = {100,90,50,40,10,9,5,4,1};
            String[] romanLiterals = {"C","XC","L","XL","X","IX","V","IV","I"};
            StringBuilder roman = new StringBuilder();
            for (int i = 0; i < values.length;i++){
                while (num >= values[i]){
                    num -= values[i];
                    roman.append(romanLiterals[i]);
                }
            }
            System.out.println(roman);
        }
    }
}
