/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.poly.it17326.group3.view;

import com.poly.it17326.group3.domainmodels.ChucVu;
import com.poly.it17326.group3.domainmodels.NhanVien;
import com.poly.it17326.group3.service.ViewChucVuService;
import com.poly.it17326.group3.service.ViewNhanVienService;
import com.poly.it17326.group3.service.impl.ViewChucVuServiceImpl;
import com.poly.it17326.group3.service.impl.ViewNhanVienServiceImpl;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class NhanVienJPanel extends javax.swing.JPanel {

    private DefaultTableModel defaultTableModel;
    private ViewNhanVienService viewNhanVienService = new ViewNhanVienServiceImpl();
    private ViewChucVuService viewChucVuService = new ViewChucVuServiceImpl();

    /**
     * Creates new form NhanVienPanel
     */
    public NhanVienJPanel() {
        initComponents();
        LoadTable((ArrayList<NhanVien>) viewNhanVienService.getNhanVien());
        loadCbo();
    }

    private void LoadTable(ArrayList<NhanVien> listNhanVien) {
        defaultTableModel = (DefaultTableModel) tbNhanVien.getModel();
        defaultTableModel.setColumnIdentifiers(new String[]{"ID", "Tên nhân viên", "Chức vụ", "Giới tính", "Ngày sinh", "SĐT", "Địa chỉ", "Mật khẩu", "Deleted"});
        defaultTableModel.setRowCount(0);
        for (NhanVien nhanVien : listNhanVien) {
            defaultTableModel.addRow(new Object[]{nhanVien.getId(), nhanVien.getTenNhanVien(), nhanVien.getChucVu().getTenChucVu(),
                nhanVien.htGioiTinh(), nhanVien.getNgaySinh(), nhanVien.getSDT(), nhanVien.getDiaChi(), nhanVien.getMatKhau(), nhanVien.htDeleted()});
        }
    }

    private void loadCbo() {
        DefaultComboBoxModel defaultComboBoxModel;
        defaultComboBoxModel = (DefaultComboBoxModel) cboChucVu.getModel();
        defaultComboBoxModel.removeAllElements();
        for (ChucVu chucVu : viewChucVuService.getChucVu()) {
            defaultComboBoxModel.addElement(chucVu.getTenChucVu());
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

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
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
        txtTenNhanVien = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        rbnNam = new javax.swing.JRadioButton();
        rbnNu = new javax.swing.JRadioButton();
        txtNgaySinh = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        cboChucVu = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNhanVien = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        txtMatKhau = new javax.swing.JTextField();
        chekNghi = new javax.swing.JCheckBox();

        jFormattedTextField1.setText("jFormattedTextField1");

        jLabel1.setText("Nhân Viên");

        jLabel2.setText("ID");

        jLabel3.setText("Tên nhân viên");

        jLabel4.setText("Chức vụ");

        jLabel5.setText("Giới tính");

        jLabel6.setText("Ngày Sinh");

        jLabel7.setText("SĐT");

        jLabel8.setText("Địa chỉ");

        jLabel9.setText("Mật Khẩu");

        jLabel10.setText("Trạng thái");

        txtId.setEditable(false);

        buttonGroup1.add(rbnNam);
        rbnNam.setText("Nam");

        buttonGroup1.add(rbnNu);
        rbnNu.setText("Nữ");

        cboChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tbNhanVien.setModel(new javax.swing.table.DefaultTableModel(
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
        tbNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbNhanVien);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        chekNghi.setText("Nghỉ");
        chekNghi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chekNghiActionPerformed(evt);
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
                        .addComponent(jLabel4)
                        .addGap(49, 49, 49)
                        .addComponent(cboChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSua))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbnNam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addComponent(rbnNu)
                                .addGap(63, 63, 63))
                            .addComponent(txtTenNhanVien)
                            .addComponent(txtNgaySinh)
                            .addComponent(txtId))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnXoa)
                        .addGap(59, 59, 59)
                        .addComponent(btnNew))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSDT)
                            .addComponent(txtDiaChi)
                            .addComponent(txtMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(chekNghi)))))
            .addGroup(layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cboChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rbnNam)
                            .addComponent(rbnNu)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(chekNghi))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnNew))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        txtId.setText(null);
        txtTenNhanVien.setText(null);
        cboChucVu.setSelectedItem(0);
        txtDiaChi.setText(null);
        txtNgaySinh.setText(null);
        txtSDT.setText(null);
        rbnNam.setSelected(true);
        rbnNu.setSelected(false);
        chekNghi.setSelected(false);
        txtMatKhau.setText(null);
    }//GEN-LAST:event_btnNewActionPerformed

    private void tbNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNhanVienMouseClicked
        // TODO add your handling code here:
        int row = tbNhanVien.getSelectedRow();
        txtId.setText(tbNhanVien.getValueAt(row, 0).toString());
        txtTenNhanVien.setText(tbNhanVien.getValueAt(row, 1).toString());
        if (tbNhanVien.getValueAt(row, 2).toString().equals("Quản lý")) {
            cboChucVu.setSelectedItem("Quản lý");
        } else if (tbNhanVien.getValueAt(row, 2).toString().equals("Lao công")) {
            cboChucVu.setSelectedItem("Lao Công");
        } else if (tbNhanVien.getValueAt(row, 2).toString().equals("Kế toán")) {
            cboChucVu.setSelectedItem("Kế toán");
        } else if (tbNhanVien.getValueAt(row, 2).toString().equals("Thu ngân")) {
            cboChucVu.setSelectedItem("Thu ngân");
        } else if (tbNhanVien.getValueAt(row, 2).toString().equals("Bảo vệ")) {
            cboChucVu.setSelectedItem("Bảo vệ");
        }
        if (tbNhanVien.getValueAt(row, 3).toString().equalsIgnoreCase("Nam")) {
            rbnNam.setSelected(true);
        } else {
            rbnNu.setSelected(true);
        }
        txtNgaySinh.setText(tbNhanVien.getValueAt(row, 4).toString());
        txtSDT.setText(tbNhanVien.getValueAt(row, 5).toString());
        txtDiaChi.setText(tbNhanVien.getValueAt(row, 6).toString());
        txtMatKhau.setText(tbNhanVien.getValueAt(row, 7).toString());
        if (tbNhanVien.getValueAt(row, 8).toString().equalsIgnoreCase("Nghỉ làm")) {
            chekNghi.setSelected(true);
        } else {
            chekNghi.setSelected(false);
        }
    }//GEN-LAST:event_tbNhanVienMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        NhanVien nhanVien = new NhanVien();
        nhanVien.setTenNhanVien(txtTenNhanVien.getText());
        ChucVu chucVu = viewChucVuService.getChucVu().get(cboChucVu.getSelectedIndex());
        nhanVien.setChucVu(chucVu);
        Boolean gioiTinh = false;
        if (rbnNam.isSelected()) {
            gioiTinh = true;
        }
        nhanVien.setGioiTinh(gioiTinh);
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = formatter.format(date);
        nhanVien.setNgaySinh(date);
        nhanVien.setSDT(txtSDT.getText());
        nhanVien.setDiaChi(txtDiaChi.getText());
        nhanVien.setMatKhau(txtMatKhau.getText());
        nhanVien.setTrangThai(chekNghi.isSelected());
        if (viewNhanVienService.them(nhanVien)) {
            JOptionPane.showMessageDialog(this, "Thêm thành công");
            LoadTable((ArrayList<NhanVien>) viewNhanVienService.getNhanVien());
        } else {
            JOptionPane.showMessageDialog(this, "Thêm thất bại");
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int index = tbNhanVien.getSelectedRow();
        NhanVien nhanVien = viewNhanVienService.getNhanVien().get(index);
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Xóa thất bại");
        } else if (viewNhanVienService.xoa(nhanVien)) {
            JOptionPane.showMessageDialog(this, "Xóa thành công");
            LoadTable((ArrayList<NhanVien>) viewNhanVienService.getNhanVien());
        } else {
            JOptionPane.showMessageDialog(this, "Xóa thất bại");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void chekNghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chekNghiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chekNghiActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        int index = tbNhanVien.getSelectedRow();
        NhanVien nhanVien = viewNhanVienService.getNhanVien().get(index);
        nhanVien.setTenNhanVien(txtTenNhanVien.getText());
        ChucVu chucVu = viewChucVuService.getChucVu().get(cboChucVu.getSelectedIndex());
        nhanVien.setChucVu(chucVu);
        Boolean gioiTinh = false;
        if (rbnNam.isSelected()) {
            gioiTinh = true;
        }
        nhanVien.setGioiTinh(gioiTinh);
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = formatter.format(date);
        nhanVien.setNgaySinh(date);
        nhanVien.setSDT(txtSDT.getText());
        nhanVien.setDiaChi(txtDiaChi.getText());
        nhanVien.setMatKhau(txtMatKhau.getText());
        nhanVien.setTrangThai(chekNghi.isSelected());
        if(viewNhanVienService.sua(nhanVien)){
            JOptionPane.showMessageDialog(this, "Sửa thành công");
            LoadTable((ArrayList<NhanVien>) viewNhanVienService.getNhanVien());
        }else{
            JOptionPane.showMessageDialog(this, "Sửa thất bại");
        }
    }//GEN-LAST:event_btnSuaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboChucVu;
    private javax.swing.JCheckBox chekNghi;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbnNam;
    private javax.swing.JRadioButton rbnNu;
    private javax.swing.JTable tbNhanVien;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenNhanVien;
    // End of variables declaration//GEN-END:variables

}
