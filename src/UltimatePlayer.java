public class UltimatePlayer extends Player {

    static int jerseyNumber = 1;
    int jersey;
    String position;

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

    public String getPosition () {
        return position;
    }

    public String toString () {
        return lastName + ", " + firstName + "\n   Jersey #: " + jersey + "\n   Position: " +
                position.substring(0, 1).toUpperCase() + position.substring(1);
    }

}
