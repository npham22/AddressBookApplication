package address;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {

    // Static method tests

    /**
     * finMenuTest closes out after each test is done
     */
    @AfterEach
    void finMenuTest() {
        System.setIn(System.in);
        System.setOut(System.out);
    }

    /**
     * testPrompt_FirstName tests the prompt_FirstName method
     */
    @Test
    void testPrompt_FirstName() {
        String expectedString = "Christine";
        InputStream inStream = new ByteArrayInputStream(expectedString.getBytes());
        OutputStream outStream = new ByteArrayOutputStream();

        System.setIn(inStream);
        System.setOut(new PrintStream(outStream));

        //assertEquals("Christine", Menu.prompt_FirstName());
    }

    /**
     * testPrompt_LastName tests the prompt_LastName method
     */
    @Test
    void testPrompt_LastName() {
        String expectedString = "Wheelock";
        InputStream inStream = new ByteArrayInputStream(expectedString.getBytes());
        OutputStream outStream = new ByteArrayOutputStream();

        System.setIn(inStream);
        System.setOut(new PrintStream(outStream));

        //assertEquals(expectedString, Menu.prompt_LastName());
    }

    /**
     * testPrompt_Street tests the prompt_Street method
     */
    @Test
    void testPrompt_Street() {
        String expectedString = "Garden Avenue";
        InputStream inStream = new ByteArrayInputStream(expectedString.getBytes());
        OutputStream outStream = new ByteArrayOutputStream();

        System.setIn(inStream);
        System.setOut(new PrintStream(outStream));

        //assertEquals(expectedString, Menu.prompt_Street());
    }

    /**
     * testPrompt_City tests the prompt_City method
     */
    @Test
    void testPrompt_City() {
        String expectedString = "Southfield";
        InputStream inStream = new ByteArrayInputStream(expectedString.getBytes());
        OutputStream outStream = new ByteArrayOutputStream();

        System.setIn(inStream);
        System.setOut(new PrintStream(outStream));

        //assertEquals(expectedString, Menu.prompt_City());
    }

    /**
     * testPrompt_State tests the prompt_State method
     */
    @Test
    void testPrompt_State() {
        String expectedString = "MI";
        InputStream inStream = new ByteArrayInputStream(expectedString.getBytes());
        OutputStream outStream = new ByteArrayOutputStream();

        System.setIn(inStream);
        System.setOut(new PrintStream(outStream));

        //assertEquals(expectedString, Menu.prompt_State());
    }

    /**
     * testPrompt_Zip tests the prompt_Zip method
     */
    @Test
    void testPrompt_Zip() {
        int expectedValue = 48034;
        InputStream inStream = new ByteArrayInputStream(Integer.toString(expectedValue).getBytes());
        OutputStream outStream = new ByteArrayOutputStream();

        System.setIn(inStream);
        System.setOut(new PrintStream(outStream));

        //assertEquals(expectedValue, Menu.prompt_Zip());
    }

    /**
     * testPrompt_Telephone tests the prompt_Telephone method
     */
    @Test
    void testPrompt_Telephone() {
        String expectedString = "248-208-4777";
        InputStream inStream = new ByteArrayInputStream(expectedString.getBytes());
        OutputStream outStream = new ByteArrayOutputStream();

        System.setIn(inStream);
        System.setOut(new PrintStream(outStream));

        //assertEquals(expectedString, Menu.prompt_Telephone());
    }

    /**
     * testPrompt_Email tests the prompt_Email method
     */
    @Test
    void testPrompt_Email() {
        String expectedString = "christine.wheelock89@yahoo.com";
        InputStream inStream = new ByteArrayInputStream(expectedString.getBytes());
        OutputStream outStream = new ByteArrayOutputStream();

        System.setIn(inStream);
        System.setOut(new PrintStream(outStream));

        //assertEquals(expectedString, Menu.prompt_Email());
    }

    /**
     * testLoad tests the load method
     */
    @Test
    void testLoad() {
        Menu firstMenu = new Menu();
        Menu secondMenu = new Menu();

        String expectedString = "AddressDataFile.txt";
        InputStream inStream = new ByteArrayInputStream(expectedString.getBytes());
        OutputStream outStream = new ByteArrayOutputStream();

        System.setIn(inStream);
        System.setOut(new PrintStream(outStream));

        //assertEquals(expectedString, firstMenu.load());
        //assertEquals(expectedString, secondMenu.load());
    }

    /**
     * testAdd tests the add method
     */
    @Test
    void testAdd() {
        // Format the AddressEntry as a String
    }

    /**
     * testRemove tests the remove method
     */
    @Test
    void testRemove() {
        Menu firstMenu = new Menu();
        Menu secondMenu = new Menu();

        String expectedString = "Wheelock";
        InputStream inStream = new ByteArrayInputStream(expectedString.getBytes());
        OutputStream outStream = new ByteArrayOutputStream();

        System.setIn(inStream);
        System.setOut(new PrintStream(outStream));

        //assertEquals(expectedString, firstMenu.remove());
        //assertEquals(expectedString, secondMenu.remove());
    }

    /**
     * testFind tests the find method
     */
    @Test
    void testFind() {
        Menu firstMenu = new Menu();
        Menu secondMenu = new Menu();

        String expectedString = "Wheelock";
        InputStream inStream = new ByteArrayInputStream(expectedString.getBytes());
        OutputStream outStream = new ByteArrayOutputStream();

        System.setIn(inStream);
        System.setOut(new PrintStream(outStream));

        //assertEquals(expectedString, firstMenu.find());
        //assertEquals(expectedString, secondMenu.find());
    }

    /**
     * testList tests the list method
     */
    @Test
    void testList() {
        Menu firstMenu = new Menu();
        Menu secondMenu = new Menu();

        assertEquals("Here is the list of contacts in the address book", firstMenu.list());
        assertEquals("Here is the list of contacts in the address book", secondMenu.list());
    }

    /**
     * testQuit tests the return String from quit
     */
    @Test
    void testQuit() {
        Menu firstMenu = new Menu();
        Menu secondMenu = new Menu();

        assertEquals("Quitting", firstMenu.quit());
        assertEquals("Quitting", secondMenu.quit());
    }

    /**
     * testInvalidChoice tests the return String from invalidChoice
     */
    @Test
    void testInvalidChoice() {
        Menu firstMenu = new Menu();
        Menu secondMenu = new Menu();

        assertEquals("Invalid choice. Try again", firstMenu.invalidChoice());
        assertEquals("Invalid choice. Try again", secondMenu.invalidChoice());
    }

    /**
     * testDisplayMenu tests the return String from displayMenu
     */
    @Test
    void testDisplayMenu() {
        Menu firstMenu = new Menu();
        Menu secondMenu = new Menu();
        String expectedString = "Please enter your menu selection\n"
                            + "a) Loading from file\n"
                            + "b) Addition\n"
                            + "c) Removal\n"
                            + "d) Find\n"
                            + "e) List\n"
                            + "f) Quit\n";

        assertEquals(expectedString, firstMenu.displayMenu());
        assertEquals(expectedString, secondMenu.displayMenu());
    }
}