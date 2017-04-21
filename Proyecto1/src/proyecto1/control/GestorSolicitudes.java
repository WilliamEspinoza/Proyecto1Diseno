package proyecto1.control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import proyecto1.datos.Solicitud;



/**
 *
 * @author DrkSprtn
 */
public class GestorSolicitudes extends GestorGeneral{
    
    private ConstructorSolicitudImpl constructor=new ConstructorSolicitudImpl();
    @Override
    public Object consultar(int identificador) {
       for (Object solicitud: lista) {
            if (((Solicitud)solicitud).getIdentificador()== identificador) {
                 return solicitud;
            }
        }
        return null;
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
        idSolicitudes+=5;
        constructor.crear();
        constructor.identificador(idSolicitudes)
        .fecha(pDatos.getFecha())
        .estado()
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
        Solicitud nuevaSolicitud=constructor.retornarSolicitud();
        lista.add(nuevaSolicitud);
        System.out.println(lista.toString());
        
    }
    public ArrayList<String> buscarPorEstado(String pEstado){
        ArrayList<String> resultado = new ArrayList<String>();
        for (Object solicitud: lista) {
            if (((Solicitud)solicitud).getEstado() == pEstado) {
                 resultado.add(String.valueOf(((Solicitud) solicitud).getIdentificador()));
            }
        }
        return resultado;
        }
    }
    
    

