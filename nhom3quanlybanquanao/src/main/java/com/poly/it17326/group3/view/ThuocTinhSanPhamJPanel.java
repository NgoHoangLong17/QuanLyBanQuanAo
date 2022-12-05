/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.poly.it17326.group3.view;

import com.poly.it17326.group3.domainmodels.Anh;
import com.poly.it17326.group3.domainmodels.DongSp;
import com.poly.it17326.group3.domainmodels.MauSac;
import com.poly.it17326.group3.domainmodels.Nsx;
import com.poly.it17326.group3.domainmodels.SanPham;
import com.poly.it17326.group3.domainmodels.Size;
import com.poly.it17326.group3.repository.AnhRepository;
import com.poly.it17326.group3.repository.SanPhamRepository;
import com.poly.it17326.group3.response.MauSacReponse;
import com.poly.it17326.group3.service.ViewDongSpService;
import com.poly.it17326.group3.service.ViewMauSacService;
import com.poly.it17326.group3.service.ViewDongSpService;
import com.poly.it17326.group3.service.ViewMauSacService;
import com.poly.it17326.group3.service.ViewNSXService;
import com.poly.it17326.group3.service.ViewSizeService;
import com.poly.it17326.group3.service.impl.AnhServiceImpl;
import com.poly.it17326.group3.service.impl.DongSpServiceImpl;
import com.poly.it17326.group3.service.impl.MauSacServiceImpl;
import com.poly.it17326.group3.service.impl.NSXSeviceImpl;
import com.poly.it17326.group3.service.impl.SanPhamServiceImpl;
import com.poly.it17326.group3.service.impl.SizeServiceImpl;
import java.awt.Image;
import java.io.File;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author doand
 */
public class ThuocTinhSanPhamJPanel extends javax.swing.JPanel {

    private ViewSizeService sizeService = new SizeServiceImpl();
    private SanPhamServiceImpl SanPhamServiceImpl = new SanPhamServiceImpl();
    private SanPhamRepository SanPhamRepository = new SanPhamRepository();
    private ViewDongSpService dongSpService = new DongSpServiceImpl();
    private ViewMauSacService mauSacService = new MauSacServiceImpl();
    private AnhServiceImpl AnhServiceImpl = new AnhServiceImpl();
    private AnhRepository AnhRepository = new AnhRepository();
    private ViewNSXService nSXService = new NSXSeviceImpl();
    private DefaultTableModel defaultTableModel;

    public void loaddata(List<Size> list) {
        defaultTableModel = (DefaultTableModel) tblSize.getModel();
        defaultTableModel.setRowCount(0);
        for (Size s : list) {
            defaultTableModel.addRow(new Object[]{s.getId(), s.getTen()});
        }
    }

    public void loadDataSp(List<SanPham> list) {
        DefaultTableModel model = (DefaultTableModel) tblSanPham.getModel();
        model.setRowCount(0);
        model.setColumnIdentifiers(new Object[]{"id", "ten"});
        for (SanPham SanPham : list) {
            Object[] row = new Object[]{
                SanPham.getId(), SanPham.getTen()
            };
            model.addRow(row);
        }

    }

    public void loadData(List<DongSp> list) {
        defaultTableModel = (DefaultTableModel) tblDongSp.getModel();
        defaultTableModel.setColumnIdentifiers(new String[]{"ID", "Tên"});
        defaultTableModel.setRowCount(0);
        for (DongSp dongSp : list) {
            defaultTableModel.addRow(new Object[]{dongSp.getId(), dongSp.getTen()});
        }
    }

    public void loadDataMau(List<MauSacReponse> list) {
        defaultTableModel = (DefaultTableModel) tblMauSac.getModel();
        defaultTableModel.setColumnIdentifiers(new String[]{"ID", "Tên"});
        defaultTableModel.setRowCount(0);
        for (MauSacReponse mauSac : list) {
            defaultTableModel.addRow(new Object[]{mauSac.getId(), mauSac.getTen()});
        }
    }

//    public void loadDataSp1(List<Anh> list) {
//        DefaultTableModel model = (DefaultTableModel) tblAnh.getModel();
//        model.setRowCount(0);
//        model.setColumnIdentifiers(new Object[]{"id", "ten"});
//        for (Anh Anh : list) {
//            Object[] row = new Object[]{
//                Anh.getId(), Anh.getTen()
//            };
//            model.addRow(row);
//        }
//
//    }

