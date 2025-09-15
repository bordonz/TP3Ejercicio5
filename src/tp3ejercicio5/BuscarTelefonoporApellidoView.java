/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3ejercicio5;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class BuscarTelefonoporApellidoView extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();

    public BuscarTelefonoporApellidoView() {
        initComponents();
        llenarListaApellido();
        ArmarCabecera();
    }

    public void ArmarCabecera() {
        modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Direccion");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Telefono");
        tablaCliente.setModel(modelo);
    }

    public void llenarListaApellido() {
        DefaultListModel<String> modelo = new DefaultListModel<>();
        Set<String> apellidosUnicos = new HashSet<>();

        for (Contacto contacto : Panel_tp5_ej1.directorio.getContactos().values()) {
            apellidosUnicos.add(contacto.getApellido());
        }

        for (String apellido : apellidosUnicos) {
            modelo.addElement(apellido);
        }

        listaApellido.setModel(modelo);

    }

    public void filtrarListaApellidos(String filtro) {
        DefaultListModel<String> modelo = new DefaultListModel<>();
        Set<String> apellidosUnicos = new HashSet<>();

        for (Contacto contacto : Panel_tp5_ej1.directorio.getContactos().values()) {
            String apellido = contacto.getApellido();
            if (apellido.toLowerCase().contains(filtro.toLowerCase()) && !apellidosUnicos.contains(contacto.getApellido())) {
                apellidosUnicos.add(contacto.getApellido());
                modelo.addElement(contacto.getApellido());
            }

        }

        listaApellido.setModel(modelo);

    }

    public void cargarDatosEnTabla(String apellidoSeleccionado) {
        DefaultTableModel model = (DefaultTableModel) tablaCliente.getModel();
        model.setRowCount(0);

        for (Map.Entry<Long, Contacto> aux : Panel_tp5_ej1.directorio.getContactos().entrySet()) {
            Contacto c = aux.getValue();

            if (c.getApellido().equals(apellidoSeleccionado)) {
                Object[] fila = {c.getDni(), c.getApellido(), c.getNombre(), c.getDireccion(), c.getCiudad(), aux.getKey()};
                model.addRow(fila);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBuscarTelPorApellido = new javax.swing.JPanel();
        jlbBuscarTelPorApellido = new javax.swing.JLabel();
        jlbApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaApellido = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();

        jpBuscarTelPorApellido.setBackground(java.awt.Color.lightGray);
        jpBuscarTelPorApellido.setForeground(java.awt.Color.black);

        jlbBuscarTelPorApellido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlbBuscarTelPorApellido.setForeground(new java.awt.Color(0, 0, 0));
        jlbBuscarTelPorApellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbBuscarTelPorApellido.setText("Buscar Teléfono Por Apellido");

        jlbApellido.setBackground(java.awt.Color.lightGray);
        jlbApellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbApellido.setForeground(java.awt.Color.black);
        jlbApellido.setText("Apellido:");

        txtApellido.setBackground(java.awt.Color.white);
        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoKeyReleased(evt);
            }
        });

        listaApellido.setBackground(java.awt.Color.white);
        listaApellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        listaApellido.setForeground(java.awt.Color.black);
        listaApellido.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaApellidoValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaApellido);

        tablaCliente.setBackground(java.awt.Color.white);
        tablaCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablaCliente.setForeground(java.awt.Color.black);
        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Apellido", "Nombre", "Dirección", "Cuidad", "Teléfono"
            }
        ));
        jScrollPane1.setViewportView(tablaCliente);

        btnSalir.setBackground(java.awt.Color.lightGray);
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setForeground(java.awt.Color.black);
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBuscarTelPorApellidoLayout = new javax.swing.GroupLayout(jpBuscarTelPorApellido);
        jpBuscarTelPorApellido.setLayout(jpBuscarTelPorApellidoLayout);
        jpBuscarTelPorApellidoLayout.setHorizontalGroup(
            jpBuscarTelPorApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBuscarTelPorApellidoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbBuscarTelPorApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219))
            .addGroup(jpBuscarTelPorApellidoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jpBuscarTelPorApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir)
                    .addGroup(jpBuscarTelPorApellidoLayout.createSequentialGroup()
                        .addComponent(jlbApellido)
                        .addGap(18, 18, 18)
                        .addGroup(jpBuscarTelPorApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jpBuscarTelPorApellidoLayout.setVerticalGroup(
            jpBuscarTelPorApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBuscarTelPorApellidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbBuscarTelPorApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jpBuscarTelPorApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBuscarTelPorApellidoLayout.createSequentialGroup()
                        .addGroup(jpBuscarTelPorApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbApellido)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBuscarTelPorApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpBuscarTelPorApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void listaApellidoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaApellidoValueChanged
        if (!evt.getValueIsAdjusting()) {
            String apellidoSeleccionado = listaApellido.getSelectedValue();
            if (apellidoSeleccionado != null) {
                txtApellido.setText(String.valueOf(apellidoSeleccionado));
                cargarDatosEnTabla(apellidoSeleccionado);
            }
        }
    }//GEN-LAST:event_listaApellidoValueChanged

    private void txtApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyReleased
        String filtro = txtApellido.getText().trim();
        filtrarListaApellidos(filtro);
    }//GEN-LAST:event_txtApellidoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlbApellido;
    private javax.swing.JLabel jlbBuscarTelPorApellido;
    private javax.swing.JPanel jpBuscarTelPorApellido;
    private javax.swing.JList<String> listaApellido;
    private javax.swing.JTable tablaCliente;
    private javax.swing.JTextField txtApellido;
    // End of variables declaration//GEN-END:variables
}
