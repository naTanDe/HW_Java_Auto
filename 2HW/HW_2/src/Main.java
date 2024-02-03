//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 31;
        int b = 5;
        System.out.println("Деление цеорчисленное " + a / b);
        int s = a + b;
        int u = a * b;
        int r = a - b;
        double d = 1.0 * a / b;
        int n = a % b;
        System.out.println(s);
        System.out.println(u);
        System.out.println(r);
        System.out.println(d);
        System.out.println(n);
        if (a % 2 == 0) {
            System.out.println("a = " + a + " четное");
        }
        if (b % 2 == 0) {
            System.out.println("b = " + b + " четное");
        } else {
            System.out.println("a и b нечетные");
        }

    }
}