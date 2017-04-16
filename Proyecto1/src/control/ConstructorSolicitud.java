package control;

import java.io.File;
import java.util.Date;

/**
 *
 * @author DrkSprtn
 */
public interface ConstructorSolicitud {
     public ConstructorSolicitud identificador(int pIdentificador);
     public ConstructorSolicitud fecha(Date pFecha);
     public ConstructorSolicitud nombreSolicitante(String pSolicitante);
     public ConstructorSolicitud idSolicitante(String pId);
     public ConstructorSolicitud periodo(String pPeriodo);
     public ConstructorSolicitud codigoCurso(String pCodigo);
     public ConstructorSolicitud grupoCurso(String pGrupo);
     public ConstructorSolicitud idAfectado(String pId);
     public ConstructorSolicitud nombreAfectado(String pAfectado);
     public ConstructorSolicitud correoAfectado(String pCorreo);
     public ConstructorSolicitud numeroAfectado(String pNumero);
     public ConstructorSolicitud tipoInconsistencia(String pInconsistencia);
     public ConstructorSolicitud descripcion(String pDescripcion);
     public ConstructorSolicitud adjunto(File pAdjunto);
     
}
