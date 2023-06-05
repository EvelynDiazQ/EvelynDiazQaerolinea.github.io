package Vista;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class consultarReserva extends javax.swing.JInternalFrame {

    public static Integer value;
    public static Integer value2;
    public int Resultado;

    public consultarReserva() {
        initComponents();
        setIconifiable(true);
        setClosable(true);
        btnSiguiente.setEnabled(false);
        this.setLocation(200, 10);
        idavuelta.setSelected(true);
        cbxPaises();

    }

    void cbxPaises() {//Metodo para extraer datos de una tabla a un jcombobox
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion con = new Conexion();
        Connection cnn = con.getConexion();
        try {

            String sql = "select * from aeropuerto";
            ps = cnn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                txtDestino.addItem(rs.getString("Ciudad") + ", " + rs.getString("Pais"));
                txtOrigen.addItem(rs.getString("Ciudad") + ", " + rs.getString("Pais"));
            }
            rs.close();

        } catch (Exception a) {
            System.out.println("Incorrecto");
        }

    }

    public String CODIGO() {
        String sql;
        String origen = txtOrigen.getSelectedItem().toString();
        String destino = txtDestino.getSelectedItem().toString();

        //Condicion para que me muestre destino y origen con todas las fechas esta bien
        if (((JTextField) jdateFechaVuelta.getDateEditor().getUiComponent()).getText().isEmpty() && ((JTextField) jdateFechaIda.getDateEditor().getUiComponent()).getText().isEmpty()) {
            sql = "select Id_vuelos,numVuelo,ciudadOrigen,ciudadDestino,Aeropuerto,FechaO,HoraIda,FechaV,HoraVuelta,codigoAvion,Precio from vuelos WHERE ciudadOrigen = '"
                    + origen + "' and ciudadDestino = '" + destino + "' ";
            jchexboxFechas.setSelected(true);
            FechaNoDecida();
            return sql;
        }
        //Condicion para que me muestre origen y destino SOLO IDA
        if (((JTextField) jdateFechaVuelta.getDateEditor().getUiComponent()).getText().isEmpty()) {

            Date date = jdateFechaIda.getDate();
            long d = date.getTime();
            java.sql.Date ida = new java.sql.Date(d);

            sql = " select Id_vuelos,numVuelo,ciudadOrigen,ciudadDestino,Aeropuerto,FechaO,HoraIda,FechaV,HoraVuelta,codigoAvion,Precio from vuelos WHERE ciudadOrigen ='"
                    + origen + "' and ciudadDestino ='" + destino + "' and FechaO = '" + ida + "'  and FechaV is " + null;
            return sql;
            //else que me retorna todos los vuelos del origen y destino seleccionado
        } else {
            Date date = jdateFechaIda.getDate();
            long d = date.getTime();
            java.sql.Date ida = new java.sql.Date(d);

            Date date2 = jdateFechaVuelta.getDate();
            long da = date2.getTime();
            java.sql.Date venida = new java.sql.Date(da);

            sql = " select Id_vuelos,numVuelo,ciudadOrigen,ciudadDestino,Aeropuerto,FechaO,HoraIda,FechaV,HoraVuelta,codigoAvion,Precio from vuelos WHERE ciudadOrigen ='"
                    + origen + "' and ciudadDestino ='" + destino + "' and FechaO = '" + ida + "' and FechaV= '" + venida + "'";

            return sql;
        }
    }

    void consultar() {
        try {

            //poder consultar con fechas en null
            String origen = txtOrigen.getSelectedItem().toString();
            String destino = txtDestino.getSelectedItem().toString();

            DefaultTableModel modelo = new DefaultTableModel();
            jtablaAviones.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion con = new Conexion();
            Connection cnn = con.getConexion();

            System.out.println(CODIGO());
            ps = cnn.prepareStatement(CODIGO());
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("Codigo");
            modelo.addColumn("Origen");
            modelo.addColumn("Destino");
            modelo.addColumn("Aeropuerto");
            modelo.addColumn("IDA");
            modelo.addColumn("Hora");
            modelo.addColumn("Vuelta");
            modelo.addColumn("Hora");
            modelo.addColumn("Avion");
            modelo.addColumn("Precio");

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);

            }

            if (jtablaAviones.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Puede que no haya lugar en los vuelos o que no haya vuelos en esos días.\n"
                        + "\n"
                        + "Lamentablemente no encontramos alternativas disponibles para este destino. Prueba con aeropuertos cercanos u otro destino.", "¡Ups! No encontramos vuelos a " + destino, JOptionPane.INFORMATION_MESSAGE);

            }

            if (jtablaAviones.getRowCount() == 1) {
                jltotal.setText(jtablaAviones.getRowCount() + " Vuelo de " + origen + " a " + destino);
            } else {
                jltotal.setText(jtablaAviones.getRowCount() + " Vuelos de " + origen + " a " + destino);
            }

        } catch (Exception ad) {
            JOptionPane.showMessageDialog(null, "Error: " + ad);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtablaAviones = new javax.swing.JTable();
        btnSiguiente = new javax.swing.JButton();
        jltotal = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idavuelta = new javax.swing.JRadioButton();
        soloida = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jdateFechaIda = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jdateFechaVuelta = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        menores = new javax.swing.JSpinner();
        adultos = new javax.swing.JSpinner();
        cbxClase = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jchexboxFechas = new javax.swing.JCheckBox();
        txtDestino = new javax.swing.JComboBox<>();
        txtOrigen = new javax.swing.JComboBox<>();

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de Vuelos"));

        jtablaAviones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtablaAviones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablaAvionesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtablaAviones);

        btnSiguiente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn siguiente.png"))); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        jltotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jltotal.setText("Total de vuelos: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSiguiente)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jltotal, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 55, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Vuelos con reserva flexible");

        btnGroup.add(idavuelta);
        idavuelta.setText("Ida y vuelta");
        idavuelta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idavueltaActionPerformed(evt);
            }
        });

        btnGroup.add(soloida);
        soloida.setText("Solo ida");
        soloida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soloidaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Origen");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Destino");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Fecha de ida");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Fecha de vuelta");

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Pasajeros y Clase"));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Adultos");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Menores");

        adultos.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));

        cbxClase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economica", "Premiun Economica", "Premiun Bussines" }));

        jLabel10.setText("Mayores de 18 años");

        jLabel12.setText("Menores de 18 años");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(8, 8, 8)
                        .addComponent(adultos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(menores, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(cbxClase, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(menores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(adultos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addComponent(cbxClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)))
                .addContainerGap())
        );

        btnConsultar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Buscar.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Encuentra pasajes aéreos con la posibilidad de cambiar las fechas de vuelo.");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/destino.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/origin-icon1.png"))); // NOI18N

        jchexboxFechas.setText("Todavía no he decidido la fecha");
        jchexboxFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchexboxFechasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jdateFechaIda, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jdateFechaVuelta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addComponent(jchexboxFechas)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(idavuelta)
                                .addGap(18, 18, 18)
                                .addComponent(soloida, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(btnConsultar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idavuelta)
                    .addComponent(soloida))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jdateFechaVuelta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jdateFechaIda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jchexboxFechas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConsultar)
                        .addGap(30, 30, 30))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtablaAvionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablaAvionesMouseClicked
        btnSiguiente.setEnabled(true);
    }//GEN-LAST:event_jtablaAvionesMouseClicked

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String origen = txtOrigen.getSelectedItem().toString();
        String destino = txtDestino.getSelectedItem().toString();
        if (origen.equals("")) {

            JOptionPane.showMessageDialog(null, "Seleccione un origen, por favor", "Mensaje", JOptionPane.WARNING_MESSAGE);
        } else if (destino.equals("")) {

            JOptionPane.showMessageDialog(null, "Seleccione un destino, por favor", "Mensaje", JOptionPane.WARNING_MESSAGE);
        } else {
            consultar();
        }

    }//GEN-LAST:event_btnConsultarActionPerformed

    private void soloidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soloidaActionPerformed

        jdateFechaVuelta.setEnabled(false);
        ((JTextField) jdateFechaVuelta.getDateEditor().getUiComponent()).setText("");

    }//GEN-LAST:event_soloidaActionPerformed

    private void idavueltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idavueltaActionPerformed
        jdateFechaVuelta.setEnabled(true);

    }//GEN-LAST:event_idavueltaActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed

        dispose();
        ConfirmarReserva confirmar = new ConfirmarReserva();
        MenuPrincipal.Escritorio.add(confirmar);
        confirmar.toFront();
        confirmar.setVisible(true);

        int fila__seleccionada = jtablaAviones.getSelectedRow();
        String Origen;
        String Destino;
        String nombreAeropuerto;
        String precio;
        Date Fecha_Ida;
        Date Fecha_Vuelta;
        String Avion;
        String Clase;
        int id_vuelo;

        Origen = (jtablaAviones.getValueAt(fila__seleccionada, 2).toString());
        Destino = (jtablaAviones.getValueAt(fila__seleccionada, 3).toString());
        nombreAeropuerto = (jtablaAviones.getValueAt(fila__seleccionada, 4).toString());
        Fecha_Ida = ((Date) jtablaAviones.getValueAt(fila__seleccionada, 5));
        Fecha_Vuelta = ((Date) jtablaAviones.getValueAt(fila__seleccionada, 7));
        Avion = (jtablaAviones.getValueAt(fila__seleccionada, 9).toString());
        precio = (jtablaAviones.getValueAt(fila__seleccionada, 10).toString());

        id_vuelo = ((int) jtablaAviones.getValueAt(fila__seleccionada, 0));
        value = (Integer) adultos.getValue();
        value2 = (Integer) menores.getValue();
        Resultado = value + value2;
        if (Resultado == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione al menos un pasajero, por favor", "Mensaje", JOptionPane.WARNING_MESSAGE);
        } else {

            confirmar.txtCantidadR.setText(Integer.toString(Resultado));
            confirmar.txtOrigenR.setText(Origen);
            confirmar.txtDestinoR.setText(Destino);
            confirmar.txtAeropuertoR.setText(nombreAeropuerto);
            confirmar.txtClase.setText(cbxClase.getSelectedItem().toString());

            confirmar.txtFechaIda.setDate(Fecha_Ida);
            confirmar.txtFechaVenida.setDate(Fecha_Vuelta);

            confirmar.txtPrecio.setText(precio);
            confirmar.txtAvion.setText(Avion);
            confirmar.txtTotal.setText(precio);
            confirmar.txtIDvuelo.setText(String.valueOf(id_vuelo));
            confirmar.txtIDUsuario.setText(MenuPrincipal.idpersona.getText());
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    void FechaNoDecida() {
        jdateFechaVuelta.setEnabled(false);
        jdateFechaIda.setEnabled(false);
    }

    private void jchexboxFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchexboxFechasActionPerformed
        ((JTextField) jdateFechaVuelta.getDateEditor().getUiComponent()).setText("");
        ((JTextField) jdateFechaIda.getDateEditor().getUiComponent()).setText("");
        FechaNoDecida();
        if (!jchexboxFechas.isSelected()) {
            jdateFechaVuelta.setEnabled(true);
            jdateFechaIda.setEnabled(true);
            adultos.setEnabled(true);
            menores.setEnabled(true);
            cbxClase.setEnabled(true);
        }
        if (soloida.isSelected()) {
            jdateFechaVuelta.setEnabled(false);

        }

    }//GEN-LAST:event_jchexboxFechasActionPerformed

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
            java.util.logging.Logger.getLogger(consultarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consultarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consultarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consultarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consultarReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner adultos;
    private javax.swing.JButton btnConsultar;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox<String> cbxClase;
    private javax.swing.JRadioButton idavuelta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox jchexboxFechas;
    private com.toedter.calendar.JDateChooser jdateFechaIda;
    private com.toedter.calendar.JDateChooser jdateFechaVuelta;
    private javax.swing.JLabel jltotal;
    public javax.swing.JTable jtablaAviones;
    private javax.swing.JSpinner menores;
    private javax.swing.JRadioButton soloida;
    private javax.swing.JComboBox<String> txtDestino;
    private javax.swing.JComboBox<String> txtOrigen;
    // End of variables declaration//GEN-END:variables

}
