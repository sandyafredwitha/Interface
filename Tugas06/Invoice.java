package Tugas06;
public class Invoice implements Payable {
    String namaProduk;
    int jumlah;
    int hargaPerItem;

    public Invoice(String namaProduk, int jumlah, Integer hargaPerItem) {
        this.namaProduk = namaProduk;
        this.jumlah = jumlah;
        this.hargaPerItem = hargaPerItem;
    }

    @Override
    public double getPayableAmount() {
        return jumlah * hargaPerItem;
    }

    @Override
    public String toString() {
        return "Produk: " + namaProduk + ", jumlah: " + jumlah + ", hargaPerItem: " + hargaPerItem;
    }
}

