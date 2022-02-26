package address.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {

    private AddressBook firstBook;
    private AddressBook secondBook;

    private AddressEntry firstEntry;
    private AddressEntry secondEntry;

    /**
     * initBookTest initializes the AddressBookTest before each test item
     */
    @BeforeEach
    void initBookTest() {
        firstBook = new AddressBook();
        secondBook = new AddressBook();

        firstEntry = new AddressEntry("Christine", "Wheelock", "8160 Garden Avenue", "Southfield", "MI", 48034, "248-208-4777", "christine.wheelock89@yahoo.com");
        secondEntry = new AddressEntry("Herbert", "Garnett", "62 Grant Drive", "Vernon Hills", "IL", 60061, "708-350-1142", "herbert.garnett77@gmail.com");
    }

    /**
     * testList tests the list method
     */
    @Test
    void testList() {
        firstBook.add(firstEntry);
        secondBook.add(firstEntry);

        firstBook.add(secondEntry);
        secondBook.add(secondEntry);
    }

    /**
     * testAdd tests the add method
     */
    @Test
    void testAdd() {
        firstBook.add(firstEntry);
        secondBook.add(secondEntry);
    }

    /**
     * testReadFromFile tests the readFromFile method
     */
    @Test
    void testReadFromFile() {
        try {
            firstBook.readFromFile("AddressDataFile.txt");
            secondBook.readFromFile("AddressDataFile.txt");
        }

        catch (IOException missing) { // FileNotFoundException is a part of IOException
            System.out.println("Required file not found");
        }
    }

    /**
     * testFind tests the find method
     */
    @Test
    void testFind() {
        firstBook.add(firstEntry);
        secondBook.add(firstEntry);

        firstBook.add(secondEntry);
        secondBook.add(secondEntry);


    }
}