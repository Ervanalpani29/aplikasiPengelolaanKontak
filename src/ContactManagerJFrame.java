/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.io.*;


/**
 *
 * @author User
 */
public class ContactManagerJFrame extends javax.swing.JFrame {
    

    /**
     * Creates new form ContactManagerJFrame
     */
    public ContactManagerJFrame() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jnama = new javax.swing.JLabel();
        jtelepone = new javax.swing.JLabel();
        jkategori = new javax.swing.JLabel();
        namaField = new javax.swing.JTextField();
        noTeleponeField = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        jEkspor = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jCombo = new javax.swing.JComboBox<>();

        jTable1.setBackground(new java.awt.Color(255, 255, 204));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 51));

        jnama.setBackground(new java.awt.Color(51, 51, 51));
        jnama.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jnama.setText("Nama");

        jtelepone.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jtelepone.setText("No Telepone");

        jkategori.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jkategori.setText("Kategori");

        namaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaFieldActionPerformed(evt);
            }
        });

        noTeleponeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noTeleponeFieldActionPerformed(evt);
            }
        });

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        jEkspor.setText("Ekspor ke CSV");
        jEkspor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEksporActionPerformed(evt);
            }
        });

        jButton6.setText("Impor dari CSV");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane4.setViewportView(jTable);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Keluarga ", "Teman", "Kerja", " ", " " }));
        jCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jEkspor)
                        .addGap(136, 136, 136)
                        .addComponent(jButton6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jtelepone)
                                .addComponent(jnama, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jkategori))
                        .addGap(121, 121, 121)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namaField)
                            .addComponent(noTeleponeField, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTambah)
                        .addGap(40, 40, 40)
                        .addComponent(btnEdit)
                        .addGap(40, 40, 40)
                        .addComponent(btnHapus)
                        .addGap(50, 50, 50)
                        .addComponent(btnCari))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jnama)
                    .addComponent(namaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtelepone)
                    .addComponent(noTeleponeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jkategori)
                    .addComponent(jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnEdit)
                    .addComponent(btnHapus)
                    .addComponent(btnCari))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEkspor)
                    .addComponent(jButton6))
                .addContainerGap(218, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaFieldActionPerformed
     JTextField namaField = new JTextField(20);
    }//GEN-LAST:event_namaFieldActionPerformed

    private void noTeleponeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noTeleponeFieldActionPerformed
       JTextField noTeleponeField = new JTextField(20);
    }//GEN-LAST:event_noTeleponeFieldActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
     String nama = namaField.getText();  // Mengambil nama dari JTextField
    String nomorTelepon =noTeleponeField.getText();  // Mengambil nomor telepon dari JTextField
    String kategori =   jCombo.getSelectedItem().toString();  // Mengambil kategori dari JComboBox

    // Validasi input (misalnya, pastikan nomor telepon tidak kosong)
    if (nama.isEmpty() || nomorTelepon.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Nama dan Nomor Telepon harus diisi!");
        return;
    }

    // Membuat objek Contact dengan data yang diambil
    Contact contact = new Contact();
    contact.setNama(nama);
    contact.setNomorTelepon(nomorTelepon);
    contact.setKategori(kategori);

    // Membuat objek ContactDatabaseHelper untuk mengakses database
    ContactDatabaseHelper dbHelper = new ContactDatabaseHelper();

    // Menambahkan kontak ke database
    dbHelper.tambahKontak(contact);

    // Menampilkan pesan sukses
    JOptionPane.showMessageDialog(this, "Kontak berhasil ditambahkan!");

    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
      int selectedRow = jTable.getSelectedRow(); // Mendapatkan baris yang dipilih di tabel
    
    if (selectedRow != -1) {
        // Mengambil data dari text fields atau komponen input lainnya
        String newName = jnama.getText();
        String newAge = jtelepone.getText();
        String newAddress = jkategori.getText();
        
        // Mengupdate data di tabel (ini tergantung pada model tabel yang Anda gunakan)
        jTable.setValueAt(jnama, selectedRow, 1); // Kolom 1: Nama
        jTable.setValueAt(jtelepone, selectedRow, 2); // Kolom 2: Umur
        jTable.setValueAt(jkategori, selectedRow, 3); // Kolom 3: Alamat
        
        JOptionPane.showMessageDialog(this, "Data berhasil diperbarui!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "Pilih baris terlebih dahulu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnEditActionPerformed

    private void jComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboActionPerformed
          // Mendapatkan item yang dipilih dari JComboBox
    String selectedCategory = (String) jCombo.getSelectedItem();
    
    // Menampilkan pilihan yang dipilih pada console
    System.out.println("Kategori yang dipilih: " + selectedCategory);
    
    
    // Menetapkan ulang model JComboBox dengan pilihan baru (opsional)
    jCombo.setModel(new DefaultComboBoxModel<>(new String[] {"Keluarga", "Teman", "Kerja"}));

    }//GEN-LAST:event_jComboActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
      DefaultTableModel model = (DefaultTableModel) jTable.getModel();
    
    // Mendapatkan baris yang dipilih
    int selectedRow = jTable.getSelectedRow();
    
    // Periksa apakah ada baris yang dipilih
    if (selectedRow != -1) {
        // Konfirmasi penghapusan
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus baris ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            // Hapus baris yang dipilih
            model.removeRow(selectedRow);
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    } else {
        // Tampilkan pesan jika tidak ada baris yang dipilih
        JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dihapus!", "Peringatan", JOptionPane.WARNING_MESSAGE);
    }    
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
      String keyword = btnCari.getText().toLowerCase(); // Ambil kata kunci dari text field dan ubah ke huruf kecil
    boolean found = false; // Flag untuk menandai apakah data ditemukan atau tidak
    
    for (int i = 0; i < jTable.getRowCount(); i++) {
        // Misalnya kita cari di kolom pertama, ubah ke indeks kolom yang diinginkan
        String cellValue = jTable.getValueAt(i, 1).toString().toLowerCase();
        
        if (cellValue.contains(keyword)) { 
          jTable.setRowSelectionInterval(i, i); // Sorot baris yang cocok
            found = true;
            JOptionPane.showMessageDialog(this, "Data ditemukan di baris ke-" + (i + 1), "Hasil Pencarian", JOptionPane.INFORMATION_MESSAGE);
            break; // Hentikan pencarian setelah data ditemukan
        }
    }
    
    if (!found) {
        JOptionPane.showMessageDialog(this, "Data tidak ditemukan!", "Pencarian Gagal", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnCariActionPerformed

    private void jEksporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEksporActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Pilih lokasi untuk menyimpan file CSV");
        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();

            // Tambahkan ekstensi .csv jika belum ada
            if (!fileToSave.getAbsolutePath().endsWith(".csv")) {
                fileToSave = new File(fileToSave.getAbsolutePath() + ".csv");
            }

            try (PrintWriter writer = new PrintWriter(new FileWriter(fileToSave))) {
                // Ambil model dari JTable
                DefaultTableModel model = (DefaultTableModel) jTable.getModel();

                // Tulis nama kolom terlebih dahulu
                for (int i = 0; i < model.getColumnCount(); i++) {
                    writer.print(model.getColumnName(i));
                    if (i < model.getColumnCount() - 1) {
                        writer.print(","); // Pisahkan dengan koma
                    }
                }
                writer.println();

                // Tulis data baris
                for (int i = 0; i < model.getRowCount(); i++) {
                    for (int j = 0; j < model.getColumnCount(); j++) {
                        writer.print(model.getValueAt(i, j).toString());
                        if (j < model.getColumnCount() - 1) {
                            writer.print(","); // Pisahkan dengan koma
                        }
                    }
                    writer.println();
                }

                JOptionPane.showMessageDialog(this, "Data berhasil diekspor ke file CSV!", "Informasi", JOptionPane.INFORMATION_MESSAGE);

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat mengekspor data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jEksporActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       // Pilih file CSV menggunakan JFileChooser
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Pilih File CSV untuk Diimpor");
    
    int userSelection = fileChooser.showOpenDialog(null);
    
    if (userSelection == JFileChooser.APPROVE_OPTION) {
        File fileToOpen = fileChooser.getSelectedFile();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileToOpen))) {
            DefaultTableModel model = (DefaultTableModel) jTable.getModel();
            model.setRowCount(0); // Menghapus data lama di JTable

            String line;
            boolean firstLine = true;

            // Membaca setiap baris dari file CSV
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(","); // Memisahkan kolom dengan koma
                if (firstLine) {
                    // Menambahkan nama kolom jika baris pertama adalah header
                    model.setColumnIdentifiers(row);
                    firstLine = false;
                } else {
                    // Menambahkan data ke JTable
                    model.addRow(row);
                }
            }

            JOptionPane.showMessageDialog(this, "Data berhasil diimpor dari CSV!", "Impor Sukses", JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat mengimpor data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(ContactManagerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactManagerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactManagerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactManagerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContactManagerJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jCombo;
    private javax.swing.JButton jEkspor;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jkategori;
    private javax.swing.JLabel jnama;
    private javax.swing.JLabel jtelepone;
    private javax.swing.JTextField namaField;
    private javax.swing.JTextField noTeleponeField;
    // End of variables declaration//GEN-END:variables
}