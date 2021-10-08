package cd.rr.strings;

import java.util.Scanner;

public class Write {

    public static void main(String[] args) {

        // Problem 1: Concat
        // Prompt the user for two different words and concatenate the two words
        // Ex. word1 = "Hello" and word2 = "World" then output = "HelloWorld"
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first word");
            String s1 = sc.nextLine();
            System.out.println("Enter second word");
            String s2 = sc.nextLine();
            System.out.println(s1 + s2);

        // Problem 2: Empty String
        // Prompt the user and display true if the string is empty, otherwise display false
        System.out.println("Enter a word");
        String s3 = sc.nextLine();
        boolean b1 = s3.isEmpty();
        System.out.println(b1);

        // if we have to display the text message then use if-else statement
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a word");
//        String s3 = sc.nextLine();
//        if(s3.isEmpty()){
//            System.out.println("String is empty");
//        }else{
//            System.out.println("String is not empty");
//        }

        // Problem 3: Even Length
        // Prompt the user and display true if the string has an even number of characters, otherwise display false
        System.out.println("Enter a word");
        String s4 = sc.nextLine();
        int x = s4.length();

        if(x % 2 ==0) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        // Problem 4: GPA to Letter Grade
        // Prompt the user to enter their gpa and display their letter grade. Use the conversion found below
        // (https://binary-translator.co/upload/cache/upload/imgs/how-to-use-free-gpa-calculator--m256x190.jpg)
        System.out.println("Enter your GPA");
        double gpa = sc.nextDouble();
        if(gpa>=3.7){
            System.out.println("Your grade is A");
        }
        else if(gpa>=2.7){
            System.out.println("Your grade is B");
        }
        else if (gpa>=1.7){
            System.out.println("Your grade is C");
        }
        else if(gpa>=0.7){
            System.out.println("Your grade is D");
        }
        else{
            System.out.println("Your grade is F");
        }

        // Problem 5: Calculator
        // Prompt the user for two numbers and an operation, generate the math problem, and display.
        // Ex. num1 = 4, num2 = 2, operator = "-", then output should be 4-2=?
        System.out.println("Enter num1");
        float num1 = sc.nextFloat();
        System.out.println("Enter num2");
        float num2 = sc.nextFloat();
        System.out.println("Enter the arithmetic operator +, -, *, /, %");
        String n = sc.next();
        switch (n) {
            case "+":
                float add;
                add = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + add);
                break;

            case "-":
                float sub;
                sub = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + sub);
                break;

            case "*":
                float multiply;
                multiply = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + multiply);
                break;

            case "/":
                float div;
                div = (float) num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + div);
                break;

            case "%":
                float mod;
                mod = num1 % num2;
                System.out.println(num1 + " % " + num2 + " = " + mod);
                break;

            case "default":
                System.exit(0);
        }

        // Problem 6: Starts with a Vowel
        // Prompt the user to enter a word and display true or false if the word they entered starts with a vowel
        System.out.println("Enter a word");
        char ch;
        ch = sc.next().charAt(0);
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' ||
                ch=='i' || ch=='I' || ch=='o' || ch=='O' ||
                ch=='u' || ch=='U')
        {
            System.out.print("This is a Vowel");
        }
        else
        {
            System.out.print("This is not a Vowel");
        }
        // Problem 7: Ends with a Vowel
        // Prompt the user to enter a word and display true or false if the word they entered ends with a vowel
        System.out.println("Enter a word");
        String s7 = sc.next();
        char ch1;
        ch1 = s7.charAt(s7.length()-1);
        if(ch1=='a' || ch1=='A' || ch1=='e' || ch1=='E' ||
                ch1=='i' || ch1=='I' || ch1=='o' || ch1=='O' ||
                ch1=='u' || ch1=='U')
        {
            System.out.print("This is a Vowel");
        }
        else
        {
            System.out.print("This is not a Vowel");
        }
    }


}
