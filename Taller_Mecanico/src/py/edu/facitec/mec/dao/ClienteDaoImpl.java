/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import py.edu.facitec.mec.model.Cliente;
import py.edu.facitec.mec.util.ConexionManager;

/**
 *
 * @author migueee
 */
public class ClienteDaoImpl  implements ClienteDao{
    //string= ´"++"´
    @Override
    public void GuardarCliente(Cliente cliente) {
        String sql="insert  into clientes(nombres,  apellidos,direccion) values "
                + "('"+cliente.getNombre()+"','"+cliente.getApellido()+"',"
                + "'"+cliente.getDireccion()+"')";
        
        System.out.println(sql);
        //conectara la base de datos
        ConexionManager.conectar();
        try {
            //ejecutar elsql
            ConexionManager.st.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        //cerrar la conexion con la base de datos
        ConexionManager.desconectar();
         
    }
        //para valores numericos "+ +"
        //para valores string '"+ +"'
    @Override
    public void modificarCliente(Cliente cliente) {
        String sql="update cliente set nombres='"+cliente.getNombre()+"',"
                + "apellido= '"+cliente.getApellido()+"',"
                + "direccion='"+cliente.getDireccion()+"',"
                + " where codigo= "+cliente.getCodigo()+" ";
        
        //conectar 
        ConexionManager.conectar();
        try {
            //ejecutar el sql
            ConexionManager.st.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        //desconectarse
        ConexionManager.desconectar();
    }

    
    @Override
    public Cliente buscarClientePorCodigo(int codigo) {
       String sql= "select nombres,apellidos, direccion from clientes"
               + " where codigo="+codigo+"; ";
       
       Cliente cliente = null;
       
       //conectar
       ConexionManager.conectar();
       
        try {
            //ejecutar sentencia sql query=sentencia
            ResultSet rs=  ConexionManager.st.executeQuery(sql);
            
            if(rs.next()){ //si tuvo resultado
                cliente= new Cliente();
                cliente.setNombre(rs.getString("nombres")); //cargar valor columna
                cliente.setApellido(rs.getString("apellido")); //lo mismo
                cliente.setDireccion(rs.getString("direccion"));// lo mismo
                
            } 
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
       //desconectar 
       ConexionManager.desconectar();
       return cliente;
    }
    
    // %-- al principio compara las letras fin
    // ---% compara las letras de inicio
    //%--% compara del inicio al fin
    @Override
    public List<Cliente> buscClientesPorFiltro(String filtro) {
    String sql= "select nombres, apellidos,direccion from clientes "
            +"where nombres LIKE '%"+filtro+"' or apellidos LIKE '"+filtro+"%' "
            + "or direccion LIKE '%"+filtro+"%' ";
    List<Cliente> Lista=new ArrayList();
    
    ConexionManager.conectar();
    try {
            //ejecutar sentencia sql query=sentencia
            ResultSet rs=  ConexionManager.st.executeQuery(sql);
            
            while (rs.next()){ //si tuvo resultado
                Cliente cliente= new Cliente();
                cliente.setNombre(rs.getString("nombres")); //cargar valor columna
                cliente.setApellido(rs.getString("apellido")); //lo mismo
                cliente.setDireccion(rs.getString("direccion"));// lo mismo
                Lista.add(cliente);
            } 
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
       //desconectar 
       ConexionManager.desconectar();
       return Lista;
    
    }

    @Override
    public void eliminarCliente(int codigo) {
        String sql = "delete from clientes where codigo= "+ codigo+" ";
        
         //conectar 
        ConexionManager.conectar();
        try {
            //ejecutar el sql
            ConexionManager.st.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        //desconectarse
        ConexionManager.desconectar();
        
    }
    
    
}