package project;

import project.entity.*;
import project.repository.*;

public class Main {
     public static void main(String[] args) {
         RepositoryCountry repositoryCountry = new RepositoryCountry  ();
         Country spain =new Country();
         Country england =new Country();
//         spain.setId(1000);
//         england.setId(1001);
//         repositoryCountry.setCountry(spain);
//         repositoryCountry.setCountry(england);
//         Country country = repositoryCountry.getCountry(1000);
//         System.out.println( country.getId());
//         repositoryCountry.updateCountry(england);
//         repositoryCountry.deleteCountry(england.getId());

         RepositoryLeague repositoryLeague = new RepositoryLeague  ();
         League laliga=new League();
         League apl=new League();
         laliga.setId(900);
         apl.setId(901);
         repositoryLeague.setLeague(laliga);
         repositoryLeague.setLeague(apl);
         League league = repositoryLeague.getLeague(apl);
         System.out.println(league.getId());
         repositoryLeague.updateLeague(apl);
         repositoryLeague.deleteLeague(apl);

         RepositoryClub repositoryClub = new RepositoryClub  ();
         Club barcelona=new Club();
         Club liverpool=new Club();

         RepositoryMatch repositoryMatch = new RepositoryMatch();
         Match  laliga_first_tour=new Match();
         Match  apl_first_tour=new Match ();

         RepositoryPlayer repositoryPlayer  = new RepositoryPlayer ();
         Player   fati=new Player();
         Player   van_Dijk=new Player  ();

         
     }
}

