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
            System.out.println("a < b");
        }  else {
            System.out.println("a > b");
            }
        } if (((a + b) % 2) == 0) {
            System.out.println("а и б скорее всего четные");
        } else {
            System.out.println("some variable is odd");
        }
    }
}

