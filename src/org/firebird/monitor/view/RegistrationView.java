
package org.firebird.monitor.view;

import org.firebird.monitor.control.RegistrationControl;

public class RegistrationView extends javax.swing.JDialog {

    private RegistrationControl rc;

    public RegistrationView(java.awt.Frame parent, boolean modal, RegistrationControl r) {
        super(parent, modal);
        this.rc = r;
        initComponents();
    }

    public String getPassTextField() {
        return new String(passTextField.getPassword());
    }

    public void setPassTextField(String pass) {
        this.passTextField.setText(pass);
    }

    public String getPatchTextField() {
        return patchTextField.getText();
    }

    public void setPatchTextField(String patch) {
        this.patchTextField.setText(patch);
    }

    public String getUserTextField() {
        return userTextField.getText();
    }

    public void setUserTextField(String user) {
        this.userTextField.setText(user);
    }

    public String getPatchSelected() {
        return patchComboBox.getSelectedItem().toString();
    }

    public int getPatchIndex() {
        return patchComboBox.getSelectedIndex();
    }

    public Object getPatchItem() {
        return patchComboBox.getSelectedItem();
    }

    public void removePatchItem(Object item) {
        patchComboBox.removeItem(item);
    }

    public void setPatchIndex(int index) {
        patchComboBox.setSelectedIndex(index);
    }

    public void setFocusPatch() {
        patchTextField.grabFocus();
    }

    public void addPatchItem(Object item) {
        patchComboBox.addItem(item);
    }

    public int getPatchItemCount() {
        return patchComboBox.getItemCount();
    }

    public void removePatchAllItens() {
        patchComboBox.removeAllItems();
    }

    public String getCharsetTextField() {
        return charsetTextField.getText();
    }

    public void setCharsetTextField(String charset) {
        this.charsetTextField.setText(charset);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clientPanel = new javax.swing.JPanel();
        patchComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        userTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        patchTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passTextField = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        charsetTextField = new javax.swing.JTextField();
        newButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        connectButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("jMonitorFirebird");
        setResizable(false);

        clientPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Registration Database ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Verdana", 1, 12))); // NOI18N

        patchComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patchComboBoxMouseClicked(evt);
            }
        });
        patchComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                patchComboBoxItemStateChanged(evt);
            }
        });
        patchComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patchComboBoxActionPerformed(evt);
            }
        });
        patchComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                patchComboBoxPropertyChange(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12));
        jLabel1.setText("Registrations:");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12));
        jLabel2.setText("User:");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12));
        jLabel3.setText("Password:");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12));
        jLabel4.setText("Patch:");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12));
        jLabel5.setText("Charset:");

        newButton.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        newButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/firebird/monitor/image/add_obj.gif"))); // NOI18N
        newButton.setText("New");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/firebird/monitor/image/delete_obj.gif"))); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/firebird/monitor/image/save_edit.gif"))); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        connectButton.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        connectButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/firebird/monitor/image/external_tools.gif"))); // NOI18N
        connectButton.setText("Connect");
        connectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout clientPanelLayout = new javax.swing.GroupLayout(clientPanel);
        clientPanel.setLayout(clientPanelLayout);
        clientPanelLayout.setHorizontalGroup(
            clientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(clientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patchTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                    .addComponent(patchComboBox, 0, 459, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addGroup(clientPanelLayout.createSequentialGroup()
                        .addComponent(newButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(connectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(clientPanelLayout.createSequentialGroup()
                        .addGroup(clientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(clientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(clientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(charsetTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(jLabel5))))
                .addContainerGap())
        );
        clientPanelLayout.setVerticalGroup(
            clientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientPanelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(clientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(clientPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(clientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(passTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(charsetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(clientPanelLayout.createSequentialGroup()
                        .addGroup(clientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(34, 34, 34)))
                .addGap(16, 16, 16)
                .addGroup(clientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(connectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clientPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patchComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patchComboBoxMouseClicked
        // TODO add your handling code here:
}//GEN-LAST:event_patchComboBoxMouseClicked

    private void patchComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_patchComboBoxItemStateChanged
        // TODO add your handling code here:
        rc.openRegistration();
}//GEN-LAST:event_patchComboBoxItemStateChanged

    private void patchComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patchComboBoxActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_patchComboBoxActionPerformed

    private void patchComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_patchComboBoxPropertyChange
        // TODO add your handling code here:
}//GEN-LAST:event_patchComboBoxPropertyChange

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        // TODO add your handling code here:
        rc.newRegistration();
}//GEN-LAST:event_newButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        rc.deleteRegistration();
}//GEN-LAST:event_deleteButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        rc.saveRegistration();
}//GEN-LAST:event_saveButtonActionPerformed

    private void connectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectButtonActionPerformed
        // TODO add your handling code here:
        rc.connectDatabase();
}//GEN-LAST:event_connectButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField charsetTextField;
    private javax.swing.JPanel clientPanel;
    private javax.swing.JButton connectButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton newButton;
    private javax.swing.JPasswordField passTextField;
    private javax.swing.JComboBox patchComboBox;
    private javax.swing.JTextField patchTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField userTextField;
    // End of variables declaration//GEN-END:variables
}
