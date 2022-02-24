package address.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * The AddressBook class contains a list of AddressEntry items or contacts and methods to change the list
 */
public class AddressBook {
    /* Class variables */

    /**
     * addressEntryList stores AddressEntry objects as an ArrayList.
     * It does not account for duplications.
     */
    private final ArrayList<AddressEntry> addressEntryList = new ArrayList<AddressEntry>();

    /* Class methods */

    /**
     * list iterates through the list and prints out the contents
     */
    public void list() {
        for (AddressEntry addressEntry : addressEntryList) {
            System.out.println(addressEntry);
        }
    }

    /**
     * add inserts an AddressEntry to the list and sorts the list by last names
     * @param addressEntry is an AddressEntry as an input to this method
     */
    public void add(AddressEntry addressEntry) {
        this.addressEntryList.add(addressEntry);

        Collections.sort(addressEntryList, LastNameComparator);
    }

    /**
     * remove deletes an AddressEntry object from the addressEntryList
     * @param lastName is the last name as an input String
     */
    public void remove(String lastName) {
        int foundCount = 0;

        for (AddressEntry addressEntry : addressEntryList) {
            if (addressEntry.getLastName().startsWith(lastName)) {
                System.out.println(addressEntry);
                foundCount++;
            }
        }

        if (foundCount == 0) {
            System.out.println("No entry found to remove");
        }
    }

    /**
     * init populates the AddressBook with AddressEntry objects from a file
     * @param filename is the name of the file or the filepath to open
     * @throws IOException when the program cannot find the file or other I/O errors
     */
    public void readFromFile(String filename) throws IOException {
        String firstName;
        String lastName;
        String street;
        String city;
        String state;
        int zip;
        String phone;
        String email;

        FileReader inFile = new FileReader(filename);
        BufferedReader inFileReader = new BufferedReader(inFile);

        firstName = inFileReader.readLine();

        while (firstName != null) {
            lastName = inFileReader.readLine();
            street = inFileReader.readLine();
            city = inFileReader.readLine();
            state = inFileReader.readLine();
            zip = Integer.parseInt(inFileReader.readLine());
            phone = inFileReader.readLine();
            email = inFileReader.readLine();

            AddressEntry addrEntry = new AddressEntry(firstName, lastName, street, city, state, zip, phone, email);
            this.add(addrEntry);

            firstName = inFileReader.readLine();
        }

        inFileReader.close();
        inFile.close();
    }

    /**
     * find searches for AddressEntry objects with last names that match the input String
     * @param startOf_lastName is the search query to find AddressEntry objects
     */
    public void find(String startOf_lastName) {
        int foundCount = 0;

        for (AddressEntry addressEntry : addressEntryList) {
            if (addressEntry.getLastName().toLowerCase().startsWith(startOf_lastName.toLowerCase())) {
                System.out.println(addressEntry);
                foundCount++;
            }
        }

        if (foundCount == 0) {
            System.out.println("No entry found");
        }
    }

    /**
     * LastNameComparator is used for sorting AddressEntry objects by last name
     * A special type of class is used
     */
    public static Comparator<AddressEntry> LastNameComparator = new Comparator<AddressEntry>() {
        /**
         * compare compares the last names of each AddressEntry for use with sorting
         * @param entry1 First AddressEntry
         * @param entry2 Second AddressEntry
         * @return The value from the comparison between the two entries' last names
         */
        @Override
        public int compare(AddressEntry entry1, AddressEntry entry2) {
            return entry1.getLastName().compareTo(entry2.getLastName());
        }
    };
}
