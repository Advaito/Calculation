import java.io.IOException;
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static String s = sc.nextLine();
    static String[] arrays = s.split(" ");

    public static void main(String[] args) throws Exception {
        int a = Integer.parseInt(arrays[0]);
        int b = Integer.parseInt(arrays[2]);
        if (arrays.length!=3){
            throw new IOException("Неверно");
        }
        switch (arrays[1]) {
            case "+" -> System.out.println(a + b);
            case "-" -> System.out.println(a - b);
            case "*" -> System.out.println(a * b);
            case "/" -> System.out.println(a / b);
        }

    }
}