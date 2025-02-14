/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.LopHocDAO;
import DAO.MonHocDAO;
import Model.MonHoc;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS RG
 */
public class formMonHoc extends javax.swing.JFrame {

    /**
     * Creates new form formMonHoc
     */
    public formMonHoc() {
        initComponents();
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMonHoc = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaMH = new javax.swing.JTextField();
        txtTenMH = new javax.swing.JTextField();
        txtSoTinChi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMaGV = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtSoLuongMH = new javax.swing.JTextField();
        btnThoat = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTongSoTinChi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Môn Học");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("CHƯƠNG TRÌNH ĐÀO TẠO CỦA KHOA CNTT");

        tableMonHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Môn Học", "Tên Môn Học", "Số TC", "Mã GV"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMonHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMonHocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMonHoc);
        if (tableMonHoc.getColumnModel().getColumnCount() > 0) {
            tableMonHoc.getColumnModel().getColumn(0).setPreferredWidth(15);
            tableMonHoc.getColumnModel().getColumn(1).setPreferredWidth(50);
            tableMonHoc.getColumnModel().getColumn(2).setPreferredWidth(210);
            tableMonHoc.getColumnModel().getColumn(3).setPreferredWidth(15);
            tableMonHoc.getColumnModel().getColumn(4).setPreferredWidth(35);
        }

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setText("Mã Môn Học:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setText("Tên Môn Học:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setText("Số Tín Chỉ:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setText("Mã GV:");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnCapNhat.setText("Cập Nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnTimKiem.setText("Tìm Theo Tên");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        jLabel6.setText("Tổng Số Môn:");

        txtSoLuongMH.setEditable(false);

        btnThoat.setText(" Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/subjectList1.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/subjectList.png"))); // NOI18N

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setText("DANH SÁCH MÔN HỌC");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        jLabel10.setText("Tổng Số Tín Chỉ:");

        txtTongSoTinChi.setEditable(false);

        jButton1.setText("Giảng Viên");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txtTenMH, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnThoat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtSoLuongMH, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTongSoTinChi, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaMH, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(btnReset))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnThem)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnXoa))
                                    .addComponent(txtSoTinChi, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnCapNhat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTimKiem))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaGV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(104, 104, 104))
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(249, 249, 249))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtMaMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4))
                    .addComponent(txtSoTinChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtMaGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTimKiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem)
                            .addComponent(btnXoa)
                            .addComponent(btnCapNhat))
                        .addGap(18, 18, 18)
                        .addComponent(btnReset)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6)
                    .addComponent(txtTongSoTinChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLuongMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat))
                .addGap(2, 2, 2))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        if (JOptionPane.showConfirmDialog(null,
                "Bạn có chắc chắn muốn đóng cửa sổ này?", "Thoát?",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void tableMonHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMonHocMouseClicked
        txtMaMH.setText(tableMonHoc.getValueAt(tableMonHoc.getSelectedRow(), 1).toString());
        txtTenMH.setText(tableMonHoc.getValueAt(tableMonHoc.getSelectedRow(), 2).toString());
        txtSoTinChi.setText(tableMonHoc.getValueAt(tableMonHoc.getSelectedRow(), 3).toString());
        txtMaGV.setText(tableMonHoc.getValueAt(tableMonHoc.getSelectedRow(), 4).toString());
        

    }//GEN-LAST:event_tableMonHocMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if("".equals(txtMaGV.getText()) || "".equals(txtMaGV.getText()) || "".equals(txtSoTinChi.getText()) || "".equals(txtTenMH.getText()))
        {
            JOptionPane.showMessageDialog(null, "Yều cầu nhập đầy đủ thông tin!", "Cảnh Báo!",
            JOptionPane.WARNING_MESSAGE);
        }

        else 
        {
            MonHocDAO mhDAO = new MonHocDAO();
            MonHoc mh = new MonHoc();
            mh.setIdMonHoc(txtMaMH.getText());
            mh.setTenMonHoc(txtTenMH.getText());
            try {
                mh.setSoTinChi(Integer.parseInt(txtSoTinChi.getText()));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Số tín chỉ không nhận ký tự!", "Sai dữ liệu đầu vào!",
                        JOptionPane.WARNING_MESSAGE);
            }
            mh.setIdGiangVien(txtMaGV.getText());

            if (mhDAO.ThemMonHoc(mh) == -1) 
            {
                JOptionPane.showMessageDialog(null, "Mã môn không được trùng!\nMã GV phải tồn tại!", "Sai dữ liệu đầu vào!",
                        JOptionPane.WARNING_MESSAGE);
            } else
                JOptionPane.showMessageDialog(null, "Thêm thành công môn " + txtTenMH.getText());
        }


        loadData();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        if("".equals(txtMaMH.getText()))
        {
            JOptionPane.showMessageDialog(null, "Mã môn học đang trống! Không thể xóa!", "Cảnh Báo!",
            JOptionPane.WARNING_MESSAGE);
        }
        
        else 
        {
            MonHocDAO mhDAO = new MonHocDAO();
            MonHoc mh = new MonHoc();
            mh.setIdMonHoc(txtMaMH.getText());

            if (mhDAO.XoaMonHoc(mh) == -1) {
                JOptionPane.showMessageDialog(null, "Có sinh viên đang theo học!", "Không thể xóa!",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Xóa thành công " + txtTenMH.getText());
            }
        }
        
        loadData();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtMaGV.setText(null);
        txtMaMH.setText(null);
        txtTenMH.setText(null);
        txtSoTinChi.setText(null);
        loadData();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        if("".equals(txtMaGV.getText()) || "".equals(txtMaGV.getText()) || "".equals(txtSoTinChi.getText()) || "".equals(txtTenMH.getText()))
        {
            JOptionPane.showMessageDialog(null, "Yều cầu nhập đầy đủ thông tin!", "Cảnh Báo!",
            JOptionPane.WARNING_MESSAGE);
        }
        
        else 
        {
            MonHocDAO mhDAO = new MonHocDAO();
            MonHoc mh = new MonHoc();
            mh.setIdMonHoc(txtMaMH.getText());
            mh.setTenMonHoc(txtTenMH.getText());
            mh.setSoTinChi(Integer.parseInt(txtSoTinChi.getText()));
            mh.setIdGiangVien(txtMaGV.getText());

            if (mhDAO.CapNhatMonHoc(mh) == -1) {
                JOptionPane.showMessageDialog(null, "Mã giảng viên phải tồn tại!", "Cập nhật thất bại!",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Cập nhật thành công " + txtTenMH.getText());
            }
        }
        
        loadData();
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        if("".equals(txtTenMH.getText()))
        {
            JOptionPane.showMessageDialog(null, "Yêu cầu nhập tên môn học để tìm!", "Cảnh Báo!",
            JOptionPane.WARNING_MESSAGE);
        }
        
        else 
        {
            MonHocDAO mhDAO = new MonHocDAO();
            ArrayList<MonHoc> dsmh = mhDAO.TimKiemMonHoc(txtTenMH.getText());
            DefaultTableModel tablemh = (DefaultTableModel) this.tableMonHoc.getModel();
            tablemh.setRowCount(0);
            int stt = 0;
            for (MonHoc mh : dsmh) {
                stt++;
                Object[] row = new Object[]{String.valueOf(stt), mh.getIdMonHoc(), mh.getTenMonHoc(), mh.getSoTinChi(), mh.getIdGiangVien()};
                tablemh.addRow(row);
            }
            int sl = tablemh.getRowCount();
            txtSoLuongMH.setText(String.valueOf(sl));

            int stc = 0;
            for (int i = 0; i < tableMonHoc.getRowCount(); i++) {
                stc += Integer.parseInt(tableMonHoc.getValueAt(i, 3).toString());
            }
            txtTongSoTinChi.setText(String.valueOf(stc));
        }

        
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        formGiangVien frmGiangVien = new formGiangVien();
        frmGiangVien.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void loadData()
    {
        //Do du lieu vao table
        MonHocDAO mhDAO = new MonHocDAO();
        ArrayList<MonHoc> arrMH = mhDAO.DanhSachMonHoc();
        DefaultTableModel tableSV = (DefaultTableModel) this.tableMonHoc.getModel();
            tableSV.setRowCount(0);
        int stt = 0;
        for(MonHoc mh : arrMH)
        {
            stt++;
            Object[] row = new Object[]{ String.valueOf(stt) ,mh.getIdMonHoc(),mh.getTenMonHoc(),mh.getSoTinChi(),mh.getIdGiangVien()};
            tableSV.addRow(row);
        }
        int sl = tableSV.getRowCount();
        txtSoLuongMH.setText(String.valueOf(sl));
        
        int stc = 0;
        for(int i = 0; i < tableMonHoc.getRowCount(); i++)
        {
            stc+= Integer.parseInt(tableSV.getValueAt(i, 3).toString());
        }
        txtTongSoTinChi.setText(String.valueOf(stc));  
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
            java.util.logging.Logger.getLogger(formMonHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formMonHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formMonHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formMonHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formMonHoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JTable tableMonHoc;
    private javax.swing.JTextField txtMaGV;
    private javax.swing.JTextField txtMaMH;
    private javax.swing.JTextField txtSoLuongMH;
    private javax.swing.JTextField txtSoTinChi;
    private javax.swing.JTextField txtTenMH;
    private javax.swing.JTextField txtTongSoTinChi;
    // End of variables declaration//GEN-END:variables

}
