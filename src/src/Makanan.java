public class Makanan {
        private String kodeMakanan;
        private String namaMakanan;
        private int harga;
        private int stok;

        public Makanan(String kodeMakanan, String namaMakanan, int harga, int stok) {
            this.kodeMakanan = kodeMakanan;
            this.namaMakanan = namaMakanan;
            this.harga = harga;
            this.stok = stok;
        }

        public String getKodeMakanan() {
            return kodeMakanan;
        }

        public String getNamaMakanan() {
            return namaMakanan;
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

        public void infoMakanan() {
            System.out.println("Kode: " + kodeMakanan + ", Nama: " + namaMakanan +
                    ", Harga: Rp" + harga + ", Stok: " + stok);
        }
}
