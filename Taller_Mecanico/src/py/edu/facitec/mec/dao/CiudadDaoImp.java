package py.edu.facitec.mec.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import py.edu.facitec.mec.model.Ciudad;
import py.edu.facitec.mec.util.ConexionManager;

public class CiudadDaoImp implements CiudadDao{
    
    public void guardar(Ciudad ciudad){
        String sql = "INSERT INTO public.ciudades"
                + "(nombre, iso, estado) "
                + "VALUES ('"+ciudad.getNombre()+"', '"+ciudad.getIso()+"', '"+ciudad.getEstado()+"');";
        
        //abrir una conexion
        ConexionManager.conectar();

        try {
            //ejecutar sql
            ConexionManager.st.execute(sql);
            System.out.println("Ejecutando: "+sql);

        } catch (SQLException ex) {

            Logger.getLogger(CiudadDaoImp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar "+ ex);

        }

        //cerrar conexion
        ConexionManager.desconectar();
    }

    public boolean modificar(Ciudad ciudad) {
        String sql = "UPDATE public.ciudades "
                + "SET nombre='"+ciudad.getNombre()+"', iso='"+ciudad.getIso()+"', estado='"+ciudad.getEstado()+"' "
                + "WHERE codigo="+ciudad.getCodigo()+";";
        boolean resultado = false;

        ConexionManager.conectar();

        try {
            resultado = ConexionManager.st.execute(sql);
            System.out.println("Ejecutando: "+sql);
            
        } catch (SQLException ex) {
            
            Logger.getLogger(CiudadDaoImp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar "+ ex);
            
        }

        ConexionManager.desconectar();
        
        return resultado;

    }

    public Ciudad recuperarPorCodigo(int codigo) {
        
        String sql = "SELECT nombre, iso, estado FROM public.ciudades WHERE codigo="+codigo+";";
 
        ConexionManager.conectar();
        
        Ciudad ciudad = null;
        
        ResultSet rs;
        
        try {

            rs = ConexionManager.st.executeQuery(sql);
            System.out.println("Ejecutando: "+sql);
            
            if (rs.next()) {
                ciudad = new Ciudad();
                ciudad.setNombre(rs.getString("nombre"));
                ciudad.setIso(rs.getString("iso"));
                ciudad.setEstado(rs.getBoolean("estado"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CiudadDaoImp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar SQL: "+ex);

        }

        ConexionManager.desconectar();
        return ciudad;
    }

    public void eliminar(int codigo) {
        String sql = "";
        
        System.out.println("SQL = "+sql);

        ConexionManager.conectar();

        try {
            ConexionManager.st.execute(sql);
            System.out.println("Ejecutando: "+sql);

        } catch (SQLException ex) {

            Logger.getLogger(CiudadDaoImp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar "+ ex);

        }

        ConexionManager.desconectar();
    }

    @Override
    public Vector<Ciudad> cargarComboBox() {
        
        String sql = "SELECT codigo, nombre FROM public.ciudades;";
        
        Vector<Ciudad> ciudadList = new Vector<Ciudad>();
        Ciudad ciu = null;
        ConexionManager.conectar();
        try {
            ResultSet rs = ConexionManager.st.executeQuery(sql);
            System.out.println("SQL "+sql);
            
            while(rs.next()){
                ciu = new Ciudad();
                ciu.setCodigo(rs.getInt("codigo"));
                ciu.setNombre(rs.getString("nombre"));
                ciudadList.add(ciu);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CiudadDaoImp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar "+ex);
        }
        ConexionManager.desconectar();
        return ciudadList;
    }

    public List<Ciudad> recuperarPorFiltro(String filtro) {

        String sql = "SELECT codigo, nombre, iso "
                + "FROM public.ciudades "
                + "WHERE (nombre LIKE '%"+filtro+"%') "
                + "or (iso LIKE '%"+filtro+"%')"
                + "ORDER BY nombre;";
        
        List<Ciudad> lista = new ArrayList<>();
        
        System.out.println("SQL = " + sql);

        ConexionManager.conectar();
        
        Ciudad ciudad = null;
        
        ResultSet rs;
        
        try {
            rs = ConexionManager.st.executeQuery(sql);
            
            System.out.println("Ejecutando: "+sql);

            
            while (rs.next()) {
                
                ciudad = new Ciudad();
                
                ciudad.setCodigo(rs.getInt("codigo"));
                ciudad.setNombre(rs.getString("nombre"));
                ciudad.setIso(rs.getString("iso"));

                lista.add(ciudad);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar "+ex);
        }
        ConexionManager.desconectar();
        
        return lista;
    }

}
