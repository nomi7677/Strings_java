package cd.rr.strings;

public class Read {

    public static void main(String[] args) {

        // Problem 1
        int hour = 5;
        int minute = 30;
        System.out.println(hour + ":" + minute);

        // Problem 2
        int a = 5;
        int b = 7;
        System.out.println(a + "x" + b + "=" + a * b);

        // Problem 3
        String person = "Mike";
        int age = 45;
        String ageGroup;

        if (age > 99) {
            ageGroup = "centenarian";
        } else {
            ageGroup = "youngster";
        }

        System.out.println("That " + person + " is a " + ageGroup + ".");

        // Problem 4
        String text = "Hola Mundo";
        System.out.println(text.charAt(0));

        // Problem 5
        String myText = "Hola Mundo";
        System.out.println(myText.charAt(myText.length() - 1));

        // Problem 6
        String message = "Stop" + " " + "Drop" + " " + "Role";
        System.out.println(message);

        // Problem 7
        String myMessage = "Stop" + "\n" + "Drop" + "\n" + "Role";
        System.out.println(myMessage);

        // Problem 8
        int myAge = 15;
        String yourMessage = "You";

        if (myAge >= 16) {
            yourMessage += " can ";
        } else {
            yourMessage += " can't ";
        }

        yourMessage += "drive";

        System.out.println(yourMessage);

        // Problem 9
        String yourText = "Code Differently";
        String subtext = yourText.substring(5);
        System.out.println(subtext);

        // Problem 10
        String ourText = "Code Differently";
        String ourSubtext = ourText.substring(0, 4);
        System.out.println(ourSubtext);

        // Problem 11
        String theText = "Code Differently";
        String theSubtext = theText.substring(10, 14) + theText.substring(4);
        System.out.println(theSubtext);

    }


}
