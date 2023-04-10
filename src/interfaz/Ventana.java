package interfaz;

import clases.CrudPersona;
import clases.Persona;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        this.getContentPane().setBackground(Color.lightGray);   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblregistro = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        lblid = new javax.swing.JLabel();
        lblapellido = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        lblcedula = new javax.swing.JLabel();
        lbldireccion = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btnlistar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblregistro.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        lblregistro.setText("Registro de personas");

        lblnombre.setText("Nombres:");

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        txtid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidKeyTyped(evt);
            }
        });

        lblid.setText("ID:");

        lblapellido.setText("Apellidos:");

        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });

        lblcedula.setText("Cédula:");

        lbldireccion.setText("Dirección:");

        lbltelefono.setText("Teléfono:");

        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcedulaKeyTyped(evt);
            }
        });

        txtdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdireccionKeyTyped(evt);
            }
        });

        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btnlistar.setText("Listar");
        btnlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistarActionPerformed(evt);
            }
        });

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblnombre)
                            .addComponent(lblid)
                            .addComponent(lblapellido)
                            .addComponent(lblcedula)
                            .addComponent(lbldireccion)
                            .addComponent(lbltelefono))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtid, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(txtnombre)
                            .addComponent(txtapellido)
                            .addComponent(txtcedula)
                            .addComponent(txtdireccion)
                            .addComponent(txttelefono))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnagregar)
                                .addComponent(btneliminar))
                            .addComponent(btnlistar))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnbuscar)
                            .addComponent(btnactualizar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnsalir)
                                .addComponent(btnnuevo))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(lblregistro)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblid)
                    .addComponent(btnagregar)
                    .addComponent(btnactualizar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblnombre)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblapellido)
                            .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcedula)
                            .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbldireccion)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btneliminar)
                            .addComponent(btnbuscar))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnlistar)
                            .addComponent(btnnuevo))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltelefono)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnsalir)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void limpiarCajas(){
        txtid.setText("");
        txtnombre.setText("");
        txtapellido.setText("");
        txtcedula.setText("");
        txtdireccion.setText("");
        txttelefono.setText("");
    }
    
    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        if (!valida()) {
            int id = Integer.parseInt(txtid.getText());
            String nombres = txtnombre.getText();
            String apellidos = txtapellido.getText();
            int cedula = Integer.parseInt(txtcedula.getText());
            String direccion = txtdireccion.getText();
            int telefono = Integer.parseInt(txttelefono.getText());

            Persona p = new Persona(id, nombres, apellidos, cedula, direccion, telefono);
            CrudPersona cp = new CrudPersona();
            String mensaje = cp.guardarNuevo(p);
            JOptionPane.showMessageDialog(this, mensaje);
            
            limpiarCajas();
        } else {
            JOptionPane.showMessageDialog(null, "Llene todos los datos");
        }

    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistarActionPerformed
        Listado listar = new Listado();
        CrudPersona crudPer = new CrudPersona();
        listar.cargardatos(crudPer.getLista());
        listar.setVisible(true);
    }//GEN-LAST:event_btnlistarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        limpiarCajas();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo"));

        try {
            limpiarCajas();
            CrudPersona crudPe = new CrudPersona();
            Persona per = crudPe.Buscarxid(id);

            if (per.getNombres() == null) {
                JOptionPane.showMessageDialog(this, "Registro no encontrado...");
                return;
            }

            txtid.setText(String.valueOf(per.getId()));
            txtnombre.setText(per.getNombres());
            txtapellido.setText(per.getApellidos());
            txtcedula.setText(String.valueOf(per.getCedula()));
            txtdireccion.setText(per.getDireccion());
            txttelefono.setText(String.valueOf(per.getTelefono()));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Registro no encontrado...");
            limpiarCajas();
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        int id = Integer.parseInt(txtid.getText());
        String nombres = txtnombre.getText();
        String apellidos = txtapellido.getText();
        int cedula = Integer.parseInt(txtcedula.getText());
        String direccion = txtdireccion.getText();
        int telefono = Integer.parseInt(txttelefono.getText());

        Persona dtoPersona = new Persona(id, nombres, apellidos, cedula, direccion, telefono);
        CrudPersona crudPer = new CrudPersona();

        String mensaje = crudPer.Actualizar(dtoPersona);
        JOptionPane.showMessageDialog(this, mensaje);
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        CrudPersona crudPer = new CrudPersona();
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del alumno a eliminar"));
        int confirm =  JOptionPane.showConfirmDialog(this, "Seguro que desea eliminar el registro?");
        if(confirm == 0)
            JOptionPane.showMessageDialog(this, crudPer.Eliminarxcodigo(id));
    }//GEN-LAST:event_btneliminarActionPerformed

    private void txtidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car < ',' || car > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtidKeyTyped

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car < ',' || car > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtcedulaKeyTyped

    private void txtdireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtdireccionKeyTyped

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car < ',' || car > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed
    
    private boolean valida() {
        boolean vacio = false;
        if (txtid.getText().equals("")) {
            vacio = true;
        } else if (txtnombre.getText().equals("")) {
            vacio = true;
        } else if (txtapellido.getText().equals("")) {
            vacio = true;
        } else if (txtcedula.getText().equals("")) {
            vacio = true;
        } else if (txtdireccion.getText().equals("")) {
            vacio = true;
        }
        if (txttelefono.getText().equals("")) {
            vacio = true;
        }
        return vacio;
    }

    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnlistar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel lblapellido;
    private javax.swing.JLabel lblcedula;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblregistro;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
