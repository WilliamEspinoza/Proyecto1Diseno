package proyecto1.control;

import java.io.IOException;
import java.util.ArrayList;
import proyecto1.datos.Solicitud;

/**
 *
 * @author DrkSprtn
 */
public class Registro {
    private GestorCurso plan;
    private GestorGrupo oferta;
    private GestorDocente docentes;
    private GestorInconsistencia inconsistencias;
    private GestorSolicitudes solicitudes;
    private static Registro instance = null;
   public Registro() {
       crearPlan();
       crearOferta();
       crearDocentes();
       crearInconsistencias();
       crearSolicitudes();
   }
   public static Registro getInstance() {
      if(instance == null) {
         instance = new Registro();
         
      }
      return instance;
   }
    public void registrarNuevaSolicitud(DTOSolicitud pDatos) throws IOException{
        solicitudes.agregar(pDatos);
    }
    public ArrayList<String> buscarPorEstado(String pEstado){
        return solicitudes.buscarPorEstado(pEstado);
    }
    public Object consultar(int pIdentificador){
        return solicitudes.consultar(pIdentificador);
    }
    private void crearPlan(){
        plan=new GestorCurso();
        
    }
    private void crearOferta(){
        oferta=new GestorGrupo();
    }
    private void crearDocentes(){
        docentes=new GestorDocente();
    }
    private void crearInconsistencias(){
        inconsistencias=new GestorInconsistencia();
    }
    private void crearSolicitudes(){
        solicitudes=new GestorSolicitudes();
    }
}
