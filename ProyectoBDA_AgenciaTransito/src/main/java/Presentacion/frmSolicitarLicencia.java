/**
 * frmSolicitarLicencia.java
 * Apr 7, 2023 12:38:23 AM
 *
 */
package Presentacion;

import Dominio.Licencia;
import Dominio.Persona;
import Dominio.tipoLicencia;
import Persistencia.LicenciasDAO;
import Persistencia.PersonasDAO;
import Validadores.Validadores;
import excepciones.PersistenciaException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import utilidades.EncriptadoCesar;

/**
 * Descripción de la clase: Clase de tipo frame para solicitar la licencia.
 *
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox
 * ID:229384
 */
public class frmSolicitarLicencia extends javax.swing.JFrame {

    /**
     * Es la persona a la cual se le desea sacar la licencia.
     */
    private Persona personaProspecto;
    /**
     * Es el objeto para acceder a la clase personasDAO.
     */
    private PersonasDAO personasDAO;
    /**
     * Es el objeto para acceder a la clase licenciasDAO.
     */
    private LicenciasDAO licenciasDAO;
    /**
     * Es la vigencia de la licencia.
     */
    private int vigencia;
    /**
     * Es el tipo de licencia.
     */
    private tipoLicencia tipo;
    /**
     * Es el objeto para acceder a la clase validadores.
     */
    private Validadores validador = new Validadores();
    /**
     * Es el objeto para acceder a la clase encriptado cesar.
     */
    private EncriptadoCesar encriptador = new EncriptadoCesar();

