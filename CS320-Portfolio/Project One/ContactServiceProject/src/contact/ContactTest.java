package contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ContactTest {

    @Test
    void testValidContactCreation() {
        Contact contact = new Contact("1234567890", "Jon", "Skop", "9876543210", "413 Bluff St");
        assertEquals("1234567890", contact.getContactID());
        assertEquals("Jon", contact.getFirstName());
        assertEquals("Skop", contact.getLastName());
        assertEquals("9876543210", contact.getPhone());
        assertEquals("413 Bluff St", contact.getAddress());
    }

    @Test
    void testInvalidContactID() {
        assertThrows(IllegalArgumentException.class, () -> new Contact(null, "Jon", "Skop", "9876543210", "413 Bluff St"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("12345678901", "Jon", "Skop", "9876543210", "413 Bluff St")); // Over 10 characters
    }

    @Test
    void testInvalidFirstName() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("1234567890", null, "Skop", "9876543210", "413 Bluff St"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("1234567890", "JonathanSkop", "Skop", "9876543210", "413 Bluff St")); // Over 10 characters
    }

    @Test
    void testInvalidLastName() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("1234567890", "Jon", null, "9876543210", "413 Bluff St"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("1234567890", "Jon", "SkopTheThird", "9876543210", "413 Bluff St")); // Over 10 characters
    }

    @Test
    void testInvalidPhone() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("1234567890", "Jon", "Skop", null, "413 Bluff St"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("1234567890", "Jon", "Skop", "123456789", "413 Bluff St")); // Less than 10 digits
        assertThrows(IllegalArgumentException.class, () -> new Contact("1234567890", "Jon", "Skop", "12345678901", "413 Bluff St")); // More than 10 digits
        assertThrows(IllegalArgumentException.class, () -> new Contact("1234567890", "Jon", "Skop", "98765432AB", "413 Bluff St")); // Non-numeric characters
    }

    @Test
    void testInvalidAddress() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("1234567890", "Jon", "Skop", "9876543210", null));
        assertThrows(IllegalArgumentException.class, () -> new Contact("1234567890", "Jon", "Skop", "9876543210", "1234567890123456789012345678901")); // Over 30 characters
    }

    @Test
    void testSetters() {
        Contact contact = new Contact("1234567890", "Jon", "Skop", "9876543210", "413 Bluff St");
        
        contact.setFirstName("Jessy");
        assertEquals("Jessy", contact.getFirstName());

        contact.setLastName("Freeman");
        assertEquals("Freeman", contact.getLastName());

        contact.setPhone("1234567890");
        assertEquals("1234567890", contact.getPhone());

        contact.setAddress("Cooper Street");
        assertEquals("Cooper Street", contact.getAddress());
    }

    @Test
    void testInvalidSetters() {
        Contact contact = new Contact("1234567890", "Jon", "Skop", "9876543210", "413 Bluff St");

        assertThrows(IllegalArgumentException.class, () -> contact.setFirstName(null));
        assertThrows(IllegalArgumentException.class, () -> contact.setFirstName("JonathanSkop")); // Over 10 characters

        assertThrows(IllegalArgumentException.class, () -> contact.setLastName(null));
        assertThrows(IllegalArgumentException.class, () -> contact.setLastName("FreemanTheThird")); // Over 10 characters

        assertThrows(IllegalArgumentException.class, () -> contact.setPhone(null));
        assertThrows(IllegalArgumentException.class, () -> contact.setPhone("123456789")); // Less than 10 digits
        assertThrows(IllegalArgumentException.class, () -> contact.setPhone("12345678901")); // More than 10 digits
        assertThrows(IllegalArgumentException.class, () -> contact.setPhone("98765432AB")); // Non-numeric characters

        assertThrows(IllegalArgumentException.class, () -> contact.setAddress(null));
        assertThrows(IllegalArgumentException.class, () -> contact.setAddress("1234567890123456789012345678901")); // Over 30 characters
    }
}