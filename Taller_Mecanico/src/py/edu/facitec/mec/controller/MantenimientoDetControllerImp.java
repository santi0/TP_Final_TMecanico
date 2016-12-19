package py.edu.facitec.mec.controller;

import java.util.List;
import py.edu.facitec.mec.dao.MantenimientoDetDao;
import py.edu.facitec.mec.model.MantenimientoDetalle;
import py.edu.facitec.mec.dao.MantenimientoDetDao;
import py.edu.facitec.mec.dao.MantenimientoDetDaoImp;

public class MantenimientoDetControllerImp implements MantenimientoDetController{

    private MantenimientoDetDao movimientoDetDao;

    public MantenimientoDetControllerImp() {
        this.movimientoDetDao = new MantenimientoDetDaoImp();
    
    }

    public void registrar(MantenimientoDetalle mantDet) {
        movimientoDetDao.guardar(mantDet);
    }

    public MantenimientoDetalle recuperarPorCodigo(int codigo) {
        return movimientoDetDao.recuperarPorCodigo(codigo);
    }

    public boolean modificar(MantenimientoDetalle mantDet) {
        return movimientoDetDao.modificar(mantDet);
    }

    public void eliminar(int codigo) {
        movimientoDetDao.eliminar(codigo);
    }

    public List<MantenimientoDetalle> recuperarPorFiltro(int codigo) {
        return movimientoDetDao.recuperarPorFiltro(codigo);
    }


}
