package py.edu.facitec.mec.dao;

import java.util.List;
import py.edu.facitec.mec.model.MantenimientoDetalle;

public interface MantenimientoDetDao {
    void guardar(MantenimientoDetalle mantDet);
    boolean modificar(MantenimientoDetalle mantDet);
    MantenimientoDetalle recuperarPorCodigo(int codigo); 
    void eliminar(int codigo);
    List<MantenimientoDetalle> recuperarPorFiltro(int codigo);    
}
