package proyecto1.control;

import java.io.File;
import java.util.Date;
import proyecto1.datos.Solicitud;

/**
 *
 * @author DrkSprtn
 */
public class ConstructorSolicitudImpl implements ConstructorSolicitud{
    private Solicitud solicitud;
    
    @Override
    public ConstructorSolicitudImpl identificador(int pIdentificador){
        solicitud.setIdentificador(pIdentificador);
        return this;    
    }

    @Override
    public ConstructorSolicitud fecha(Date pFecha) {
        solicitud.setFecha(pFecha);
        return this;    
    }
    @Override
    public ConstructorSolicitud estado() {
        solicitud.setEstado("Pendiente");
        return this;    
    }

    @Override
    public ConstructorSolicitud nombreSolicitante(String pSolicitante) {
        solicitud.setNombreSolicitante(pSolicitante);
        return this;    
        }

    @Override
    public ConstructorSolicitud idSolicitante(String pId) {
        solicitud.setIdSolicitante(pId);
        return this;    
        }

    @Override
    public ConstructorSolicitud periodo(String pPeriodo) {
        solicitud.setPeriodo(pPeriodo);
        return this;    
        }

    @Override
    public ConstructorSolicitud codigoCurso(String pCodigo) {
        solicitud.setCodigoCurso(pCodigo);
        return this;    
        }

    @Override
    public ConstructorSolicitud grupoCurso(String pGrupo) {
        solicitud.setGrupoCurso(pGrupo);
        return this;    
        }

    @Override
    public ConstructorSolicitud idAfectado(String pId) {
        solicitud.setIdAfectado(pId);
        return this;    
        }

    @Override
    public ConstructorSolicitud nombreAfectado(String pAfectado) {
        solicitud.setNombreAfectado(pAfectado);
        return this;    
        }

    @Override
    public ConstructorSolicitud correoAfectado(String pCorreo) {
        solicitud.setCorreoAfectado(pCorreo);
        return this;    
        }

    @Override
    public ConstructorSolicitud numeroAfectado(String pNumero) {
        solicitud.setNumeroAfectado(pNumero);
        return this;    
        }

    @Override
    public ConstructorSolicitud tipoInconsistencia(String pInconsistencia) {
        solicitud.setTipoInconsistencia(pInconsistencia);
        return this;    
        }

    @Override
    public ConstructorSolicitud descripcion(String pDescripcion) {
        solicitud.setDescripcion(pDescripcion);
        return this;    
        }

    @Override
    public ConstructorSolicitud adjunto(File pAdjunto) {
        solicitud.setAdjunto(pAdjunto);
        return this;    
        }
    public Solicitud retornarSolicitud(){
        return solicitud;
    }
    public void crear(){
        solicitud=new Solicitud();
    }
    
}
