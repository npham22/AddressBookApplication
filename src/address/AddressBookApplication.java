package address;

import address.data.AddressBook;
import address.data.AddressEntry;
import java.io.*;

/**
 * main AddressBookApplication: the purpose is to invoke some methods of the Menu class
 * @author Nguyen Nam Pham
 * @version 1.5
 * @since 2022
 */
public class AddressBookApplication {

    /**
     * main is the main method to run the AddressBookApplication
     * @param args are the arguments from the commandline
     */
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        try {
            addressBook.readFromFile("AddressInputDataFile.txt");
            addressBook.list();
        }

        catch (FileNotFoundException missing) {
            System.out.println("Cannot find file " + missing.getMessage());
        }

        catch (IOException except) {
            System.out.println("File I/O error occurred: " + except.getMessage());
        }
    }
}
