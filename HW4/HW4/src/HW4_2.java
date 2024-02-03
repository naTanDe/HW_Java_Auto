import java.util.Arrays;

public class HW4_2 {
    public static void main(String[] args) {
        System.out.println("\nЗадача_1\n");
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести все нечетные числа из массива.
        int[] array_1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array_1.length; i++) {
            if (array_1[i] % 2 == 0) {
                System.out.print(array_1[i] + " ");
            }
        }
        System.out.println("\n\nЗадача_2\n");

//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести все значения массива больше 5.
        int[] array_2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int j = 0; j < array_2.length; j++) {
            if (array_2[j] > 5) {
                System.out.print(array_2[j] + " ");
            }
        }
        System.out.println("\n\nЗадача_3\n");
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо увеличить все значения массива на 15.

        int[] array_3 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int k = 0; k < array_3.length; k++) {
            array_3[k] = array_3[k] + 15;
            }
        System.out.println(Arrays.toString(array_3));
    }
}
