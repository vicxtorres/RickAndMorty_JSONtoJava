import java.util.ArrayList;

public class Personaje
{
    private int id;
    private String name;
    private String species; //human animal
    private String status; //alive death
    private String gender; //male female
    private Origin origin;
    private Location location;
    private ArrayList<String> episodios;

    public Personaje(){
        episodios = new ArrayList<String>();
    }

    public Personaje(int id, String name, String species, String status, String gender, Origin origin, Location location) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.status = status;
        this.gender = gender;
        this.origin = origin;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void agregarEpisodio(String episodio)
    {
        episodios.add(episodio);
    }

    public ArrayList<String> getEpisodios() {
        return episodios;
    }

    @Override
    public String toString() {
        return "\n--Personaje ==>" +
                "|  Id:" + id +
                "  |  Name: " + name  +
                "  |  Species: " + species  +
                "  |  Status: " + status +
                "  |  Gender: " + gender + origin + location + "\n  Episodios =>" + getEpisodios() +"\n";
    }
}
