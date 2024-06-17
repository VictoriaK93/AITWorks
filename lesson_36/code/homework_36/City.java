package homework_36;

import java.util.Objects;

public class City implements Comparable<City> {
    private String name;
    private int population;
    private String country;
    private double index;

    // constructor

    public City(String name, int population, String country, double index) {
        this.name = name;
        this.population = population;
        this.country = country;
        this.index = index;
    }

    // getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getIndex() {
        return index;
    }

    public void setIndex(double index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", country='" + country + '\'' +
                ", index=" + index +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof city_array.City city)) return false;
        return Objects.equals(name, city.getName()) && Objects.equals(country, city.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country);
    }


    @Override
    public int compareTo(City o) {
        int res = this.name.compareTo(o.name); // compare by name

            return res;
        }


    }





