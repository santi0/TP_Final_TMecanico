package py.edu.facitec.mec.dao;

import java.util.List;
import java.util.Vector;
import py.edu.facitec.mec.model.Ciudad;

public interface CiudadDao {
    void guardar(Ciudad ciudad);
    boolean modificar(Ciudad ciudad);
    Ciudad recuperarPorCodigo(int codigo); 
    Vector<Ciudad>cargarComboBox();
    List<Ciudad>recuperarPorFiltro(String filtro);
    void eliminar(int codigo);
    
}
