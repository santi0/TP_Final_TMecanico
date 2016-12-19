package py.edu.facitec.mec.dao;

import java.util.List;
import py.edu.facitec.mec.model.Servicio;

public interface ServicioDao {
    
    void insertar(Servicio serv);
    void modificar(Servicio serv);
    Servicio recuperarPorCodigo(int codigo);
    List<Servicio> recuperarPorFiltro(String filtro);
    void eliminar(int codigo);
}
