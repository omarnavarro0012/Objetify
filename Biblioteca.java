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
        int existe;
        existe=totalpistas();
        
        if(existe!=0)
        {
            reproductor.reproducir(canciones.get(numeroCan));
        }
        
    }
    
    public void eliminar(int numeroCan)
    {
        int existe;
        existe=totalpistas();
        
        if(existe!=0)
        {
            canciones.remove(numeroCan);
        }
    }
    
    public int totalpistas()
    {
        int i=canciones.size();
        return i;
    }
    
    public void reproducirTodas()
    {
        int existe;
        existe=totalpistas();
        for(int i=0;i<existe;i++)
        {
            reproducirCan(i);
        }
    }
    
    public void eliminartodo()
    {
        int existe;
        existe=totalpistas();
        
        for(int i=0;i<existe;i++)
        {
            eliminar(i);
        }
    }
}