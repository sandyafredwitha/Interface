package Tugas06;
public class Employee implements Payable {
    int nomorRegistrasi;
    String nama;
    int gajiPerBulan;
    Invoice[] invoices;

    public Employee(int nomorRegistrasi, String nama, int gajiPerBulan, Invoice[] invoices) {
        this.nomorRegistrasi = nomorRegistrasi;
        this.nama = nama;
        this.gajiPerBulan = gajiPerBulan;
        this.invoices = invoices;
    }

    @Override
    public double getPayableAmount() {
        double totalTagihan = 0;
        for (Invoice invoice : invoices) {
            totalTagihan += invoice.getPayableAmount();
        }
        return gajiPerBulan - totalTagihan;
    }

    public void displayDetails() {
        System.out.println("Detail Karyawan:");
        System.out.println("Nomor Registrasi: " + nomorRegistrasi);
        System.out.println("Name: " + nama);
        System.out.println("Total Gaji Setelah Potongan: " + getPayableAmount());
        System.out.println("Tagihan Karyawan:");
        for (Invoice invoice : invoices) {
            System.out.println(invoice);
        }
    }
}
