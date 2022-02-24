package address;

import address.data.AddressBook;
import address.data.AddressEntry;
import java.io.*;
import java.util.Scanner;

/**
 * main AddressBookApplication: the purpose is to invoke some methods of the Menu class
 * @author Nguyen Nam Pham
 * @version 1.6
 * @since 2022
 */
public class AddressBookApplication {

    /**
     * main is the main method to run the AddressBookApplication
     * @param args are the arguments from the commandline
     */
    public static void main(String[] args) {
        String choice;
        boolean isQuit = false;

        Scanner userInput = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        Menu mainMenu = new Menu();

        System.out.println(mainMenu.displayMenu());

        System.out.println("Choice:");
        choice = userInput.nextLine().toLowerCase(); // Just in case the user entered the choice in upper case

        while (!isQuit) {
            switch (choice.charAt(0)) {
                case 'a':
                    try {
                        addressBook.readFromFile(mainMenu.load());
                    }

                    catch (FileNotFoundException missing) {
                        System.out.println("Cannot find file " + missing.getMessage());
                        break;
                    }

                    catch (IOException except) {
                        System.out.println("File I/O error occurred: " + except.getMessage());
                        break;
                    }

                    break;
                case 'b':
                    addressBook.add(mainMenu.add());
                    break;
                case 'c':
                    mainMenu.remove();
                    break;
                case 'd':
                    addressBook.find(mainMenu.find());
                    break;
                case 'e':
                    mainMenu.list();
                    addressBook.list();
                    break;
                case 'f':
                    isQuit = true;
                    mainMenu.quit();
                    break;
                default:
                    mainMenu.invalidChoice();
            }
        }
    }
}
