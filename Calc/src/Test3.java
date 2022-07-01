import java.util.Arrays;
import java.util.Collections;

public class Test3 {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3, 1, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value, int begin, int end) {
        //напишите тут ваш код
       // for(int i = 0; i<array.length;i++){
            Arrays.fill(array,begin,end,value);
       // }
    }
}
