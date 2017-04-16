package proyecto1.datos;

/**
 *
 * @author DrkSprtn
 */
public class Curso {
    private String codigo;
    private String nombre;
    private int creditos;

  
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

 
    public String getCodigo() {
        return codigo;
    }

    
    public String getNombre() {
        return nombre;
    }

   
    public int getCreditos() {
        return creditos;
    }
    
}
