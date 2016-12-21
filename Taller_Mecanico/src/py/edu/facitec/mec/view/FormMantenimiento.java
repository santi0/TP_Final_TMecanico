


package py.edu.facitec.mec.view;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import py.edu.facitec.mec.dao.MantenimientoDao;
import py.edu.facitec.mec.dao.MantenimientoDaoImpl;
import py.edu.facitec.mec.model.Cliente;
import py.edu.facitec.mec.model.Mantenimiento;


 
public class FormMantenimiento extends javax.swing.JFrame {

    private MantenimientoDao mantenimientoDao;
    
    
    public FormMantenimiento() {
        initComponents();
        mantenimientoDao= new MantenimientoDaoImpl();
    }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfFecha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfCondicion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfImporte = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfObservacion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfSituacion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulario Mantenimientos");
        setAlwaysOnTop(true);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Codigo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 76, 59, -1));
        getContentPane().add(tfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 67, 160, 30));

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 204));
        btnBuscar.setText("Consultar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 121, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Fecha:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 47, -1));
        getContentPane().add(tfFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 103, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Condicion:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 84, -1));
        getContentPane().add(tfCondicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 371, 28));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Importe Total:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 85, -1));
        getContentPane().add(tfImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 246, 28));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Observacion:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));
        getContentPane().add(tfObservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 371, 31));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Situacion:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 85, -1));
        getContentPane().add(tfSituacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 246, 31));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 204));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 98, 31));

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 0, 204));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 102, 31));

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 0, 204));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 100, 31));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 99, 31));

        btnCerrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(0, 0, 204));
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 116, 31));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 0));
        jLabel8.setText("DD/MM/AAAA");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 92, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        consultar(Integer.parseInt(tfCodigo.getText()));
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        insertar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        eliminar(Integer.parseInt(tfCodigo.getText()));
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        modificar();
    }//GEN-LAST:event_btnModificarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMantenimiento().setVisible(true);
            }
        });
    }
    private String[] columnas = new String[]{"ID","NOMBRE","APELLIDO","DIRECCION","CELULAR"};
    private List<Cliente> listaClientes = new ArrayList<>();
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfCondicion;
    private javax.swing.JTextField tfFecha;
    private javax.swing.JTextField tfImporte;
    private javax.swing.JTextField tfObservacion;
    private javax.swing.JTextField tfSituacion;
    // End of variables declaration//GEN-END:variables

    private void insertar() {
        Mantenimiento mant = new Mantenimiento();
       
        mant.setFecha((tfFecha.getText()));
        mant.setCliente_codigo(Integer.parseInt(tfCodigo.getText()));
        mant.setCondicion(tfCondicion.getText());
        mant.setImporte_total(Double.valueOf(tfImporte.getText()));
        mant.setObservacion(tfObservacion.getText());
        mant.setSituacion(tfSituacion.getText());
        
        mantenimientoDao.guardar(mant);
        JOptionPane.showMessageDialog(this, "Se inserto el mantenimiento con exito", "Aviso", 1);
        limpiar();
    }
    private void limpiar(){
        tfCodigo.setText("");
        tfFecha.setText("");
        tfCodigo.setText("");
        tfCondicion.setText("");
        tfImporte.setText("");
        tfObservacion.setText("");
        tfSituacion.setText("");
    }

    private void consultar(int codigo) {
       if(codigo != 0){
           Mantenimiento mant= mantenimientoDao.recuperarPorCodigo(codigo);
           
           if(mant != null){
               tfFecha.setText((mant.getFecha()));
               tfCodigo.setText(String.valueOf(mant.getCliente_codigo()));
               tfCondicion.setText(mant.getCondicion());
               tfImporte.setText(String.valueOf(mant.getImporte_total()));
               tfObservacion.setText(mant.getObservacion());
               tfSituacion.setText(mant.getSituacion());
               
           } else{
           JOptionPane.showMessageDialog(this, "No existe mantenimiento con este codigo!","Aviso",1);
           }
       }else{
          JOptionPane.showMessageDialog(this, "Debes digitar un numero!","Aviso",2); 
       }    
    }

    private void eliminar(int codigo) {
         int opcion= JOptionPane.showConfirmDialog(this, "Estas seguro que quieres eliminar..?","Aviso", JOptionPane.YES_NO_OPTION);
        if (opcion==JOptionPane.YES_OPTION){
            mantenimientoDao.anular(Integer.parseInt(tfCodigo.getText()));
           
            JOptionPane.showMessageDialog(this, "Cliente se ha borrado con exito", "Aviso", 1);
             limpiar();
        }
    }
    private void modificar(){
        Mantenimiento mant= new Mantenimiento();
        mant.setCodigo(Integer.parseInt(tfCodigo.getText()));
        mant.setFecha((tfFecha.getText()));
        mant.setCondicion(tfCondicion.getText());
        mant.setImporte_total(Double.parseDouble(tfImporte.getText()));
        mant.setObservacion(tfObservacion.getText());
        mant.setSituacion(tfSituacion.getText());
        
        mantenimientoDao.modificar(mant);
        JOptionPane.showMessageDialog(this, "Mantenimiento se ha actualizado con exito", "Aviso", 1);
        limpiar();
    }
    
  
   
    
     
}
