package project.repository;


import project.entity.League;

import java.util.LinkedList;

public class RepositoryLeague {
    private LinkedList<League> leagues = new LinkedList<League>();

    public void setLeague(League league) {
        leagues.add(league);

    }

    public League getLeague(Integer id) {
        for (League league : leagues) {
            if (league.getId().equals(id)) {
                return league;
            }
        }
        return null;

    }
    public void updateLeague(League League) {

        leagues.set(leagues.indexOf(League), League);
    }

    public void deleteLeague(Integer id) {
        League findLeague=null;
        for (League league : leagues) {
            if (league.getId().equals(id)) {
                findLeague = league;
            }
        }

        leagues.remove(findLeague);

    }

}
