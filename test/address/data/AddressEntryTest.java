package address.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressEntryTest {

    private AddressEntry firstEntry;
    private AddressEntry secondEntry;

    /**
     * testToString tests the toString method
     */
    @Test
    void testToString() {
        firstEntry = new AddressEntry("Christine", "Wheelock", "8160 Garden Avenue", "Southfield", "MI", 48034, "248-208-4777", "christine.wheelock89@yahoo.com");
        secondEntry = new AddressEntry("Herbert", "Garnett", "62 Grant Drive", "Vernon Hills", "IL", 60061, "708-350-1142", "herbert.garnett77@gmail.com");

        String firstString = firstEntry.getFirstName() + " " + firstEntry.getLastName() + "\n"
                        + firstEntry.getStreet() + "\n"
                        + firstEntry.getCity() + ", " + firstEntry.getState() + " " + firstEntry.getZip() + "\n"
                        + firstEntry.getEmail() + "\n"
                        + firstEntry.getTelephone() + "\n";
        
        String secondString = secondEntry.getFirstName() + " " + secondEntry.getLastName() + "\n"
                            + secondEntry.getStreet() + "\n"
                            + secondEntry.getCity() + ", " + secondEntry.getState() + " " + secondEntry.getZip() + "\n"
                            + secondEntry.getEmail() + "\n"
                            + secondEntry.getTelephone() + "\n";

        assertEquals(firstString, firstEntry.toString());
        assertEquals(secondString, secondEntry.toString());
    }

    /**
     * initEntryTest initializes the tests' AddressEntry objects
     */
    @BeforeEach
    void initEntryTest() {
        firstEntry = new AddressEntry();
        secondEntry = new AddressEntry();
    }

    /**
     * testSetFirstName tests the setFirstName method
     */
    @Test
    void testSetFirstName() {
        firstEntry.setFirstName("Christine");
        assertEquals("Christine", firstEntry.getFirstName());

        secondEntry.setFirstName("Herbert");
        assertEquals("Herbert", secondEntry.getFirstName());
    }

    /**
     * testGetFirstName tests the getFirstName method
     */
    @Test
    void testGetFirstName() {
        firstEntry.setFirstName("Christine");
        assertEquals("Christine", firstEntry.getFirstName());

        secondEntry.setFirstName("Herbert");
        assertEquals("Herbert", secondEntry.getFirstName());
    }

    /**
     * testSetLastName tests the setLastName method
     */
    @Test
    void testSetLastName() {
        firstEntry.setLastName("Wheelock");
        assertEquals("Wheelock", firstEntry.getLastName());

        secondEntry.setLastName("Garnett");
        assertEquals("Garnett", secondEntry.getLastName());
    }

    /**
     * testGetLastName tests the getLastName method
     */
    @Test
    void testGetLastName() {
        firstEntry.setLastName("Wheelock");
        assertEquals("Wheelock", firstEntry.getLastName());

        secondEntry.setLastName("Garnett");
        assertEquals("Garnett", secondEntry.getLastName());
    }

    /**
     * testSetStreet tests the setStreet method
     */
    @Test
    void testSetStreet() {
        firstEntry.setStreet("8160 Garden Avenue");
        assertEquals("8160 Garden Avenue", firstEntry.getStreet());

        secondEntry.setStreet("62 Grant Drive");
        assertEquals("62 Grant Drive", secondEntry.getStreet());
    }

    /**
     * testGetStreet tests the getStreet method
     */
    @Test
    void testGetStreet() {
        firstEntry.setStreet("8160 Garden Avenue");
        assertEquals("8160 Garden Avenue", firstEntry.getStreet());

        secondEntry.setStreet("62 Grant Drive");
        assertEquals("62 Grant Drive", secondEntry.getStreet());
    }

    /**
     * testSetCity tests the setCity method
     */
    @Test
    void testSetCity() {
        firstEntry.setCity("Southfield");
        assertEquals("Southfield", firstEntry.getCity());

        secondEntry.setCity("Vernon Hills");
        assertEquals("Vernon Hills", secondEntry.getCity());
    }

    /**
     * testGetCity tests the getCity method
     */
    @Test
    void testGetCity() {
        firstEntry.setCity("Southfield");
        assertEquals("Southfield", firstEntry.getCity());

        secondEntry.setCity("Vernon Hills");
        assertEquals("Vernon Hills", secondEntry.getCity());
    }

    /**
     * testSetState tests the setState method
     */
    @Test
    void testSetState() {
        firstEntry.setState("MI");
        assertEquals("MI", firstEntry.getState());

        secondEntry.setState("IL");
        assertEquals("IL", secondEntry.getState());
    }

    /**
     * testGetState tests the getState method
     */
    @Test
    void testGetState() {
        firstEntry.setState("MI");
        assertEquals("MI", firstEntry.getState());

        secondEntry.setState("IL");
        assertEquals("IL", secondEntry.getState());
    }

    /**
     * testSetZip tests the setZip method
     */
    @Test
    void testSetZip() {
        firstEntry.setZip(48034);
        assertEquals(48034, firstEntry.getZip());

        secondEntry.setZip(60061);
        assertEquals(60061, secondEntry.getZip());
    }

    /**
     * testGetZip tests the getZip method
     */
    @Test
    void testGetZip() {
        firstEntry.setZip(48034);
        assertEquals(48034, firstEntry.getZip());

        secondEntry.setZip(60061);
        assertEquals(60061, secondEntry.getZip());
    }

    /**
     * testSetTelephone tests the setTelephone method
     */
    @Test
    void testSetTelephone() {
        firstEntry.setTelephone("248-208-4777");
        assertEquals("248-208-4777", firstEntry.getTelephone());

        secondEntry.setTelephone("708-350-1142");
        assertEquals("708-350-1142", secondEntry.getTelephone());
    }

    /**
     * testGetTelephone tests the getTelephone method
     */
    @Test
    void testGetTelephone() {
        firstEntry.setTelephone("248-208-4777");
        assertEquals("248-208-4777", firstEntry.getTelephone());

        secondEntry.setTelephone("708-350-1142");
        assertEquals("708-350-1142", secondEntry.getTelephone());
    }

    /**
     * testSetEmail tests the setEmail method
     */
    @Test
    void testSetEmail() {
        firstEntry.setEmail("christine.wheelock89@yahoo.com");
        assertEquals("christine.wheelock89@yahoo.com", firstEntry.getEmail());

        secondEntry.setEmail("herbert.garnett77@gmail.com");
        assertEquals("herbert.garnett77@gmail.com", secondEntry.getEmail());
    }

    /**
     * testGetEmail tests the getEmail method
     */
    @Test
    void testGetEmail() {
        firstEntry.setEmail("christine.wheelock89@yahoo.com");
        assertEquals("christine.wheelock89@yahoo.com", firstEntry.getEmail());

        secondEntry.setEmail("herbert.garnett77@gmail.com");
        assertEquals("herbert.garnett77@gmail.com", secondEntry.getEmail());
    }
}