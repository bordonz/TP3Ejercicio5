/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3ejercicio5;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class BuscarClienteporCIudadView extends javax.swing.JInternalFrame {

   private DefaultTableModel modelo = new DefaultTableModel();
   
    public BuscarClienteporCIudadView() {
        initComponents();
        ArmarCabecera();
    }

   public void ArmarCabecera(){
       modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
         modelo.addColumn("Nombre");
          modelo.addColumn("Direccion");
           modelo.addColumn("Ciudad");
            modelo.addColumn("Telefono");
            tablaCliente.setModel(modelo);
   }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBuscarClientePorCiudad = new javax.swing.JPanel();
        jlbBucarClientePorCiudad = new javax.swing.JLabel();
        jlbCiudades = new javax.swing.JLabel();
        cmbCiudades = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jpBuscarClientePorCiudad.setBackground(java.awt.Color.lightGray);
        jpBuscarClientePorCiudad.setForeground(java.awt.Color.black);

        jlbBucarClientePorCiudad.setBackground(java.awt.Color.lightGray);
        jlbBucarClientePorCiudad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbBucarClientePorCiudad.setForeground(new java.awt.Color(0, 0, 0));
        jlbBucarClientePorCiudad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbBucarClientePorCiudad.setText("Buscar Clientes de Directorio por Ciudad");

        jlbCiudades.setBackground(java.awt.Color.lightGray);
        jlbCiudades.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbCiudades.setForeground(java.awt.Color.black);
        jlbCiudades.setText("Ciudades:");

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

        jButton1.setBackground(java.awt.Color.lightGray);
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(java.awt.Color.black);
        jButton1.setText("Salir");

        javax.swing.GroupLayout jpBuscarClientePorCiudadLayout = new javax.swing.GroupLayout(jpBuscarClientePorCiudad);
        jpBuscarClientePorCiudad.setLayout(jpBuscarClientePorCiudadLayout);
        jpBuscarClientePorCiudadLayout.setHorizontalGroup(
            jpBuscarClientePorCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBuscarClientePorCiudadLayout.createSequentialGroup()
                .addGroup(jpBuscarClientePorCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBuscarClientePorCiudadLayout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jlbBucarClientePorCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 210, Short.MAX_VALUE))
                    .addGroup(jpBuscarClientePorCiudadLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jpBuscarClientePorCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)))
                .addGap(6, 6, 6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBuscarClientePorCiudadLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(65, 65, 65))
        );
        jpBuscarClientePorCiudadLayout.setVerticalGroup(
            jpBuscarClientePorCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBuscarClientePorCiudadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBuscarClientePorCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBuscarClientePorCiudadLayout.createSequentialGroup()
                        .addComponent(jlbBucarClientePorCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpBuscarClientePorCiudadLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jlbCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpBuscarClientePorCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBuscarClientePorCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbCiudades;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbBucarClientePorCiudad;
    private javax.swing.JLabel jlbCiudades;
    private javax.swing.JPanel jpBuscarClientePorCiudad;
    private javax.swing.JTable tablaCliente;
    // End of variables declaration//GEN-END:variables
}
