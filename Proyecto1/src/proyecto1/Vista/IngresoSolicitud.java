package proyecto1.Vista;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyecto1.control.DTOSolicitud;
import proyecto1.control.UICoordinador;

/**
 *
 * @author DrkSprtn
 */
public class IngresoSolicitud extends javax.swing.JFrame {
    private UICoordinador ui;
    /**
     * Creates new form IngresoSolicitud
     */
    public IngresoSolicitud() {
        initComponents();
        ocultarElementos();
        ui=new UICoordinador();
        
    }
    public void modoVista(DTOSolicitud dto){
        setIdSolicitante(dto.getIdSolicitante());
        setNombreSolicitante(dto.getNombreSolicitante());
        setPeriodoLectivo(dto.getPeriodo());
        setGrupo(dto.getGrupoCurso());
        setCurso(dto.getCodigoCurso());
        setIdAfectado(dto.getIdAfectado());
        setNombreAfectado(dto.getNombreAfectado());
        setCorreoAfectado(dto.getCorreoAfectado());
        setTelefonoAfectado(dto.getNumeroAfectado());
        setTipoSolicitud(dto.getTipoInconsistencia());
        setDescripcion(dto.getDescripcion());
        btnResolucion.setVisible(true);
        btnAnularSolicitud.setVisible(true);
        btnNuevaSolicitud.setVisible(false);
        evidencia.setVisible(false);
        lblEvidencia.setVisible(false);
        
        
    }
    public void ocultarElementos(){
        btnResolucion.setVisible(false);
        btnAnularSolicitud.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tipoSolicitud = new javax.swing.JComboBox<>();
        nombreSolicitante = new javax.swing.JTextField();
        idSolicitante = new javax.swing.JTextField();
        periodoLectivo = new javax.swing.JTextField();
        grupo = new javax.swing.JTextField();
        curso = new javax.swing.JTextField();
        idAfectado = new javax.swing.JTextField();
        nombreAfectado = new javax.swing.JTextField();
        telefonoAfectado = new javax.swing.JTextField();
        lblEvidencia = new javax.swing.JLabel();
        evidencia = new javax.swing.JFileChooser();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextPane();
        correoAfectado = new javax.swing.JTextField();
        btnNuevaSolicitud = new javax.swing.JButton();
        btnResolucion = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        btnAnularSolicitud = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Identificación Solicitante");

        jLabel2.setText("Nombre del Solicitante");

        jLabel3.setText("Período Lectivo de la Inconsistencia");

        jLabel4.setText("Grupo");

        jLabel5.setText("Curso");

        jLabel6.setText("Carné del Estudiante Afectado");

        jLabel7.setText("Nombre del Estudiante Afectado");

        jLabel8.setText("Correo Electrónico del Estudiante Afectado");

        jLabel9.setText("Teléfono del Estudiante Afectado");

        jLabel10.setText("Tipo de Inconsistencia ");

        tipoSolicitud.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Error Nota", "Inclusión Acta", "Exclusión Acta" }));

        nombreSolicitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreSolicitanteActionPerformed(evt);
            }
        });

        idSolicitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idSolicitanteActionPerformed(evt);
            }
        });

        periodoLectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periodoLectivoActionPerformed(evt);
            }
        });

        grupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupoActionPerformed(evt);
            }
        });

        curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cursoActionPerformed(evt);
            }
        });

        idAfectado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idAfectadoActionPerformed(evt);
            }
        });

        nombreAfectado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreAfectadoActionPerformed(evt);
            }
        });

        telefonoAfectado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoAfectadoActionPerformed(evt);
            }
        });

        lblEvidencia.setText("Evidencia");

        jLabel13.setText("Descripción Detallada de la Situación");

        jScrollPane2.setViewportView(descripcion);

        correoAfectado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoAfectadoActionPerformed(evt);
            }
        });

        btnNuevaSolicitud.setText("Agregar Nueva Solicitud");
        btnNuevaSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaSolicitudActionPerformed(evt);
            }
        });

        btnResolucion.setText("Generar Resolución");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnAnularSolicitud.setText("Anular Solicitud");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefonoAfectado, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombreAfectado, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idAfectado, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(curso, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(correoAfectado, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tipoSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(periodoLectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nombreSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(idSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnVolver)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                                        .addComponent(btnAnularSolicitud)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnResolucion)))))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevaSolicitud)
                        .addGap(28, 28, 28)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(lblEvidencia))
                        .addGap(0, 304, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(evidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEvidencia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(evidencia, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnNuevaSolicitud)
                                    .addComponent(btnVolver)
                                    .addComponent(btnAnularSolicitud)
                                    .addComponent(btnResolucion))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(nombreSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(periodoLectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idAfectado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreAfectado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(correoAfectado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefonoAfectado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreSolicitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreSolicitanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreSolicitanteActionPerformed

    private void idSolicitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idSolicitanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idSolicitanteActionPerformed

    private void periodoLectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periodoLectivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_periodoLectivoActionPerformed

    private void grupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grupoActionPerformed

    private void cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cursoActionPerformed

    private void idAfectadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idAfectadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idAfectadoActionPerformed

    private void nombreAfectadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreAfectadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreAfectadoActionPerformed

    private void telefonoAfectadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoAfectadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoAfectadoActionPerformed

    private void correoAfectadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoAfectadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoAfectadoActionPerformed

    private void btnNuevaSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaSolicitudActionPerformed

        try {
            ui.agregarSolicitud(this);
        } catch (IOException ex) {
            Logger.getLogger(IngresoSolicitud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNuevaSolicitudActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
        new Solicitudes().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IngresoSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoSolicitud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnularSolicitud;
    private javax.swing.JButton btnNuevaSolicitud;
    private javax.swing.JButton btnResolucion;
    private javax.swing.JButton btnVolver;
    private javax.swing.JTextField correoAfectado;
    private javax.swing.JTextField curso;
    private javax.swing.JTextPane descripcion;
    private javax.swing.JFileChooser evidencia;
    private javax.swing.JTextField grupo;
    private javax.swing.JTextField idAfectado;
    private javax.swing.JTextField idSolicitante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEvidencia;
    private javax.swing.JTextField nombreAfectado;
    private javax.swing.JTextField nombreSolicitante;
    private javax.swing.JTextField periodoLectivo;
    private javax.swing.JTextField telefonoAfectado;
    private javax.swing.JComboBox<String> tipoSolicitud;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the correoAfectado
     */
    public javax.swing.JTextField getCorreoAfectado() {
        return correoAfectado;
    }

    /**
     * @return the curso
     */
    public javax.swing.JTextField getCurso() {
        return curso;
    }

    /**
     * @return the descripcion
     */
    public javax.swing.JTextPane getDescripcion() {
        return descripcion;
    }

    /**
     * @return the evidencia
     */
    public javax.swing.JFileChooser getEvidencia() {
        return evidencia;
    }

    /**
     * @return the grupo
     */
    public javax.swing.JTextField getGrupo() {
        return grupo;
    }

    /**
     * @return the idAfectado
     */
    public javax.swing.JTextField getIdAfectado() {
        return idAfectado;
    }

    /**
     * @return the idSolicitante
     */
    public javax.swing.JTextField getIdSolicitante() {
        return idSolicitante;
    }

    /**
     * @return the jComboBox1
     */
    public javax.swing.JComboBox<String> getTipoSolicitud() {
        return tipoSolicitud;
    }

    /**
     * @return the nombreAfectado
     */
    public javax.swing.JTextField getNombreAfectado() {
        return nombreAfectado;
    }

    /**
     * @return the nombreSolicitante
     */
    public javax.swing.JTextField getNombreSolicitante() {
        return nombreSolicitante;
    }

    /**
     * @return the periodoLectivo
     */
    public javax.swing.JTextField getPeriodoLectivo() {
        return periodoLectivo;
    }

    /**
     * @return the telefonoAfectado
     */
    public javax.swing.JTextField getTelefonoAfectado() {
        return telefonoAfectado;
        
    }

    /**
     * @param correoAfectado the correoAfectado to set
     */
    public void setCorreoAfectado(String pCorreo) {
        this.correoAfectado.setText(pCorreo);
        this.correoAfectado.setEnabled(false);
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String pCurso) {
        this.curso.setText(pCurso);
        this.curso.setEnabled(false);
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String pDescripcion) {
        this.descripcion.setText(pDescripcion);
        this.descripcion.setEnabled(false);
    }

    /**
     * @param evidencia the evidencia to set
     */
    public void ocultarEvidencia() {
        this.evidencia.setVisible(false);
    }

    /**
     * @param grupo the grupo to set
     */
    public void setGrupo(String pGrupo) {
        this.grupo.setText(pGrupo);
        this.grupo.setEnabled(false);
    }

    /**
     * @param idAfectado the idAfectado to set
     */
    public void setIdAfectado(String pIdAfectado) {
        this.idAfectado.setText(pIdAfectado);
        this.idAfectado.setEnabled(false);
    }

    /**
     * @param idSolicitante the idSolicitante to set
     */
    public void setIdSolicitante(String pIdSolicitante) {
        this.idSolicitante.setText(pIdSolicitante);
        this.idSolicitante.setEnabled(false);
    }

    /**
     * @param nombreAfectado the nombreAfectado to set
     */
    public void setNombreAfectado(String pNombreAfectado) {
        this.nombreAfectado.setText(pNombreAfectado);
        this.nombreAfectado.setEnabled(false);
    }

    /**
     * @param nombreSolicitante the nombreSolicitante to set
     */
    public void setNombreSolicitante(String pNombreSolicitante) {
        this.nombreSolicitante.setText(pNombreSolicitante);
        this.nombreSolicitante.setEnabled(false);
    }

    /**
     * @param periodoLectivo the periodoLectivo to set
     */
    public void setPeriodoLectivo(String pPeriodoLectivo) {
        this.periodoLectivo.setText(pPeriodoLectivo);
        this.periodoLectivo.setEnabled(false);
    }

    /**
     * @param telefonoAfectado the telefonoAfectado to set
     */
    public void setTelefonoAfectado(String pTelefonoAfectado) {
        this.telefonoAfectado.setText(pTelefonoAfectado);
        this.telefonoAfectado.setEnabled(false);
    }

    /**
     * @param tipoSolicitud the tipoSolicitud to set
     */
    public void setTipoSolicitud(String pTipoSolicitud) {
        this.tipoSolicitud.removeAllItems();
        this.tipoSolicitud.addItem(pTipoSolicitud);
        this.tipoSolicitud.setEnabled(false);
    }
}