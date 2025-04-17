package lv.acodemy;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLesson {
    public static void main(String[] args) {

        String name = "Alisa";
        int age = 30;

        //Array
        int[] numbers = new int[5]; // eto massiv s chislami, on poka pustoj no tuda mozhno polozhitj 5 chisel
        // [0, 0, 0, 0, 0]

        String[] names = {"John", "Andrey", "Mark"}; // [John, Andrey, Mark]

        int[] ages = {19, 20, 30, 41, 50};
        //index: [0] - 19
        //index: [1] - 20
        //index: [2] - 30

        String[] fruitBasket = new String[10];

        //Element access
        System.out.println(numbers[0]);
        numbers[0] = 10;
        numbers[1] = 12;
        numbers[2] = 14;
        numbers[3] = 16;
        numbers[4] = 18;
        System.out.println(Arrays.toString(numbers));

        //Exercise
        fruitBasket[0] = "kiwi";
        fruitBasket[1] = "apple";
        fruitBasket[2] = "blueberry";
        fruitBasket[3] = "strawberry";
        fruitBasket[4] = "mango";
        fruitBasket[5] = "melon";
        fruitBasket[6] = "watermelon";
        fruitBasket[7] = "papaya";
        fruitBasket[8] = "pear";
        fruitBasket[9] = "pineapple";
        System.out.println(Arrays.toString(fruitBasket));

        // Loops = cikli, pozvoljaet povtorjatj kusok koda neskoljko raz
        //Print hello world 5 times;
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        System.out.println("------------");

        // for loop
        // int i=0 - eto schetchik; i++ - uvelichivaet schetchik na 1
        //kogda znaem skoljko raz hotim povtorjatj;
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(fruitBasket[i]);
        }
        // ILI kogda ne znaem dlinu

        for (int i = 0; i < fruitBasket.length; i++) {
            System.out.println(fruitBasket[i]);
        }
        System.out.println("------------");

        //for each; pechataem VSE
        for (String fruit : fruitBasket) {
            System.out.println(fruit);
        }

        // for(counter (s kakogo indexa nachinaem bratj iz massiva dannie); condition_is_true (do kakogo countera on budet loopitj)

        //Create int number array from 0 -> to 10;
        //Print in reverse order;

        int[] numbers2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = numbers2.length - 1; i >= 0; i--) {
            System.out.print(numbers2[i] + " ");
        }

        //Concatenation
        String myName = "Alise";
        String mySurname = "Konivcenko";
        int myAge = 30;
        // My name is Alise Konivcenko. I am 30 years old.
        System.out.println("My name is " + myName + " " + mySurname + ". I am " + myAge + " years old.");
        //String.format();
        System.out.println(
                String.format("My name is %s %s. I am %d years old", myName, mySurname, myAge));
        String template = """
                My name is %s %s. I am %d years old""";
        System.out.println(String.format(template, myName, mySurname, myAge));

        // while loops (vipolnjaetsja poka uslovie true) vnachale proverjaet uslovie, potom vipolnjaet telo

        int i = 0;
        while (i < 5) {
            System.out.println("Number: " + i);
            i++; //uvelichivaet cikl na +1
        }

        Scanner scanner = new Scanner(System.in);
        String password = "";

        while (!password.equals("secret")) {
            System.out.println("Enter your password:");
            password = scanner.nextLine();
        }
        System.out.println("Access granted!");
        // OR

        boolean isGuessed = false;
        while (!isGuessed)
            if (!password.equals("secret")) {
                System.out.println("Enter your password:");
                password = scanner.nextLine();
            } else {
                System.out.println("Access granted");
                isGuessed = true;
            }

        // do while (vipolnjaetsja poka uslovie true) vnachale vipolnjaet telo, potom proverjaet uslovie

        int guessedNumber = 10;
        int guess;
        Scanner myScanner = new Scanner(System.in);
        do {
            System.out.println("Guess number from 1 to 10");
            guess = myScanner.nextInt();
        } while (guess != guessedNumber);

        System.out.println("Guessed!");


        // Vivesti tablicu umnozhenija na 5; 5 * 1 = 5 (do 10)


        // Poschitatj summu chisel ot 1 do 100

        int summa = 0;
        for (int o = 1; o <= 100; o++) {
            summa = summa + o;
        }
        System.out.println("Summa:" + summa);

        // While: vivesti chisla of 10 do 1


    }
}




