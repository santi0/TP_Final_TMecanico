package py.edu.facitec.mec.controller;

import java.util.List;
import py.edu.facitec.mec.model.MantenimientoDetalle;

public interface MantenimientoDetController {
    void registrar(MantenimientoDetalle mantDet);
    boolean modificar(MantenimientoDetalle mantDet);
    MantenimientoDetalle recuperarPorCodigo(int codigo);
    void eliminar(int codigo);
    List<MantenimientoDetalle> recuperarPorFiltro(int codigo);    
}
