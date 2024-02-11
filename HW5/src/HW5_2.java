public class HW5_2 {
    public static void main(String[] args) {

        System.out.println("Задача №1");
//        Вывести следующие строки с соответствующим форматированием (как пирамиды):
////
//        Задача №1
//
//        0  1  2  3  4  5  6  7  8  9
//        0  1  2  3  4  5  6  7  8
//        0  1  2  3  4  5  6  7
//        0  1  2  3  4  5  6
//        0  1  2  3  4  5
//        0  1  2  3  4
//        0  1  2  3
//        0  1  2
//        0  1
//        0

        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("Задача №2");

        for (int i = 9; i >= 0; i--) {
            for (int j = 9; j > i; j-- ) {
                System.out.print("  ");
            }
                for (int k = 0; k <= i; k++) {

                    System.out.print(k + " ");
            }
            System.out.println();
            }

        System.out.println("Задача №3");

        for (int i = 9; i >= 0; i--) {
            for (int j = 9; j > i; j--) {
                System.out.print("  ");
            }
                for (int k = i; k >= 0; k--) {
                    System.out.print(k + " ");
            }
                for (int l = 1; l <= i; l++) {
                    System.out.print(l + " ");
                }
            System.out.println();
        }
    }
}

