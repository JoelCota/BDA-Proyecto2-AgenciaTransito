/**
* frmMenu.java
* Apr 6, 2023 10:46:06 AM
* 
*/ 

package Implementaciones;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * Descripción de la clase: 
 * 
 * @author Joel Antonio Lopez Cota ID:228926
 */
public class frmMenu extends javax.swing.JFrame {

    /** Creates new form frmMenu */
    public frmMenu() {
        initComponents();
        pnlTramites.setVisible(false);
        pnlPlacas.setVisible(false);
        pnlDatosClientes.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDatosClientes = new javax.swing.JPanel();
        spClientes = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        pnltxtMenu = new javax.swing.JPanel();
        pnltxtMenu1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        pnlRectangulo1 = new javax.swing.JPanel();
        pnlRectangulo2 = new javax.swing.JPanel();
        txtTramites = new javax.swing.JLabel();
        pnlTramites = new javax.swing.JPanel();
        pnlPlacas = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        txtAutomovilNuevo = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtAutomovilUsado = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtReportes = new javax.swing.JLabel();
        txtConsultas = new javax.swing.JLabel();
        txtLicencias = new javax.swing.JLabel();
        txtPlacas = new javax.swing.JLabel();
        txtGeneraClientes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setBackground(new java.awt.Color(102, 102, 102));
        setResizable(false);

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre Completo", "Fecha Nacimiento", "RFC", "Num. Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblClientes.setEnabled(false);
        spClientes.setViewportView(tblClientes);

        javax.swing.GroupLayout pnlDatosClientesLayout = new javax.swing.GroupLayout(pnlDatosClientes);
        pnlDatosClientes.setLayout(pnlDatosClientesLayout);
        pnlDatosClientesLayout.setHorizontalGroup(
            pnlDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(spClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlDatosClientesLayout.setVerticalGroup(
            pnlDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(spClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnltxtMenu.setBackground(new java.awt.Color(117, 37, 37));

        pnltxtMenu1.setBackground(new java.awt.Color(117, 37, 37));

        javax.swing.GroupLayout pnltxtMenu1Layout = new javax.swing.GroupLayout(pnltxtMenu1);
        pnltxtMenu1.setLayout(pnltxtMenu1Layout);
        pnltxtMenu1Layout.setHorizontalGroup(
            pnltxtMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnltxtMenu1Layout.setVerticalGroup(
            pnltxtMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Menú");

        javax.swing.GroupLayout pnltxtMenuLayout = new javax.swing.GroupLayout(pnltxtMenu);
        pnltxtMenu.setLayout(pnltxtMenuLayout);
        pnltxtMenuLayout.setHorizontalGroup(
            pnltxtMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnltxtMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnltxtMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnltxtMenuLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnltxtMenuLayout.createSequentialGroup()
                        .addComponent(pnltxtMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(17, 17, 17))))
        );
        pnltxtMenuLayout.setVerticalGroup(
            pnltxtMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnltxtMenuLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnltxtMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlRectangulo1.setBackground(new java.awt.Color(117, 37, 37));
        pnlRectangulo1.setPreferredSize(new java.awt.Dimension(10, 30));

        javax.swing.GroupLayout pnlRectangulo1Layout = new javax.swing.GroupLayout(pnlRectangulo1);
        pnlRectangulo1.setLayout(pnlRectangulo1Layout);
        pnlRectangulo1Layout.setHorizontalGroup(
            pnlRectangulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        pnlRectangulo1Layout.setVerticalGroup(
            pnlRectangulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlRectangulo2.setBackground(new java.awt.Color(117, 37, 37));
        pnlRectangulo2.setPreferredSize(new java.awt.Dimension(10, 30));

        javax.swing.GroupLayout pnlRectangulo2Layout = new javax.swing.GroupLayout(pnlRectangulo2);
        pnlRectangulo2.setLayout(pnlRectangulo2Layout);
        pnlRectangulo2Layout.setHorizontalGroup(
            pnlRectangulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        pnlRectangulo2Layout.setVerticalGroup(
            pnlRectangulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        txtTramites.setBackground(new java.awt.Color(0, 0, 0));
        txtTramites.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTramites.setForeground(new java.awt.Color(0, 0, 0));
        txtTramites.setText("Tramites");
        txtTramites.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTramitesMouseClicked(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        txtAutomovilNuevo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAutomovilNuevo.setText("-Automovil Nuevo");
        txtAutomovilNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAutomovilNuevoMouseClicked(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        txtAutomovilUsado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAutomovilUsado.setText("- Automovil Usado");
        txtAutomovilUsado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAutomovilUsadoMouseClicked(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnlPlacasLayout = new javax.swing.GroupLayout(pnlPlacas);
        pnlPlacas.setLayout(pnlPlacasLayout);
        pnlPlacasLayout.setHorizontalGroup(
            pnlPlacasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlacasLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlPlacasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3)
                    .addGroup(pnlPlacasLayout.createSequentialGroup()
                        .addGroup(pnlPlacasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAutomovilNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAutomovilUsado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1)))
        );
        pnlPlacasLayout.setVerticalGroup(
            pnlPlacasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlacasLayout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(txtAutomovilNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAutomovilUsado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtReportes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtReportes.setText("Reportes");
        txtReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtReportesMouseClicked(evt);
            }
        });

        txtConsultas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtConsultas.setText("Consultas");
        txtConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtConsultasMouseClicked(evt);
            }
        });

        txtLicencias.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtLicencias.setText("Licencias");
        txtLicencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLicenciasMouseClicked(evt);
            }
        });

        txtPlacas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPlacas.setText("Placas");
        txtPlacas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPlacasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlTramitesLayout = new javax.swing.GroupLayout(pnlTramites);
        pnlTramites.setLayout(pnlTramitesLayout);
        pnlTramitesLayout.setHorizontalGroup(
            pnlTramitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTramitesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTramitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPlacas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTramitesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlTramitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtConsultas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLicencias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtReportes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPlacas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnlTramitesLayout.setVerticalGroup(
            pnlTramitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTramitesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLicencias, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtGeneraClientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtGeneraClientes.setText("Generar Clientes");
        txtGeneraClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGeneraClientesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addComponent(pnlRectangulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtGeneraClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                        .addComponent(pnlRectangulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTramites, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addComponent(pnlTramites, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(384, 384, 384))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlRectangulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTramites, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTramites, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlRectangulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtGeneraClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnltxtMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDatosClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnltxtMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnlDatosClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTramitesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTramitesMouseClicked
        if (pnlTramites.isVisible()) {
            pnlTramites.setVisible(false);
        }else{
            pnlTramites.setVisible(true);
        }
    }//GEN-LAST:event_txtTramitesMouseClicked

    private void txtPlacasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPlacasMouseClicked
     if (pnlPlacas.isVisible()) {
            pnlPlacas.setVisible(false);
        }else{
            pnlPlacas.setVisible(true);
        }
    }//GEN-LAST:event_txtPlacasMouseClicked

    private void txtGeneraClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGeneraClientesMouseClicked
        if (pnlDatosClientes.isVisible()) {
            JOptionPane.showMessageDialog(this, "Los clientes ya se han generado");
        }else{
            JOptionPane.showMessageDialog(this, "Se han generado los clientes");
            pnlDatosClientes.setVisible(true);
        }
    }//GEN-LAST:event_txtGeneraClientesMouseClicked

    private void txtReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReportesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportesMouseClicked

    private void txtLicenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLicenciasMouseClicked
      new frmSolicitarLicencia().setVisible(true);
    }//GEN-LAST:event_txtLicenciasMouseClicked

    private void txtConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConsultasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultasMouseClicked
       private void txtAutomovilNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAutomovilNuevoMouseClicked
     new frmSolicitarPlacasAutoNuevo().setVisible(true);
    }//GEN-LAST:event_txtAutomovilNuevoMouseClicked

    private void txtAutomovilUsadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAutomovilUsadoMouseClicked
       new frmSolicitarPlacasAutoUsado().setVisible(true);
    }//GEN-LAST:event_txtAutomovilUsadoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel pnlDatosClientes;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPlacas;
    private javax.swing.JPanel pnlRectangulo1;
    private javax.swing.JPanel pnlRectangulo2;
    private javax.swing.JPanel pnlTramites;
    private javax.swing.JPanel pnltxtMenu;
    private javax.swing.JPanel pnltxtMenu1;
    private javax.swing.JScrollPane spClientes;
    private javax.swing.JTable tblClientes;
    private javax.swing.JLabel txtAutomovilNuevo;
    private javax.swing.JLabel txtAutomovilUsado;
    private javax.swing.JLabel txtConsultas;
    private javax.swing.JLabel txtGeneraClientes;
    private javax.swing.JLabel txtLicencias;
    private javax.swing.JLabel txtPlacas;
    private javax.swing.JLabel txtReportes;
    private javax.swing.JLabel txtTramites;
    // End of variables declaration//GEN-END:variables

}
