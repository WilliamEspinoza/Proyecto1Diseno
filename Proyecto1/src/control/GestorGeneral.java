package control;

import java.util.ArrayList;

/**
 *
 * @author DrkSprtn
 */
public abstract class GestorGeneral {
    public ArrayList<Object> lista=new ArrayList();
    public abstract Object consultar(int identificador);
    public abstract void cargarExcel();
    public abstract void cargarSQL();
}
