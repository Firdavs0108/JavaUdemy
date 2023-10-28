import java.util.Objects;

public class CityEquality {

    private String name;
    private long population;


    public CityEquality(String name, long population) {
        this.name = name;
        this.population = population;
    }

    public CityEquality(CityEquality source) {
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


    @Override
    public boolean equals(Object o) {
        if (o == this) 
            return true;
        if (!(o instanceof CityEquality)) {
            return false;
        }
        CityEquality cityEquality = (CityEquality) o;
        return Objects.equals(name, cityEquality.name) && population == cityEquality.population;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, population);
    }




}
