import java.util.Arrays;
public class StringExercises {


    public static void main(String[] args) {


/*Exercise 1 – Length of a String
Question
What is the length of the String: "Java"?
*/


    String message = "Java";
    System.out.println("The length of the String 'Java' is: " + message.length());



/*Exercise 2 – Character at Index
Question

What char is at index position 6 in the following String: "Long example sentence"? */


    String message2 = "Long example sentence";
   char position6 = message2.charAt(6);
    System.out.println(position6);

/*
Exercise 3 – Index Position of 'o'
Question

What is the index position of 'o' in the following String: "Even longer example sentence"?
 */

        String message3 = "Even longer example sentence";
        int positionO = message3.indexOf('o');
        System.out.println("The position of 'o' is: " + positionO);

/*
Exercise 4 – Substring
Question

Given the following String:
"Ok this is not as long!", create a substring of only "not as long"
(excluding the exclamation point) and print it out.
 */

        String message4 = "Ok this is not as long!";
        String substring = message4.substring(11,22);
        System.out.println("Substring: " + substring);

/*
Exercise 5 – Lowercase and Uppercase
Question

Convert the following String: "CAPS EQUALS SCREAMING" to lowercase and print it out.
Then convert it back to uppercase and print it out again.
 */
        String message5 = "CAPS EQUALS SCREAMING";
        String toLowerCase = message5.toLowerCase();
        System.out.println("In lower case: " + toLowerCase);

        String backToUpper = toLowerCase.toUpperCase();
        System.out.println("Back to upper case: " + backToUpper);

/*
Exercise 6 – Trim String
Question

What is the output of the following String: "\tJ\ta\tv\ta\t" after you trim it?
 */

        String message6 = "\tJ\ta\tv\ta\t";
        String trim = message6.trim();
        System.out.println("Trimmmed: " + trim);
        System.out.println("J a   v   a");
/*
Exercise 7 – Parse to String
Question

Parse the following int: 20 to a String and add a 20 to the end of the String. Printing it out should return: "2020".
 */
        int number = 20;
        String text = Integer.toString(number);
        text = text + "20";
        System.out.println(text);


/*
Exercise 8 – Split String (Oil and Water)
Question

Oil and water don't go well together. Given the String: "Oil and Water", split them up into the words "Oil",
"Water" and store them in a String array.
 */
        String message8 = "Oil and Water";
        String[] words = message8.split(" ");
        String oil = words[0];
        String water = words[2];
        String [] result = {oil, water};

        // I looked for a way to make the code better:
         String[] result2 = {"Oil and Water".split(" ")[0], "Oil and Water".split(" ")[2]};


         System.out.println(result);
        // I got a strange result so I had to look up how I could get a good print of the result.

        System.out.println(Arrays.toString(result));


/*
Exercise 9 – Split String (Names)
Question

Split the following String: "Carl,Susie,Fredrick,Bob,Erik" into an array. Print out all names separately.
 */


/*
Exercise 10 – Convert to Char Array
Question

Convert the following String: "ThisShouldBeConverted" to a char array. Iterate through the char array and print out each element.
 */


/*
Exercise 11 – Convert Char Array to String
Question

Convert the following char[]: {'J','a','v','a'} to a String and print it out.
 */



    }
}