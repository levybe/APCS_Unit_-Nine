public class Player {

    private String firstName, lastName;

    public Player () {
        firstName = "unknown";
        lastName = "unknown";
    }

    public Player (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName () {
        return firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public void setLastname (String lastName) {
        this.lastName = lastName;
    }

    public String toString () {
        return lastName + ", " + firstName;
    }

}
