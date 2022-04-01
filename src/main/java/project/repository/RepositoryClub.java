package project.repository;

import project.entity.Club;

import java.util.HashMap;

public class RepositoryClub {
    private HashMap<Integer, Club> clubs= new HashMap<>();


    public void setClub(Club сlub) {
        clubs.put(сlub.getId(),сlub);

    }

    public Club getClub(Integer id) {
            if (clubs.containsKey(id)) {
                return  clubs.get(id);
            }
        return null;

    }




    public void updateClub(Integer id,Club сlub) {

        clubs.put(id, сlub);
    }


    public void deleteClub(Integer id) {

        clubs.remove(id);

    }


}
