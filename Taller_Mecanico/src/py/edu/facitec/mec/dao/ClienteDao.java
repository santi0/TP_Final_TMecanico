
package py.edu.facitec.mec.dao;

import java.util.List;
import py.edu.facitec.mec.model.Cliente;


public interface ClienteDao {
    void GuardarCliente(Cliente cliente);
    void modificarCliente (Cliente cliente);
    void eliminarCliente (int codigo);
    Cliente buscarClientePorCodigo  (int codigo);
    List<Cliente> buscClientesPorFiltro(String filtro);
}
