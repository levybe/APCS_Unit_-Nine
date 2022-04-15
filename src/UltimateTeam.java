import java.util.ArrayList;

public class UltimateTeam {
    ArrayList<UltimatePlayer> players;
    ArrayList<Coach> coaches;

    public UltimateTeam (ArrayList<UltimatePlayer> players, ArrayList<Coach> coaches) {
        this.players = players;
        this.coaches = coaches;
    }

    public String getCutters () {
        String cutters = "";
        for (int playerIndex = 0; playerIndex < players.size(); playerIndex++) {
            if (players.get(playerIndex).getPosition() == "cutter") {
                cutters += players.get(playerIndex).toString() + "\n\n";
            }
        }
        return cutters;
    }

    public String getHandlers () {
        String handlers = "";
        boolean firstHandler = true;
        for (int playerIndex = 0; playerIndex < players.size(); playerIndex++) {
            if (players.get(playerIndex).getPosition() == "handler") {
                handlers += players.get(playerIndex).toString() + "\n\n";
            }
        }
        return handlers;
    }

    public String toString () {
        String formattedCoaches = "";
        String formattedPlayers = "";
        for (int coachIndex = 0; coachIndex < coaches.size(); coachIndex++) {
            formattedCoaches += coaches.get(coachIndex).toString() + "\n\n";
        }

        for (int playerIndex = 0; playerIndex < players.size(); playerIndex++) {
            formattedPlayers += players.get(playerIndex).toString() + "\n\n";
        }
        return "COACHES\n" + formattedCoaches + "PLAYERS\n" + formattedPlayers;
    }
}
