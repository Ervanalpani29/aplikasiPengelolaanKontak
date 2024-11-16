/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Contact {
    private String nama;
    private String nomorTelepon;
    private String kategori;
    
        // Constructor
    public Contact() {
        // Default constructor
    }

    public Contact(int id, String nama, String nomorTelepon, String kategori) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
        this.kategori = kategori;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk nomorTelepon
    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    // Getter dan Setter untuk kategori
    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    // Override metode toString() jika ingin menampilkan objek Contact dengan cara yang mudah
    @Override
    public String toString() {
        return "Contact{nama='" + nama + "', nomorTelepon='" + nomorTelepon + "', kategori='" + kategori + "'}";
    }

}
