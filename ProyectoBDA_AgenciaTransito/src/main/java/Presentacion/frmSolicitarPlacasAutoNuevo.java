/**
 * frmSolicitarPlacasAutoNuevo.java
 * Apr 6, 2023 12:50:09 PM
 *
 */
package Presentacion;

import Dominio.Automovil;
import Validadores.Validadores;
import Dominio.Persona;
import Dominio.Placa;
import Persistencia.LicenciasDAO;
import Persistencia.PersonasDAO;
import Persistencia.PlacasDAO;
import excepciones.PersistenciaException;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Descripción de la clase:
 *
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox
 * ID:229384
 */
public class frmSolicitarPlacasAutoNuevo extends javax.swing.JFrame {

    private Validadores validadores = new Validadores();
    private PersonasDAO personaDAO;
    private PlacasDAO placasDAO;
    private LicenciasDAO licenciasDAO;
    private Persona personaProspecto;
 private final float costo=1500;
    /**
     * Creates new form frmSolicitarPlacasAutoNuevo
     */
    public frmSolicitarPlacasAutoNuevo() {
        initComponents();
        this.pnlInfoPersona.setVisible(false);
        this.txtCostoPlacas.setVisible(false);
        this.personaDAO = new PersonasDAO();
        this.placasDAO = new PlacasDAO();
        this.licenciasDAO = new LicenciasDAO();

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
        jPanel3 = new javax.swing.JPanel();
        pnlInfoPersona = new javax.swing.JPanel();
        txtRFCCliente = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JLabel();
        txtFechaCliente = new javax.swing.JLabel();
        txtNumeroCliente = new javax.swing.JLabel();
        txtCampoRFC = new javax.swing.JTextField();
        txtRFC = new javax.swing.JLabel();
        txtCampoSerie = new javax.swing.JTextField();
        txtCampoModelo = new javax.swing.JTextField();
        txtCampoLinea = new javax.swing.JTextField();
        txtCampoColor = new javax.swing.JTextField();
        txtSerieCarro = new javax.swing.JLabel();
        txtModeloCarro = new javax.swing.JLabel();
        txtLineaCarro = new javax.swing.JLabel();
        txtColorCarro = new javax.swing.JLabel();
        txtMarcaCarro = new javax.swing.JLabel();
        txtCampoMarca = new javax.swing.JTextField();
        Separator1 = new javax.swing.JSeparator();
        btnSolicitar = new javax.swing.JButton();
        btnBorrarCampos = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtCostoPlacas = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Solicitar Placas Auto Nuevo");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 204, 153));

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

        txtCampoRFC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        txtRFC.setForeground(new java.awt.Color(0, 0, 0));
        txtRFC.setText("RFC");

        txtCampoSerie.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCampoSerie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCampoSerieKeyTyped(evt);
            }
        });

        txtCampoModelo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCampoModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCampoModeloKeyTyped(evt);
            }
        });

        txtCampoLinea.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCampoLinea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCampoLineaKeyTyped(evt);
            }
        });

        txtCampoColor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCampoColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCampoColorKeyTyped(evt);
            }
        });

        txtSerieCarro.setForeground(new java.awt.Color(0, 0, 0));
        txtSerieCarro.setText("Serie");

        txtModeloCarro.setForeground(new java.awt.Color(0, 0, 0));
        txtModeloCarro.setText("Modelo");

        txtLineaCarro.setForeground(new java.awt.Color(0, 0, 0));
        txtLineaCarro.setText("Linea");

        txtColorCarro.setForeground(new java.awt.Color(0, 0, 0));
        txtColorCarro.setText("Color");

        txtMarcaCarro.setForeground(new java.awt.Color(0, 0, 0));
        txtMarcaCarro.setText("Marca");

        txtCampoMarca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCampoMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCampoMarcaKeyTyped(evt);
            }
        });

        btnSolicitar.setText("Solicitar");
        btnSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarActionPerformed(evt);
            }
        });

        btnBorrarCampos.setText("Borrar datos");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtCostoPlacas.setForeground(new java.awt.Color(0, 0, 0));
        txtCostoPlacas.setText("Costo: 1500");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Separator1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btnSolicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnBorrarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtMarcaCarro)
                        .addGap(38, 38, 38)
                        .addComponent(txtCampoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(txtColorCarro)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCampoColor, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(txtLineaCarro)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCampoLinea, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(txtModeloCarro)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCampoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(txtSerieCarro)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCampoSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(txtRFC)
                            .addGap(50, 50, 50)
                            .addComponent(txtCampoRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlInfoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCostoPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtRFC)
                                    .addComponent(txtCampoRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))
                                .addGap(18, 18, 18)
                                .addComponent(txtCampoSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtSerieCarro))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCampoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModeloCarro))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCampoLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLineaCarro))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCampoColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtColorCarro)))
                    .addComponent(pnlInfoPersona, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarcaCarro)
                    .addComponent(txtCampoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCostoPlacas))
                .addGap(36, 36, 36)
                .addComponent(Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSolicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(117, 37, 37));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Solicitar Placas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        try {
            new frmMenu().setVisible(true);
        } catch (PersistenciaException ex) {
            Logger.getLogger(frmSolicitarPlacasAutoNuevo.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCampoRFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCampoRFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCampoRFCActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (this.txtCampoRFC.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un rfc valido");
        } else {
            try {
                if (licenciasDAO.buscarLicenciaRFC(personaDAO.buscarPersonaRFC(txtCampoRFC.getText())) != null) {
                    personaProspecto = personaDAO.buscarPersonaRFC(txtCampoRFC.getText());
                    this.pnlInfoPersona.setVisible(true);
                    setearInfo(personaProspecto);
                    System.out.println(personaProspecto);
                } else {
                    JOptionPane.showMessageDialog(this, "El usuario no cuenta con una licencia vigente");
                }
            } catch (PersistenciaException ex) {
                Logger.getLogger(frmSolicitarPlacasAutoNuevo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private void validacionCamposAlfabeto(java.awt.event.KeyEvent evt) {
        char txt = evt.getKeyChar();
        if (!(Character.isAlphabetic(txt) || txt == KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }

    private void validacionNumeroLetra(java.awt.event.KeyEvent evt) {
        char txt = evt.getKeyChar();
        if (!(Character.isLetterOrDigit(txt))) {
            evt.consume();
        }
    }

    private void validacionCamposSerie(java.awt.event.KeyEvent evt) {
        char txt = evt.getKeyChar();
        if (!(txt == KeyEvent.VK_MINUS || Character.isLetterOrDigit(txt))) {
            evt.consume();
        }
    }

    private void validacionNumero(java.awt.event.KeyEvent evt) {
        char txt = evt.getKeyChar();
        if (!(Character.isDigit(txt))) {
            evt.consume();
        }
    }
    private void txtCampoRFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCampoRFCKeyTyped
        if (!(txtCampoRFC.getText().length() > 12)) {
            validacionNumeroLetra(evt);
        } else {
            evt.consume();
        }

    }//GEN-LAST:event_txtCampoRFCKeyTyped

    private void txtCampoSerieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCampoSerieKeyTyped
        if (!(txtCampoSerie.getText().length() > 6)) {
            validacionCamposSerie(evt);
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtCampoSerieKeyTyped

    private void txtCampoModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCampoModeloKeyTyped
        if (!(txtCampoModelo.getText().length() > 3)) {
            validacionNumero(evt);
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtCampoModeloKeyTyped

    private void txtCampoLineaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCampoLineaKeyTyped
        if (!(txtCampoLinea.getText().length() > 15)) {
            validacionCamposAlfabeto(evt);
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtCampoLineaKeyTyped

    private void txtCampoColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCampoColorKeyTyped
        if (!(txtCampoColor.getText().length() > 15)) {
            validacionCamposAlfabeto(evt);
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtCampoColorKeyTyped

    private void txtCampoMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCampoMarcaKeyTyped
        if (!(txtCampoMarca.getText().length() > 15)) {
            validacionCamposAlfabeto(evt);
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtCampoMarcaKeyTyped

    private void btnSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarActionPerformed
        try {
            Placa placaGenerada = this.generarPlaca();
            if (!(placaGenerada == null)) {
                placasDAO.generarPlaca(placaGenerada);
                JOptionPane.showMessageDialog(this, "Se genero la placa: \n" + placaGenerada.getNumeroPlaca());
            }

        } catch (PersistenciaException ex) {
            Logger.getLogger(frmSolicitarPlacasAutoNuevo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSolicitarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            new frmMenu().setVisible(true);
        } catch (PersistenciaException ex) {
            Logger.getLogger(frmSolicitarPlacasAutoNuevo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_formWindowClosed

    private void setearInfo(Persona persona) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.txtRFCCliente.setText("RFC: " + persona.getRFC());
        this.txtNombreCliente.setText("Nombre: " + persona.getNombreCompleto());
        this.txtFechaCliente.setText("Fecha Nacimiento: " + sdf.format(persona.getFechaNacimiento().getTime()));
        this.txtNumeroCliente.setText("Numero Telefono: " + persona.getTelefono());
    }

    private Placa generarPlaca() {
        if (validadores.validarSerie(this.txtCampoSerie.getText())) {
            String numSerie = this.txtCampoSerie.getText();
            String modelo = this.txtCampoModelo.getText();
            String linea = this.txtCampoLinea.getText().toUpperCase();
            String color = this.txtCampoColor.getText().toUpperCase();
            String marca = this.txtCampoMarca.getText().toUpperCase();
            Calendar fechaVencimiento = Calendar.getInstance();
            fechaVencimiento.add(Calendar.YEAR, 4);
            return new Placa(generarNumeroSerie(), true, new Automovil(numSerie, modelo, linea, marca, color),
                     costo, Calendar.getInstance(), fechaVencimiento, licenciasDAO.buscarLicenciaRFC(personaProspecto));
        }
        JOptionPane.showMessageDialog(this, "Formato de la serie incorrecto \n AAA-111");
        return null;
    }

    public static String generarNumeroSerie() {
        StringBuilder numeroSerie = new StringBuilder();
        Random random = new Random();
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < 3; i++) {
            char letra = letras.charAt(random.nextInt(letras.length()));
            numeroSerie.append(letra);
        }
        numeroSerie.append("-");
        for (int i = 0; i < 3; i++) {
            int numero = random.nextInt(10);
            numeroSerie.append(numero);
        }
        return numeroSerie.toString();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separator1;
    private javax.swing.JButton btnBorrarCampos;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSolicitar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel pnlInfoPersona;
    private javax.swing.JTextField txtCampoColor;
    private javax.swing.JTextField txtCampoLinea;
    private javax.swing.JTextField txtCampoMarca;
    private javax.swing.JTextField txtCampoModelo;
    private javax.swing.JTextField txtCampoRFC;
    private javax.swing.JTextField txtCampoSerie;
    private javax.swing.JLabel txtColorCarro;
    private javax.swing.JLabel txtCostoPlacas;
    private javax.swing.JLabel txtFechaCliente;
    private javax.swing.JLabel txtLineaCarro;
    private javax.swing.JLabel txtMarcaCarro;
    private javax.swing.JLabel txtModeloCarro;
    private javax.swing.JLabel txtNombreCliente;
    private javax.swing.JLabel txtNumeroCliente;
    private javax.swing.JLabel txtRFC;
    private javax.swing.JLabel txtRFCCliente;
    private javax.swing.JLabel txtSerieCarro;
    // End of variables declaration//GEN-END:variables

}
