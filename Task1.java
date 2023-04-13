import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 0, 5, 10, 1};
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите искомое число = ");

        int userValue = sc.nextInt();
        int result = findE1(arr, userValue);


        switch (result) {
            case -1:
                System.out.println("Длина массива меньше некоторого заданного минимума");
                break;
            case -2:
                System.out.println("Искомый элемент не найден");
                break;
            case -3:
                System.out.println("Вместо массива пришел null");
                break;
            default:
                System.out.println("Искомый элемент найден и он находится на позиции: " + result);
                break;
        }
        sc.close();
    }

    public static int findE1(int[] arr, int value) {

        if (arr == null) {
            return -3;
        } else if (arr.length == 0) {
            return -1;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == value) {
                    return i;
                }
            }
        }
        return -2;
    }
}


