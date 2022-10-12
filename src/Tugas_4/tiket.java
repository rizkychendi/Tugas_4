/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_4;

public class tiket {
    private String bandaraAsal;
    private String bookingID;

    /* renamed from: jk */
    private String f1jk;
    private String nama;
    private String nik;
    private String tgl_berangkat;
    private String tgl_kembali;

    public tiket(String nik2, String nama2, String jk, String bookingID2, String tgl_berangkat2, String tgl_kembali2, String bandaraAsal2) {
        this.nik = nik2;
        this.nama = nama2;
        this.f1jk = jk;
        this.bookingID = bookingID2;
        this.tgl_berangkat = tgl_berangkat2;
        this.tgl_kembali = tgl_kembali2;
        this.bandaraAsal = bandaraAsal2;
    }

    public String getNik() {
        return this.nik;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJk() {
        return this.f1jk;
    }

    public String getBookingID() {
        return this.bookingID;
    }

    public String getTgl_berangkat() {
        return this.tgl_berangkat;
    }

    public String getTgl_kembali() {
        return this.tgl_kembali;
    }

    public String getBandaraAsal() {
        return this.bandaraAsal;
    }
}