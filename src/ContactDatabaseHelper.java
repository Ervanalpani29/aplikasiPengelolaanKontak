    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    import java.sql.*;
    import java.util.List;
    import java.util.ArrayList;
   
    /**
     *
     * @author User
     */
    public class ContactDatabaseHelper {
        private Connection conn;

        public ContactDatabaseHelper() {
           
        }

        public void tambahKontak(Contact contact) {
          String sql = "INSERT INTO contacts (nama, nomor_telepon, kategori) VALUES (?, ?, ?)";

    // Pastikan koneksi database valid
    if (conn == null) {
        System.out.println("Koneksi database tidak valid.");
        return;
    }

    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        // Set parameter untuk query
        stmt.setString(1, contact.getNama());           // Set nama kontak
        stmt.setString(2, contact.getNomorTelepon());   // Set nomor telepon
        stmt.setString(3, contact.getKategori());       // Set kategori kontak

        // Eksekusi query untuk menambahkan data
        int rowsAffected = stmt.executeUpdate();

        // Mengecek apakah ada perubahan pada database
        if (rowsAffected > 0) {
            System.out.println("Kontak berhasil ditambahkan!");
        } else {
            System.out.println("Gagal menambahkan kontak.");
        }
    } catch (SQLException e) {
        // Menangani SQLException jika terjadi error saat mengeksekusi query
        System.out.println("Gagal menambahkan kontak: " + e.getMessage());
    }
        }

        public List<Contact> cariKontak() {
          List<Contact> kontakList = new ArrayList<>();
    String sql = "SELECT * FROM contacts"; // Query untuk membaca semua kontak

    try (Statement stmt = conn.createStatement();  // Membuat Statement untuk menjalankan query
         ResultSet rs = stmt.executeQuery(sql)) {  // Mengeksekusi query dan mendapatkan hasilnya
         
        // Looping melalui ResultSet untuk mendapatkan data kontak
        while (rs.next()) {
            // Membuat objek Contact untuk setiap baris hasil query
            Contact contact = new Contact();
           
            contact.setNama(rs.getString("nama"));  // Ambil nama kontak
            contact.setNomorTelepon(rs.getString("nomor_telepon"));  // Ambil nomor telepon
            contact.setKategori(rs.getString("kategori"));  // Ambil kategori kontak
            
            // Menambahkan objek contact ke dalam list
            kontakList.add(contact);
        }
    } catch (SQLException e) {
        System.out.println("Gagal mengambil kontak: " + e.getMessage());  // Menangani kesalahan SQL
    }

    return kontakList;  // Mengembalikan daftar kontak yang ditemukan
}
        }
