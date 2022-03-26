package project.repository;

import project.entity.Country;

import java.util.ArrayList;

public class RepositoryCountry {
    private ArrayList<Country> countries = new ArrayList<Country>();

    public void setCountry(Country country) {
        countries.add(country);

    }

    public Country getCountry(Integer id) {
        for (Country country : countries) {
            if (country.getId().equals(id)) {
                return country;
            }
        }
        return null;

    }
    public void updateCountry(Country country) {
                countries.set(countries.indexOf(country), country);
        }

    public void deleteCountry(Integer id) {
        Country findCountry=null;
        for (Country country : countries) {
            if (country.getId().equals(id)) {
                findCountry = country;
            }
        }

                countries.remove(countries.indexOf(findCountry));

    }


}
