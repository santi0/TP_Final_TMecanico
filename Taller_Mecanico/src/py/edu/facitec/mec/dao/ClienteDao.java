/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.dao;

import java.util.List;
import py.edu.facitec.mec.model.Cliente;

/**
 *
 * @author migueee
 */
public interface ClienteDao {
    void GuardarCliente(Cliente cliente);
    void modificarCliente (Cliente cliente);
    void eliminarCliente (int codigo);
    Cliente buscarClientePorCodigo  (int codigo);
    List<Cliente> buscClientesPorFiltro(String filtro);
}
