import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ControladoraAPI
{
    public void controladoraAPI () //hago el tratamiento de la excepcion directamente aca
    {
        ArrayListPersonajes personajes= new ArrayListPersonajes();
        try {
            JSONObject jsonObject = new JSONObject(ConsumoAPI.getInfo()); //como comienza con {} hago un object

            JSONObject infoObject = jsonObject.getJSONObject("info");
            int count = infoObject.getInt("count");
            int pages = infoObject.getInt("pages");

            JSONArray jsonArrayResults = jsonObject.getJSONArray("results");

            //recojo la info del array
            for(int i=0; i<jsonArrayResults.length();i++)
            {
                JSONObject personajeObject = jsonArrayResults.getJSONObject(i);

                JSONObject originObject = personajeObject.getJSONObject("origin");
                Origin origin = new Origin(); //para guardar la info de origin de cada personaje
                origin.setName(originObject.getString("name"));
                origin.setUrl(originObject.getString("url"));

                JSONObject locationObject = personajeObject.getJSONObject("location");
                Location location = new Location(); //para guardar la info de location de cada personaje
                location.setName(locationObject.getString("name"));
                location.setUrl(locationObject.getString("url"));

                Personaje personaje = new Personaje(); //guardamos la info de cada personaje

                personaje.setOrigin(origin);
                personaje.setLocation(location);
                personaje.setId(personajeObject.getInt("id")); //no hacemos los set del json, estamos pasando la info a nuestra clase
                personaje.setName(personajeObject.getString("name"));
                personaje.setSpecies(personajeObject.getString("species"));
                personaje.setStatus(personajeObject.getString("status"));
                personaje.setGender(personajeObject.getString("gender"));

                JSONArray episodiosArray = personajeObject.getJSONArray("episode"); //guardo el array de episodios que tiene el personaje
                for(int j=0; j<episodiosArray.length(); j++)
                {
                    String episodio = episodiosArray.getString(j);
                    personaje.agregarEpisodio(episodio); //ESTO ESTA BIEN?????
                }
                personajes.agregar(personaje);
            }
            System.out.println(personajes.toString());
        }
        catch (JSONException e)
        {

            System.out.println("ERROR EN LA DECODIFICION");
        }
    }
}
