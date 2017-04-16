package control;

import java.io.IOException;
import java.util.Properties;
import proyecto1.datos.Solicitud;



/**
 *
 * @author DrkSprtn
 */
public class GestorSolicitudes extends GestorGeneral{
    
    private ConstructorSolicitudImpl constructor;
    @Override
    public Object consultar(int identificador) {
       return 3;
    }

    @Override
    public void cargarExcel() {
    }

    @Override
    public void cargarSQL() {
    }
    public void agregar(DTOSolicitud pDatos) throws IOException{
        PropertiesLoader loader=new PropertiesLoader();
        Properties prop=loader.cargarProperties();
        int idSolicitudes=Integer.parseInt(prop.getProperty("idSolicitudes"));
        idSolicitudes+=1;
        constructor.identificador(idSolicitudes)
        .fecha(pDatos.getFecha())
        .nombreSolicitante(pDatos.getNombreSolicitante())
        .idSolicitante(pDatos.getIdSolicitante())
        .periodo(pDatos.getPeriodo())
        .grupoCurso(pDatos.getGrupoCurso())
        .codigoCurso(pDatos.getCodigoCurso())
        .idAfectado(pDatos.getIdAfectado())
        .nombreAfectado(pDatos.getNombreAfectado())
        .correoAfectado(pDatos.getCorreoAfectado())
        .numeroAfectado(pDatos.getNumeroAfectado())
        .tipoInconsistencia(pDatos.getTipoInconsistencia())
        .descripcion(pDatos.getDescripcion())
        .adjunto(pDatos.getAdjunto());
        Solicitud nuevaSolicitud=constructor.crear();
        lista.add(nuevaSolicitud);
        
    }
    public boolean insertBD(Solicitud pSolicitud){
        // codigo para llamar DAOSQLSolicitud
        return true;
    }
    
    
}
