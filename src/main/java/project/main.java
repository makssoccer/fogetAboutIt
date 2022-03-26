package project;

import project.entity.Country;
import project.repository.RepositoryCountry;

public class main {
     public static void main(String[] args) {
         RepositoryCountry repositoryCountry = new RepositoryCountry  ();
         Country gana=new Country();
         Country egypt=new Country();
         gana.setId(1000);
         egypt.setId(1001);
         repositoryCountry.setCountry(gana);
         repositoryCountry.setCountry(egypt);
         Country country = repositoryCountry.getCountry(1000);
         System.out.println( country.getId());
         repositoryCountry.updateCountry(egypt);
         repositoryCountry.deleteCountry(egypt);
     }
}

