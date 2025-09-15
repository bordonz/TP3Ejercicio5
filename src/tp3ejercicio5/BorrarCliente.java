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
public class BorrarCliente extends javax.swing.JInternalFrame {
private DefaultTableModel modelo = new DefaultTableModel();
   
    public BorrarCliente() {
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

        jlbDni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbDni.setForeground(java.awt.Color.black);
        jlbDni.setText("DNI:");

        listaDni.setBackground(java.awt.Color.white);
        listaDni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        listaDni.setForeground(java.awt.Color.black);
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

        btnSalir.setBackground(java.awt.Color.lightGray);
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setForeground(java.awt.Color.black);
        btnSalir.setText("Salir");

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarCliente;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlbBorrarCliente;
    private javax.swing.JLabel jlbDni;
    private javax.swing.JPanel jpBorrarCliente;
    private javax.swing.JList<String> listaDni;
    private javax.swing.JTable tablaCliente;
    private javax.swing.JTextField txtDni;
    // End of variables declaration//GEN-END:variables
}
