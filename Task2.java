public class Task2 {
    public static void main(String[] args) {

        int[][] array = new int[][]{{0, 1, 0, 0}, {1, 0, 0, 1},
                                    {0, 0, 1, 0}, {0, 0, 1, 0}};
        System.out.println(simE1(array));
    }

    public static int simE1(int[][] array) {
        for (int index = 0; index < array.length; index++) {
            if (array.length != array[index].length) throw new RuntimeException("Массив не квадратный!");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != 0 && array[i][j] != 1) throw new RuntimeException("В ячейках должны быть 0 или 1!");

                sum += array[i][j];
            }
        }
        return sum;
    }
}