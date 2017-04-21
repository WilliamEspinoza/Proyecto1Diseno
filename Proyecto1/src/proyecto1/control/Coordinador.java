package proyecto1.control;

import java.io.IOException;
import java.util.ArrayList;
import proyecto1.datos.Solicitud;

/**
 *
 * @author DrkSprtn
 */
public class Coordinador {
    private Registro control;

    public Coordinador() {
        this.control = Registro.getInstance();
    }
    public void registrarNuevaSolicitud(DTOSolicitud pDatos) throws IOException{
        control.registrarNuevaSolicitud(pDatos);
    }
    public ArrayList<String> buscarPorEstado(String pEstado){
        return control.buscarPorEstado(pEstado);
    }
    public Object consultar(int pIdentificador){
        return control.consultar(pIdentificador);
    }
}
