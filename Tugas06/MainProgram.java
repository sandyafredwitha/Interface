package Tugas06;

import java.util.Scanner;

public class MainProgram {
  public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Masukkan Nomor Registrasi Karyawan\t: ");
        int nomorRegistrasi = scn.nextInt();
        scn.nextLine(); 

        System.out.print("Masukkan Nama Karyawan\t\t\t: ");
        String nama = scn.nextLine();

        System.out.print("Masukkan Gaji Karyawan PerBulan\t\t: ");
        int gajiPerBulan = scn.nextInt();
        scn.nextLine();

        System.out.println("\n============SELAMAT DATANG DI SANDYA'S MART=============\n");
        System.out.print("Masukkan Jumlah Barang\t: ");
        int jumlahTagihan = scn.nextInt();
        scn.nextLine(); 

        Invoice[] invoices = new Invoice[jumlahTagihan];
        for (int i = 0; i < jumlahTagihan; i++) {
            System.out.println("\nBarang " + (i + 1));
            System.out.print("Nama Barang\t: ");
            String namaProduk = scn.nextLine();
            System.out.print("Jumlah\t\t: ");
            int jumlah = scn.nextInt();
            scn.nextLine(); 

            System.out.print("Harga Barang\t: ");
            int hargaPerItem = scn.nextInt();
            scn.nextLine();

            invoices[i] = new Invoice(namaProduk, jumlah, hargaPerItem);
        }

        Employee employee = new Employee(nomorRegistrasi, nama, gajiPerBulan, invoices);

        employee.displayDetails();
        System.out.println("\nTotal Gaji Setelah dikurangi Tagihan : " + employee.getPayableAmount());

        scn.close();
    }
}
