import java.util.Arrays;

public class HW6_1 {
    public static void main(String[] args) {

        System.out.println("Задача №1");

//        Задача №1
//
//        Дана строка:
//        String s = “Перестановочный алгоритм быстрого действия”;
//        необходимо вывести все буквы “о” из этой строки.
//                Для указанной строки ответ будет “ооооо” (или в столбик)

        String s = "Перестановочный алгоритм быстрого действия";

        for (int i = 0; i <= s.length(); i++) {
            i = s.indexOf("о", i);
            if (i < s.length() && i > 0) {
                System.out.print("o");
            } else {
                break;
            }
        }
        System.out.println();

        System.out.println("Задача №2");

//        Задача №2
//
//        Дана строка:
//        String s = “Перевыборы выбранного президента”;
//        необходимо подсчитать количество букв “е” в строке.
//        Для указанной строки ответ будет 4.

        String ss = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < ss.length(); i++) {
            i = ss.indexOf("е", i);
            if (i < ss.length() && i > 0) {
                count += 1;
            } else {
                break;
            }
        }

        System.out.println(count);

        System.out.println("Задача №3");

//        Задача №3
//
//        Дана строка:
//        String s = “Посмотрите как Рите нравится ритм”;
//        необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//                Для указанной строки ответ будет 6, 15, 29.

        String sss = "Посмотрите как Рите нравится ритм";
        for (int i = 0; i < sss.length(); i++) {
            String ssss = sss.toLowerCase();
            i = ssss.indexOf(("рит"), i);
            if (i < ssss.length() && i > 0) {
                System.out.print(i + " ");
            } else {
                break;
            }
        }

        System.out.println("Задача №4");

//        Экстра задача
//
//        Дан массив:
//        String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
//        необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.

        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        String convert = Arrays.deepToString(array);
        

    }
}