import java.util.ArrayList;

public class ArrayListPersonajes
{
    ArrayList<Personaje> personajes ;

    public ArrayListPersonajes()
    {
        personajes = new ArrayList<Personaje>();
    }

    public void agregar (Personaje personaje)
    {
        personajes.add(personaje);
    }

    @Override
    public String toString() {
        return "Personajes: " + personajes;
    }

}
