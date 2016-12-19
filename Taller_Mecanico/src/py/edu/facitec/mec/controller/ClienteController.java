package py.edu.facitec.mec.controller;

import java.util.List;
import py.edu.facitec.mec.model.Cliente;

public interface ClienteController {
    void registrar(Cliente cliente);
    void modificar(Cliente cliente);
    Cliente recuperarPorCodigo(int codigo);
    List<Cliente> recuperarPorFiltro(String busqueda);
    void eliminarCliente(int codigo);
}
