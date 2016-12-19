package py.edu.facitec.mec.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import py.edu.facitec.mec.model.Servicio;
import py.edu.facitec.mec.util.ConexionManager;

public class ServicioDaoImp implements ServicioDao{
    
    private String sql;

    public void insertar(Servicio serv) {
        
        sql = "INSERT INTO public.servicio"
                + "(nombre, descripcion, valor_unitario, estado) "
                + "VALUES ('"+serv.getNombre()+"', '"+serv.getDescripcion()+"', "
                + ""+serv.getValor_unitario()+", "+serv.isEstado()+");";
        
        ConexionManager.conectar();
        
        try {
            ConexionManager.st.execute(sql);
            System.out.println("SQL "+sql);
        } catch (SQLException ex) {
            Logger.getLogger(ServicioDaoImp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar sql "+ex);
        }
        ConexionManager.desconectar();
        
    }
    public void modificar(Servicio serv) {
        
        sql = "UPDATE public.servicio "
                + "SET nombre='"+serv.getNombre()+"', descripcion='"+serv.getDescripcion()+"', "
                + "valor_unitario="+serv.getValor_unitario()+", estado="+serv.isEstado()+" "
                + "WHERE codigo="+serv.getCodigo()+";";
        
        ConexionManager.conectar();
        
        try {
            ConexionManager.st.execute(sql);
            System.out.println("SQL "+sql);
        } catch (SQLException ex) {
            Logger.getLogger(ServicioDaoImp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar sql "+ex);
        }
        
        ConexionManager.desconectar();
        
    }

    public Servicio recuperarPorCodigo(int codigo) {
        
        sql = "SELECT nombre, descripcion, valor_unitario, estado "
                + "FROM public.servicio "
                + "WHERE codigo="+codigo+";";
        
        Servicio servicio = null;
        
        ConexionManager.conectar();
        
        try {
            ResultSet rs = ConexionManager.st.executeQuery(sql);
            System.out.println("SQL "+sql);
            
            if (rs.next()) {
                servicio = new Servicio();
                servicio.setNombre(rs.getString("nombre"));
                servicio.setDescripcion(rs.getString("descripcion"));
                servicio.setValor_unitario(rs.getDouble("valor_unitario"));
                servicio.setEstado(rs.getBoolean("estado"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ServicioDaoImp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar sql "+ex);
        }
        
        ConexionManager.desconectar();
        
        return servicio;
    }

    public List<Servicio> recuperarPorFiltro(String filtro) {
        
        List<Servicio> lista = new ArrayList<>();
        
        sql = "SELECT codigo, nombre, descripcion, valor_unitario, estado "
                + "FROM public.servicio "
                + "WHERE (nombre LIKE '%"+filtro+"%') "
                + "or (descripcion LIKE '%"+filtro+"%');";
        
        Servicio servicio = null;
        
        ConexionManager.conectar();
        
        try {
            ResultSet rs = ConexionManager.st.executeQuery(sql);
            System.out.println("SQL "+sql);
            
            while(rs.next()) {
                servicio = new Servicio();
                servicio.setCodigo(rs.getInt("codigo"));
                servicio.setNombre(rs.getString("nombre"));
                servicio.setDescripcion(rs.getString("descripcion"));
                servicio.setValor_unitario(rs.getDouble("valor_unitario"));
                servicio.setEstado(rs.getBoolean("estado"));
                lista.add(servicio);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ServicioDaoImp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar sql "+ex);
        }
        
        ConexionManager.desconectar();
        
        return lista;
    }

    public void eliminar(int codigo) {
        sql = "DELETE FROM public.servicio WHERE codigo="+codigo+";";
        
        ConexionManager.conectar();
        
        try {
            ConexionManager.st.execute(sql);
            System.out.println("SQL "+sql);
        } catch (SQLException ex) {
            Logger.getLogger(ServicioDaoImp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar sql "+ex);
        }
        
        ConexionManager.desconectar();
        
    }
    
}
