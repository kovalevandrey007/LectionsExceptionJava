import javax.management.RuntimeErrorException;
import java.util.ArrayList;
import java.util.List;

public class Task3 {

    public static boolean checkArray(Integer[] arr) {

        boolean check = true;
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            lst.add(i);
            check = false;
        }
        if (check == false) {
            String str = "В данном массиве на позициях: " + lst + "значения равны NULL";
            throw new RuntimeErrorException(null, str);
        }
        return check;
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1,null, 3, 5, 2, 6};
        if (checkArray(array)) {
            System.out.println("Array is good!");
        };
    }
}
