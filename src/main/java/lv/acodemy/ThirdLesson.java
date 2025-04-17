package lv.acodemy;

import java.util.Arrays;

public class ThirdLesson {
    public static void main(String[] args) {

        // Conditional operators in Java

        // if (is, has -> isRaining, isRandomNumber, hasEvenValue)
        boolean isRaining = true;

        if(isRaining) {
            System.out.println("Take an umbrella!");
        }

        int temperature = 30;
        if(temperature > 29) {
            System.out.println("It is too hot!");
        }

        if(4 > 2 && 10 > 5) { //&& and
            System.out.println("Both are equals!");
        }

        if (4 < 2 || 10 < 11) { //  || or
            System.out.println("Execute this code");
        }


    //if-else ...
        boolean isWeekDay2 = true;

        if(isWeekDay2) {
        System.out.println("Working today...");
        } else {
       System.out.println("Will stay at home!");
    }

    int number = 10;
    // %
    // + - / * (

    if(number % 2 == 0) { // % vozvrashaet ostatok ot delenija 1ogo chisla na drugoe
        System.out.println("Even number");
    } else {
        System.out.println("Odd number");
    }
     // if age => 18 -> Access granted
        // in all other cases -> Acess denied

        int age = 18;
        if (age >= 18) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        // if-else-if-else

        int hour = 7;
        if(hour == 5) {
            System.out.println("Will go for run!");
        } else if (hour == 7) {
            System.out.println("Will have breakfast!");
        } else if (hour == 9) {
            System.out.println("Will start work!");
        } else {
            System.out.println("Free time!");
        }

        // score >= 90 - Perfect
        // score >= 70 - Good
        // >= 50 - OK
        // else -> NOT OK

        int score = 35;
        if(score >= 90) {
            System.out.println("Perfect!");
        } else if(score >= 70) {
            System.out.println("Good!");
        } else if (score >= 50) {
            System.out.println("OK!");
        } else {
            System.out.println("NOT OK!");
        }

        int age2 = 7;
         if (age2 >= 0 && age2 <=6) {
             System.out.println("Baby");
         } else if(age2 >= 7 && age2<= 17) {
            System.out.println("Shkilla");
        } else if(age2 >= 18 && age2 <= 65) {
            System.out.println("Adult");
        } else {
            System.out.println("pens");
        }

         // We know conditions & loops
        // Print even numbers from 1 to 10;

        for(int i = 1; i <= 10; i++) {
            if(i % 2 == 0) {
                System.out.println("Number: " + i + " is even number!");
            }
        }

        int [] numbers = {-2, -10, 5, 6, -100, 3, 0, 20};
        int sum = 0;

        // count sum only for numbers that are positive
        for(int i = 0; i < numbers.length; i++ ) {
            if (numbers[i] > 0) {
                sum = numbers[i] + sum;
            }
        }
        // ILI
        for (int j : numbers) {
            if (j > 0) {
                sum = j + sum;
            }
        }


        System.out.println("Sum of positive numbers: " + sum);
            // ILI
        int sumOfNumbers = Arrays.stream(numbers)
                .filter(n -> n > 0)
        .sum();
        System.out.println(sumOfNumbers);


        // 1 till 20
        // print numbers that can be divided by 3 and 5; (chislo delitsja na 3 i na 5)
        // print divided by 3
        // print divided by 5
        // else -> just print number;

        for(int i = 1; i <= 20; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("Number " + i + " can be divided by 3 or 5!");
            } else if(i % 3 == 0) {
                    System.out.println("Number " + i + " can be divided by 3!");
            } else if(i % 5 == 0) {
                        System.out.println("Number " + i + " can be divided by 5!");
                    } else {
                        System.out.println("This number is useless: " + i);
                    }
        }



    }


}
