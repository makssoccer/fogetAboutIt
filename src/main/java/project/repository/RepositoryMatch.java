package project.repository;

import project.entity.Match;

import java.util.ArrayList;

public class RepositoryMatch {

    private ArrayList<Match> matches = new ArrayList<Match>();

    public void setMatch(Match match) {
        matches.add(match);

    }

    public Match getMatch(Integer id) {
        for (Match match : matches) {
            if (match.getId().equals(id)) {
                return match;
            }
        }
        return null;

    }
    public void updateMatch(Match match) {
        matches.set(matches.indexOf(match), match);
    }

    public void deleteMatch(Integer id) {
        Match findMatch=null;
        for (Match match : matches) {
            if (match.getId().equals(id)) {
                findMatch = match;
            }
        }

        matches.remove(matches.indexOf(findMatch));

    }


}
