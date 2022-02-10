package address;

import address.data.AddressBook;
import address.data.AddressEntry;

/**
 *  main AddressBookApplication: purpose is to invoke some methods of the Menu class
 */
public class AddressBookApplication {

    public static void initAddressBookExercise(AddressBook ab) {
        AddressEntry firstEntry = new AddressEntry("Christine", "Wheelock", "8160 Garden Avenue", "Southfield", "MI", "48034", "248-208-4777", "christine.wheelock89@yahoo.com");
        AddressEntry secondEntry = new AddressEntry("Herbert", "Garnett", "62 Grant Drive", "Vernon Hills", "IL", "60061", "708-350-1142", "herbert.garnett77@gmail.com");

        ab.add(firstEntry);
        ab.add(secondEntry);

        ab.list();
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        initAddressBookExercise(addressBook);

        /*
        // Create an instance of Menu
        Menu myMenu = new Menu();

        // Display all of the Menu prompts to standard output
        System.out.println(myMenu.prompt_FirstName());
        System.out.println(myMenu.prompt_LastName());
        System.out.println(myMenu.prompt_Street());
        System.out.println(myMenu.prompt_City());
        System.out.println(myMenu.prompt_State());
        System.out.println(myMenu.prompt_Zip());
        System.out.println(myMenu.prompt_Telephone());
        System.out.println(myMenu.prompt_Email());
        */
    }
}
