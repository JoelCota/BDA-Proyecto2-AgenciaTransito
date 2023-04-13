/**
 * frmSolicitarPlacasAutoUsado.java
 * Apr 6, 2023 12:53:31 PM
 *
 */
package Presentacion;

import excepciones.PersistenciaException;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Descripción de la clase:
 *
 * @author Joel Antonio Lopez Cota ID:228926
 */
public class frmSolicitarPlacasAutoUsado extends javax.swing.JFrame {

    /**
     * Creates new form frmSolicitarPlacasAutoUsado
     */
    public frmSolicitarPlacasAutoUsado() {
        initComponents();
        this.pnlInfoCarro.setVisible(false);
        this.pnlInfoPersona.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlInformacion = new javax.swing.JPanel();
        txtRFC = new javax.swing.JLabel();
        txtPlacas = new javax.swing.JLabel();
        txtCampoPlacas = new javax.swing.JTextField();
        txtCampoRFC = new javax.swing.JTextField();
        Separator1 = new javax.swing.JSeparator();
        btnCancelar = new javax.swing.JButton();
        btnSolicitar = new javax.swing.JButton();
        txtCostoPlacas = new javax.swing.JLabel();
        btnBorrarCampos = new javax.swing.JButton();
        pnlInfoPlacas = new javax.swing.JPanel();
        txtPropietario = new javax.swing.JLabel();
        txtModelo = new javax.swing.JLabel();
        txtLinea = new javax.swing.JLabel();
        txtColor = new javax.swing.JLabel();
        txtMarca = new javax.swing.JLabel();
        pnlInfoPersona = new javax.swing.JPanel();
        txtRFCCliente = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JLabel();
        txtFechaCliente = new javax.swing.JLabel();
        txtNumeroCliente = new javax.swing.JLabel();
        pnlTitulo = new javax.swing.JPanel();
        txtSolicitarPlacas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Solicitar Placas Auto Usado");
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        pnlInformacion.setBackground(new java.awt.Color(255, 204, 153));

        txtRFC.setForeground(new java.awt.Color(0, 0, 0));
        txtRFC.setText("RFC");

        txtPlacas.setForeground(new java.awt.Color(0, 0, 0));
        txtPlacas.setText("Placas");

        txtCampoPlacas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCampoPlacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCampoPlacasActionPerformed(evt);
            }
        });

        txtCampoRFC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCampoRFC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCampoRFCMouseClicked(evt);
            }
        });
        txtCampoRFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCampoRFCActionPerformed(evt);
            }
        });
        txtCampoRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCampoRFCKeyTyped(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSolicitar.setText("Solicitar");

        txtCostoPlacas.setForeground(new java.awt.Color(0, 0, 0));
        txtCostoPlacas.setText("Costo");

        btnBorrarCampos.setText("Borrar datos");

        pnlInfoPlacas.setBackground(new java.awt.Color(255, 204, 153));

        txtPropietario.setForeground(new java.awt.Color(0, 0, 0));
        txtPropietario.setText("12");
        txtPropietario.setMaximumSize(new java.awt.Dimension(0, 20));
        txtPropietario.setMinimumSize(new java.awt.Dimension(0, 20));
        txtPropietario.setPreferredSize(new java.awt.Dimension(10, 20));

        txtModelo.setForeground(new java.awt.Color(0, 0, 0));
        txtModelo.setText("12");
        txtModelo.setMaximumSize(new java.awt.Dimension(0, 20));
        txtModelo.setMinimumSize(new java.awt.Dimension(0, 20));
        txtModelo.setPreferredSize(new java.awt.Dimension(10, 20));

        txtLinea.setForeground(new java.awt.Color(0, 0, 0));
        txtLinea.setText("12");
        txtLinea.setMaximumSize(new java.awt.Dimension(0, 20));
        txtLinea.setMinimumSize(new java.awt.Dimension(0, 20));
        txtLinea.setPreferredSize(new java.awt.Dimension(10, 20));

        txtColor.setForeground(new java.awt.Color(0, 0, 0));
        txtColor.setText("12");
        txtColor.setMaximumSize(new java.awt.Dimension(0, 20));
        txtColor.setMinimumSize(new java.awt.Dimension(0, 20));
        txtColor.setPreferredSize(new java.awt.Dimension(10, 20));

        txtMarca.setForeground(new java.awt.Color(0, 0, 0));
        txtMarca.setText("12");
        txtMarca.setMaximumSize(new java.awt.Dimension(0, 20));
        txtMarca.setMinimumSize(new java.awt.Dimension(0, 20));
        txtMarca.setPreferredSize(new java.awt.Dimension(10, 20));

        javax.swing.GroupLayout pnlInfoPlacasLayout = new javax.swing.GroupLayout(pnlInfoPlacas);
        pnlInfoPlacas.setLayout(pnlInfoPlacasLayout);
        pnlInfoPlacasLayout.setHorizontalGroup(
            pnlInfoPlacasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoPlacasLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnlInfoPlacasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLinea, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(txtColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPropietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        pnlInfoPlacasLayout.setVerticalGroup(
            pnlInfoPlacasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoPlacasLayout.createSequentialGroup()
                .addComponent(txtPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLinea, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlInfoPersona.setBackground(new java.awt.Color(255, 204, 153));

        txtRFCCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtRFCCliente.setText("1");
        txtRFCCliente.setMaximumSize(new java.awt.Dimension(0, 20));
        txtRFCCliente.setMinimumSize(new java.awt.Dimension(0, 20));
        txtRFCCliente.setPreferredSize(new java.awt.Dimension(10, 20));

        txtNombreCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreCliente.setText("1");
        txtNombreCliente.setMaximumSize(new java.awt.Dimension(0, 20));
        txtNombreCliente.setMinimumSize(new java.awt.Dimension(0, 20));
        txtNombreCliente.setPreferredSize(new java.awt.Dimension(10, 20));

        txtFechaCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtFechaCliente.setText("1");
        txtFechaCliente.setMaximumSize(new java.awt.Dimension(0, 20));
        txtFechaCliente.setMinimumSize(new java.awt.Dimension(0, 20));
        txtFechaCliente.setPreferredSize(new java.awt.Dimension(10, 20));

        txtNumeroCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtNumeroCliente.setText("1");
        txtNumeroCliente.setMaximumSize(new java.awt.Dimension(0, 20));
        txtNumeroCliente.setMinimumSize(new java.awt.Dimension(0, 20));
        txtNumeroCliente.setPreferredSize(new java.awt.Dimension(10, 20));

        javax.swing.GroupLayout pnlInfoPersonaLayout = new javax.swing.GroupLayout(pnlInfoPersona);
        pnlInfoPersona.setLayout(pnlInfoPersonaLayout);
        pnlInfoPersonaLayout.setHorizontalGroup(
            pnlInfoPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoPersonaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pnlInfoPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFechaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(txtNumeroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtRFCCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        pnlInfoPersonaLayout.setVerticalGroup(
            pnlInfoPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoPersonaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(txtRFCCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFechaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlInformacionLayout = new javax.swing.GroupLayout(pnlInformacion);
        pnlInformacion.setLayout(pnlInformacionLayout);
        pnlInformacionLayout.setHorizontalGroup(
            pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInformacionLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRFC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlacas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCostoPlacas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCampoPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCampoRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlInfoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlInfoPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
            .addGroup(pnlInformacionLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(btnSolicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBorrarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
            .addGroup(pnlInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Separator1)
                .addContainerGap())
        );
        pnlInformacionLayout.setVerticalGroup(
            pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformacionLayout.createSequentialGroup()
                .addGroup(pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInformacionLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRFC)
                            .addComponent(txtCampoRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPlacas)
                            .addComponent(txtCampoPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCostoPlacas)
                        .addGap(46, 46, 46))
                    .addGroup(pnlInformacionLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(pnlInfoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlInfoPlacas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(49, 49, 49)))
                .addComponent(Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSolicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        pnlTitulo.setBackground(new java.awt.Color(117, 37, 37));
        pnlTitulo.setPreferredSize(new java.awt.Dimension(221, 66));

        txtSolicitarPlacas.setBackground(new java.awt.Color(0, 0, 0));
        txtSolicitarPlacas.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        txtSolicitarPlacas.setForeground(new java.awt.Color(0, 0, 0));
        txtSolicitarPlacas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSolicitarPlacas.setText("Solicitar Placas");

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSolicitarPlacas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtSolicitarPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCampoPlacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCampoPlacasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCampoPlacasActionPerformed

    private void txtCampoRFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCampoRFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCampoRFCActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        try {
            new frmMenu().setVisible(true);
        } catch (PersistenciaException ex) {
            Logger.getLogger(frmSolicitarPlacasAutoUsado.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCampoRFCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCampoRFCMouseClicked

    }//GEN-LAST:event_txtCampoRFCMouseClicked

    private void txtCampoRFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCampoRFCKeyTyped
        if (!(txtCampoRFC.getText().length() > 12)) {
            validacionNumeroLetra(evt);
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtCampoRFCKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separator1;
    private javax.swing.JButton btnBorrarCampos;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSolicitar;
    private javax.swing.JPanel pnlInfoPersona;
    private javax.swing.JPanel pnlInfoPlacas;
    private javax.swing.JPanel pnlInformacion;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JTextField txtCampoPlacas;
    private javax.swing.JTextField txtCampoRFC;
    private javax.swing.JLabel txtColor;
    private javax.swing.JLabel txtCostoPlacas;
    private javax.swing.JLabel txtFechaCliente;
    private javax.swing.JLabel txtLinea;
    private javax.swing.JLabel txtMarca;
    private javax.swing.JLabel txtModelo;
    private javax.swing.JLabel txtNombreCliente;
    private javax.swing.JLabel txtNumeroCliente;
    private javax.swing.JLabel txtPlacas;
    private javax.swing.JLabel txtPropietario;
    private javax.swing.JLabel txtRFC;
    private javax.swing.JLabel txtRFCCliente;
    private javax.swing.JLabel txtSolicitarPlacas;
    // End of variables declaration//GEN-END:variables

    private void validacionNumeroLetra(KeyEvent evt) {
        char txt = evt.getKeyChar();
        if (!(Character.isLetterOrDigit(txt))) {
            evt.consume();
        }
    }

}
