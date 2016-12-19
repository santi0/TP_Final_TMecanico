
package py.edu.facitec.mec.controller;

import java.util.Date;
import java.util.List;
import py.edu.facitec.mec.dao.MantenimientoDao;
import py.edu.facitec.mec.dao.MantenimientoDaoImpl;
import py.edu.facitec.mec.model.Mantenimiento;

public class MantenimientoControllerImp implements MantenimientoController{

    private MantenimientoDao mantDao;

    public MantenimientoControllerImp() {
        this.mantDao = new MantenimientoDaoImpl();
    
    }

    public void registrar(Mantenimiento mant) {
        mantDao.guardar(mant);
    }

    public Mantenimiento recuperarPorCodigo(int codigo) {
        return mantDao.recuperarPorCodigo(codigo);
    }





}
