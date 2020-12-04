package models;

import com.google.gson.annotations.SerializedName;

public class Team {
    @SerializedName("Player")
    private Player[] players;

    /**
     * team object
     * @param players
     */
    public Team(Player[] players) {
        setPlayers(players);
    }

    /**
     * returns the player array
     * @return
     */
    public Player[] getPlayers() {
        return players;
    }

    /**
     * sets player array if all objects are type player
     * @param players
     */
    public void setPlayers(Player[] players) {
        if((players.getClass()).equals(Player.class)) {
            this.players = players;
        }else {
            throw new IllegalArgumentException("player class not valid");
        }
    }
}
