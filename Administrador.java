package Vista;

import Dao.AdministradorDaoImpl;
import Idao.IAdministradorDao;
import Modelo.modeloAdministrador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Administrador extends javax.swing.JInternalFrame implements ActionListener {

    modeloAdministrador u = new modeloAdministrador();
    IAdministradorDao du = new AdministradorDaoImpl();

    public Administrador() {
        initComponents();
        setIconifiable(true);
        setClosable(true);
        consultar();
        btnGuardar.addActionListener(this);
        btnNuevo.addActionListener(this);
        btnCancelar.addActionListener(this);
        btnEliminar.addActionListener(this);
        btnModificar.addActionListener(this);
        btnCancelar.addActionListener(this);
        btnBuscar.addActionListener(this);
        Habilitar();
        Inhabilitar();

    }

    void Habilitar() {
        btnGuardar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnModificar.setEnabled(true);
        btnCancelar.setEnabled(true);
        txtNombres.setEnabled(true);
        txtApellidos.setEnabled(true);
        cbxDocumento.setEnabled(true);
        txtNumDocumento.setEnabled(true);
        spnEdad.setEnabled(true);
        comboSexo.setEnabled(true);
        txtEmail.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtPassword.setEnabled(true);
        cbxEstado.setEnabled(true);
        btnBuscar.setEnabled(true);
        txtBuscar.setEnabled(true);
        Limpiar();
    }

    void Inhabilitar() {
        btnGuardar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
        btnCancelar.setEnabled(false);
        txtNombres.setEnabled(false);
        txtApellidos.setEnabled(false);
        cbxDocumento.setEnabled(false);
        txtNumDocumento.setEnabled(false);
        spnEdad.setEnabled(false);
        comboSexo.setEnabled(false);
        txtEmail.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtPassword.setEnabled(false);
        cbxEstado.setEnabled(false);
        btnBuscar.setEnabled(false);
        txtBuscar.setEnabled(false);
        Limpiar();
    }

    void Limpiar() {
        txtidUsuarios.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        cbxDocumento.setSelectedIndex(0);
        txtNumDocumento.setText("");
        comboSexo.setSelectedIndex(0);
        txtEmail.setText("");
        txtDireccion.setText("");
        txtPassword.setText("");
        cbxEstado.setSelectedIndex(0);
        consultar();
    }

    void consultar() {
        jtablaAdministradores.setModel(du.read(txtBuscar.getText()));
        jlbTotal.setText("Total de Registros: " + jtablaAdministradores.getRowCount());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtablaAdministradores = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jlbTotal = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtidUsuarios = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtNumDocumento = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        cbxDocumento = new javax.swing.JComboBox<>();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        spnEdad = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cbxEstado = new javax.swing.JComboBox<>();
        txtPassword = new javax.swing.JPasswordField();
        txtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comboSexo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Administradores");

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de Administradores"));

        jtablaAdministradores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtablaAdministradores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablaAdministradoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtablaAdministradores);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Modificar.png"))); // NOI18N
        btnModificar.setText("Modificar");

        jlbTotal.setText("Total de Registros:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar)
                                .addGap(47, 47, 47)
                                .addComponent(btnModificar)))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jlbTotal)
                        .addGap(103, 103, 103))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jlbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de Administradores"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 60, 20));

        jLabel3.setText("Apellidos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel4.setText("Tipo de Documento:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel5.setText("Numero de documento");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel6.setText("Edad:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel7.setText("Sexo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        txtidUsuarios.setEnabled(false);
        jPanel1.add(txtidUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 131, -1));

        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 260, -1));

        txtNumDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumDocumentoKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 260, -1));

        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 260, -1));

        cbxDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "DNI", "LM", "CE", "Otros" }));
        jPanel1.add(cbxDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 260, -1));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Nuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, -1, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, -1, -1));

        spnEdad.setModel(new javax.swing.SpinnerNumberModel(18, 18, 49, 1));
        jPanel1.add(spnEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 150, -1));

        jLabel10.setText("Direccion:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 260, -1));

        jLabel14.setText("Contraseña:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        jLabel15.setText("Estado:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, 20));

        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "A", "I" }));
        jPanel1.add(cbxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 260, 30));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 260, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 260, -1));

        jLabel8.setText("Email:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jLabel9.setText("Nombres");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        comboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Masculino", "Femenino", "Otro" }));
        jPanel1.add(comboSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 260, -1));

        jLabel11.setText(" + 18 años");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 266, 100, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int filas;
    private void jtablaAdministradoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablaAdministradoresMouseClicked
        // TODO add your handling code here:
        int fila__seleccionada = jtablaAdministradores.getSelectedRow();
        txtidUsuarios.setText(jtablaAdministradores.getValueAt(fila__seleccionada, 0).toString());
        txtNombres.setText(jtablaAdministradores.getValueAt(fila__seleccionada, 1).toString());
        txtApellidos.setText(jtablaAdministradores.getValueAt(fila__seleccionada, 2).toString());
        cbxDocumento.setSelectedItem(jtablaAdministradores.getValueAt(fila__seleccionada, 3).toString());
        txtNumDocumento.setText(jtablaAdministradores.getValueAt(fila__seleccionada, 4).toString());
        spnEdad.setValue(Integer.parseInt((String) jtablaAdministradores.getValueAt(fila__seleccionada, 5)));
        comboSexo.setSelectedItem(jtablaAdministradores.getValueAt(fila__seleccionada, 6).toString());
        txtEmail.setText(jtablaAdministradores.getValueAt(fila__seleccionada, 7).toString());
        txtDireccion.setText(jtablaAdministradores.getValueAt(fila__seleccionada, 8).toString());

        txtPassword.setText(jtablaAdministradores.getValueAt(fila__seleccionada, 9).toString());
        cbxEstado.setSelectedItem(jtablaAdministradores.getValueAt(fila__seleccionada, 10).toString());

        filas = fila__seleccionada;
    }//GEN-LAST:event_jtablaAdministradoresMouseClicked

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped

        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(this, "Solo Ingrese Letras");
        }

        if (txtNombres.getText().length() >= 30) {
            evt.consume();
        }

    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(this, "Solo Ingrese Letras");
        }

        if (txtApellidos.getText().length() >= 30) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtNumDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumDocumentoKeyTyped

        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(this, "Solo Ingrese Numeros");
        }

        if (txtNumDocumento.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNumDocumentoKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbxDocumento;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JComboBox<String> comboSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlbTotal;
    private javax.swing.JTable jtablaAdministradores;
    private javax.swing.JSpinner spnEdad;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumDocumento;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtidUsuarios;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnGuardar) {

            if (txtNombres.getText().isEmpty()
                    || txtApellidos.getText().isEmpty()
                    || cbxDocumento.getSelectedItem() == "Seleccione"
                    || txtNumDocumento.getText().isEmpty()
                    || spnEdad.getValue() == "0"
                    || comboSexo.getSelectedItem() == "Seleccione"
                    || txtEmail.getText().isEmpty()
                    || txtDireccion.getText().isEmpty()
                    || txtPassword.getText().isEmpty()
                    || cbxEstado.getSelectedItem() == "Seleccione") {

                JOptionPane.showMessageDialog(this, "Campos Vacios");

            } else {
                u.setNombres(txtNombres.getText());
                u.setApellidos(txtApellidos.getText());
                u.setTipoDocumento(cbxDocumento.getSelectedItem().toString());
                u.setNumeroDocumento(txtNumDocumento.getText());
                u.setEdad(spnEdad.getValue().toString());
                u.setSexo(comboSexo.getSelectedItem().toString());
                u.setEmail(txtEmail.getText());
                u.setDireccion(txtDireccion.getText());
                u.setContraseña(txtPassword.getText());
                u.setEstado(cbxEstado.getSelectedItem().toString());
                du.create(u);
                Limpiar();
            }

        }
        if (e.getSource() == btnEliminar) {

            int Fila_Seleccionada = jtablaAdministradores.getSelectedRow();
            if (Fila_Seleccionada >= 0) {
                du.delete(Integer.parseInt(txtidUsuarios.getText()));
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una fila, por favor");
            }

        }
        if (e.getSource() == btnBuscar) {
            consultar();

        }
        if (e.getSource() == btnModificar) {

            int Fila_Seleccionada = jtablaAdministradores.getSelectedRow();
            if (Fila_Seleccionada >= 0) {

                if (txtNombres.getText().isEmpty()
                        || txtApellidos.getText().isEmpty()
                        || cbxDocumento.getSelectedItem() == "Seleccione"
                        || txtNumDocumento.getText().isEmpty()
                        || spnEdad.getValue() == "0"
                        || comboSexo.getSelectedItem() == "Seleccione"
                        || txtEmail.getText().isEmpty()
                        || txtDireccion.getText().isEmpty()
                        || txtPassword.getText().isEmpty()
                        || cbxEstado.getSelectedItem() == "Seleccione") {

                    JOptionPane.showMessageDialog(this, "Campos icompletos");

                } else {

                    u.setId_usuario(Integer.parseInt(txtidUsuarios.getText()));
                    u.setNombres(txtNombres.getText());
                    u.setApellidos(txtApellidos.getText());
                    u.setTipoDocumento(cbxDocumento.getSelectedItem().toString());
                    u.setNumeroDocumento(txtNumDocumento.getText());
                    u.setEdad(spnEdad.getValue().toString());
                    u.setSexo(comboSexo.getSelectedItem().toString());
                    u.setEmail(txtEmail.getText());
                    u.setDireccion(txtDireccion.getText());
                    u.setContraseña(txtPassword.getText());
                    u.setEstado(cbxEstado.getSelectedItem().toString());
                    du.update(u);
                    Limpiar();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una fila, por favor");

            }
        }
        if (e.getSource() == btnNuevo) {
            Habilitar();
        }
        if (e.getSource() == btnCancelar) {
            Inhabilitar();
        }
    }

}
