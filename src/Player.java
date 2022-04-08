public class Player {

    String firstName, lastName;

    public Player () {
        firstName = "unknown";
        lastName = "unknown";
    }

    public Player (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString () {
        return lastName + ", " + firstName;
    }

}
