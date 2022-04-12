public class UltimatePlayer extends Player {

    private static int jerseyNumber = 1;
    private int jersey;
    private String position;

    public UltimatePlayer () {
        super();
        this.position = "handler";
        jersey = 0;
    }

    public UltimatePlayer (String firstName, String lastName, String position) {
        super(firstName, lastName);
        position = position.toLowerCase();
        if (position.equals("handler") || position.equals("cutter")) {
            this.position = position;
        }
        else {
            this.position = "handler";
        }
        jersey = jerseyNumber;
        jerseyNumber++;
    }

    public int getJerseyNumber () {
        return jerseyNumber;
    }

    public int getJersey () {
        return jersey;
    }

    public String getPosition () {
        return position;
    }

    public void setJersey (int jersey) {
        this.jersey = jersey;
    }

    public void setPosition (String position) {
        this.position = position;
    }

    public String toString () {
        return getLastName() + ", " + getFirstName() + "\n   Jersey #: " + jersey + "\n   Position: " +
                position;
    }

}
