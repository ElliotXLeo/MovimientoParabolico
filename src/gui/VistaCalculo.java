package gui;

import clases.MovimientoParabolico;
import java.text.DecimalFormat;

public class VistaCalculo extends javax.swing.JFrame {

    DecimalFormat df = new DecimalFormat("#.##");
    MovimientoParabolico movimientoParabolico = new MovimientoParabolico();

    public VistaCalculo() {
        initComponents();
        llenarComboBoxGravedad();
        this.setLocationRelativeTo(null);
    }

    private void llenarComboBoxGravedad() {
        double valorGravedad = 10.0;
        for (int i = 0; i < 101; i++) {
            jComboBoxGravedad.addItem(df.format(valorGravedad) + "");
            valorGravedad = valorGravedad - 0.1;
        }
    }

    public static String resultados = "";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelVelocidad = new javax.swing.JLabel();
        jLabelAngulo = new javax.swing.JLabel();
        jLabelAltura = new javax.swing.JLabel();
        jLabelGravedad = new javax.swing.JLabel();
        jSliderVelocidad = new javax.swing.JSlider();
        jSliderAngulo = new javax.swing.JSlider();
        jSliderAltura = new javax.swing.JSlider();
        jComboBoxGravedad = new javax.swing.JComboBox<>();
        jLabelValorVelocidad = new javax.swing.JLabel();
        jLabelValorAngulo = new javax.swing.JLabel();
        jLabelValorAltura = new javax.swing.JLabel();
        jButtonCalcular = new javax.swing.JButton();
        jButtonRestablecer = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Simulación del lanzamiento de todo objeto empleando magnitudes físicas");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        jLabelVelocidad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelVelocidad.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVelocidad.setText("Velocidad inicial (m/s)");
        getContentPane().add(jLabelVelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        jLabelAngulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelAngulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAngulo.setText("Angulo de lanzamiento (°)");
        getContentPane().add(jLabelAngulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        jLabelAltura.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelAltura.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAltura.setText("Altura incial (m)");
        getContentPane().add(jLabelAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        jLabelGravedad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelGravedad.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGravedad.setText("Gravedad (m/s^2)");
        getContentPane().add(jLabelGravedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        jSliderVelocidad.setForeground(new java.awt.Color(255, 255, 255));
        jSliderVelocidad.setMajorTickSpacing(10);
        jSliderVelocidad.setPaintLabels(true);
        jSliderVelocidad.setPaintTicks(true);
        jSliderVelocidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderVelocidadStateChanged(evt);
            }
        });
        getContentPane().add(jSliderVelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 320, 40));

