package address.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {

    private AddressBook firstBook;
    private AddressBook secondBook;

    private AddressEntry firstEntry;
    private AddressEntry secondEntry;

    @BeforeEach
    void initBookTest() {
        firstBook = new AddressBook();
        secondBook = new AddressBook();

        firstEntry = new AddressEntry("Christine", "Wheelock", "8160 Garden Avenue", "Southfield", "MI", "48034", "248-208-4777", "christine.wheelock89@yahoo.com");
        secondEntry = new AddressEntry("Herbert", "Garnett", "62 Grant Drive", "Vernon Hills", "IL", "60061", "708-350-1142", "herbert.garnett77@gmail.com");
    }

    @Test
    void list() {

    }

    @Test
    void add() {
        firstBook.add(firstEntry);
        secondBook.add(secondEntry);
    }

    @Test
    void readFromFile() {
    }
}