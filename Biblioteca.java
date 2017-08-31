import java.util.ArrayList;

public class Biblioteca
{
    private ArrayList<String> canciones;
    private Reproductor reproductor; 
    
    /**
     * Se inicializa la lista de objetos de Archivos o canciones
     * y mas aparte se inicializa el reproductos.
     */
    public Biblioteca()
    {
        canciones = new ArrayList<String>();
        reproductor= new Reproductor();
    }
    
    /**
     * se agrega una cancion a la lista.
     */
    public void agregarCancion(String nombreCan)
    {
       canciones.add(nombreCan); 
    }
    
    public void reproducirCan(int numeroCan)
    {
        reproductor.reproducir(canciones.get(numeroCan));
    }
}