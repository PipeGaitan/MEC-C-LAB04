/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Punto2;


import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author Usuario
 */
public class Impresiondata extends javax.swing.JFrame {

    
    public Impresiondata() {
        initComponents();
    }
      public void imprimirListas(List<Vehiculo> carros, List<Vehiculo> motos, List<Vehiculo> bicis) {
        DefaultListModel<String> modeloLista = new DefaultListModel<>(); 
        modeloLista.addElement("Carros:");
        for (Vehiculo carro : carros) {
            modeloLista.addElement("- Placa: " + carro.getPlaca() + " - Hora de llegada: " + carro.getHoraLlegada() + " - Valor a pagar: $" + carro.getValor());
        }
         modeloLista.addElement("Motos:");
        for (Vehiculo moto : motos) {
            modeloLista.addElement("- Placa: " + moto.getPlaca() + " - Hora de llegada: " + moto.getHoraLlegada() + " - Valor a pagar: $" + moto.getValor());
        }
         modeloLista.addElement("Bicis:");
        for (Vehiculo bici : bicis) {
            modeloLista.addElement("- Placa: " + bici.getPlaca() + " - Hora de llegada: " + bici.getHoraLlegada() + " - Valor a pagar: $" + bici.getValor());
        }

        jListMostrar.setModel(modeloLista);
        int valorTotalCarros = carros.stream().mapToInt(Vehiculo::getValor).sum();
        int valorTotalMotos = motos.stream().mapToInt(Vehiculo::getValor).sum();
        int valorTotalBicis = bicis.stream().mapToInt(Vehiculo::getValor).sum();

        jLabelTotal.setText("Valor total a pagar: $" + (valorTotalCarros + valorTotalMotos + valorTotalBicis));
        
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListMostrar = new javax.swing.JList<>();
        jLabelTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jListMostrar.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListMostrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Impresiondata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Impresiondata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Impresiondata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Impresiondata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Impresiondata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JList<String> jListMostrar;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
