package project.repository;

import project.entity.Club;

import java.util.HashMap;

public class RepositoryClub {
    private HashMap<Integer, Club> clubs= new HashMap<>();


    public void setClub(Integer id,Club сlub) {
        clubs.put(id,сlub);

    }

    public Club getClub(Integer id) {
            if (clubs.containsKey(id)) {
                return  clubs.get(id);
            }
        return null;

    }

    public Club getClub(Club сlub) {
        if (clubs.containsValue(сlub)) {
            return  clubs.get(сlub);
        }
        return null;

    }


    public void updateClub(Integer id,Club сlub) {

        clubs.put(id, сlub);
    }

    public void deleteClub(Club club) {

        clubs.remove(club);

    }
    public void deleteClub(Integer id) {

        clubs.remove(id);

    }


}
