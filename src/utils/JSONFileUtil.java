package utils;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import models.Player;
import models.Team;

import javax.naming.directory.SearchResult;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class JSONFileUtil {
    /**
     * get an array list of type player fom the json entered
     * @param jsonFileName
     * @return
     */
    public static ArrayList<Player> getRoster(String jsonFileName)
    {
        ArrayList<Player> players = new ArrayList<>();
        Gson gson = new Gson();
        try(
                FileReader fileReader = new FileReader(jsonFileName);
                JsonReader jsonReader = new JsonReader(fileReader);
                )
        {
            Team team = gson.fromJson(jsonReader, Team.class);
            players.addAll(Arrays.asList(team.getPlayers()));
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        return players;
    }
}
