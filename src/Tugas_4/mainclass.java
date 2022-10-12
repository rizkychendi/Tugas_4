/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_4;

import java.io.*;
public class mainclass {
    public static void main(String[] args) throws IOException {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    String tglKembali = " ";
      int total = 0;
      while (true){
          System.out.println("---Pesan Tiket Pesawat---");
            System.out.print("Masukkan jumlah penumpang: ");
            int jumlah = Integer.parseInt(r.readLine());
            System.out.print("Masukan Kota Asal (Surabaya/Jakarta) : ");
            String asal = r.readLine();
            System.out.println("Pilih Rute Tujuan (tidak boleh sama dengan kota asal) : ");
            System.out.println(" 1.Bali \n 2.Surabaya \n 3.Jakarta \n 4.Lombok \n 5.Yogyakarta \n 6.Balikpapan \n 7.Makasar ");
            System.out.print("Masukan kota Tujuan : ");
            String tujuan = r.readLine();
            System.out.print("Masukan tanggal keberangkatan (DD-MM-YYYY) : ");
            String tglBerangkat = r.readLine();
            System.out.print("Pesan tiket pulang-pergi? (Y/N) : ");
            if (r.readLine().equalsIgnoreCase("Y")) {
                System.out.print("Tanggal kembali : ");
                tglKembali = r.readLine();
            }
            System.out.println("");
            System.out.println("-- Pilih Maskapai Penerbangan --");
            System.out.println("1. Lion Air");
            System.out.println("2. Citilink");
            System.out.print("Pilihan : ");
            int pilih = Integer.parseInt(r.readLine());
            System.out.println("");
            lionair[] lionair = new lionair[jumlah];
            citilink[] citilink = new citilink[jumlah];
            switch (pilih) {
                case 1:
                    System.out.println("=== Selamat datang di Maskapai Lion Air ===");
                    System.out.println("Silahkan isi data penumpang");
                    for (int i = 0; i < lionair.length; i++) {
                        System.out.println("Data penumpang ke " +(i+1));
                        System.out.print("Booking ID : ");
                        String bookingID = r.readLine();
                        System.out.print("NIK : ");
                        String nik = r.readLine();
                        System.out.print("Nama : ");
                        String nama = r.readLine();
                        System.out.print("Jenis kelamin (P/L) : ");
                        String jk = r.readLine();
                        System.out.print("No pesawat : ");
                        String noPesawat = r.readLine();
                        System.out.print("No kursi : ");
                        String noKursi =r.readLine();
                        System.out.println("");
                       lionair[i] = new lionair(noPesawat, tujuan,noKursi, jumlah, nik, nama, jk, bookingID, tglBerangkat, tglKembali, asal);
            }
                        for (int i2 = 0; i2 < lionair.length; i2++) {
                        System.out.println(" Tiket LION AIR ke "+(i2+1));
                        System.out.println("=========================");
                        System.out.println("Booking ID : " + lionair[i2].getBookingID());
                        System.out.println("NIK : " + lionair[i2].getNik());
                        System.out.println("Nama : " + lionair[i2].getNama() + "/ " + lionair[i2].getJk());
                        System.out.println("Kota Asal : " + lionair[i2].getBandaraAsal());
                        System.out.println("Kota Tujuan : " + lionair[i2].getTujuan());
                        System.out.println("Tanggal berangkat : " + lionair[i2].getTgl_berangkat());
                        System.out.println("Tanggal kembali : " + lionair[i2].getTgl_kembali());
                        System.out.println("Nomor pesawat : " + lionair[i2].getNoPesawat());
                        System.out.println("Nomor kursi : " + lionair[i2].getNoKursi());
                        System.out.println("Harga tiket : " + lionair[i2].getHarga());
                        total = lionair[i2].getTotal();
                        System.out.println("");
                    }
                    System.out.println("Total: " + total);
                    System.out.println("");
                    System.out.print("Apakahh ingin Pesan lagi? (Y/N) : ");
                    if (!r.readLine().equalsIgnoreCase("n")) {
                        break;
                    } else {
                        System.exit(0);
                        break;
                    }
        case 2 :
        System.out.println("=== Selamat datang di Maskapai Citilink ===");
                    System.out.println("Silahkan isi data penumpang");
                    for (int i = 0; i < citilink.length; i++) {
                        System.out.println("Data penumpang ke " +(i+1));
                        System.out.print("Booking ID : ");
                        String bookingID = r.readLine();
                        System.out.print("NIK : ");
                        String nik = r.readLine();
                        System.out.print("Nama : ");
                        String nama = r.readLine();
                        System.out.print("Jenis kelamin (P/L) : ");
                        String jk = r.readLine();
                        System.out.print("No pesawat : ");
                        String noPesawat = r.readLine();
                        System.out.print("No kursi : ");
                        String noKursi =r.readLine();
                        System.out.println("");
                       citilink[i] = new citilink(noPesawat, tujuan,noKursi, jumlah, nik, nama, jk, bookingID, tglBerangkat, tglKembali, asal);
            }
                        for (int i2 = 0; i2 < lionair.length; i2++) {
                        System.out.println("Tiket Citilink Ke " +(i2+1));
                        System.out.println("=========================");
                        System.out.println("Booking ID : " + citilink[i2].getBookingID());
                        System.out.println("NIK : " + citilink[i2].getNik());
                        System.out.println("Nama : " + citilink[i2].getNama() + "/ " + citilink[i2].getJk());
                        System.out.println("Kota Asal : " + citilink[i2].getBandaraAsal());
                        System.out.println("Kota Tujuan : " + citilink[i2].getTujuan());
                        System.out.println("Tanggal berangkat : " + citilink[i2].getTgl_berangkat());
                        System.out.println("Tanggal kembali : " + citilink[i2].getTgl_kembali());
                        System.out.println("Nomor pesawat : " + citilink[i2].getNoPesawat());
                        System.out.println("Nomor kursi : " + citilink[i2].getNoKursi());
                        System.out.println("Harga tiket : " + citilink[i2].getHarga());
                        total = citilink[i2].getTotal();
                        System.out.println("");
                    }
                    System.out.println("Total: " + total);
                    System.out.println("");
                    System.out.print("Apakahh ingin Pesan lagi? (Y/N) : ");
                    System.out.println("Terima Kasih Save Flight");
                    if (!r.readLine().equalsIgnoreCase("n")) {
                        break;
                    } else {
                        System.out.println("Terima Kasih Save Flight");
                        System.exit(0);
                        break;  
                        
      }
    }
    }
    }
}