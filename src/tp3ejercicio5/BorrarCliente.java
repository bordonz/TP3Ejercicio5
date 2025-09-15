/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3ejercicio5;

import java.awt.Component;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class BorrarCliente extends javax.swing.JInternalFrame {
//private DefaultTableModel modelo = new DefaultTableModel();

    public BorrarCliente() {
        initComponents();
        llenarListaDni();
//        ArmarCabecera();
    }

//   public void ArmarCabecera(){
//       modelo.addColumn("DNI");
//        modelo.addColumn("Apellido");
//         modelo.addColumn("Nombre");
//          modelo.addColumn("Direccion");
//           modelo.addColumn("Ciudad");
//            modelo.addColumn("Telefono");
//            tablaCliente.setModel(modelo);
//   }
    public void llenarListaDni() {
        DefaultListModel<Long> modelo = new DefaultListModel<>();
        Set<Long> dniUnicos = new HashSet<>();
        
        for (Contacto contacto : Panel_tp5_ej1.directorio.getContactos().values()) {
            if (!dniUnicos.contains(contacto.getDni())) {
                dniUnicos.add(contacto.getDni());
                modelo.addElement(contacto.getDni());
            }
        }
        
        listaDni.setModel(modelo);
    }
    
    public void filtrarListaDni(String filtro) {
        DefaultListModel<Long> modelo = new DefaultListModel<>();
        Set<Long> dniUnicos = new HashSet<>();
        
        for (Contacto contacto : Panel_tp5_ej1.directorio.getContactos().values()) {
            String dniS = String.valueOf(contacto.getDni());
            if (dniS.contains(filtro) && !dniUnicos.contains(contacto.getDni())) {
                dniUnicos.add(contacto.getDni());
                modelo.addElement(contacto.getDni());
            }
        }
        
        listaDni.setModel(modelo);
    }
    
    public void cargarDatosEnTabla(long dniSeleccionado) {
        DefaultTableModel model = (DefaultTableModel) tablaCliente.getModel();
        model.setRowCount(0);
        
        for (Map.Entry<Long, Contacto> entry : Panel_tp5_ej1.directorio.getContactos().entrySet()) {
            Contacto value = entry.getValue();
            
            if (value.getDni() == dniSeleccionado) {
                Object[] fila = {value.getDni(), value.getApellido(), value.getNombre(), value.getDireccion(), value.getCiudad(), entry.getKey()};
                model.addRow(fila);
            }
        }
    }
    
    public void limpiarCampos(JPanel panel) {
        for (Component c : panel.getComponents()) {
            if (c instanceof JTextField) {
                JTextField caja = (JTextField) c;
                caja.setText("");
            } else if (c instanceof JComboBox) {
                JComboBox combo = (JComboBox) c;
                combo.setSelectedItem(null);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBorrarCliente = new javax.swing.JPanel();
        jlbBorrarCliente = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jlbDni = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaDni = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        btnBorrarCliente = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        jpBorrarCliente.setBackground(java.awt.Color.lightGray);

        jlbBorrarCliente.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jlbBorrarCliente.setForeground(new java.awt.Color(0, 0, 0));
        jlbBorrarCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbBorrarCliente.setText("Borrar Cliente");

        txtDni.setBackground(java.awt.Color.white);
        txtDni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDni.setForeground(java.awt.Color.black);
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDniKeyReleased(evt);
            }
        });

        jlbDni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbDni.setForeground(java.awt.Color.black);
        jlbDni.setText("DNI:");

        listaDni.setBackground(java.awt.Color.white);
        listaDni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        listaDni.setForeground(java.awt.Color.black);
        listaDni.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaDniValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaDni);

        tablaCliente.setBackground(java.awt.Color.white);
        tablaCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablaCliente.setForeground(java.awt.Color.black);
        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Apellido", "Nombre", "Dirección", "Ciudad", "Teléfono"
            }
        ));
        jScrollPane1.setViewportView(tablaCliente);

        btnBorrarCliente.setBackground(java.awt.Color.lightGray);
        btnBorrarCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBorrarCliente.setForeground(java.awt.Color.black);
        btnBorrarCliente.setText("Borrar Cliente");
        btnBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarClienteActionPerformed(evt);
            }
        });

        btnSalir.setBackground(java.awt.Color.lightGray);
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setForeground(java.awt.Color.black);
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBorrarClienteLayout = new javax.swing.GroupLayout(jpBorrarCliente);
        jpBorrarCliente.setLayout(jpBorrarClienteLayout);
        jpBorrarClienteLayout.setHorizontalGroup(
            jpBorrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBorrarClienteLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpBorrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBorrarClienteLayout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(jlbBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpBorrarClienteLayout.createSequentialGroup()
                        .addComponent(jlbDni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpBorrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBorrarClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBorrarCliente)
                .addGap(202, 202, 202)
                .addComponent(btnSalir)
                .addGap(38, 38, 38))
        );
        jpBorrarClienteLayout.setVerticalGroup(
            jpBorrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBorrarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbBorrarCliente)
                .addGap(42, 42, 42)
                .addGroup(jpBorrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBorrarClienteLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addGroup(jpBorrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBorrarCliente)
                            .addComponent(btnSalir))
                        .addGap(31, 31, 31))
                    .addGroup(jpBorrarClienteLayout.createSequentialGroup()
                        .addGroup(jpBorrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpBorrarClienteLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jlbDni))
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBorrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaDniValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaDniValueChanged
        if (!evt.getValueIsAdjusting()) {
            Long dniSeleccionado = listaDni.getSelectedValue();
            if (dniSeleccionado != null) {
                txtDni.setText(String.valueOf(dniSeleccionado));
                cargarDatosEnTabla(dniSeleccionado);
            }
        }
    }//GEN-LAST:event_listaDniValueChanged

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarClienteActionPerformed
        Long dniSeleccionado = listaDni.getSelectedValue();
        
        if (dniSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un DNI para borrar", "Campos incompletos", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Long telefonoABorrar = null;
        for (Map.Entry<Long, Contacto> entry : Panel_tp5_ej1.directorio.getContactos().entrySet()) {
            if (entry.getValue().getDni() == dniSeleccionado) {
                telefonoABorrar = entry.getKey();
                break;
            }
        }
        
        if (telefonoABorrar != null) {
            Panel_tp5_ej1.directorio.borrarContacto(telefonoABorrar);
            llenarListaDni();
            
            DefaultTableModel model = (DefaultTableModel) tablaCliente.getModel();
            model.setRowCount(0);
            
            limpiarCampos(jpBorrarCliente);
            
            JOptionPane.showMessageDialog(this, "El cliente se elimino correctamente.", "Confirmación:", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "El cliente no se encontró para eliminar", "Atención!!!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnBorrarClienteActionPerformed

    private void txtDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyReleased
        String filtro = txtDni.getText().trim();
        filtrarListaDni(filtro);
    }//GEN-LAST:event_txtDniKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarCliente;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlbBorrarCliente;
    private javax.swing.JLabel jlbDni;
    private javax.swing.JPanel jpBorrarCliente;
    private javax.swing.JList<Long> listaDni;
    private javax.swing.JTable tablaCliente;
    private javax.swing.JTextField txtDni;
    // End of variables declaration//GEN-END:variables
}
