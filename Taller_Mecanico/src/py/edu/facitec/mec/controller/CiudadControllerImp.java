package py.edu.facitec.mec.controller;

import java.util.List;
import java.util.Vector;
import py.edu.facitec.mec.dao.CiudadDao;
import py.edu.facitec.mec.dao.CiudadDaoImp;
import py.edu.facitec.mec.model.Ciudad;

public class CiudadControllerImp implements CiudadController{

    private CiudadDao ciudadDao;

    public CiudadControllerImp() {
        this.ciudadDao = new CiudadDaoImp();
    
    }
    
    public void registrar(Ciudad ciudad) {
        ciudadDao.guardar(ciudad);
    }

    public Ciudad recuperarPorCodigo(int codigo) {
        return ciudadDao.recuperarPorCodigo(codigo);
    }

    public boolean modificar(Ciudad ciudad) {
        return ciudadDao.modificar(ciudad);
    }

    public void eliminar(int codigo) {
        ciudadDao.eliminar(codigo);
    }

    public Vector<Ciudad> cargarComboBox() {
        return ciudadDao.cargarComboBox();
    }

    public List<Ciudad> recuperarPorFiltro(String filtro) {
        return ciudadDao.recuperarPorFiltro(filtro);
    }
}
