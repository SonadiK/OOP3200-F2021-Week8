/**
 * @author Sonadi Kannangara
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Program
{
    // constants
    public static final int NUM_OF_PEOPLE = 10;
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
     * This function builds an array of person objects by instantiating Num_OF_PEOPLE Person objects
     * @param people an array of Person objects
     */
    /**public static void buildPersonArray(Person[] people)
    {
        for (int i = 0; i < NUM_OF_PEOPLE; i++)
        {
            people[i] = new Person();
        }
    }

    public static void buildPersonArrayList(ArrayList<Person> people)
    {
        for (int i = 0; i < NUM_OF_PEOPLE; i++)
        {
            people.add(new Person());
        }
    }

    public static void buildPersonLinkedList(LinkedList<Person> people)
    {
        for (int i = 0; i < NUM_OF_PEOPLE; i++)
        {
            people.add(new Person());
        }
    }*/

    public static void buildStudentLinkedList(LinkedList<Student> student)
    {
        for (int i = 0; i < NUM_OF_PEOPLE; i++)
        {
            student.add(new Student());
        }
    }

    /**
     * The entry point for our program.
     * @param args an array of command line.
     */
    public static void main(String[] args)
    {
        var students = new LinkedList<Student>();

        //LinkedList<Person> people = new LinkedList<Person>();

        ///ArrayList<Person> people = new ArrayList<Person>(); // creates a new empty list of Person object shape.
        //Person[] people = {new Person("Mike", 25), new Person("Joe", 10)};
        //Person[] people = new Person[NUM_OF_PEOPLE];

        buildStudentLinkedList(students);
        //buildPersonLinkedList(people);
        //buildPersonArray(people);
        //buildPersonArrayList(people);

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

        System.out.print("Enter your StudentID: ");
        String studentID = inputObject.nextLine();

        //Person person = new Person( name,age);
        //people.set(0, person);
        //person.SaysHello();
        //System.out.println(person);
        Student student = new Student( name,age, studentID);

        //System.out.println("The first person is: " + people.get(0).getName());
        //System.out.println(people);
        //people.get(0).SaysHello();
        students.set(0, student);
        students.get(0).SaysHello();
        students.get(0).Studies();

    }
}
