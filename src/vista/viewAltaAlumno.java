/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controladores.AlumnoData;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import modelo.Alumno;

/**
 *
 * @author long_
 */
public class viewAltaAlumno extends javax.swing.JInternalFrame {

    private AlumnoData ad;
    /**
     * Creates new form viewAlumno
     */
    public viewAltaAlumno(AlumnoData ad) {
        initComponents();
        this.ad = ad;
    }
    
    public void mensaje(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);
    }
    
    /*public void traerAlumno(){
        Alumno al = ad.obtenerAlumnoPorID(tfDNI.getText());
        tfDNI.setText(al.getDni());
        cbEstado.setSelected(al.isEstado());
    }*/

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
        tfDNI = new javax.swing.JTextField();
        tfApellido = new javax.swing.JTextField();
        dcFechaDeNacimiento = new com.toedter.calendar.JDateChooser();
        tfNombre = new javax.swing.JTextField();
        cbEstado = new javax.swing.JCheckBox();
        bGuardar = new javax.swing.JButton();
        Estado = new javax.swing.JLabel();
        bGuardar1 = new javax.swing.JButton();

        jLabel1.setText("DNI:");

        jLabel2.setText("Apellido:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("F de nacimiento:");

        jLabel5.setText("Estado:");

        tfApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfApellidoActionPerformed(evt);
            }
        });

        cbEstado.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cbEstadoStateChanged(evt);
            }
        });

        bGuardar.setText("Guardar");
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });

        bGuardar1.setText("Buscar");
        bGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcFechaDeNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Estado)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfNombre)
                            .addComponent(tfApellido)
                            .addComponent(tfDNI)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bGuardar)
                        .addGap(38, 38, 38)
                        .addComponent(bGuardar1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dcFechaDeNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbEstado)
                            .addComponent(jLabel5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Estado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bGuardar)
                    .addComponent(bGuardar1))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfApellidoActionPerformed

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        ad.Alta(new Alumno(tfDNI.getText(), tfApellido.getText(), tfNombre.getText(), dcFechaDeNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), cbEstado.isSelected()));
    }//GEN-LAST:event_bGuardarActionPerformed

    private void cbEstadoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cbEstadoStateChanged
        if(cbEstado.isSelected()){
            Estado.setText("El estado es verdadero.");
        } else {
            Estado.setText("");
        }
    }//GEN-LAST:event_cbEstadoStateChanged

    private void bGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardar1ActionPerformed
        mensaje("");
    }//GEN-LAST:event_bGuardar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Estado;
    private javax.swing.JButton bGuardar;
    private javax.swing.JButton bGuardar1;
    private javax.swing.JCheckBox cbEstado;
    private com.toedter.calendar.JDateChooser dcFechaDeNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfDNI;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}