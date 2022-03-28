package project;

import project.entity.Country;
import project.entity.League;
import project.repository.RepositoryCountry;
import project.repository.RepositoryLeague;

public class main {
     public static void main(String[] args) {
//         RepositoryCountry repositoryCountry = new RepositoryCountry  ();
//         Country gana=new Country();
//         Country egypt=new Country();
//         gana.setId(1000);
//         egypt.setId(1001);
//         repositoryCountry.setCountry(gana);
//         repositoryCountry.setCountry(egypt);
//         Country country = repositoryCountry.getCountry(1000);
//         System.out.println( country.getId());
//         repositoryCountry.updateCountry(egypt);
//         repositoryCountry.deleteCountry(egypt.getId());

         RepositoryLeague repositoryLeague = new RepositoryLeague  ();
         League superGana=new League();
         League superEgypt=new League();
         superGana.setId(900);
         superEgypt.setId(901);
         repositoryLeague.setLeague(superGana);
         repositoryLeague.setLeague(superEgypt);
         League league = repositoryLeague.getLeague(superEgypt);
         System.out.println(league.getId());
         repositoryLeague.updateLeague(superEgypt);
         repositoryLeague.deleteLeague(superEgypt);
         ////////////////////////
     }
}

