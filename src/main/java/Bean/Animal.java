package Bean;

public class Animal {

    private final int id;
    private final String race;
    private final String name;
    private final int power;
    private final String country;

    public Animal(int id, String race, String name, int power, String country) {
        this.id = id;
        this.race = race;
        this.name = name;
        this.power = power;
        this.country = country;
    }


    public int getId() {
        return id;
    }

    public String getRace() {
        return race;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", race='" + race + '\'' +
                ", name='" + name + '\'' +
                ", power=" + power +
                ", country='" + country + '\'' +
                '}';
    }
}
