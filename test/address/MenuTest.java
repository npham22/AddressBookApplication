package address;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        String expectedString = "First Name:";
        
        assertEquals(expectedString, firstMenu.prompt_FirstName());
        assertEquals(expectedString, secondMenu.prompt_FirstName());
    }

    @Test
    void testPrompt_LastName() {
        String expectedString = "Last Name:";

        assertEquals(expectedString, firstMenu.prompt_LastName());
        assertEquals(expectedString, secondMenu.prompt_LastName());
    }

    @Test
    void testPrompt_Street() {
        String expectedString = "Street:";

        assertEquals(expectedString, firstMenu.prompt_Street());
        assertEquals(expectedString, secondMenu.prompt_Street());
    }

    @Test
    void testPrompt_City() {
        String expectedString = "City:";

        assertEquals(expectedString, firstMenu.prompt_City());
        assertEquals(expectedString, secondMenu.prompt_City());
    }

    @Test
    void testPrompt_State() {
        String expectedString = "State:";

        assertEquals(expectedString, firstMenu.prompt_State());
        assertEquals(expectedString, secondMenu.prompt_State());
    }

    @Test
    void testPrompt_Zip() {
        String expectedString = "Zip:";

        assertEquals(expectedString, firstMenu.prompt_Zip());
        assertEquals(expectedString, secondMenu.prompt_Zip());
    }

    @Test
    void testPrompt_Telephone() {
        String expectedString = "Telephone:";

        assertEquals(expectedString, firstMenu.prompt_Telephone());
        assertEquals(expectedString, secondMenu.prompt_Telephone());
    }

    @Test
    void testPrompt_Email() {
        String expectedString = "Email:";

        assertEquals(expectedString, firstMenu.prompt_Email());
        assertEquals(expectedString, secondMenu.prompt_Email());
    }
}