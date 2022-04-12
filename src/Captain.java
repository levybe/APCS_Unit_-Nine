public class Captain extends UltimatePlayer {

    private boolean type;
    // True for Offense, false for Defense

    public Captain () {
        super();
        type = false;
    }

    public Captain (String firstName, String lastName, String position, boolean type) {
        super(firstName, lastName, position);
        this.type = type;
    }

    public boolean getType () {
        return type;
    }

    public void setType (boolean type) {
        this.type = type;
    }

    public String toString () {
        String captainRole;
        if (type) {
            captainRole = "offense";
        }
        else {
            captainRole = "defense";
        }
        return getLastName() + ", " + getFirstName() + "\n   Jersey #: " + getJersey() + "\n   Position: " +
                getPosition() + "\n   Captain: "
                + captainRole;
    }
}
