package address;

import java.util.Scanner;

/**
 * Menu class currently only has static methods to prompt to standard output information about a Contact like name, etc.
 */
public class Menu {

    /**
     * userInput is the object used to get the user input as Strings
     */
    private static final Scanner userInput = new Scanner(System.in);

    /**
     * prompt_FirstName generates a standard output prompt for the First Name to be entered
     * @return The string "First Name:"
     */
    public static String prompt_FirstName() {
        System.out.println("First Name: ");
        return userInput.nextLine();
    }

    /**
     * prompt_LastName generates a standard output prompt for the Last Name to be entered
     * @return The string "Last Name:"
     */
    public static String prompt_LastName() {
        System.out.println("Last Name: ");
        return userInput.nextLine();
    }

    /**
     * prompt_Street generates a standard output prompt for the Street to be entered
     * @return The string "Street:"
     */
    public static String prompt_Street() {
        System.out.println("Street: ");
        return userInput.nextLine();
    }

    /**
     * prompt_City generates a standard output prompt for the City to be entered
     * @return The string "City:"
     */
    public static String prompt_City() {
        System.out.println("City: ");
        return userInput.nextLine();
    }

    /**
     * prompt_State generates a standard output prompt for the State to be entered
     * @return The string "State:"
     */
    public static String prompt_State() {
        System.out.println("State: ");
        return userInput.nextLine();
    }

    /**
     * prompt_Zip generates a standard output prompt for the Zip Code to be entered
     * @return The string "Zip:"
     */
    public static int prompt_Zip() {
        String inZip;

        System.out.println("Zip: ");
        inZip = userInput.nextLine();

        return Integer.parseInt(inZip);
    }

    /**
     * prompt_Telephone generates a standard output prompt for the Telephone to be entered
     * @return The string "Telephone:"
     */
    public static String prompt_Telephone() {
        System.out.println("Telephone: ");
        return userInput.nextLine();
    }

    /**
     * prompt_Email generates a standard output prompt for the Email to be entered
     * @return The string "Email:"
     */
    public String prompt_Email() {
        System.out.println("Email: ");
        return userInput.nextLine();
    }
}