    /**
     * Creates new form frmSolicitarLicencia
     */
    public frmSolicitarLicencia() {
        initComponents();
        cargarComboBoxVigencia();
        cargarComboBoxTipo();
        this.personasDAO = new PersonasDAO();
        this.pnlInfoPersona.setVisible(false);
        this.licenciasDAO = new LicenciasDAO();
        this.btnSolicitar.setEnabled(false);
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
        cbxVigencia = new javax.swing.JComboBox<>();
        cbxTipo = new javax.swing.JComboBox<>();
        txtRFC1 = new javax.swing.JLabel();
        txtRFC2 = new javax.swing.JLabel();
        btnSolicitar = new javax.swing.JButton();
        Separator1 = new javax.swing.JSeparator();
        btnBorrarCampos = new javax.swing.JButton();
        txtCosto = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        pnlInfoPersona = new javax.swing.JPanel();
        txtRFCCliente = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JLabel();
        txtFechaCliente = new javax.swing.JLabel();
        txtNumeroCliente = new javax.swing.JLabel();
        txtSolicitarPlacas1 = new javax.swing.JLabel();

        setTitle("Solicitar Licencia");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

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
                .addComponent(txtSolicitarPlacas, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
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

        cbxVigencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxVigencia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxVigenciaItemStateChanged(evt);
            }
        });

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxTipoItemStateChanged(evt);
            }
        });

        txtRFC1.setForeground(new java.awt.Color(0, 0, 0));
        txtRFC1.setText("Vigencia");

        txtRFC2.setForeground(new java.awt.Color(0, 0, 0));
        txtRFC2.setText("Tipo");

        btnSolicitar.setText("Solicitar");
        btnSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarActionPerformed(evt);
            }
        });

        btnBorrarCampos.setText("Borrar datos");
        btnBorrarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarCamposActionPerformed(evt);
            }
        });

        txtCosto.setForeground(new java.awt.Color(0, 0, 0));
        txtCosto.setText("Costo");

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

        txtSolicitarPlacas1.setBackground(new java.awt.Color(0, 0, 0));
        txtSolicitarPlacas1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtSolicitarPlacas1.setForeground(new java.awt.Color(0, 0, 0));
        txtSolicitarPlacas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSolicitarPlacas1.setText("Datos Cliente");

        javax.swing.GroupLayout pnlInfoPersonaLayout = new javax.swing.GroupLayout(pnlInfoPersona);
        pnlInfoPersona.setLayout(pnlInfoPersonaLayout);
        pnlInfoPersonaLayout.setHorizontalGroup(
            pnlInfoPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoPersonaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfoPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInfoPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtFechaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                        .addComponent(txtNumeroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtRFCCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtSolicitarPlacas1))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        pnlInfoPersonaLayout.setVerticalGroup(
            pnlInfoPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoPersonaLayout.createSequentialGroup()
                .addComponent(txtSolicitarPlacas1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRFCCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFechaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRFC1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRFC2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtCampoRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbxVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(pnlInfoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCosto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(btnSolicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(165, 165, 165)
                                .addComponent(btnBorrarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Separator1)
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
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRFC1)
                            .addComponent(cbxVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRFC2)
                            .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(txtCosto)
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSolicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(281, 281, 281)
                    .addComponent(Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(59, Short.MAX_VALUE)))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.buscarPersona();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtCampoRFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCampoRFCKeyTyped
        if (!(txtCampoRFC.getText().length() > 12)) {
            validador.validacionRFC(evt);
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtCampoRFCKeyTyped

    private void btnSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarActionPerformed
        generarLicencia();
    }//GEN-LAST:event_btnSolicitarActionPerformed

    private void cbxTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxTipoItemStateChanged
        setearCosto();
    }//GEN-LAST:event_cbxTipoItemStateChanged

    private void cbxVigenciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxVigenciaItemStateChanged
        this.setearCosto();
    }//GEN-LAST:event_cbxVigenciaItemStateChanged

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
    }//GEN-LAST:event_formWindowClosed

    private void btnBorrarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarCamposActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnBorrarCamposActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        new frmMenu().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void txtCampoRFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCampoRFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCampoRFCActionPerformed

    /**
     *
     * Metodo para cargar los combox de los años.
     */
    private void cargarComboBoxVigencia() {
        this.cbxVigencia.removeAllItems();
        this.cbxVigencia.addItem("1 año");
        this.cbxVigencia.addItem("2 años");
        this.cbxVigencia.addItem("3 años");

    }

    /**
     * Metodo para cargar el combo box de los tipos.
     */
    private void cargarComboBoxTipo() {
        this.cbxTipo.removeAllItems();
        this.cbxTipo.addItem("Normal");
        this.cbxTipo.addItem("Discapacitado");

    }

    /**
     * Metodo para setear la informacion.
     *
     * @param persona Objeto persona.
     */
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
    private javax.swing.JButton btnSolicitar;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JComboBox<String> cbxVigencia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel pnlInfoPersona;
    private javax.swing.JTextField txtCampoRFC;
    private javax.swing.JLabel txtCosto;
    private javax.swing.JLabel txtFechaCliente;
    private javax.swing.JLabel txtNombreCliente;
    private javax.swing.JLabel txtNumeroCliente;
    private javax.swing.JLabel txtRFC;
    private javax.swing.JLabel txtRFC1;
    private javax.swing.JLabel txtRFC2;
    private javax.swing.JLabel txtRFCCliente;
    private javax.swing.JLabel txtSolicitarPlacas;
    private javax.swing.JLabel txtSolicitarPlacas1;
    // End of variables declaration//GEN-END:variables

    /**
     * Metodo para generar los costos en base al tipo seleccionado y a la
     * vigencia.
     *
     * @return retorna los costos.
     */
    private float generarCosto() {
        float costo = 0;
        switch (this.cbxTipo.getModel().getSelectedItem().toString()) {
            case "Normal" ->
                tipo = tipoLicencia.NORMAL;
            case "Discapacitado" ->
                tipo = tipoLicencia.DISCAPACITADO;
        }
        switch (this.cbxVigencia.getModel().getSelectedItem().toString()) {

            case "1 año":
                vigencia = 1;
                if (tipo == tipoLicencia.NORMAL) {
                    costo = 600;
                } else {
                    costo = 200;
                }
                break;
            case "2 años":
                vigencia = 2;
                if (tipo == tipoLicencia.NORMAL) {
                    costo = 900;
                } else {
                    costo = 500;
                }
                break;
            case "3 años":
                vigencia = 3;
                if (tipo == tipoLicencia.NORMAL) {
                    costo = 1100;
                } else {
                    costo = 700;
                }
                break;
        }
        return costo;
    }

    /**
     * Metodo para generar la licencia.
     *
     * @return objeto de tipo licencia.
     */
    private Licencia generarLicencia() {
        Calendar fechaVigencia = Calendar.getInstance();
        fechaVigencia.add(Calendar.YEAR, vigencia);
        Licencia licencia = new Licencia(tipo, vigencia, true, generarCosto(), Calendar.getInstance(), fechaVigencia, personaProspecto);
        try {
            if (licenciasDAO.buscarLicenciaPersona(personaProspecto) == null) {
                licenciasDAO.agregarLicencia(licencia);
                JOptionPane.showMessageDialog(this, "Se genero la licencia \nCosto: $" + licencia.getCosto());
                lanzarConfirmacion();
            } else {
                licenciasDAO.actualizarLicencia(licencia);
                JOptionPane.showMessageDialog(this, "Se genero la licencia \nCosto: $" + licencia.getCosto());
                lanzarConfirmacion();
            }
        } catch (PersistenciaException ex) {
            Logger.getLogger(frmSolicitarLicencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * Metodo para lanzar confirmacion.
     */
    private void lanzarConfirmacion() {
        int respuesta = JOptionPane.showOptionDialog(null, "¿Deseas realizar otro?", "Confirmación",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (respuesta == JOptionPane.YES_OPTION) {
            limpiarCampos();
        } else {
            new frmMenu().setVisible(true);
            this.setVisible(false);
        }
    }

    /**
     * Metodo para dejar todos los campos en blanco.
     */
    private void limpiarCampos() {
        this.txtCampoRFC.setText("");
        this.btnSolicitar.setEnabled(false);
        this.pnlInfoPersona.setVisible(false);
    }

    /**
     * Metodo para actualizar el costo de la licencia.
     */
    private void setearCosto() {
        try {
            this.txtCosto.setText("Costo: " + generarCosto());
        } catch (NullPointerException nul) {
            nul.getMessage();

        }
    }

    /**
     * Metodo para buscar la persona y setear la info en el panel de
     * informacion.
     */
    private void buscarPersona() {
        if (this.txtCampoRFC.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un RFC valido");
        } else {
            try {
                personaProspecto = personasDAO.buscarPersonaRFC(this.txtCampoRFC.getText());
                if (personaProspecto != null) {
                    this.pnlInfoPersona.setVisible(true);
                    personaProspecto.setNombreCompleto(encriptador.getDesencriptado(personaProspecto.getNombreCompleto()));
                    setearInfo(personaProspecto);
                    this.txtCosto.setText("Costo: $" + generarCosto());
                    this.btnSolicitar.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(this, "El RFC no pertenece a ninguna persona");
                }
            } catch (PersistenciaException ex) {
                JOptionPane.showMessageDialog(this, "El RFC no pertenece a ninguna persona");

            }
        }
    }

}
