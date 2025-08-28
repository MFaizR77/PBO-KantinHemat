public class PembelianMinuman {

    private Minuman minumanDibeli;
    private int jumlahMinuman;
    private int totalHarga;

    public PembelianMinuman(Minuman minumanDibeli, int jumlahMinuman) {
        this.minumanDibeli = minumanDibeli;

        if (minumanDibeli != null) {
            if (minumanDibeli.getStok() >= jumlahMinuman) {
                this.jumlahMinuman = jumlahMinuman;
                this.totalHarga = minumanDibeli.getHarga() * jumlahMinuman;
                minumanDibeli.setStok(minumanDibeli.getStok() - jumlahMinuman);
            } else {
                System.out.println("⚠ Stok tidak mencukupi!");
            }
        } else {
            System.out.println("⚠ Menu tidak ditemukan!");
        }
    }

    public int getTotalHarga(){
        return totalHarga;
    }

    public Minuman getMinuman() {
        return minumanDibeli;
    }

    public int getJumlah() {
        return jumlahMinuman;
    }
}
