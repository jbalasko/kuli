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
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juraj
 */
public class Department extends javax.swing.JFrame {
    //Init treshhold
    private static String ID=null;
    /**
     * Creates new form Department
     */
    public Department() {
        initComponents();
    }
    /**
     * Creates new boolean form Department
     */
    public Department(boolean value){
        if(value == true){
        initComponents2();
        showTable(departmentsSecondTable);
        }
    }
    /** fills table <code>deptTable</code> with data and shows it in this form
     * 
     */
    private void showTable(JTable table) {
        DefaultTableModel defaultTable = (DefaultTableModel) table.getModel();

        try {
            DBServiceInvoker invoke = new DBServiceInvoker();
            List<String> pers = invoke.invokeSelect("DEPARTMENTS", "");
            Iterator<String> i = pers.iterator();
            while (i.hasNext()) {
                String[] subString = i.next().split(Pattern.quote(" "));

                String idDepartments = subString[0];
                String department = subString[1];
                
                defaultTable.addRow(new Object[]{idDepartments, department});
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        deptTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        editFikuButton = new javax.swing.JButton();
        refreshFikuButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Departments");

        deptTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Department ID", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(deptTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
        );

        editFikuButton.setText("Edit");
        editFikuButton.setToolTipText("Edit selected");
        editFikuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editFikuButtonActionPerformed(evt);
            }
        });

        refreshFikuButton.setText("Refresh");
        refreshFikuButton.setToolTipText("Update list");
        refreshFikuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshFikuButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add new");
        addButton.setToolTipText("Add to the list");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        closeButton.setText("Close");
        closeButton.setToolTipText("Close and return");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editFikuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(refreshFikuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeButton)
                .addGap(6, 6, 6))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshFikuButton)
                    .addComponent(closeButton)
                    .addComponent(editFikuButton)
                    .addComponent(addButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Init Componets2()
     * 
     */
    private void initComponents2(){
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        departmentsSecondTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        okButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Departments");

        departmentsSecondTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Department ID", "Name"
            }
        ));
        jScrollPane5.setViewportView(departmentsSecondTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
        );

        okButton.setText("OK");
        okButton.setToolTipText("Ok for this Table");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

 
        closeButton.setText("Close");
        closeButton.setToolTipText("Close and return");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(okButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeButton)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(closeButton)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        AddDept addDept = new AddDept();
        addDept.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addButtonActionPerformed

    private void editFikuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editFikuButtonActionPerformed
        /*java.awt.EventQueue.invokeLater(() -> {*/
            int count = deptTable.getSelectedRow();
            StringBuilder id = new StringBuilder();
            if (count > -1) {
                for (int i = 0; i < deptTable.getColumnCount() ; i++) {
                    id.append(deptTable.getValueAt(count, i));
                    id.append(" ");
                }

                new AddDept(id.toString()).setVisible(true);
                /*});
        java.awt.EventQueue.invokeLater(() -> {*/
            super.dispose();
            /*        });*/
    }
    else new PleaseSelectMessage().setVisible(true);
    }//GEN-LAST:event_editFikuButtonActionPerformed

    private void refreshFikuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshFikuButtonActionPerformed
        try {
            DefaultTableModel defaultTable = (DefaultTableModel) deptTable.getModel();
            defaultTable.setRowCount(0);
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        try{
            showTable(deptTable);
        }catch(Exception e){
            System.out.println("Could not write the Data to List!");
        }
    }//GEN-LAST:event_refreshFikuButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int count = departmentsSecondTable.getSelectedRow();
        StringBuilder id = new StringBuilder();
        if (count > -1) {
            for (int i = 0; i < departmentsSecondTable.getColumnCount() ; i++) {
                id.append(departmentsSecondTable.getValueAt(count, i));
                id.append(" ");
            }
            ID = getSelectedID(id.toString());
            System.out.println(id);
            AddPerku newPerku = new AddPerku();
            newPerku.setVisible(true);
            super.dispose();

        }
        else new PleaseSelectMessage().setVisible(true);
    }
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
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Department().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JTable deptTable;
    private javax.swing.JButton editFikuButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshFikuButton;
    // End of variables declaration//GEN-END:variables
    //Variables declaration do modify if nessesary
    private javax.swing.JButton okButton;
    private javax.swing.JTable departmentsSecondTable;
    private javax.swing.JTable jTable2;
    private JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    //End of variables decleration
    /**
     * Copies our selected ID
     * @param toString 
     * @return fikuId deliver the selected fikuId
     */
    public String getSelectedID(String toString) {
       String[] subString = toString.split(Pattern.quote(" "));
       String departmentId = subString[0];
       return departmentId;
    }
    /**
     * 
     * @return the FikuID
     */
    public static String getID(){
        return ID;
    }
}
