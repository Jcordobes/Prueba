package zoo;

/**
 * Clase Gallina
 * @author Javier C.
 */
public class Gallina extends Ave {
 
    private String cacareo = "KOKOKO";
    
    /**
     * Es el public de Gallina 
     */
    public Gallina () {}
    
    /**
     * Método Gallina
     * @param habitat Es su habitat
     * @param comida Es la comida 
     * @param longevidad Es su longevidad
     * @param periodoIncubacion Es su periodo de Incubacion
     */
    public Gallina (Habitat habitat, String comida, int longevidad, int periodoIncubacion) {
        super(habitat, comida, longevidad, periodoIncubacion);
    }
    
    /**
     * Método setCacareo
     * @param cacareo Almacena su cacareo
     */
    public void setCacareo (String cacareo) { this.cacareo = cacareo; }
    
    /**
     * Método getCacareo
     * @return retorna su cacareo
     */
    public String getCacareo () { return cacareo; }
    
    /**
     * Método cacarear
     */
    public void cacarear () { System.out.println(cacareo); }
    
    /**
     * Método comer
     */
    public void comer () { System.out.println("Estoy comiendo " + comida); }
    
    /**
     * Método desplazar
     */
    public void desplazar () { System.out.println("Estoy volando con mucha dificultad"); }
}
