package contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContactServiceTest {
    private ContactService contactService;

    @BeforeEach
    void setUp() {
        contactService = new ContactService();
    }

    @Test
    void testAddContact() {
        Contact contact = new Contact("1234567890", "Jon", "Skop", "9876543210", "413 Bluff St");
        contactService.addContact(contact);

        assertEquals(contact, contactService.getContact("1234567890"));
    }

    @Test
    void testAddDuplicateContact() {
        Contact contact1 = new Contact("1234567890", "Jon", "Skop", "9876543210", "413 Bluff St");
        Contact contact2 = new Contact("1234567890", "Jessy", "Freeman", "1234567890", "Cooper Street");

        contactService.addContact(contact1);
        assertThrows(IllegalArgumentException.class, () -> contactService.addContact(contact2));
    }

    @Test
    void testDeleteContact() {
        Contact contact = new Contact("1234567890", "Jon", "Skop", "9876543210", "413 Bluff St");
        contactService.addContact(contact);
        contactService.deleteContact("1234567890");

        assertThrows(IllegalArgumentException.class, () -> contactService.getContact("1234567890"));
    }

    @Test
    void testDeleteNonexistentContact() {
        assertThrows(IllegalArgumentException.class, () -> contactService.deleteContact("9999999999"));
    }

    @Test
    void testUpdateContact() {
        Contact contact = new Contact("1234567890", "Jon", "Skop", "9876543210", "413 Bluff St");
        contactService.addContact(contact);

        contactService.updateContact("1234567890", "Jessy", "Freeman", "1234567890", "Cooper Street");

        Contact updatedContact = contactService.getContact("1234567890");
        assertEquals("Jessy", updatedContact.getFirstName());
        assertEquals("Freeman", updatedContact.getLastName());
        assertEquals("1234567890", updatedContact.getPhone());
        assertEquals("Cooper Street", updatedContact.getAddress());
    }

    @Test
    void testUpdateNonexistentContact() {
        assertThrows(IllegalArgumentException.class, () -> 
            contactService.updateContact("9999999999", "Jessy", "Freeman", "1234567890", "Cooper Street"));
    }

    @Test
    void testUpdateInvalidPhone() {
        Contact contact = new Contact("1234567890", "Jon", "Skop", "9876543210", "413 Bluff St");
        contactService.addContact(contact);

        assertThrows(IllegalArgumentException.class, () -> 
            contactService.updateContact("1234567890", "Jessy", "Freeman", "12345678", "Cooper Street")); // Invalid phone length
    }

    @Test
    void testUpdateInvalidAddress() {
        Contact contact = new Contact("1234567890", "Jon", "Skop", "9876543210", "413 Bluff St");
        contactService.addContact(contact);

        assertThrows(IllegalArgumentException.class, () -> 
            contactService.updateContact("1234567890", "Jessy", "Freeman", "1234567890", 
                "123456789012345678901234567890123")); // Address too long
    }
}