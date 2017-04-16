package proyecto1.control;

import java.io.IOException;

/**
 *
 * @author DrkSprtn
 */
public class Coordinador {
    GestorSolicitudes gestorSolicitud;
    public void registrarNuevaSolicitud(DTOSolicitud pDatos) throws IOException{
        gestorSolicitud.agregar(pDatos);
    }
}
