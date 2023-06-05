package Vista;

import java.io.IOException;
import javax.swing.JOptionPane;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(this);
        Escritorio.setBorder(new ImagenFondo());
        setExtendedState(MenuPrincipal.MAXIMIZED_BOTH);
        setTitle("Sistema de reservas de vuelos - Aerolinea Airbender");
        idpersona.setVisible(false);
        idAdministrador.setVisible(false);
        nombresAdministrador.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        idpersona = new javax.swing.JLabel();
        idAdministrador = new javax.swing.JLabel();
        nombresAdministrador = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        itemSistema = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        itemCerrarSistema = new javax.swing.JMenuItem();
        itemArchivos = new javax.swing.JMenu();
        itemAviones = new javax.swing.JMenuItem();
        itemServicios = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        itemRegistro = new javax.swing.JMenu();
        itemVuelos = new javax.swing.JMenuItem();
        itemConsultas = new javax.swing.JMenu();
        itemReservar = new javax.swing.JMenuItem();
        itemMisreservas = new javax.swing.JMenuItem();
        itemPasajeros = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemAdministradores = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        itemCalculadora = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        itemAyudaAdmin = new javax.swing.JMenuItem();
        itemAyudaUsuario = new javax.swing.JMenuItem();
        ItemAcercaDe = new javax.swing.JMenu();
        ItemDesarrolladores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Escritorio.setBackground(new java.awt.Color(153, 153, 153));
        Escritorio.add(idpersona);
        idpersona.setBounds(30, 30, 0, 0);
        Escritorio.add(idAdministrador);
        idAdministrador.setBounds(30, 70, 0, 0);
        Escritorio.add(nombresAdministrador);
        nombresAdministrador.setBounds(30, 110, 0, 0);

        itemSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/system.png"))); // NOI18N
        itemSistema.setText("Sistema");
        itemSistema.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        menuBar.add(itemSistema);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Home-icon1.png"))); // NOI18N
        jMenu6.setText("Inicio");
        jMenu6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cerrar sesion.png"))); // NOI18N
        jMenuItem3.setText("Cerrar Sesion");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem3);

        itemCerrarSistema.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        itemCerrarSistema.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        itemCerrarSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SalirP2.png"))); // NOI18N
        itemCerrarSistema.setText("Cerrar el Sistema");
        itemCerrarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCerrarSistemaActionPerformed(evt);
            }
        });
        jMenu6.add(itemCerrarSistema);

        menuBar.add(jMenu6);

        itemArchivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Archivo.png"))); // NOI18N
        itemArchivos.setText("Archivos");
        itemArchivos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        itemAviones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        itemAviones.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        itemAviones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ReservaAvion.png"))); // NOI18N
        itemAviones.setText("Aviones");
        itemAviones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAvionesActionPerformed(evt);
            }
        });
        itemArchivos.add(itemAviones);

        itemServicios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        itemServicios.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        itemServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ServiciosM.png"))); // NOI18N
        itemServicios.setText("Servicios");
        itemServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemServiciosActionPerformed(evt);
            }
        });
        itemArchivos.add(itemServicios);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Aeropuerto.png"))); // NOI18N
        jMenuItem1.setText("Aeropuertos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        itemArchivos.add(jMenuItem1);

        menuBar.add(itemArchivos);

        itemRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reservaas.png"))); // NOI18N
        itemRegistro.setMnemonic('h');
        itemRegistro.setText("Registro de Vuelos");
        itemRegistro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        itemVuelos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        itemVuelos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        itemVuelos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vuelos.png"))); // NOI18N
        itemVuelos.setText("Vuelos");
        itemVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVuelosActionPerformed(evt);
            }
        });
        itemRegistro.add(itemVuelos);

        menuBar.add(itemRegistro);

        itemConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/consultar.png"))); // NOI18N
        itemConsultas.setText("Consultas");
        itemConsultas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        itemReservar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        itemReservar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        itemReservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reserva.png"))); // NOI18N
        itemReservar.setText("Reservar Vuelos");
        itemReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReservarActionPerformed(evt);
            }
        });
        itemConsultas.add(itemReservar);

        itemMisreservas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        itemMisreservas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        itemMisreservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mis reservas.png"))); // NOI18N
        itemMisreservas.setText("Mis Reservas");
        itemMisreservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMisreservasActionPerformed(evt);
            }
        });
        itemConsultas.add(itemMisreservas);

        itemPasajeros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        itemPasajeros.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        itemPasajeros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pasajeross.png"))); // NOI18N
        itemPasajeros.setText("Pasajeros");
        itemPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPasajerosActionPerformed(evt);
            }
        });
        itemConsultas.add(itemPasajeros);

        menuBar.add(itemConsultas);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/configuraciones.png"))); // NOI18N
        jMenu2.setText("Configuraciones");
        jMenu2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        itemAdministradores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        itemAdministradores.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        itemAdministradores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/usuarios.png"))); // NOI18N
        itemAdministradores.setText("Administradores");
        itemAdministradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAdministradoresActionPerformed(evt);
            }
        });
        jMenu2.add(itemAdministradores);

        menuBar.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Herramientas.png"))); // NOI18N
        jMenu3.setText("Herramientas");
        jMenu3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        itemCalculadora.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        itemCalculadora.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        itemCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/calculadora.png"))); // NOI18N
        itemCalculadora.setText("Calculadora");
        itemCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCalculadoraActionPerformed(evt);
            }
        });
        jMenu3.add(itemCalculadora);

        menuBar.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icono-Ayuda-directa-verde.png"))); // NOI18N
        jMenu4.setText("Ayuda");
        jMenu4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        itemAyudaAdmin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        itemAyudaAdmin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        itemAyudaAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ayuda2.png"))); // NOI18N
        itemAyudaAdmin.setText("Ayuda");
        itemAyudaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAyudaAdminActionPerformed(evt);
            }
        });
        jMenu4.add(itemAyudaAdmin);

        itemAyudaUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        itemAyudaUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        itemAyudaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ayuda2.png"))); // NOI18N
        itemAyudaUsuario.setText("Ayuda");
        itemAyudaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAyudaUsuarioActionPerformed(evt);
            }
        });
        jMenu4.add(itemAyudaUsuario);

        menuBar.add(jMenu4);

        ItemAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/informacion.png"))); // NOI18N
        ItemAcercaDe.setText("Acerca de..");
        ItemAcercaDe.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ItemAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemAcercaDeActionPerformed(evt);
            }
        });

        ItemDesarrolladores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        ItemDesarrolladores.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ItemDesarrolladores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/desarrolladores.png"))); // NOI18N
        ItemDesarrolladores.setText("Desarrolladores");
        ItemDesarrolladores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemDesarrolladoresActionPerformed(evt);
            }
        });
        ItemAcercaDe.add(ItemDesarrolladores);

        menuBar.add(ItemAcercaDe);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemAvionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAvionesActionPerformed
        Avion avion = new Avion();
        Escritorio.add(avion);
        avion.toFront();
        avion.setVisible(true);
    }//GEN-LAST:event_itemAvionesActionPerformed

    private void itemServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemServiciosActionPerformed
        Servicios servicios = new Servicios();
        Escritorio.add(servicios);
        servicios.toFront();
        servicios.setVisible(true);
    }//GEN-LAST:event_itemServiciosActionPerformed

    private void itemPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPasajerosActionPerformed
        Pasajeros p = new Pasajeros();
        Escritorio.add(p);
        p.toFront();
        p.setVisible(true);
    }//GEN-LAST:event_itemPasajerosActionPerformed

    private void itemAdministradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAdministradoresActionPerformed
        Administrador usuarios = new Administrador();
        Escritorio.add(usuarios);
        usuarios.toFront();
        usuarios.setVisible(true);
    }//GEN-LAST:event_itemAdministradoresActionPerformed

    private void itemCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCalculadoraActionPerformed
        try {
            Runtime rt = Runtime.getRuntime();
            Process p = rt.exec("calc");
            p.waitFor();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }//GEN-LAST:event_itemCalculadoraActionPerformed

    private void itemVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVuelosActionPerformed
        Vuelo vuelo = new Vuelo();
        Escritorio.add(vuelo);
        vuelo.toFront();
        vuelo.txtIdAdministrador.setText(idAdministrador.getText()); //setea en vuelos los label del menu
        vuelo.txtAdministrador.setText(nombresAdministrador.getText());
        vuelo.setVisible(true);
    }//GEN-LAST:event_itemVuelosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Aeropuerto aeropuerto = new Aeropuerto();
        Escritorio.add(aeropuerto);
        aeropuerto.toFront();
        aeropuerto.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void itemReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReservarActionPerformed
        consultarReserva reserva = new consultarReserva();
        Escritorio.add(reserva);
        reserva.toFront();
        reserva.setVisible(true);

    }//GEN-LAST:event_itemReservarActionPerformed

    private void itemCerrarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCerrarSistemaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemCerrarSistemaActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Login login = new Login();
        dispose();
        login.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void ItemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemAcercaDeActionPerformed

    }//GEN-LAST:event_ItemAcercaDeActionPerformed

    private void itemAyudaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAyudaAdminActionPerformed
        AyudaAdministrador ayudaA = new AyudaAdministrador();
        Escritorio.add(ayudaA);
        ayudaA.toFront();
        ayudaA.setVisible(true);
    }//GEN-LAST:event_itemAyudaAdminActionPerformed

    private void ItemDesarrolladoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemDesarrolladoresActionPerformed
        AcercaProyecto desarrolladores = new AcercaProyecto();
        Escritorio.add(desarrolladores);
        desarrolladores.toFront();
        desarrolladores.setVisible(true);
    }//GEN-LAST:event_ItemDesarrolladoresActionPerformed

    private void itemMisreservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMisreservasActionPerformed
        MisReservas reserva = new MisReservas();
        Escritorio.add(reserva);
        reserva.toFront();
        reserva.setVisible(true);

    }//GEN-LAST:event_itemMisreservasActionPerformed

    private void itemAyudaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAyudaUsuarioActionPerformed
        AyudaUsuario ayudaU = new AyudaUsuario();
        Escritorio.add(ayudaU);
        ayudaU.toFront();
        ayudaU.setVisible(true);
    }//GEN-LAST:event_itemAyudaUsuarioActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu ItemAcercaDe;
    private javax.swing.JMenuItem ItemDesarrolladores;
    public static javax.swing.JLabel idAdministrador;
    public static javax.swing.JLabel idpersona;
    public static javax.swing.JMenuItem itemAdministradores;
    public static javax.swing.JMenu itemArchivos;
    private javax.swing.JMenuItem itemAviones;
    public static javax.swing.JMenuItem itemAyudaAdmin;
    public static javax.swing.JMenuItem itemAyudaUsuario;
    private javax.swing.JMenuItem itemCalculadora;
    private javax.swing.JMenuItem itemCerrarSistema;
    public static javax.swing.JMenu itemConsultas;
    public static javax.swing.JMenuItem itemMisreservas;
    public static javax.swing.JMenuItem itemPasajeros;
    public static javax.swing.JMenu itemRegistro;
    public static javax.swing.JMenuItem itemReservar;
    private javax.swing.JMenuItem itemServicios;
    public static javax.swing.JMenu itemSistema;
    private javax.swing.JMenuItem itemVuelos;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuBar menuBar;
    public static javax.swing.JLabel nombresAdministrador;
    // End of variables declaration//GEN-END:variables

}
