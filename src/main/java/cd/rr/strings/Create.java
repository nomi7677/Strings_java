package cd.rr.strings;

import java.util.Scanner;

public class Create {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        // Problem 1: Name Flip
        // Prompt the user to enter their first and last name, return their
        // last name - comma - first name.
        // ex: text => "Kaleb Burd" then output = "Burd, Kaleb"
        System.out.println("Enter your first and last name");
        String name = sc.nextLine();
        String[] parts = name.split(" ");
        System.out.println(parts[1]+","+parts[0]);

        // Problem 2: Valid SSN
        // Prompt the user to enter their SSN and determine if it is a valid SSN or not.
        // A valid SSN follows the following format: NNN-NN-NNNN where N is a number 0-9
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a Social Security number
        System.out.print("Enter a SSN: ");
        String ssn = input.nextLine();

        // Check whether the input is valid
        boolean isValid =
                (ssn.length() == 11) &&
                        (Character.isDigit(ssn.charAt(0))) &&
                        (Character.isDigit(ssn.charAt(1))) &&
                        (Character.isDigit(ssn.charAt(2))) &&
                        (ssn.charAt(3) == '-') &&
                        (Character.isDigit(ssn.charAt(4))) &&
                        (Character.isDigit(ssn.charAt(5))) &&
                        (ssn.charAt(6) == '-') &&
                        (Character.isDigit(ssn.charAt(7))) &&
                        (Character.isDigit(ssn.charAt(8))) &&
                        (Character.isDigit(ssn.charAt(9))) &&
                        (Character.isDigit(ssn.charAt(10)));

        // Display result
        System.out.println(ssn + " is " + ((isValid) ? "a valid " : "an invalid ")
                + "social security number");
        // Problem 3: Valid Telephone Number
        // Prompt the user to enter their telephone number and determine if it is a valid telephone
        // number or not. A valid telephone number follows the following format: (NNN) NNN-NNNN
        // where N is a number 0-9
// Prompt the user to enter a Telephone number
            System.out.print("Enter a TLP: ");
            String tlp = input.nextLine();

            // Check whether the input is valid
            // (NNN)NNN-NNNN where N is number
            boolean isValid1 =
                    (tlp.length() == 13) &&
                            (tlp.charAt(0)== '(') &&
                            (Character.isDigit(tlp.charAt(1))) &&
                            (Character.isDigit(tlp.charAt(2))) &&
                            (Character.isDigit(tlp.charAt(3))) &&
                            (tlp.charAt(4)==')') &&
                            (Character.isDigit(tlp.charAt(5))) &&
                            (Character.isDigit(tlp.charAt(6))) &&
                            (Character.isDigit(tlp.charAt(7))) &&
                            (tlp.charAt(8)=='-') &&
                            (Character.isDigit(tlp.charAt(9))) &&
                            (Character.isDigit(tlp.charAt(10))) &&
                            (Character.isDigit(tlp.charAt(11))) &&
                            (Character.isDigit(tlp.charAt(12)));

            // Display result
            System.out.println(tlp + " is " + ((isValid1) ? "a valid " : "an invalid ")
                    + "telephone number");
        // Problem 4: Solve a Math Problem
        // Prompt the user for a math problem in string form and calculate the answer to the
        // problem. You solution should work for the following operations: +, -, x, ÷, %, ^
        // Ex1: input = "3x4" then output = 12
        // Ex2: input = "2^3" then output = 8;
        System.out.println("Enter a math problem");
        String intString1 = input.nextLine();

