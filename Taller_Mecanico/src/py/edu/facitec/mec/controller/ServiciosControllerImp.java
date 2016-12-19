package py.edu.facitec.mec.controller;

import java.util.List;
import py.edu.facitec.mec.dao.ServicioDaoImp;
import py.edu.facitec.mec.model.Servicio;
import py.edu.facitec.mec.dao.ServicioDao;

public class ServiciosControllerImp implements ServiciosController{
    
    ServicioDao servDao = new ServicioDaoImp();

    public void insertar(Servicio serv) {
        servDao.insertar(serv);
    }

    public void modificar(Servicio serv) {
        servDao.modificar(serv);
    }

    public Servicio recuperarPorCodigo(int codigo) {
        return servDao.recuperarPorCodigo(codigo);
    }

    public List<Servicio> recuperarPorFiltro(String filtro) {
        return servDao.recuperarPorFiltro(filtro);
    }

    public void eliminar(int codigo) {
        servDao.eliminar(codigo);
    }
}
