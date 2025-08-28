public class Minuman {
    private String kodeMinuman;
    private String namaMinuman;
    private int harga;
    private int stok;

    public Minuman(String kodeMinuman, String namaMinuman, int harga, int stok) {
        this.kodeMinuman = kodeMinuman;
        this.namaMinuman = namaMinuman;
        this.harga = harga;
        this.stok = stok;
    }

    public String getKodeMinuman() {
        return kodeMinuman;
    }

    public String getNamaMinuman() {
        return namaMinuman;
    }

    public int getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void infoMinuman() {
        System.out.println("Kode: " + kodeMinuman + ", Nama: " + namaMinuman +
                ", Harga: Rp" + harga + ", Stok: " + stok);
    }

}
