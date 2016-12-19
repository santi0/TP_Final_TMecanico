package py.edu.facitec.mec.controller;

import java.util.Date;
import java.util.List;
import py.edu.facitec.mec.model.Mantenimiento;

public interface MantenimientoController {
    void registrar(Mantenimiento mantenimiento);
    Mantenimiento recuperarPorCodigo(int codigo);
    
    
}
