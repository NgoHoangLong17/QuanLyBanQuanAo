/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.poly.it17326.group3.view;

import com.poly.it17326.group3.domainmodels.Size;
import com.poly.it17326.group3.service.ViewSizeService;
import com.poly.it17326.group3.service.impl.SizeServiceImpl;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Hibernate;
import org.springframework.data.jpa.provider.HibernateUtils;

/**
 *
 * @author ADMIN
 */
public class FrmPanelSize extends javax.swing.JPanel {

    /**
     * Creates new form PanelSize
     */
    private  ViewSizeService sizeService = new SizeServiceImpl();
    
    private  DefaultTableModel defaultTableModel;
    public FrmPanelSize() {
        initComponents();
        loaddata(sizeService.getAll());
        
    }
    public void loaddata(List<Size> list){
    defaultTableModel = (DefaultTableModel) Tblnsx.getModel();
    defaultTableModel.setRowCount(0);
    for(Size s:list){
    defaultTableModel.addRow(new Object[]{s.getId(),s.getTen()});
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

        Btnsua = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tblnsx = new javax.swing.JTable();
        Btnthem = new javax.swing.JButton();
        Btnxoa = new javax.swing.JButton();

        Btnsua.setText("Sua");
        Btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsuaActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Size");

        jLabel2.setText("ID");

        jLabel3.setText("TEN");

        Tblnsx.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Ten"
            }
        ));
        Tblnsx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblnsxMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tblnsx);

        Btnthem.setText("Them");
        Btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnthemActionPerformed(evt);
            }
        });

        Btnxoa.setText("Xoa");
        Btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnxoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(38, 38, 38)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(28, 28, 28)
                                .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Btnthem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btnsua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btnxoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Btnthem)
                        .addGap(18, 18, 18)
                        .addComponent(Btnsua)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btnxoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnthemActionPerformed
        // TODO add your handling code here:
        Size size = new Size();
        size.setTen(txtTen.getText());
        
        if(sizeService.save(size)){
            JOptionPane.showMessageDialog(this, "Thêm thành công");
            loaddata(sizeService.getAll());
        }else{
            JOptionPane.showMessageDialog(this, "Thêm thất bại.");
        }
    }//GEN-LAST:event_BtnthemActionPerformed

    private void TblnsxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblnsxMouseClicked
        // TODO add your handling code here:
         int row = Tblnsx.getSelectedRow();
        txtID.setText(Tblnsx.getValueAt(row, 0).toString());
        txtTen.setText(Tblnsx.getValueAt(row, 1).toString());
    }//GEN-LAST:event_TblnsxMouseClicked

    private void BtnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnsuaActionPerformed
        // TODO add your handling code here:
        int index = Tblnsx.getSelectedRow();
        Size size = sizeService.getAll().get(index);
        size.setTen(txtTen.getText());
        size.setId(Integer.parseInt(txtID.getText()));
        
        if(sizeService.update(size)){
            JOptionPane.showMessageDialog(this, "Sửa thành công");
            loaddata(sizeService.getAll());
        }else{
            JOptionPane.showMessageDialog(this, "Sửa thất bại");
        }
    }//GEN-LAST:event_BtnsuaActionPerformed

    private void BtnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnxoaActionPerformed
        // TODO add your handling code here:
        int index = Tblnsx.getSelectedRow();
        Size size = sizeService.getAll().get(index);
        if(index == -1){
            JOptionPane.showMessageDialog(this, "Xóa thất bại");
        }else if(sizeService.delete(size)){
            JOptionPane.showMessageDialog(this, "Xóa thành công");
            loaddata(sizeService.getAll());
        }else{
            JOptionPane.showMessageDialog(this, "Xóa thất bại");
        }
    }//GEN-LAST:event_BtnxoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnsua;
    private javax.swing.JButton Btnthem;
    private javax.swing.JButton Btnxoa;
    private javax.swing.JTable Tblnsx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
