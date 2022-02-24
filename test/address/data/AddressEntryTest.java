package address.data;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressEntryTest {

    private AddressEntry firstEntry;
    private AddressEntry secondEntry;

    @Test
    void testToString() {
        firstEntry = new AddressEntry("Christine", "Wheelock", "8160 Garden Avenue", "Southfield", "MI", "48034", "248-208-4777", "christine.wheelock89@yahoo.com");
        secondEntry = new AddressEntry("Herbert", "Garnett", "62 Grant Drive", "Vernon Hills", "IL", "60061", "708-350-1142", "herbert.garnett77@gmail.com");

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

    @BeforeEach
    void initEntryTest() {
        firstEntry = new AddressEntry();
        secondEntry = new AddressEntry();
    }

    @Test
    void testSetFirstName() {
        firstEntry.setFirstName("Christine");
        assertEquals("Christine", firstEntry.getFirstName());

        secondEntry.setFirstName("Herbert");
        assertEquals("Herbert", secondEntry.getFirstName());
    }

    @Test
    void testGetFirstName() {
        firstEntry.setFirstName("Christine");
        assertEquals("Christine", firstEntry.getFirstName());

        secondEntry.setFirstName("Herbert");
        assertEquals("Herbert", secondEntry.getFirstName());
    }

    @Test
    void testSetLastName() {
        firstEntry.setLastName("Wheelock");
        assertEquals("Wheelock", firstEntry.getLastName());

        secondEntry.setLastName("Garnett");
        assertEquals("Garnett", secondEntry.getLastName());
    }

    @Test
    void testGetLastName() {
        firstEntry.setLastName("Wheelock");
        assertEquals("Wheelock", firstEntry.getLastName());

        secondEntry.setLastName("Garnett");
        assertEquals("Garnett", secondEntry.getLastName());
    }

    @Test
    void testSetStreet() {
        firstEntry.setStreet("8160 Garden Avenue");
        assertEquals("8160 Garden Avenue", firstEntry.getStreet());

        secondEntry.setStreet("62 Grant Drive");
        assertEquals("62 Grant Drive", secondEntry.getStreet());
    }

    @Test
    void testGetStreet() {
        firstEntry.setStreet("8160 Garden Avenue");
        assertEquals("8160 Garden Avenue", firstEntry.getStreet());

        secondEntry.setStreet("62 Grant Drive");
        assertEquals("62 Grant Drive", secondEntry.getStreet());
    }

    @Test
    void testSetCity() {
        firstEntry.setCity("Southfield");
        assertEquals("Southfield", firstEntry.getCity());

        secondEntry.setCity("Vernon Hills");
        assertEquals("Vernon Hills", secondEntry.getCity());
    }

    @Test
    void testGetCity() {
        firstEntry.setCity("Southfield");
        assertEquals("Southfield", firstEntry.getCity());

        secondEntry.setCity("Vernon Hills");
        assertEquals("Vernon Hills", secondEntry.getCity());
    }

    @Test
    void testSetState() {
        firstEntry.setState("MI");
        assertEquals("MI", firstEntry.getState());

        secondEntry.setState("IL");
        assertEquals("IL", secondEntry.getState());
    }

    @Test
    void testGetState() {
        firstEntry.setState("MI");
        assertEquals("MI", firstEntry.getState());

        secondEntry.setState("IL");
        assertEquals("IL", secondEntry.getState());
    }

    @Test
    void testSetZip() {
        firstEntry.setZip("48034");
        assertEquals("48034", firstEntry.getZip());

        secondEntry.setZip("60061");
        assertEquals("60061", secondEntry.getZip());
    }

    @Test
    void testGetZip() {
        firstEntry.setZip("48034");
        assertEquals("48034", firstEntry.getZip());

        secondEntry.setZip("60061");
        assertEquals("60061", secondEntry.getZip());
    }

    @Test
    void testSetTelephone() {
        firstEntry.setTelephone("248-208-4777");
        assertEquals("248-208-4777", firstEntry.getTelephone());

        secondEntry.setTelephone("708-350-1142");
        assertEquals("708-350-1142", secondEntry.getTelephone());
    }

    @Test
    void testGetTelephone() {
        firstEntry.setTelephone("248-208-4777");
        assertEquals("248-208-4777", firstEntry.getTelephone());

        secondEntry.setTelephone("708-350-1142");
        assertEquals("708-350-1142", secondEntry.getTelephone());
    }

    @Test
    void testSetEmail() {
        firstEntry.setEmail("christine.wheelock89@yahoo.com");
        assertEquals("christine.wheelock89@yahoo.com", firstEntry.getEmail());

        secondEntry.setEmail("herbert.garnett77@gmail.com");
        assertEquals("herbert.garnett77@gmail.com", secondEntry.getEmail());
    }

    @Test
    void testGetEmail() {
        firstEntry.setEmail("christine.wheelock89@yahoo.com");
        assertEquals("christine.wheelock89@yahoo.com", firstEntry.getEmail());

        secondEntry.setEmail("herbert.garnett77@gmail.com");
        assertEquals("herbert.garnett77@gmail.com", secondEntry.getEmail());
    }
}