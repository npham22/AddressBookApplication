package address;

import address.data.AddressEntry;
import java.util.Scanner;

/**
 * Menu class currently only has static methods to prompt to standard output information about a Contact like name, etc.
 */
public class Menu {

    /**
     * userInput is the object used to get the user input as Strings
     */
    private static Scanner userInput = new Scanner(System.in);

    /**
     * prompt_FirstName generates a standard output prompt for the First Name to be entered
     * @return The firstName String that the user inputted
     */
    public static String prompt_FirstName() {
        System.out.println("First Name:");
        return userInput.nextLine();
    }

    /**
     * prompt_LastName generates a standard output prompt for the Last Name to be entered
     * @return The lastName String that the user inputted
     */
    public static String prompt_LastName() {
        System.out.println("Last Name:");
        return userInput.nextLine();
    }

    /**
     * prompt_Street generates a standard output prompt for the Street to be entered
     * @return The street String that the user inputted
     */
    public static String prompt_Street() {
        System.out.println("Street:");
        return userInput.nextLine();
    }

    /**
     * prompt_City generates a standard output prompt for the City to be entered
     * @return The city String that the user inputted
     */
    public static String prompt_City() {
        System.out.println("City:");
        return userInput.nextLine();
    }

    /**
     * prompt_State generates a standard output prompt for the State to be entered
     * @return The state String that the user inputted
     */
    public static String prompt_State() {
        System.out.println("State:");
        return userInput.nextLine();
    }

    /**
     * prompt_Zip generates a standard output prompt for the Zip Code to be entered
     * @return The zip integer converted from the String that the user inputted
     */
    public static int prompt_Zip() {
        int zip;
        String inZip;

        System.out.println("Zip:");
        inZip = userInput.nextLine();

        try {
            zip = Integer.parseInt(inZip);
        }

        catch (NumberFormatException numExcept) {
            System.out.println("The entered zip is not a number");
            zip = 0;
        }

        return zip;
    }

    /**
     * prompt_Telephone generates a standard output prompt for the Telephone to be entered
     * @return The telephone String that the user inputted
     */
    public static String prompt_Telephone() {
        System.out.println("Telephone:");
        return userInput.nextLine();
    }

    /**
     * prompt_Email generates a standard output prompt for the Email to be entered
     * @return The email String that the user inputted
     */
    public static String prompt_Email() {
        System.out.println("Email:");
        return userInput.nextLine();
    }

    /**
     * displayMenu displays the menu to the application
     */
    public String displayMenu() {
        return "Please enter your menu selection\n"
                + "a) Loading from file\n"
                + "b) Addition\n"
                + "c) Removal\n"
                + "d) Find\n"
                + "e) List\n"
                + "f) Quit\n";
    }

    /**
     * load fills AddressEntry objects from a file
     * @return The file name as a String for the readFromFile method
     */
    public String load() {
        System.out.println("Enter the filename:");
        return userInput.nextLine();
    }

    /**
     * add prompts the user for the required fields to fill an AddressEntry object
     * @return The new AddressEntry object to add to the AddressBook
     */
    public AddressEntry add() {
        return new AddressEntry(prompt_FirstName(), prompt_LastName(), prompt_Street(), prompt_City(), prompt_State(), prompt_Zip(), prompt_Telephone(), prompt_Email());
    }

    /**
     * remove deletes a contact from the list
     * @return The last name as a String to search and delete on user request
     */
    public String remove() {
        System.out.println("Enter the last name of contact to remove");
        return userInput.nextLine();
    }

    /**
     * find prompts the user for the last name to search the list
     * @return The String that the user inputted as the query to search
     */
    public String find() {
        System.out.println("Enter the whole or beginning of the last name you wish to find");
        return userInput.nextLine();
    }

    /**
     * list prints out the title before the list
     */
    public String list() {
        return "Here is the list of contacts in the address book";
    }

    /**
     * quit prints out the quit message
     */
    public String quit() {
        return "Quitting";
    }

    /**
     * invalidChoice prints out the invalid choice message in the choice prompt
     */
    public String invalidChoice() {
        return "Invalid choice. Try again";
    }
}
