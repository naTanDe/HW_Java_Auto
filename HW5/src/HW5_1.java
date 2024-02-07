public class HW5_1 {
    public static void main(String[] args) {
//        Задача №1
//
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести сумму всех значений массива.

        System.out.println("Задача №1");

        int[] array_1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int a = 0;
        for (int i = 0; i < array_1.length; i++ ) {
            a = a + array_1[i];
        }
        System.out.println("Сумма всех значений массива = " + a);

//        Задача №2
//
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести максимальное значение массива.

        System.out.println("Задача №2");

        int[] array_2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array_2.length; i++) {
            if (array_2[i] > max) {
                max = array_2[i];
            }
        }
        System.out.println("Максимальное значение массива = " + max);


//        Задача №3
//
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести минимальное значение массива.

        System.out.println("Задача №3");

        int[] array_3 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array_3.length; i++) {
            if (array_3[i] < min) {
                min = array_3[i];
            }
        }
        System.out.println("Минимальное значение массива = " + min);

//        Задача №4
//
//        Дан массив:
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        необходимо вывести среднее арифметическое всех значений массива

        System.out.println("Задача №4");

        int[] array_4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum_4 = 0;
        for (int i = 0; i < array_4.length; i++) {
            sum_4 += array_4[i];
        }
        System.out.println("Среднее арифметическое всех значений массива = " + 1.0* sum_4 / array_4.length);

//        Задача №5
//
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести сумму элементов массива.

        System.out.println("Задача №4");
        int[][] array_5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum_5 = 0;
        for (int i = 0; i < array_5.length; i++) {
            for (int j = 0; j < array_5[i].length; j++) {
                sum_5 += array_5[i][j];
            }
        }
        System.out.println("Сумма элементов массива = " + sum_5);







    }
}
