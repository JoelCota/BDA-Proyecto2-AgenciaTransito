/**
 * frmSolicitarLicencia.java
 * Apr 7, 2023 12:38:23 AM
 *
 */
package Presentacion;

import Dominio.Persona;
import Dominio.tipoLicencia;
import Persistencia.PersonasDAO;
import excepciones.PersistenciaException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Descripción de la clase:
 *
 * @author Joel Antonio Lopez Cota ID:228926
 */
public class frmSolicitarLicencia extends javax.swing.JFrame {

    PersonasDAO persona;

    /**
     * Creates new form frmSolicitarLicencia
     */
    public frmSolicitarLicencia() {
        initComponents();
        this.persona = new PersonasDAO();
        cargarComboBoxVigencia();
        cargarComboBoxTipo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtSolicitarPlacas = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtRFC = new javax.swing.JLabel();
        txtCampoRFC = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        cbxVigencia = new javax.swing.JComboBox<>();
        txtRFC1 = new javax.swing.JLabel();
        txtRFC2 = new javax.swing.JLabel();
        btnSolicitar = new javax.swing.JButton();
        Separator1 = new javax.swing.JSeparator();
        btnBorrarCampos = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtCostoPlacas = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        pnlInfoPersona = new javax.swing.JPanel();
        txtRFCCliente = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JLabel();
        txtFechaCliente = new javax.swing.JLabel();
        txtNumeroCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Solicitar Licencia");

        jPanel1.setBackground(new java.awt.Color(117, 37, 37));
        jPanel1.setPreferredSize(new java.awt.Dimension(221, 66));

        txtSolicitarPlacas.setBackground(new java.awt.Color(0, 0, 0));
        txtSolicitarPlacas.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        txtSolicitarPlacas.setForeground(new java.awt.Color(0, 0, 0));
        txtSolicitarPlacas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSolicitarPlacas.setText("Solicitar Licencia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSolicitarPlacas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtSolicitarPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 204, 153));

        txtRFC.setForeground(new java.awt.Color(0, 0, 0));
        txtRFC.setText("RFC");

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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbxVigencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxVigencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxVigenciaActionPerformed(evt);
            }
        });

        txtRFC1.setForeground(new java.awt.Color(0, 0, 0));
        txtRFC1.setText("Vigencia");

        txtRFC2.setForeground(new java.awt.Color(0, 0, 0));
        txtRFC2.setText("Tipo");

        btnSolicitar.setText("Solicitar");

        btnBorrarCampos.setText("Borrar datos");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtCostoPlacas.setForeground(new java.awt.Color(0, 0, 0));
        txtCostoPlacas.setText("Costo");

        btnBuscar.setText("buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        pnlInfoPersona.setBackground(new java.awt.Color(255, 204, 153));

        txtRFCCliente.setMaximumSize(new java.awt.Dimension(0, 20));
        txtRFCCliente.setMinimumSize(new java.awt.Dimension(0, 20));
        txtRFCCliente.setPreferredSize(new java.awt.Dimension(10, 20));

        txtNombreCliente.setMaximumSize(new java.awt.Dimension(0, 20));
        txtNombreCliente.setMinimumSize(new java.awt.Dimension(0, 20));
        txtNombreCliente.setPreferredSize(new java.awt.Dimension(10, 20));

        txtFechaCliente.setMaximumSize(new java.awt.Dimension(0, 20));
        txtFechaCliente.setMinimumSize(new java.awt.Dimension(0, 20));
        txtFechaCliente.setPreferredSize(new java.awt.Dimension(10, 20));

        txtNumeroCliente.setMaximumSize(new java.awt.Dimension(0, 20));
        txtNumeroCliente.setMinimumSize(new java.awt.Dimension(0, 20));
        txtNumeroCliente.setPreferredSize(new java.awt.Dimension(10, 20));

        javax.swing.GroupLayout pnlInfoPersonaLayout = new javax.swing.GroupLayout(pnlInfoPersona);
        pnlInfoPersona.setLayout(pnlInfoPersonaLayout);
        pnlInfoPersonaLayout.setHorizontalGroup(
            pnlInfoPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoPersonaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnlInfoPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFechaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(txtNumeroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtRFCCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        pnlInfoPersonaLayout.setVerticalGroup(
            pnlInfoPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoPersonaLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(txtRFCCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFechaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRFC1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCostoPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRFC2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCampoRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(pnlInfoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(77, 77, 77)
                            .addComponent(btnSolicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBorrarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(76, 76, 76)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(76, 76, 76))
                        .addComponent(Separator1))
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlInfoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRFC)
                            .addComponent(txtCampoRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRFC1))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRFC2))
                        .addGap(66, 66, 66)
                        .addComponent(txtCostoPlacas)))
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(281, 281, 281)
                    .addComponent(Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSolicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBorrarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(25, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCampoRFCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCampoRFCMouseClicked

    }//GEN-LAST:event_txtCampoRFCMouseClicked

    private void txtCampoRFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCampoRFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCampoRFCActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        new frmMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cbxVigenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxVigenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxVigenciaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        try {
            Persona personita = new Persona();
            personita
                    = persona.buscarPersonaRFC(this.txtCampoRFC.getText());
        } catch (PersistenciaException ex) {
            Logger.getLogger(frmSolicitarLicencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtCampoRFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCampoRFCKeyTyped
          validacionNumeroLetra(evt);
    }//GEN-LAST:event_txtCampoRFCKeyTyped

    private void cargarComboBoxVigencia() {
        this.cbxVigencia.removeAllItems();
        this.cbxVigencia.addItem("1 año");
        this.cbxVigencia.addItem("2 año");
        this.cbxVigencia.addItem("3 año");

    }

    private void cargarComboBoxTipo() {
        this.cbxVigencia.removeAllItems();
        this.cbxVigencia.addItem("Normal");
        this.cbxVigencia.addItem("Discapacitado");

    }
    private void validacionNumeroLetra(java.awt.event.KeyEvent evt) {
        char txt = evt.getKeyChar();
        if (!(Character.isLetterOrDigit(txt))) {
            evt.consume();
        }
    }
     private void setearInfo(Persona persona) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.txtRFCCliente.setText("RFC: " + persona.getRFC());
        this.txtNombreCliente.setText("Nombre: " + persona.getNombreCompleto());
        this.txtFechaCliente.setText("Fecha Nacimiento: " + sdf.format(persona.getFechaNacimiento().getTime()));
        this.txtNumeroCliente.setText("Numero Telefono: " + persona.getTelefono());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separator1;
    private javax.swing.JButton btnBorrarCampos;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSolicitar;
    private javax.swing.JComboBox<String> cbxVigencia;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel pnlInfoPersona;
    private javax.swing.JTextField txtCampoRFC;
    private javax.swing.JLabel txtCostoPlacas;
    private javax.swing.JLabel txtFechaCliente;
    private javax.swing.JLabel txtNombreCliente;
    private javax.swing.JLabel txtNumeroCliente;
    private javax.swing.JLabel txtRFC;
    private javax.swing.JLabel txtRFC1;
    private javax.swing.JLabel txtRFC2;
    private javax.swing.JLabel txtRFCCliente;
    private javax.swing.JLabel txtSolicitarPlacas;
    // End of variables declaration//GEN-END:variables

}