        if (intString1.contains("+")) {
            String[] result = intString1.split("[+]");
            int intValue1 = Integer.parseInt(result[0]);
            int intValue2 = Integer.parseInt(result[1]);

            System.out.println(intValue1 + intValue2);
        } else if (intString1.contains("-")) {
            String[] result = intString1.split("[-]");
            int intValue1 = Integer.parseInt(result[0]);
            int intValue2 = Integer.parseInt(result[1]);

            System.out.println(intValue1 - intValue2);
        } else if (intString1.contains("*")) {
            String[] result = intString1.split("[*]");
            int intValue1 = Integer.parseInt(result[0]);
            int intValue2 = Integer.parseInt(result[1]);

            System.out.println(intValue1 * intValue2);
        } else if (intString1.contains("/")) {
            String[] result = intString1.split("[/]");
            int intValue1 = Integer.parseInt(result[0]);
            int intValue2 = Integer.parseInt(result[1]);

            System.out.println(intValue1 / intValue2);
        } else if (intString1.contains("%")) {
            String[] result = intString1.split("[%]");
            int intValue1 = Integer.parseInt(result[0]);
            int intValue2 = Integer.parseInt(result[1]);

            System.out.println(intValue1 % intValue2);
        } else if (intString1.contains("^")) {
            String[] result = intString1.split("[ ^ ]");
            int intValue1 = Integer.parseInt(result[0]);
            int intValue2 = Integer.parseInt(result[1]);

            System.out.println(intValue1 ^ intValue2);
        } else {
            System.out.println("done");
        }
        // Problem 5: License Plate Number Generator
        // Generate a license plate number. Each license plate should start with 3 uppercase
        // letters followed by 4 numbers. The letters and numbers should be choosen randomly
        // and be different every time the function is called
        // ex1: output = GAO7761
        // ex2: output = SWE3098
        int letter1 = 'A' + (int) (Math.random() * ('Z' - 'A'));
        int letter2 = 'A' + (int) (Math.random() * ('Z' - 'A'));
        int letter3 = 'A' + (int) (Math.random() * ('Z' - 'A'));

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int number3 = (int) (Math.random() * 10);
        int number4 = (int) (Math.random() * 10);

        System.out.println("" + (char) (letter1) + ((char) (letter2)) +
                ((char) (letter3)) + number1 + number2 + number3 + number4);
        // Problem 6: Keypad Conversion
        // Given a letter, convert the into the sequance of key presses on telephone
        // keypad, seen here (https://en.wikipedia.org/wiki/Telephone_keypad)
        // Ex1: Input = b then output = 22
        // Ex2: Input = y then output = 999

        String str[] = {"2", "22", "222",
                "3", "33", "333",
                "4", "44", "444",
                "5", "55", "555",
                "6", "66", "666",
                "7", "77", "777", "7777",
                "8", "88", "888",
                "9", "99", "999", "9999"
        };
        System.out.println("Enter a letter");
        String letter =input.nextLine();
        char letter4= letter.charAt(0);
        int numb = letter4 - 'a';
        System.out.println(str[numb]);

        // Problem 7: Cypher
        // Given a letter and a shift amount, cypher the letter. To cypher a letter, you shift letter
        // by the shift amount.
        // Ex1: shift = 4 and message = "b" then output = "f"
        // Ex1: shift = 2 and message = "z" then output = "b"
        System.out.println("Enter a message");
        String message = input.next();
        System.out.println("Enter the value by which letter gets shifted");
        int shift = input.nextInt();
        String cypherLetter= "";
        char alphabet;

        for (int i =0; i<message.length();i++) {
            alphabet = message.charAt(i);

            if (alphabet >= 'a' && alphabet <= 'z') {
                alphabet = (char) (alphabet + shift);
                if (alphabet > 'z') {
                    alphabet = (char) (alphabet + 'a' - 'z' - 1);
                }
                cypherLetter = cypherLetter + alphabet;

            } else if (alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) (alphabet + shift);
                if (alphabet > 'Z') {
                    alphabet = (char) (alphabet + 'a' - 'z' - 1);
                }
                cypherLetter = cypherLetter + alphabet;
            } else {
                cypherLetter = cypherLetter + alphabet;

            }
        }
        System.out.println(cypherLetter);

    }
    }


