// Question 8:
// Consider the City class:

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class City {
 
    private String name;
    private long population;
 
 
    public City(String name, long population) {
        this.name = name;
        this.population = population;
    }
 
    public City(City source) {
        this.name = source.name;
        this.population = source.population;
    }
 
    public String getName() {
        return this.name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public long getPopulation() {
        return this.population;
    }
 
    public void setPopulation(long population) {
        this.population = population;
    }
   
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
 
        if (!(obj instanceof City))
            return false;
 
        City city = (City)obj;
        return Objects.equals(this.name, city.name) && this.getPopulation() == city.population;
    }
 
}
// Will the contains method return true or false?



        City paris = new City("Paris", 2161000);
 
       List<City> cities = new ArrayList<>();
       
        cities.add(new City("London", 8982000));
        cities.add(new City("Paris", 2161000));
        cities.add(new City("Florence", 382258));
 
        System.out.println(cities.contains(paris));



     
