package proyecto1.datos;

/**
 *
 * @author DrkSprtn
 */
public class Persona {

    private String identificador;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String correo;
    private String telefono;
    
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

   
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIdentificador() {
        return identificador;
    }

 
    public String getNombre() {
        return nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }


    public String getSegundoApellido() {
        return segundoApellido;
    }

  
    public String getCorreo() {
        return correo;
    }

  
    public String getTelefono() {
        return telefono;
    }
    
    
}
