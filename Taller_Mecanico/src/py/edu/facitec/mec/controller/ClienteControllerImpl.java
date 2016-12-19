package py.edu.facitec.mec.controller;

import java.util.List;
import py.edu.facitec.mec.dao.ClienteDao;
import py.edu.facitec.mec.dao.ClienteDaoImpl;
import py.edu.facitec.mec.model.Cliente;

public class ClienteControllerImpl implements ClienteController{

    private ClienteDao clienteDao;

    public ClienteControllerImpl() {
        this.clienteDao = new ClienteDaoImpl();
    
    }

    public void registrar(Cliente cliente) {
        clienteDao.GuardarCliente(cliente);
    }

    public void modificar(Cliente cliente) {
        
         clienteDao.modificarCliente(cliente);
    }

    public Cliente recuperarPorCodigo(int codigo) {
        return clienteDao.buscarClientePorCodigo(codigo);
    }

    public List<Cliente> recuperarPorFiltro(String busqueda) {
        return clienteDao.buscClientesPorFiltro(busqueda);
    }

    public void eliminarCliente(int codigo) {
        clienteDao.eliminarCliente(codigo);
    }
}