    public void loaddataNSx(List<Nsx> list) {
        defaultTableModel = (DefaultTableModel) tblNsx.getModel();
        defaultTableModel.setRowCount(0);
        for (Nsx s : list) {
            defaultTableModel.addRow(new Object[]{s.getId(), s.getTen()});
        }
    }

    /**
     * Creates new form ThuocTinhSanPhamJPanel
     */
    public ThuocTinhSanPhamJPanel() {
        initComponents();
        loaddata(sizeService.getAll());
        loadDataSp(SanPhamRepository.getAll());
        loadData(dongSpService.getAll());
        loadDataMau(mauSacService.getAll1());
//        loadDataSp1(AnhRepository.getAll());
        loaddataNSx(nSXService.getNSX());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnXoa1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblSize = new javax.swing.JTable();
        btnSuaSize = new javax.swing.JButton();
        btnThemSize = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtIdSize = new javax.swing.JTextField();
        txtTenSize = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        btnXoaSanPham = new javax.swing.JButton();
        btnSuaSanPham = new javax.swing.JButton();
        btnThemSanPham = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        txtIdSp = new javax.swing.JTextField();
        txtSanPham = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblDongSp = new javax.swing.JTable();
        btnThemDongSp = new javax.swing.JButton();
        btnSuaDongSp = new javax.swing.JButton();
        btnXoaDongSp = new javax.swing.JButton();
        txtTenDongSp = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtIdDongSp = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblMauSac = new javax.swing.JTable();
        btnThemMauSac = new javax.swing.JButton();
        btnSuaMauSac = new javax.swing.JButton();
        btnXoaMauSac = new javax.swing.JButton();
        txtTenMauSac = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtIdMauSAc = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tblNsx = new javax.swing.JTable();
        btnThemNsx = new javax.swing.JButton();
        btnSuaNsx = new javax.swing.JButton();
        btnXoaNsx = new javax.swing.JButton();
        txtTenNsx = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtIdNsx = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();

        btnXoa1.setText("Xóa");
        btnXoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa1ActionPerformed(evt);
            }
        });

        tblSize.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tblSize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSizeMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblSize);

        btnSuaSize.setText("Sửa");
        btnSuaSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaSizeActionPerformed(evt);
            }
        });

        btnThemSize.setText("Thêm");
        btnThemSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSizeActionPerformed(evt);
            }
        });

        jLabel10.setText("Tên");

        jLabel11.setText("ID");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Quản lý size");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnThemSize)
                        .addGap(63, 63, 63)
                        .addComponent(btnSuaSize)
                        .addGap(79, 79, 79)
                        .addComponent(btnXoa1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenSize, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdSize, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(319, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtIdSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTenSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemSize)
                    .addComponent(btnSuaSize)
                    .addComponent(btnXoa1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Size", jPanel1);

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(tblSanPham);

        btnXoaSanPham.setText("Xóa");
        btnXoaSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSanPhamActionPerformed(evt);
            }
        });

        btnSuaSanPham.setText("Sửa");
        btnSuaSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaSanPhamActionPerformed(evt);
            }
        });

        btnThemSanPham.setText("Thêm");
        btnThemSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSanPhamActionPerformed(evt);
            }
        });

        jLabel25.setText("Tên");

        jLabel26.setText("ID");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Quản lý San Pham");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnThemSanPham)
                        .addGap(63, 63, 63)
                        .addComponent(btnSuaSanPham)
                        .addGap(79, 79, 79)
                        .addComponent(btnXoaSanPham))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdSp, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(319, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtIdSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemSanPham)
                    .addComponent(btnSuaSanPham)
                    .addComponent(btnXoaSanPham))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("SanPham", jPanel3);

        tblDongSp.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDongSp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDongSpMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(tblDongSp);

        btnThemDongSp.setText("Thêm");
        btnThemDongSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemDongSpActionPerformed(evt);
            }
        });

        btnSuaDongSp.setText("Sửa");
        btnSuaDongSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaDongSpActionPerformed(evt);
            }
        });

        btnXoaDongSp.setText("Xóa");
        btnXoaDongSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaDongSpActionPerformed(evt);
            }
        });

        jLabel28.setText("Tên");

        jLabel29.setText("ID");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Quản lý DongSp");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnThemDongSp)
                        .addGap(63, 63, 63)
                        .addComponent(btnSuaDongSp)
                        .addGap(79, 79, 79)
                        .addComponent(btnXoaDongSp))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel28))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenDongSp, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdDongSp, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(319, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtIdDongSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtTenDongSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemDongSp)
                    .addComponent(btnSuaDongSp)
                    .addComponent(btnXoaDongSp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DongSp", jPanel4);

        tblMauSac.setModel(new javax.swing.table.DefaultTableModel(
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
        tblMauSac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMauSacMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(tblMauSac);

        btnThemMauSac.setText("Thêm");
        btnThemMauSac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMauSacActionPerformed(evt);
            }
        });

        btnSuaMauSac.setText("Sửa");
        btnSuaMauSac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaMauSacActionPerformed(evt);
            }
        });

        btnXoaMauSac.setText("Xóa");
        btnXoaMauSac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaMauSacActionPerformed(evt);
            }
        });

        jLabel31.setText("Tên");

        jLabel32.setText("ID");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Quản lý MauSac");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnThemMauSac)
                        .addGap(63, 63, 63)
                        .addComponent(btnSuaMauSac)
                        .addGap(79, 79, 79)
                        .addComponent(btnXoaMauSac))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel31))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdMauSAc, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(319, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtIdMauSAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtTenMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemMauSac)
                    .addComponent(btnSuaMauSac)
                    .addComponent(btnXoaMauSac))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mau Sac", jPanel5);

        tblNsx.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tblNsx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNsxMouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(tblNsx);

        btnThemNsx.setText("Thêm");
        btnThemNsx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNsxActionPerformed(evt);
            }
        });

        btnSuaNsx.setText("Sửa");
        btnSuaNsx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaNsxActionPerformed(evt);
            }
        });

        btnXoaNsx.setText("Xóa");
        btnXoaNsx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaNsxActionPerformed(evt);
            }
        });

        jLabel37.setText("Tên");

        jLabel38.setText("ID");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Quản lý Nsx");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnThemNsx)
                        .addGap(63, 63, 63)
                        .addComponent(btnSuaNsx)
                        .addGap(79, 79, 79)
                        .addComponent(btnXoaNsx))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel37))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenNsx, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdNsx, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(319, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txtIdNsx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txtTenNsx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemNsx)
                    .addComponent(btnSuaNsx)
                    .addComponent(btnXoaNsx))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nsx", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaNsxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaNsxActionPerformed
        // TODO add your handling code here:
        int index = tblNsx.getSelectedRow();
        Nsx chatLieu = nSXService.getNSX().get(index);
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Xóa thất bại");
        } else if (nSXService.delete(chatLieu)) {
            JOptionPane.showMessageDialog(this, "Xóa thành công");
            loaddataNSx(nSXService.getNSX());
        } else {
            JOptionPane.showMessageDialog(this, "Xóa thất bại");
        }
    }//GEN-LAST:event_btnXoaNsxActionPerformed

    private void btnSuaNsxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaNsxActionPerformed
        // TODO add your handling code here:
        int index = tblNsx.getSelectedRow();
        Nsx chatLieu = nSXService.getNSX().get(index);
        chatLieu.setTen(txtTenNsx.getText());
        chatLieu.setId(Integer.parseInt(txtIdNsx.getText()));
        if (nSXService.update(chatLieu)) {
            JOptionPane.showMessageDialog(this, "Sửa thành công");
            loaddataNSx(nSXService.getNSX());
        } else {
            JOptionPane.showMessageDialog(this, "Sửa thất bại");
        }
    }//GEN-LAST:event_btnSuaNsxActionPerformed

    private void btnThemNsxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNsxActionPerformed
        // TODO add your handling code here:
        Nsx chatLieu = new Nsx();
        chatLieu.setTen(txtTenNsx.getText());
        if (nSXService.save(chatLieu)) {
            JOptionPane.showMessageDialog(this, "Thêm thành công");
            loaddataNSx(nSXService.getNSX());
        } else {
            JOptionPane.showMessageDialog(this, "Thêm thất bại");
        }
    }//GEN-LAST:event_btnThemNsxActionPerformed

    private void tblNsxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNsxMouseClicked
        // TODO add your handling code here:
        int row = tblNsx.getSelectedRow();
        txtIdNsx.setText(tblNsx.getValueAt(row, 0).toString());
        txtTenNsx.setText(tblNsx.getValueAt(row, 1).toString());
    }//GEN-LAST:event_tblNsxMouseClicked

    private void btnXoaMauSacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaMauSacActionPerformed
        // TODO add your handling code here:
        int index = tblMauSac.getSelectedRow();
        MauSac chatLieu = mauSacService.getAll().get(index);
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Xóa thất bại");
        } else if (mauSacService.delete(chatLieu)) {
            JOptionPane.showMessageDialog(this, "Xóa thành công");
            loadDataMau(mauSacService.getAll1());
        } else {
            JOptionPane.showMessageDialog(this, "Xóa thất bại");
        }
    }//GEN-LAST:event_btnXoaMauSacActionPerformed

    private void btnSuaMauSacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaMauSacActionPerformed
        // TODO add your handling code here:
        int index = tblMauSac.getSelectedRow();
        MauSac mauSac = mauSacService.getAll().get(index);
        mauSac.setTen(txtTenMauSac.getText());
        mauSac.setId(Integer.parseInt(txtIdMauSAc.getText()));
        if (mauSacService.update(mauSac)) {
            JOptionPane.showMessageDialog(this, "Sửa thành công");
            loadDataMau(mauSacService.getAll1());
        } else {
            JOptionPane.showMessageDialog(this, "Sửa thất bại");
        }
    }//GEN-LAST:event_btnSuaMauSacActionPerformed

    private void btnThemMauSacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMauSacActionPerformed
        // TODO add your handling code here:
        MauSac mauSac = new MauSac();
        mauSac.setTen(txtTenMauSac.getText());
        if (mauSacService.add(mauSac)) {
            JOptionPane.showMessageDialog(this, "Thêm thành công");
            loadDataMau(mauSacService.getAll1());
        } else {
            JOptionPane.showMessageDialog(this, "Thêm thất bại");
        }
    }//GEN-LAST:event_btnThemMauSacActionPerformed

    private void tblMauSacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMauSacMouseClicked
        // TODO add your handling code here:
        int row = tblMauSac.getSelectedRow();
        txtIdMauSAc.setText(tblMauSac.getValueAt(row, 0).toString());
        txtTenMauSac.setText(tblMauSac.getValueAt(row, 1).toString());
    }//GEN-LAST:event_tblMauSacMouseClicked

    private void btnXoaDongSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaDongSpActionPerformed
        // TODO add your handling code here:
        int index = tblDongSp.getSelectedRow();
        DongSp dongSp = dongSpService.getAll().get(index);
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Xóa thất bại");
        } else if (dongSpService.delete(dongSp)) {
            JOptionPane.showMessageDialog(this, "Xóa thành công");
            loadData(dongSpService.getAll());
        } else {
            JOptionPane.showMessageDialog(this, "Xóa thất bại");
        }
    }//GEN-LAST:event_btnXoaDongSpActionPerformed

    private void btnSuaDongSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaDongSpActionPerformed
        // TODO add your handling code here:
        int index = tblDongSp.getSelectedRow();
        DongSp mauSac = dongSpService.getAll().get(index);
        mauSac.setTen(txtTenDongSp.getText());
        mauSac.setId(Integer.parseInt(txtIdDongSp.getText()));
        if (dongSpService.update(mauSac)) {
            JOptionPane.showMessageDialog(this, "Sửa thành công");
            loadData(dongSpService.getAll());
        } else {
            JOptionPane.showMessageDialog(this, "Sửa thất bại");
        }
    }//GEN-LAST:event_btnSuaDongSpActionPerformed

    private void btnThemDongSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemDongSpActionPerformed
        // TODO add your handling code here:
        DongSp dongSp = new DongSp();
        dongSp.setTen(txtTenDongSp.getText());
        if (dongSpService.add(dongSp)) {
            JOptionPane.showMessageDialog(this, "Thêm thành công");
            loadData(dongSpService.getAll());
        } else {
            JOptionPane.showMessageDialog(this, "Thêm thất bại");
        }
    }//GEN-LAST:event_btnThemDongSpActionPerformed

    private void tblDongSpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDongSpMouseClicked
        // TODO add your handling code here:
        int row = tblDongSp.getSelectedRow();
        txtIdDongSp.setText(tblDongSp.getValueAt(row, 0).toString());
        txtTenDongSp.setText(tblDongSp.getValueAt(row, 1).toString());
    }//GEN-LAST:event_tblDongSpMouseClicked

    private void btnThemSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSanPhamActionPerformed
        // TODO add your handling code here:
        SanPham sp = new SanPham();
        sp.setTen(txtSanPham.getText());
        if (SanPhamRepository.add(sp) == true) {
            JOptionPane.showMessageDialog(this, "Thêm Thành công");
            loadDataSp(SanPhamServiceImpl.getAll());
            return;
        }
    }//GEN-LAST:event_btnThemSanPhamActionPerformed

    private void btnSuaSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaSanPhamActionPerformed
        // TODO add your handling code here:
        int index = tblSanPham.getSelectedRow();

        SanPham sp = SanPhamServiceImpl.getAll().get(index);
        sp.setId(Integer.parseInt(txtIdSp.getText()));
        sp.setTen(txtSanPham.getText());
        if (SanPhamRepository.update(sp) == true) {
            JOptionPane.showMessageDialog(this, "Sửa Thành công");
            loadDataSp(SanPhamServiceImpl.getAll());
            return;
        }
    }//GEN-LAST:event_btnSuaSanPhamActionPerformed

    private void btnXoaSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSanPhamActionPerformed
        // TODO add your handling code here:
        int index = tblSanPham.getSelectedRow();
        SanPham SanPham = SanPhamServiceImpl.getAll().get(index);
        if (SanPhamServiceImpl.Delete(SanPham)) {
            JOptionPane.showMessageDialog(this, "Xóa Thành công");
            loadDataSp(SanPhamServiceImpl.getAll());
        }
    }//GEN-LAST:event_btnXoaSanPhamActionPerformed

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        // TODO add your handling code here:
        int index = tblSanPham.getSelectedRow();
        txtIdSp.setText(tblSanPham.getValueAt(index, 0).toString());
        txtSanPham.setText((String) tblSanPham.getValueAt(index, 1));
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void btnThemSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSizeActionPerformed
        // TODO add your handling code here:
        Size chatLieu = new Size();
        chatLieu.setTen(txtTenSize.getText());
        if (sizeService.save(chatLieu)) {
            JOptionPane.showMessageDialog(this, "Thêm thành công");
            loaddata(sizeService.getAll());
        } else {
            JOptionPane.showMessageDialog(this, "Thêm thất bại");
        }
    }//GEN-LAST:event_btnThemSizeActionPerformed

    private void btnSuaSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaSizeActionPerformed
        // TODO add your handling code here:
        int index = tblSize.getSelectedRow();
        Size chatLieu = sizeService.getAll().get(index);
        chatLieu.setTen(txtTenSize.getText());
        chatLieu.setId(Integer.parseInt(txtIdSize.getText()));
        if (sizeService.update(chatLieu)) {
            JOptionPane.showMessageDialog(this, "Sửa thành công");
            loaddata(sizeService.getAll());
        } else {
            JOptionPane.showMessageDialog(this, "Sửa thất bại");
        }
    }//GEN-LAST:event_btnSuaSizeActionPerformed

    private void tblSizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSizeMouseClicked
        // TODO add your handling code here:
        int row = tblSize.getSelectedRow();
        txtIdSize.setText(tblSize.getValueAt(row, 0).toString());
        txtTenSize.setText(tblSize.getValueAt(row, 1).toString());
    }//GEN-LAST:event_tblSizeMouseClicked

    private void btnXoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa1ActionPerformed
        // TODO add your handling code here:
        int index = tblSize.getSelectedRow();
        Size chatLieu = sizeService.getAll().get(index);
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Xóa thất bại");
        } else if (sizeService.delete(chatLieu)) {
            JOptionPane.showMessageDialog(this, "Xóa thành công");
            loaddata(sizeService.getAll());
        } else {
            JOptionPane.showMessageDialog(this, "Xóa thất bại");
        }
    }//GEN-LAST:event_btnXoa1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaDongSp;
    private javax.swing.JButton btnSuaMauSac;
    private javax.swing.JButton btnSuaNsx;
    private javax.swing.JButton btnSuaSanPham;
    private javax.swing.JButton btnSuaSize;
    private javax.swing.JButton btnThemDongSp;
    private javax.swing.JButton btnThemMauSac;
    private javax.swing.JButton btnThemNsx;
    private javax.swing.JButton btnThemSanPham;
    private javax.swing.JButton btnThemSize;
    private javax.swing.JButton btnXoa1;
    private javax.swing.JButton btnXoaDongSp;
    private javax.swing.JButton btnXoaMauSac;
    private javax.swing.JButton btnXoaNsx;
    private javax.swing.JButton btnXoaSanPham;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblDongSp;
    private javax.swing.JTable tblMauSac;
    private javax.swing.JTable tblNsx;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTable tblSize;
    private javax.swing.JTextField txtIdDongSp;
    private javax.swing.JTextField txtIdMauSAc;
    private javax.swing.JTextField txtIdNsx;
    private javax.swing.JTextField txtIdSize;
    private javax.swing.JTextField txtIdSp;
    private javax.swing.JTextField txtSanPham;
    private javax.swing.JTextField txtTenDongSp;
    private javax.swing.JTextField txtTenMauSac;
    private javax.swing.JTextField txtTenNsx;
    private javax.swing.JTextField txtTenSize;
    // End of variables declaration//GEN-END:variables
}
