package address.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * The AddressBook class contains a list of AddressEntries or contacts and methods to change the list
 */
public class AddressBook {
    /* Class variables */
    int index;
    ArrayList<AddressEntry> addressEntryList = new ArrayList<AddressEntry>();

    /* Class methods */

    /**
     * list iterates through the list and prints out the contents
     */
    public void list() {
        for (index = 0; index < addressEntryList.size(); index++) {
            System.out.println(addressEntryList.get(index));
        }
    }

    /**
     * add inserts an AddressEntry to the list
     */
    public void add(AddressEntry addressEntry) {
        this.addressEntryList.add(addressEntry);

        Collections.sort(addressEntryList, LastNameComparator);
    }

    /**
     * LastNameComparator is used for sorting AddressEntries by last name
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
