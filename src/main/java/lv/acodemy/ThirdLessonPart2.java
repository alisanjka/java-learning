package lv.acodemy;

import java.util.Arrays;

public class ThirdLessonPart2 {
    public static void main(String[] args) {

        int summa = add(10, 30); // rezuljtat metoda kotorij nam chto-to vozvrashaet, mi mozhem ego vivesti na ekran
        System.out.println(summa); // esli nado sohranitj v peremenuju
        System.out.println(add(20, 10)); //esli toljko nado vivesti na ekran

        greet("Alisa");

        int add = add(30, 10, 5);
        System.out.println(add);


        int maxOfTwo = maxOfTwo(10, 30);
        System.out.println(maxOfTwo);

        int maxOfThree = maxOfThree(5, 10, 20);
        System.out.println(maxOfThree);

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 10, 100, 1, 2, 3, 300, 400};
        var rezultik = maxFromArray(numbers);
        System.out.println(rezultik);

        var i1 = maxFromArray(4, 10, 3, 48, 20, 20);
        System.out.println(i1);

        var asInt = Arrays.stream(numbers).max().getAsInt();
        System.out.println(asInt);


    }


    public static int add(int a, int b) { // int znachit chto nash metod budet vozvrashatj tip dannih int; add nazvanie metoda; int a/int b - paametri
        int result = a + b;
        return result; // esli v metode vozvrashaetsja tip dannih kakoj-to, to vsehda ukazivaem v konce return
    }

    // Methods overloading
    public static int add (int a, int b, int c) {
        return a + b + c;
    }
        // maxOfTwo, accepts: int a, int b; return the biggest number;

    public static int maxOfTwo (int a, int b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }

    public static int maxOfThree (int a, int b, int c) {
        if(a > b && a > c) {
            return a;
        } else if (b > a && b > c ) {
            return b;
        } else {
            return c;
        }
    }

    public static int maxFromArray(int... numbers) {
        int max = numbers[0];

        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }


    public static void greet(String name) { // void eto tip metoda kotorij nichego ne vozvrashaet t.e. rezuljtat nigde ne smozhem zapisatj
        System.out.println("Helo, " + name + "!");
    }
}
