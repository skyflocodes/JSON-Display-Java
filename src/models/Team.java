package models;

import com.google.gson.annotations.SerializedName;

public class Team {
    @SerializedName("Player")
    private Player[] players;

    public Team(Player[] players) {
        setPlayers(players);
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        if((players.getClass()).equals(Player.class)) {
            this.players = players;
        }else {
            throw new IllegalArgumentException("player class not valid");
        }
    }
}
