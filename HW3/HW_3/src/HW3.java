import java.util.Scanner;
public class HW3 {
    public static void main(String[] args) {
        int a;
        int b;
        System.out.println("Введите число а = ");
        Scanner console_a = new Scanner(System.in);
        a = console_a.nextInt();

        System.out.println("Введите число b = ");
        Scanner console_b = new Scanner(System.in);
        b = console_b.nextInt();

        if (a == b) {
            System.out.println("a == b");
        } else {
        if (a < b) {
            System.out.println("1. a < b");
        }  else {
            System.out.println("1. a > b");
            }
        } if ((a + b) % 2 == 0) {
            System.out.println("2. а и б скорее всего четные");
        } else {
            System.out.println("2. какая то пересменная не четная");
        }

        if (a > 10 || b > 10 ) {
            System.out.println("3. a или b больше 10");
        }
        if (a < 100 || b < 100) {
            System.out.println("4. a или b меньше 100");
        }
        if ((a * 1.0 / 2) > 20 ) {
            System.out.println("5. Результат деления а на 2 больше 20");
        }
        if ((b * 1.0 / 2) > 20 ) {
            System.out.println("5. Результат деления b на 2 больше 20");

        }
        if (a >= 5 & a <= 40) {
            System.out.println("6. значение переменной a между 5 и 40 включительно");
        } else {
            System.out.println("6. значение переменной a меньше 5 или больше 40");
        }
        if (b >= 5 & b <= 40) {
            System.out.println("7. значение переменной b между 5 и 40 включительно");
        } else {
            System.out.println("7. значение переменной b меньше 5 или больше 40");
        }


    }
}

