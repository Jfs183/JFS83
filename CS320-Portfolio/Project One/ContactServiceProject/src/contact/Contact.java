package contact;

public class Contact {
    private String contactID;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    // Constructor
    public Contact(String contactID, String firstName, String lastName, String phone, String address) {
        if (contactID == null || contactID.length() > 10) {
            throw new IllegalArgumentException("Contact ID cannot be null and must be 10 characters or less.");
        }
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("First name cannot be null and must be 10 characters or less.");
        }
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Last name cannot be null and must be 10 characters or less.");
        }
        if (phone == null || phone.length() != 10 || !phone.matches("\\d+")) {
            throw new IllegalArgumentException("Phone number must be exactly 10 digits.");
        }
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Address cannot be null and must be 30 characters or less.");
        }

        this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    // Getters
    public String getContactID() {
        return contactID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    // Setters (with validation)
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("First name cannot be null and must be 10 characters or less.");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Last name cannot be null and must be 10 characters or less.");
        }
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        if (phone == null || phone.length() != 10 || !phone.matches("\\d+")) {
            throw new IllegalArgumentException("Phone number must be exactly 10 digits.");
        }
        this.phone = phone;
    }

    public void setAddress(String address) {
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Address cannot be null and must be 30 characters or less.");
        }
        this.address = address;
    }
}