/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Guis;

import dbServices.DBServiceInvoker;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kain
 */
public class Workplace extends javax.swing.JFrame {
    //Init treshhold
    private static String fikuID = null;
    private static String placeID = null ;
    /**
     * Creates new form Workplace
     */
    public Workplace() {
        initComponents();
        showTable(workplaceTable);
    }
    /**
     * 
     * @return the FikuID
     */
    public static String getFikuId(){
        return fikuID;
    }
    /**
     * 
     * @return the FikuID
     */
    public static String getPlaceId(){
        return placeID;
    }
    /**
     * Copies our selected ID
     * @param toString 
     * @return fikuId deliver the selected fikuId
     */
    public String setFikuId(String toString) {
       String[] subString = toString.split(Pattern.quote(" "));
       String fikuId = subString[0];
       return fikuId;
    }
    /**
     * Copies our selected ID
     * @param toString 
     * @return fikuId deliver the selected fikuId
     */
    public String setPlaceId(String toString) {
       String[] subString = toString.split(Pattern.quote(" "));
       String placeId = subString[1];
       return placeId;
    }
    /**
     * 
     */
    private void showTable(JTable table) {
        DefaultTableModel defaultTable = (DefaultTableModel) table.getModel();

        try {
            DBServiceInvoker invoke = new DBServiceInvoker();

            List<String> workplace = invoke.invokeSelect("fiku_has_place", "");
            Iterator<String> i = workplace.iterator();
            while (i.hasNext()) {
                String[] subString = i.next().split(Pattern.quote(" "));

                String idFiKu = subString[0];
                String placeId = subString[1];
                                
                defaultTable.addRow(new Object[]{idFiKu, placeId,});
            }
            invoke.cleanErrorString();

        } catch (SQLException sqlex) {

            System.out.println("SQL Error : " + sqlex.getMessage());
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonRefresh = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        workplaceTable = new javax.swing.JTable();
        jButtonOk = new javax.swing.JButton();
        jButtonClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Workplace");

        jButtonRefresh.setText("Refresh");
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });

        workplaceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dept. ID", "Workplace ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workplaceTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setViewportView(workplaceTable);

        jButtonOk.setText("OK");
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });

        jButtonClose.setText("Close");
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonOk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                        .addComponent(jButtonRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonClose)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClose)
                    .addComponent(jButtonOk)
                    .addComponent(jButtonRefresh))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
        try {
            DefaultTableModel defaultTable = (DefaultTableModel) workplaceTable.getModel();
            defaultTable.setRowCount(0);
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        showTable(workplaceTable);
    }//GEN-LAST:event_jButtonRefreshActionPerformed

    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
         int count = workplaceTable.getSelectedRow();
        StringBuilder id = new StringBuilder();
        if (count > -1) {
            for (int i = 0; i < workplaceTable.getColumnCount() ; i++) {
                id.append(workplaceTable.getValueAt(count, i));
                id.append(" ");
            }
            fikuID = setFikuId(id.toString());
            placeID = setPlaceId(id.toString());
            System.out.println(id);
            AddPerku newPerku = new AddPerku();
            newPerku.setVisible(true);
            super.dispose();

        }
        else new PleaseSelectMessage().setVisible(true);
    }//GEN-LAST:event_jButtonOkActionPerformed

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCloseActionPerformed

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
            java.util.logging.Logger.getLogger(Workplace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Workplace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Workplace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Workplace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Workplace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable workplaceTable;
    // End of variables declaration//GEN-END:variables
}