        jSliderAngulo.setForeground(new java.awt.Color(255, 255, 255));
        jSliderAngulo.setMajorTickSpacing(10);
        jSliderAngulo.setMaximum(90);
        jSliderAngulo.setPaintLabels(true);
        jSliderAngulo.setPaintTicks(true);
        jSliderAngulo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderAnguloStateChanged(evt);
            }
        });
        getContentPane().add(jSliderAngulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 320, 40));

        jSliderAltura.setForeground(new java.awt.Color(255, 255, 255));
        jSliderAltura.setMajorTickSpacing(10);
        jSliderAltura.setPaintLabels(true);
        jSliderAltura.setPaintTicks(true);
        jSliderAltura.setValue(0);
        jSliderAltura.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderAlturaStateChanged(evt);
            }
        });
        getContentPane().add(jSliderAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 320, -1));

        jComboBoxGravedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9.8" }));
        jComboBoxGravedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGravedadActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxGravedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 380, -1));

        jLabelValorVelocidad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelValorVelocidad.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValorVelocidad.setText("50");
        getContentPane().add(jLabelValorVelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        jLabelValorAngulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelValorAngulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValorAngulo.setText("50");
        getContentPane().add(jLabelValorAngulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        jLabelValorAltura.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelValorAltura.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValorAltura.setText("0");
        getContentPane().add(jLabelValorAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 200, -1));

        jButtonRestablecer.setText("Restablecer");
        jButtonRestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestablecerActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRestablecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 200, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed

        movimientoParabolico.setVelocidad(jSliderVelocidad.getValue());
        movimientoParabolico.setAngulo(jSliderAngulo.getValue());
        movimientoParabolico.setPosicionInicialY(jSliderAltura.getValue());
        movimientoParabolico.setGravedad(Double.parseDouble(jComboBoxGravedad.getSelectedItem().toString()));

        resultados = ("");

        resultados += ("Velocidad inicial en los ejes cardinales\n");
        resultados += ("Vox = Vo*Cos(α)\n");
        resultados += ("Vox = " + df.format(movimientoParabolico.velocidadInicialX()) + " m/s\n");
        resultados += ("Voy = Vo*Sen(α)\n");
        resultados += ("Voy = " + df.format(movimientoParabolico.velocidadInicialY()) + " m/s\n\n");

        resultados += ("Tiempo de altura máxima\n");
        resultados += ("tmax = Voy/g\n");
        resultados += ("tmax = " + df.format(movimientoParabolico.tiempoAlturaMaximaY()) + " s\n\n");

        resultados += ("Tiempo de vuelo\n");
        resultados += ("t =(-Voy - (((Voy^2) - (4.0 * (-g / 2.0) * Yo))^(1.0/2.0))) / (2.0 * (-g / 2.0)))\n");
        resultados += ("t = " + df.format(movimientoParabolico.tiempoVueloY()) + " s\n\n");

        resultados += ("Altura máxima\n");
        resultados += ("hmax = Yo + Voy*tmax - 1/2*g*tmax^2\n");
        resultados += ("hmax = " + df.format(movimientoParabolico.alturaMaximaY()) + " m\n\n");

        resultados += ("Distancia máxima\n");
        resultados += ("Xmax = Vox*t\n");
        resultados += ("Xmax = " + df.format(movimientoParabolico.posicionFinalX()) + " m");

        VistaReporte vistaReporte = new VistaReporte();
        vistaReporte.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCalcularActionPerformed

    private void jComboBoxGravedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGravedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxGravedadActionPerformed

    private void jButtonRestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestablecerActionPerformed
        jSliderVelocidad.setValue(50);
        jSliderAngulo.setValue(50);
        jSliderAltura.setValue(0);
        jComboBoxGravedad.setSelectedIndex(0);
    }//GEN-LAST:event_jButtonRestablecerActionPerformed

    private void jSliderAlturaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderAlturaStateChanged
        jLabelValorAltura.setText(jSliderAltura.getValue() + "");
    }//GEN-LAST:event_jSliderAlturaStateChanged

    private void jSliderAnguloStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderAnguloStateChanged
        jLabelValorAngulo.setText(jSliderAngulo.getValue() + "");
    }//GEN-LAST:event_jSliderAnguloStateChanged

    private void jSliderVelocidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderVelocidadStateChanged
        jLabelValorVelocidad.setText(jSliderVelocidad.getValue() + "");
    }//GEN-LAST:event_jSliderVelocidadStateChanged

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
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaCalculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCalculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCalculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCalculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCalculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonRestablecer;
    private javax.swing.JComboBox<String> jComboBoxGravedad;
    private javax.swing.JLabel jLabelAltura;
    private javax.swing.JLabel jLabelAngulo;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelGravedad;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelValorAltura;
    private javax.swing.JLabel jLabelValorAngulo;
    private javax.swing.JLabel jLabelValorVelocidad;
    private javax.swing.JLabel jLabelVelocidad;
    private javax.swing.JSlider jSliderAltura;
    private javax.swing.JSlider jSliderAngulo;
    private javax.swing.JSlider jSliderVelocidad;
    // End of variables declaration//GEN-END:variables
}
