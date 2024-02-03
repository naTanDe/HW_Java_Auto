import java.util.Scanner;
public class HW4_1 {
    public static void main(String[] args) {

        System.out.println("Введи первое значение");
        Scanner console_1 = new Scanner(System.in);
        int a = console_1.nextInt();

        System.out.println("Введи второе значение");
        Scanner console_2 = new Scanner(System.in);
        int b = console_2.nextInt();

        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }

        for (int j = 1; Math.pow(5, j) <= 10000; j++) {
            System.out.println((int) Math.pow(5, j));
        }

        System.out.println();

        for (int k = 40; k <= 60; k++) {
            if (k % 4 == 0) {
                System.out.println(k);
            }
        }

        System.out.println();

        for (int k = 40; k <= 60; k = k + 4) {
            System.out.println(k);
        }
    }
}
