public class Coach extends Player {
    private String role;

    public Coach () {
        super();
        role = "coach";
    }

    public Coach (String firstName, String lastName, String role) {
        super(firstName, lastName);
        this.role = role;
    }

    public String getRole () {
        return role;
    }

    public void setRole (String role) {
        this.role = role;
    }

    public String toString () {
        return getLastName() + ", " + getFirstName() + "\n   Role: " + role;
    }
}
