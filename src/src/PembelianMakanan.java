public class PembelianMakanan {
    private Makanan makananDibeli;
    private int jumlahMakanan;
    private int totalHarga;

    public PembelianMakanan(Makanan makananDibeli, int jumlahMakanan) {
        this.makananDibeli = makananDibeli;

        if (makananDibeli != null) {
            if (makananDibeli.getStok() >= jumlahMakanan) {
                this.jumlahMakanan = jumlahMakanan;
                this.totalHarga = makananDibeli.getHarga() * jumlahMakanan;
                makananDibeli.setStok(makananDibeli.getStok() - jumlahMakanan);
            } else {
                System.out.println("⚠ Stok tidak mencukupi!");
            }
        } else {
            System.out.println("⚠ Menu tidak ditemukan!");
        }
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public Makanan getMakanan() {
        return makananDibeli;
    }

    public int getJumlah() {
        return jumlahMakanan;
    }


}
