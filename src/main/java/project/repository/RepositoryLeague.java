package project.repository;

import project.entity.Country;
import project.entity.League;

import java.util.LinkedList;

public class RepositoryLeague {
    private LinkedList<League> leagues = new LinkedList<League>();

    public void setLeague(League league) {
        leagues.add(league);

    }

    public League getLeague(League id) {
        for (League league : leagues) {
            if (league==id) {
                return league;
            }
        }
        return null;

    }
    public void updateLeague(League League) {
        leagues.set(leagues.indexOf(League), League);
    }

    public void deleteLeague(League id) {
        League findLeague=null;
        for (League league : leagues) {
            if (league==id) {
                findLeague = league;
            }
        }

        leagues.remove(findLeague);

    }

}
