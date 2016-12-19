
package py.edu.facitec.mec.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import py.edu.facitec.mec.model.Mantenimiento;
import py.edu.facitec.mec.util.ConexionManager;

public class MantenimientoDaoImpl implements MantenimientoDao{

    public void guardar(Mantenimiento mant){
        String sql = "INSERT INTO public.mantenimiento"
                + "(fecha, cliente_codigo, condicion, importe_total, observacion, situacion) "
                + "VALUES ('"+mant.getFecha()+"', "+mant.getCliente_codigo()+", '"+mant.getCondicion()+"',"
                + " "+mant.getImporte_total()+", '"+mant.getObservacion()+"', '"+mant.getSituacion()+"');";

        ConexionManager.conectar();

        try {
            ConexionManager.st.execute(sql);
            System.out.println("Ejecutando: "+sql);

        } catch (SQLException ex) {

            Logger.getLogger(MantenimientoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar "+ ex);

        }

        ConexionManager.desconectar();
    }

    public Mantenimiento recuperarPorCodigo(int codigo) {
        
        String sql = "SELECT fecha, cliente_codigo, condicion, importe_total, observacion, situacion "
                + "FROM public.mantenimiento "
                + "WHERE codigo="+codigo+";";

        ConexionManager.conectar();
        
        Mantenimiento mant = null;
        
        ResultSet rs;
        
        try {
            rs = ConexionManager.st.executeQuery(sql);
            System.out.println("Ejecutando: "+sql);
            
            if (rs.next()) {
                mant = new Mantenimiento();
                mant.setFecha(rs.getDate("fecha"));
                mant.setCliente_codigo(rs.getInt("cliente_codigo"));
                mant.setCondicion(rs.getString("condicion"));
                mant.setImporte_total(rs.getDouble("importe_total"));
                mant.setObservacion(rs.getString("observacion"));
                mant.setSituacion(rs.getString("situacion"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MantenimientoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar SQL: "+ex);

        }
        ConexionManager.desconectar();
        return mant;
    }
    public void anular(int codigo) {
        String sql = "UPDATE public.mantenimiento SET situacion='Anulado' WHERE codigo="+codigo+";";
        
        System.out.println("SQL = "+sql);
        ConexionManager.conectar();

        try {
            ConexionManager.st.execute(sql);
            System.out.println("Ejecutando: "+sql);

        } catch (SQLException ex) {

            Logger.getLogger(MantenimientoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar "+ ex);

        }
        ConexionManager.desconectar();
    }
    public int obtenerMaximo() {
        int max = 0;
        String sql = "SELECT MAX (codigo) as codigo FROM public.mantenimiento";
        ConexionManager.conectar();
        try {
            ResultSet rs = ConexionManager.st.executeQuery(sql);
            if (rs.next()) {
                max = rs.getInt("codigo");
            }
            System.out.println("Ejecutando: "+sql);
        } catch (SQLException ex) {
            Logger.getLogger(MantenimientoDetDaoImp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar "+ex);
        }
        
        
        return max+1;
    }
    public List<Mantenimiento> reporteMantenimiento(String fecha1, String fecha2, int cod1, int cod2, String orden) {
        
    String sql = "SELECT mantenimiento.\"codigo\" AS mov, "
            + "mantenimiento.\"fecha\" AS fecha, "
            + "mantenimiento.\"cliente_codigo\" AS codigo, "
            + "clientes.\"nombres\" AS nombres, "
            + "clientes.\"apellidos\" AS apellidos,"
            + "mantenimiento.\"condicion\" AS condicion, "
            + "mantenimiento.\"importe_total\" AS total "
            + "FROM \"public\".\"clientes\" clientes INNER JOIN \"public\".\"mantenimiento\" mantenimiento ON clientes.\"codigo\" = mantenimiento.\"cliente_codigo\" "
            + "WHERE fecha BETWEEN '"+fecha1+"' AND '"+fecha2+"' AND "
            + "cliente_codigo BETWEEN "+cod1+" AND "+cod2+" "
            + "AND situacion = 'Activo' "
            + "ORDER BY "+orden+";";    

    List<Mantenimiento> lista = new ArrayList<>();
        
        
        Mantenimiento mant = null;
        
        ConexionManager.conectar();
        
        try {
            ResultSet rs = ConexionManager.st.executeQuery(sql);
            System.out.println("SQL "+sql);
            
            while(rs.next()) {
                mant = new Mantenimiento();
                mant.setCodigo(rs.getInt("mov"));
                mant.setFecha(rs.getDate("fecha"));
                mant.setCliente_codigo(rs.getInt("codigo"));
                mant.setCondicion(rs.getString("condicion"));
                mant.setImporte_total(rs.getDouble("total"));
                lista.add(mant);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ServicioDaoImp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar sql "+ex);
        }
        
        ConexionManager.desconectar();
        
        return lista;
    }

    @Override
    public void modificar(Mantenimiento mant) {
        String sql = "INSERT INTO public.mantenimiento"
                + "(fecha, cliente_codigo, condicion, importe_total, observacion, situacion) "
                + "VALUES ('"+mant.getFecha()+"', "+mant.getCliente_codigo()+", '"+mant.getCondicion()+"',"
                + " "+mant.getImporte_total()+", '"+mant.getObservacion()+"', '"+mant.getSituacion()+"');";

        ConexionManager.conectar();

        try {
            ConexionManager.st.execute(sql);
            System.out.println("Ejecutando: "+sql);

        } catch (SQLException ex) {

            Logger.getLogger(MantenimientoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar "+ ex);

        }

        ConexionManager.desconectar();
       
    }
}