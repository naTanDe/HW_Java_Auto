import java.util.Scanner;
public class Main {
    //Код из урока:

    public static void main(String[] args) {
        System.out.println("Does it move?(true/not true)");
        Scanner console_1 = new Scanner(System.in);
        boolean it_1 = console_1.hasNextBoolean();
        System.out.println("Should it?(true/not true)");
        Scanner console_2 = new Scanner(System.in);
        boolean it_2 = console_2.hasNextBoolean();
        if (it_1 == true && it_2 == false) {
            System.out.println("take skotch!");
        } else if (it_1 == false && it_2 == true) {
            System.out.println("take wd-40");
        } else {
            System.out.println("No problem");
        }
    }
}