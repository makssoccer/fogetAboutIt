package project.repository;


import project.entity.Player;

import java.util.ArrayList;

public class RepositoryPlayer {
    private ArrayList<Player> players = new ArrayList<Player>();

    public void setPlayer(Player player) {
        players.add(player);

    }

    public Player getPlayer(Integer id) {
        for (Player player : players) {
            if (player.getId().equals(id)) {
                return player;
            }
        }
        return null;

    }
    public void updatePlayer(Player player) {
        players.set(players.indexOf(player), player);
    }

    public void deletePlayer(Integer id) {
        Player findPlayer=null;
        for (Player player : players) {
            if (player.getId().equals(id)) {
                findPlayer = player;
            }
        }

        players.remove(players.indexOf(findPlayer));

    }

}
