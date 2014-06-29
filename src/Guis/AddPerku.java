/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Guis;

import dbServices.DBServiceInvoker;
import java.awt.Frame;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author Kain
 */
public class AddPerku extends javax.swing.JFrame {
   
/*    public String getComboText(int combo){
        String returnValue= null;
        switch(combo){
            case 1: String sub =(String)jComboBoxCompanyID.getSelectedItem();
                    String[] id = sub.split(Pattern.quote(" "));
                    returnValue=id[0];
                    break;
            case 2: String sub0 =(String)jComboBoxDeptID.getSelectedItem();
                    String[] id0 = sub0.split(Pattern.quote(" "));
                    returnValue=id0[0];
                    break;
            case 3: String sub1 =(String)jComboBoxWorkplaceID.getSelectedItem();
                    String[] id1 = sub1.split(Pattern.quote(" "));
                    returnValue=id1[0];
                    break;
        }
        return returnValue;
    }*/
    /**
     * Creates new form AddPerku
     */
    public AddPerku(java.awt.Frame parent, boolean modal){
        initComponents();
    }

    AddPerku(String id) {
        initComponents();
        this.id = id;

        if (id.equals("")) {
            DBServiceInvoker invoke = new DBServiceInvoker();
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            try {
                List<String> list = invoke.invokeSelect("Fiku", " ");
                Iterator<String> i = list.iterator();
                while (i.hasNext()) {
                    StringBuilder sb = new StringBuilder();
                    String[] substring = i.next().split(Pattern.quote(" "));
                    for (int j = 0; j < 2; j++) {
                        sb.append(substring[j]);
                        sb.append(" ");
                    }
                    model.addElement(sb.toString());
                }
                company.setModel(model);

            } catch (SQLException sqlex) {
                System.out.println(sqlex);
            }

        } else {
            String[] substring = id.split(Pattern.quote(" "));

            name.setText(substring[1]);
            surname.setText(substring[2]);
            phone.setText(substring[4]);
            mobile.setText(substring[5]);
            email.setText(substring[6]);
            sex.setSelectedItem(substring[3]);
            this.id_eintrag = substring[0];

            DBInvoker invoke = new DBInvoker();
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            try {
                List<String> list = invoke.invokeSelect("firmenkunde", " ");
                Iterator<String> i = list.iterator();
                while (i.hasNext()) {
                    StringBuilder sb = new StringBuilder();
                    String[] substring2 = i.next().split(Pattern.quote(" "));
                    for (int j = 0; j < 2; j++) {
                        sb.append(substring2[j]);
                        sb.append(" ");
                    }
                    model.addElement(sb.toString());
                }
                company.setModel(model);

            } catch (SQLException sqlex) {
                System.out.println(sqlex);
            }

        }
    }
/*    public AddPerku(java.awt.Frame parent, boolean modal) {
        //super(parent, modal);
        initComponents();
        DBServiceInvoker invoke = new DBServiceInvoker();
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        DefaultComboBoxModel model1 = new DefaultComboBoxModel();
        DefaultComboBoxModel model2 = new DefaultComboBoxModel();
        try {
            List<String> list= invoke.invokeSelect("fiku"," ");
            Iterator<String> i = list.iterator();
            while(i.hasNext()){
                StringBuilder stringBuild = new StringBuilder();
                String[] substring = i.next().split(Pattern.quote(" "));
                for(int j=0;j<2;j++){
                    stringBuild.append(substring[j]);
                    stringBuild.append(" ");
                }
                model.addElement(stringBuild.toString());
            }
           jComboBoxCompanyID.setModel(model);
            
            
        }catch(SQLException sqlex){System.out.println(sqlex);}
        
        try {
            List<String> list= invoke.invokeSelect("departments"," ");
            Iterator<String> i = list.iterator();
            while(i.hasNext()){
                StringBuilder stringBuild = new StringBuilder();
                String[] substring = i.next().split(Pattern.quote(" "));
                for(int j=0;j<2;j++){
                    stringBuild.append(substring[j]);
                    stringBuild.append(" ");
                }
                model1.addElement(stringBuild.toString());
            }
           jComboBoxDeptID.setModel(model1);
           
        }catch(SQLException sqlex){System.out.println(sqlex);}
        
        try {
            List<String> list= invoke.invokeSelect("fiku_has_place"," ");
            Iterator<String> i = list.iterator();
            while(i.hasNext()){
                StringBuilder stringBuild = new StringBuilder();
                String[] substring = i.next().split(Pattern.quote(" "));
                for(int j=0;j<2;j++){
                    stringBuild.append(substring[j]);
                    stringBuild.append(" ");
                }
                model2.addElement(stringBuild.toString());
            }
           jComboBoxDeptID.setModel(model2);
           
        }catch(SQLException sqlex){System.out.println(sqlex);}
    }
*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fNameTextField = new javax.swing.JTextField();
        lNameTextField = new javax.swing.JTextField();
        titleTextField = new javax.swing.JTextField();
        sexTextField = new javax.swing.JTextField();
        companyID = new javax.swing.JLabel();
        deptID = new javax.swing.JLabel();
        fName = new javax.swing.JLabel();
        lName = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        sex = new javax.swing.JLabel();
        CancelButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        jLabelPosition = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        positionTextField = new javax.swing.JTextField();
        jTextFieldPhone = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelFax = new javax.swing.JLabel();
        jTextFieldFax = new javax.swing.JTextField();
        jLabelBuilding = new javax.swing.JLabel();
        jTextFieldBuilding = new javax.swing.JTextField();
        jTextFieldRoom = new javax.swing.JTextField();
        jLabelRoom = new javax.swing.JLabel();
        jLabelWorkplace = new javax.swing.JLabel();
        SelectPlaceButton = new javax.swing.JButton();
        SelectFikuButton = new javax.swing.JButton();
        SelectDeptButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTextFieldActionPerformed(evt);
            }
        });

        sexTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexTextFieldActionPerformed(evt);
            }
        });

        companyID.setText("CompanyID:");

        deptID.setText("Department ID:");

        fName.setText("First Name:");

        lName.setText("Last Name:");

        title.setText("Title:");

        sex.setText("Sex:");

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        jLabelPosition.setText("Position:");

        jLabel8.setText("Phone:");

        jTextFieldPhone.setText("Phone");
        jTextFieldPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPhoneActionPerformed(evt);
            }
        });

        jLabelEmail.setText("Email:");

        jTextFieldEmail.setText("Email");

        jLabelFax.setText("Fax:");

        jTextFieldFax.setText("Fax");

        jLabelBuilding.setText("Building:");

        jTextFieldBuilding.setText("Building");

        jTextFieldRoom.setText("Room");
        jTextFieldRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRoomActionPerformed(evt);
            }
        });

        jLabelRoom.setText("Room:");

        jLabelWorkplace.setText("Workplace:");

        SelectPlaceButton.setText("Select");

        SelectFikuButton.setText("Select Company");

        SelectDeptButton.setText("Select Department");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CancelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SaveButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deptID)
                            .addComponent(fName)
                            .addComponent(lName)
                            .addComponent(title)
                            .addComponent(sex)
                            .addComponent(jLabel8)
                            .addComponent(companyID)
                            .addComponent(jLabelPosition)
                            .addComponent(jLabelEmail)
                            .addComponent(jLabelFax)
                            .addComponent(jLabelBuilding)
                            .addComponent(jLabelRoom)
                            .addComponent(jLabelWorkplace))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldBuilding)
                            .addComponent(fNameTextField)
                            .addComponent(lNameTextField)
                            .addComponent(titleTextField)
                            .addComponent(sexTextField)
                            .addComponent(positionTextField)
                            .addComponent(jTextFieldPhone)
                            .addComponent(jTextFieldEmail)
                            .addComponent(jTextFieldFax)
                            .addComponent(jTextFieldRoom)
                            .addComponent(SelectPlaceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SelectFikuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SelectDeptButton)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(companyID)
                                                    .addComponent(SelectFikuButton))
                                                .addGap(19, 19, 19)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(deptID)
                                                    .addComponent(SelectDeptButton))
                                                .addGap(18, 18, 18)
                                                .addComponent(fNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(fName))
                                        .addGap(18, 18, 18)
                                        .addComponent(lNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lName))
                                .addGap(38, 38, 38))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(title)
                                .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sex)
                            .addComponent(sexTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelPosition)
                        .addComponent(positionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFax))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBuilding)
                    .addComponent(jTextFieldBuilding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRoom))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelWorkplace)
                    .addComponent(SelectPlaceButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelButton)
                    .addComponent(SaveButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void titleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleTextFieldActionPerformed

    private void sexTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexTextFieldActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        this.setVisible(false);
        Perku newContacts = new Perku();
        newContacts.setVisible(true);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        DBServiceInvoker invoke = new DBServiceInvoker();
        StringBuilder stringBuild = new StringBuilder();
        stringBuild.append("NULL");
        stringBuild.append(",");
        stringBuild.append("NULL");
        stringBuild.append(",");
        stringBuild.append("'");
        stringBuild.append(fNameTextField.getText());
        stringBuild.append("'");
        stringBuild.append(",");        
        stringBuild.append("'");
        stringBuild.append(lNameTextField.getText());
        stringBuild.append("'");
        stringBuild.append(",");
        stringBuild.append("'");
        stringBuild.append(titleTextField.getText());
        stringBuild.append("'");
        stringBuild.append(",");
        stringBuild.append("'");
        stringBuild.append(sexTextField.getText());
        stringBuild.append("'");
        stringBuild.append(",");
        stringBuild.append("'");
        stringBuild.append(positionTextField.getText());
        stringBuild.append("'");
        stringBuild.append(",");
        stringBuild.append("'");
        stringBuild.append(jTextFieldPhone.getText());
        stringBuild.append("'");
        stringBuild.append(",");
        stringBuild.append("'");
        stringBuild.append(jTextFieldEmail.getText());
        stringBuild.append("'");
        stringBuild.append(",");
        stringBuild.append("'");
        stringBuild.append(jTextFieldFax.getText());
        stringBuild.append("'");
        stringBuild.append(",");
        stringBuild.append("'");
        stringBuild.append(jTextFieldBuilding.getText());
        stringBuild.append("'");
        stringBuild.append(",");
        stringBuild.append("'");
        stringBuild.append(jTextFieldRoom.getText());
        stringBuild.append("'");
        stringBuild.append(",");
        stringBuild.append("NULL");
        
        String attribut;
        attribut = "`idPerKu`, `FiKu_idFiKu`, `Departments_idDepartments`, `FName`, `LName`, `Title`, `Sex`, `Position`, `Phone`, `Email`, `Fax`, `Building`, `Room`, `FiKu_has_Place_FiKu_idFiKu`, `FiKu_has_Place_Place_idPlace`";
        invoke.invokeInsert("perku",attribut,stringBuild.toString());
        this.setVisible(false);
       Perku newContacts = new Perku();
       newContacts.setVisible(true);
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void jTextFieldPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPhoneActionPerformed

    private void jTextFieldRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRoomActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldRoomActionPerformed

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
            java.util.logging.Logger.getLogger(AddPerku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPerku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPerku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPerku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
/*        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddPerku dialog = new AddPerku(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JButton SelectDeptButton;
    private javax.swing.JButton SelectFikuButton;
    private javax.swing.JButton SelectPlaceButton;
    private javax.swing.JLabel companyID;
    private javax.swing.JLabel deptID;
    private javax.swing.JLabel fName;
    private javax.swing.JTextField fNameTextField;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelBuilding;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFax;
    private javax.swing.JLabel jLabelPosition;
    private javax.swing.JLabel jLabelRoom;
    private javax.swing.JLabel jLabelWorkplace;
    private javax.swing.JTextField jTextFieldBuilding;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFax;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldRoom;
    private javax.swing.JLabel lName;
    private javax.swing.JTextField lNameTextField;
    private javax.swing.JTextField positionTextField;
    private javax.swing.JLabel sex;
    private javax.swing.JTextField sexTextField;
    private javax.swing.JLabel title;
    private javax.swing.JTextField titleTextField;
    // End of variables declaration//GEN-END:variables
}
