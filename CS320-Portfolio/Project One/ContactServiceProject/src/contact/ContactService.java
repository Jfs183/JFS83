package contact;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private Map<String, Contact> contactMap;

    public ContactService() {
        contactMap = new HashMap<>();
    }

    // Add Contact
    public void addContact(Contact contact) {
        if (contact == null || contactMap.containsKey(contact.getContactID())) {
            throw new IllegalArgumentException("Contact ID must be unique and not null.");
        }
        contactMap.put(contact.getContactID(), contact);
    }

    // Delete Contact
    public void deleteContact(String contactID) {
        if (!contactMap.containsKey(contactID)) {
            throw new IllegalArgumentException("Contact ID not found.");
        }
        contactMap.remove(contactID);
    }

    // Update Contact Fields
    public void updateContact(String contactID, String firstName, String lastName, String phone, String address) {
        if (!contactMap.containsKey(contactID)) {
            throw new IllegalArgumentException("Contact ID not found.");
        }

        Contact contact = contactMap.get(contactID);
        if (firstName != null) contact.setFirstName(firstName);
        if (lastName != null) contact.setLastName(lastName);
        if (phone != null) contact.setPhone(phone);
        if (address != null) contact.setAddress(address);
    }

    // Get Contact
    public Contact getContact(String contactID) {
        return contactMap.get(contactID);
    }
}