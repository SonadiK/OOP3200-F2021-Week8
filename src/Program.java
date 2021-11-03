/**
 * @author Sonadi Kannangara
 */

import java.util.Scanner;

public class Program
{
    /**
     * This function returns the square of the value parameter
     * @param value a floating point number to squared.
     * @return returns the square of values
     */
    public static float square(float value)
    {
        return value * value;
    }

    /**
     * The entry point for our program.
     * @param args an array of command line.
     */
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");

        float valueToSquare = 5;
        float squaredValue = square(valueToSquare);

        // example of output
        System.out.println("The squared value is: " + squaredValue);

        /** Person person = new Person("Sonadi", 21);
        person.SaysHello();*/

        // Step 1: example for input we need to create a scanner object
        Scanner inputObject = new Scanner(System.in);
        System.out.print("Enter your name: ");

        // STep 2: use the scanner object to get the next line of data in this case a String value.
        String name = inputObject.nextLine();

        System.out.print("Enter your age: ");
        int age = inputObject.nextInt();

        Person person = new Person( name,age);
        person.SaysHello();

    }
}
