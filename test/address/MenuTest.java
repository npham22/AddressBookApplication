package address;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {

    Menu firstMenu;
    Menu secondMenu;

    @BeforeEach
    void initMenuTest() {
        firstMenu = new Menu();
        secondMenu = new Menu();
    }

    @Test
    void testPrompt_FirstName() {
        String expectedString = "Christine";
        InputStream inStream = new ByteArrayInputStream(expectedString.getBytes());

        System.setIn(inStream);

        String inputString = Menu.prompt_FirstName();
        assertEquals("Christine", inputString);

        System.setIn(System.in);
    }

    @Test
    void testPrompt_LastName() {
        String expectedString = "Wheelock";

        //assertEquals(expectedString, Menu.prompt_LastName());
    }

    @Test
    void testPrompt_Street() {
        String expectedString = "Garden Avenue";

        //assertEquals(expectedString, Menu.prompt_Street());
    }

    @Test
    void testPrompt_City() {
        String expectedString = "Southfield";

        //assertEquals(expectedString, Menu.prompt_City());
    }

    @Test
    void testPrompt_State() {
        String expectedString = "MI";

        //assertEquals(expectedString, Menu.prompt_State());
    }

    @Test
    void testPrompt_Zip() {
        int expectedValue = 48034;

        //assertEquals(expectedValue, Menu.prompt_Zip());
    }

    @Test
    void testPrompt_Telephone() {
        String expectedString = "248-208-4777";

        //assertEquals(expectedString, Menu.prompt_Telephone());
    }

    @Test
    void testPrompt_Email() {
        String expectedString = "christine.wheelock89@yahoo.com";

        //assertEquals(expectedString, Menu.prompt_Email());
    }

    @Test
    void testLoad() {
    }

    @Test
    void testAdd() {
    }

    @Test
    void testRemove() {
    }

    @Test
    void testFind() {
    }

    @Test
    void testList() {
    }

    @Test
    void testQuit() {
        assertEquals("Quitting", firstMenu.quit());
        assertEquals("Quitting", secondMenu.quit());
    }

    @Test
    void testInvalidChoice() {
        assertEquals("Invalid choice. Try again", firstMenu.invalidChoice());
        assertEquals("Invalid choice. Try again", secondMenu.invalidChoice());
    }

    @Test
    void displayMenu() {
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