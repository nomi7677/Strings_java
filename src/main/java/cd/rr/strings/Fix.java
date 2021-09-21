package cd.rr.strings;

import java.util.Scanner;

public class Fix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Problem 1: Greeting
        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.println("Hello " + "name");

        // Problem 2: First Four
        System.out.print("Enter a message: ");
        String message = scanner.next();
        System.out.println("First Four Characters: " + message.substring(4));

    // Problem 3: Display Full Name
        System.out.print("Enter your First Name: ");
        String first = scanner.next();
        System.out.print("Enter your Middle Name: ");
        String middle = scanner.next();
        System.out.print("Enter your Last Name: ");
        String last = scanner.next();
        System.out.println("first + middle + last");

        // Problem 4: Ends with Number
        System.out.print("Type some text: ");
        String input = scanner.next();
        char lastCharacter = input.charAt(input.length());

        if(lastCharacter >= '0' && lastCharacter <= '9'){
            System.out.println(true);
        }

        else{
            System.out.println(false);
        }

        // Problem 5: Summation
        System.out.print("Enter a Number: ");
        String num1 = scanner.next();
        System.out.print("Enter a Number: ");
        String num2 = scanner.next();
        System.out.print("Enter a Number: ");
        String num3 = scanner.next();

        System.out.println(num1 + num2 + num3);

        // Problem 6: Pig Latin
        System.out.print("Enter a word: ");
        String word = scanner.next();
        String newWord = word.substring(1) + word.charAt(1) + "ay";
        System.out.println("New Word: " + newWord);

    }
}
