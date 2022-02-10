package address.data;

/**
 * The AddressEntry class defines the data elements and methods of an AddressEntry object
 */
public class AddressEntry {
    /* Class variables */
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private Integer zip;
    private String phone;
    private String email;

    /* Class methods */

    /**
     * The default constructor of AddressEntry without any argument initialized to default Strings and value
     */
    public AddressEntry() {
        setFirstName("");
        setLastName("");
        setCity("");
        setState("");
        setZip("0");
        setTelephone("");
        setEmail("");
    }

    /**
     * The constructor of AddressEntry that initializes the data elements as the object is declared
     * @param firstName The input String firstName
     * @param lastName The input String lastName
     * @param street The input String street
     * @param city The input String city
     * @param state The input String state abbreviated as two letters
     * @param zip The input String zip
     * @param telephone The input String telephone
     * @param email The input String email
     */
    public AddressEntry(String firstName, String lastName, String street, String city, String state, String zip, String telephone, String email) {
        setFirstName(firstName);
        setLastName(lastName);
        setStreet(street);
        setCity(city);
        setState(state);
        setZip(zip);
        setTelephone(telephone);
        setEmail(email);
    }

    /**
     * toString gets all the data elements and formats them to print to standard output
     * @return The formatted String containing all of its data elements
     */
    public String toString() {
        return getFirstName() + " " + getLastName() + "\n"
             + getStreet() + "\n"
             + getCity() + ", " + getState() + " " + getZip() + "\n"
             + getEmail() + "\n"
             + getTelephone() + "\n";
    }

    /**
     * setFirstName sets the argument firstName to the object's firstName variable
     * @param firstName The input String firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * getFirstName gives the object's String firstName to the caller
     * @return The object's String firstName
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * setLastName sets the argument lastName to the object's lastName variable
     * @param lastName The input String lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * getLastName gives the object's String lastName to the caller
     * @return The object's String lastName
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * setStreet sets the argument street to the object's String street
     * @param street The input String street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * getStreet gives the object's String street to the caller
     * @return The object's String street
     */
    public String getStreet() {
        return this.street;
    }

    /**
     * setCity sets the argument city to the object's String city
     * @param city The input String city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * getCity gives the object's String city to the caller
     * @return The object's String city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * setState sets the argument state to the object's String state
     * @param state The input String state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * getState gives the object's String state to the caller
     * @return The object's String state
     */
    public String getState() {
        return this.state;
    }

    /**
     * setZip sets the argument zip to the object's Integer zip
     * @param zip The input String zip
     */
    public void setZip(String zip) {
        // Convert the String zip to an Integer and assign to zip
        this.zip = Integer.parseInt(zip);
    }

    /**
     * getZip gives the object's String zip to the caller
     * @return The object's integer zip as a String
     */
    public String getZip(){
        // Convert zip to a String then return
        return Integer.toString(zip);
    }

    /**
     * setTelephone sets the argument telephone to the object's String telephone
     * @param telephone The input String telephone
     */
    public void setTelephone(String telephone) {
        this.phone = telephone;
    }

    /**
     * getTelephone gives the object's String telephone to the caller
     * @return The object's String phone
     */
    public String getTelephone() {
        return this.phone;
    }

    /**
     * setEmail sets the argument email to the object's String email
     * @param email The input String email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * getEmail gives the object's String email to the caller
     * @return The object's String email
     */
    public String getEmail() {
        return this.email;
    }
}
