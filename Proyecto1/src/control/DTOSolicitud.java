package control;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import proyecto1.datos.EstadoSolicitud;

/**
 *
 * @author DrkSprtn
 */
public class DTOSolicitud {
    private int identificador;
    private Date fecha;
    private String nombreSolicitante;
    private EstadoSolicitud estado;
    private String idSolicitante;
    private String periodo;
    private String codigoCurso;
    private String grupoCurso;
    private String idAfectado;
    private String nombreAfectado;
    private String correoAfectado;
    private String numeroAfectado;
    private String tipoInconsistencia ;
    private String descripcion;
    private ArrayList<String> considerandos;
    private File adjunto;
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setNombreSolicitante(String nombreSolicitante) {
        this.nombreSolicitante = nombreSolicitante;
    }

 
    public void setEstado(EstadoSolicitud estado) {
        this.estado = estado;
    }

  
    public void setIdSolicitante(String idSolicitante) {
        this.idSolicitante = idSolicitante;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

  
    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

 
    public void setGrupoCurso(String grupoCurso) {
        this.grupoCurso = grupoCurso;
    }

 
    public void setIdAfectado(String idAfectado) {
        this.idAfectado = idAfectado;
    }

    
    public void setNombreAfectado(String nombreAfectado) {
        this.nombreAfectado = nombreAfectado;
    }


    public void setNumeroAfectado(String numeroAfectado) {
        this.numeroAfectado = numeroAfectado;
    }


    public void setTipoInconsistencia(String tipoInconsistencia) {
        this.tipoInconsistencia = tipoInconsistencia;
    }

 
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setConsiderandos(ArrayList<String> considerandos) {
        this.considerandos = considerandos;
    }

    public void setAdjunto(File adjunto) {
        this.adjunto = adjunto;
    }

    public void setCorreoAfectado(String correoAfecado) {
        this.correoAfectado = correoAfecado;
    }

    public int getIdentificador() {
        return identificador;
    }


    public Date getFecha() {
        return fecha;
    }

    public String getNombreSolicitante() {
        return nombreSolicitante;
    }

    public EstadoSolicitud getEstado() {
        return estado;
    }


    public String getIdSolicitante() {
        return idSolicitante;
    }

    public String getPeriodo() {
        return periodo;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }


    public String getGrupoCurso() {
        return grupoCurso;
    }


    public String getIdAfectado() {
        return idAfectado;
    }


    public String getNombreAfectado() {
        return nombreAfectado;
    }

    public String getCorreoAfectado() {
        return correoAfectado;
    }


    public String getNumeroAfectado() {
        return numeroAfectado;
    }

  
    public String getTipoInconsistencia() {
        return tipoInconsistencia;
    }

  
    public String getDescripcion() {
        return descripcion;
    }

  
    public ArrayList<String> getConsiderandos() {
        return considerandos;
    }

 
    public File getAdjunto() {
        return adjunto;
    }
}
