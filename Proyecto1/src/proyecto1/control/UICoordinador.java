package proyecto1.control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import proyecto1.Vista.IngresoSolicitud;
import proyecto1.datos.Solicitud;

/**
 *
 * @author DrkSprtn
 */
public class UICoordinador {
    private int idSolicitudActual;
    private Coordinador facade=new Coordinador();
    public void agregarSolicitud(IngresoSolicitud ventana) throws IOException{
        System.out.println("Acceso a UI");
        DTOSolicitud dto=new DTOSolicitud();
        Date fecha = new Date();
        dto.setFecha(fecha);
        dto.setIdSolicitante(ventana.getIdSolicitante().getText());
        dto.setNombreSolicitante(ventana.getNombreSolicitante().getText());
        dto.setPeriodo(ventana.getPeriodoLectivo().getText());
        dto.setCodigoCurso(ventana.getCurso().getText());
        dto.setGrupoCurso(ventana.getGrupo().getText());
        dto.setIdAfectado(ventana.getIdSolicitante().getText());
        dto.setNombreAfectado(ventana.getIdSolicitante().getText());
        dto.setCorreoAfectado(ventana.getCorreoAfectado().getText());
        dto.setNumeroAfectado(ventana.getTelefonoAfectado().getText());
        dto.setTipoInconsistencia(ventana.getTipoSolicitud().getSelectedItem().toString());
        dto.setDescripcion(ventana.getDescripcion().getText());
        dto.setAdjunto(ventana.getEvidencia().getSelectedFile());
        facade.registrarNuevaSolicitud(dto);
        
    }
    public ArrayList<String> consultarPorEstado(String pEstado){
        return facade.buscarPorEstado(pEstado);
    }
    public DTOSolicitud consultarPorIdentificador(int pIdentificador){
        Solicitud consultado=(Solicitud)facade.consultar(pIdentificador);
        DTOSolicitud dto=new DTOSolicitud();
        idSolicitudActual=pIdentificador;
        dto.setIdSolicitante(consultado.getIdSolicitante());
        dto.setNombreSolicitante(consultado.getNombreSolicitante());
        dto.setPeriodo(consultado.getPeriodo());
        dto.setCodigoCurso(consultado.getCodigoCurso());
        dto.setGrupoCurso(consultado.getGrupoCurso());
        dto.setIdAfectado(consultado.getIdAfectado());
        dto.setNombreAfectado(consultado.getNombreAfectado());
        dto.setCorreoAfectado(consultado.getCorreoAfectado());
        dto.setNumeroAfectado(consultado.getNumeroAfectado());
        dto.setTipoInconsistencia(consultado.getTipoInconsistencia());
        dto.setDescripcion(consultado.getDescripcion());
        return dto;
    }
}
