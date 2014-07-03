/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Guis;

/**
 *
 * @author Kain
 */
public class AddPosition extends javax.swing.JFrame {

    /**
     * Creates new form AddInvoice
     */
    public AddPosition() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelMaintenanceId = new javax.swing.JLabel();
        jTextFieldMaintenanceId = new javax.swing.JTextField();
        jTextFieldLicenseId = new javax.swing.JTextField();
        jLabelLicenseId = new javax.swing.JLabel();
        jTextFieldGroupLicenseId = new javax.swing.JTextField();
        jLabelGroupLicenseId = new javax.swing.JLabel();
        jTextFieldQuantity = new javax.swing.JTextField();
        jLabelQuantity = new javax.swing.JLabel();
        jTextFieldTotalAmExVAT = new javax.swing.JTextField();
        jLabelTotalAmExVat = new javax.swing.JLabel();
        jTextFieldTotalVat = new javax.swing.JTextField();
        jLabelTotalVat = new javax.swing.JLabel();
        jTextFieldVat = new javax.swing.JTextField();
        jLabelVat = new javax.swing.JLabel();
        jTextFieldPositionTotal = new javax.swing.JTextField();
        jLabelPositionTotal = new javax.swing.JLabel();
        jButtonCancel = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonSelectMaintenanceId = new javax.swing.JButton();
        jButtonSelectLicenseId = new javax.swing.JButton();
        jButtonSelectGroupLicenseId = new javax.swing.JButton();
        jLabelDiscount = new javax.swing.JLabel();
        jTextFieldDiscount = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Position");

        jLabelMaintenanceId.setText("Maintenance ID");

        jTextFieldMaintenanceId.setEditable(false);

        jTextFieldLicenseId.setEditable(false);

        jLabelLicenseId.setText("License ID");

        jTextFieldGroupLicenseId.setEditable(false);

        jLabelGroupLicenseId.setText("Group License ID");

        jLabelQuantity.setText("Quantity");

        jLabelTotalAmExVat.setText("TotalAmExVAT");

        jLabelTotalVat.setText("TotalVAT");

        jLabelVat.setText("VAT");

        jLabelPositionTotal.setText("Position Total");

        jButtonCancel.setText("Cancel");

        jButtonSave.setText("Save");

        jButtonSelectMaintenanceId.setText("Select");

        jButtonSelectLicenseId.setText("Select");

        jButtonSelectGroupLicenseId.setText("Select");

        jLabelDiscount.setText("Discount");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSave))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelQuantity)
                            .addComponent(jLabelTotalAmExVat))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldQuantity)
                            .addComponent(jTextFieldTotalAmExVAT)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMaintenanceId)
                            .addComponent(jLabelLicenseId)
                            .addComponent(jLabelGroupLicenseId))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldMaintenanceId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSelectMaintenanceId))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldLicenseId, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                    .addComponent(jTextFieldGroupLicenseId))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonSelectGroupLicenseId)
                                    .addComponent(jButtonSelectLicenseId, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTotalVat)
                            .addComponent(jLabelVat)
                            .addComponent(jLabelPositionTotal)
                            .addComponent(jLabelDiscount))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDiscount)
                            .addComponent(jTextFieldVat)
                            .addComponent(jTextFieldTotalVat)
                            .addComponent(jTextFieldPositionTotal))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMaintenanceId)
                    .addComponent(jTextFieldMaintenanceId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSelectMaintenanceId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLicenseId)
                    .addComponent(jTextFieldLicenseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSelectLicenseId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGroupLicenseId)
                    .addComponent(jTextFieldGroupLicenseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSelectGroupLicenseId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQuantity)
                    .addComponent(jTextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTotalAmExVat)
                    .addComponent(jTextFieldTotalAmExVAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTotalVat)
                    .addComponent(jTextFieldTotalVat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVat)
                    .addComponent(jTextFieldVat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPositionTotal)
                    .addComponent(jTextFieldPositionTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDiscount)
                    .addComponent(jTextFieldDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonSave))
                .addContainerGap())
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
            java.util.logging.Logger.getLogger(AddPosition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPosition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPosition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPosition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPosition().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonSelectGroupLicenseId;
    private javax.swing.JButton jButtonSelectLicenseId;
    private javax.swing.JButton jButtonSelectMaintenanceId;
    private javax.swing.JLabel jLabelDiscount;
    private javax.swing.JLabel jLabelGroupLicenseId;
    private javax.swing.JLabel jLabelLicenseId;
    private javax.swing.JLabel jLabelMaintenanceId;
    private javax.swing.JLabel jLabelPositionTotal;
    private javax.swing.JLabel jLabelQuantity;
    private javax.swing.JLabel jLabelTotalAmExVat;
    private javax.swing.JLabel jLabelTotalVat;
    private javax.swing.JLabel jLabelVat;
    private javax.swing.JTextField jTextFieldDiscount;
    private javax.swing.JTextField jTextFieldGroupLicenseId;
    private javax.swing.JTextField jTextFieldLicenseId;
    private javax.swing.JTextField jTextFieldMaintenanceId;
    private javax.swing.JTextField jTextFieldPositionTotal;
    private javax.swing.JTextField jTextFieldQuantity;
    private javax.swing.JTextField jTextFieldTotalAmExVAT;
    private javax.swing.JTextField jTextFieldTotalVat;
    private javax.swing.JTextField jTextFieldVat;
    // End of variables declaration//GEN-END:variables
}
