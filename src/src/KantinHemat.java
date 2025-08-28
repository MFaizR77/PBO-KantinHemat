import java.util.ArrayList;
import java.util.Scanner;

public class KantinHemat {

    private static ArrayList<PembelianMakanan> keranjangMakanan = new ArrayList<>();
    private static ArrayList<PembelianMinuman> keranjangMinuman = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaKantin = "Kantin Hemat";

        // Daftar makanan
        ArrayList<Makanan> daftarMenu = new ArrayList<>();
        daftarMenu.add(new Makanan("M001", "Nasi Goreng", 15000, 10));
        daftarMenu.add(new Makanan("M002", "Bakso", 12000, 5));
        daftarMenu.add(new Makanan("M003", "Mie Ayam", 10000, 8));

        // Daftar minuman
        ArrayList<Minuman> daftarMinuman = new ArrayList<>();
        daftarMinuman.add(new Minuman("D001", "Es Teh Manis", 5000, 20));
        daftarMinuman.add(new Minuman("D002", "Jus Alpukat", 12000, 10));
        daftarMinuman.add(new Minuman("D003", "Kopi Hitam", 8000, 15));
        daftarMinuman.add(new Minuman("D004", "Air Mineral", 3000, 30));

        boolean still = true;
        boolean stills = true;
        while (still) {

            System.out.println("\n=== " + namaKantin + " ===");
            System.out.print("Masukkan nama pelanggan: ");
            String namaPelanggan = sc.nextLine();
            int pilih;
            do {
                System.out.println("\n=== MENU UTAMA ===");
                System.out.println("1. Lihat Menu");
                System.out.println("2. Beli Makanan");
                System.out.println("3. Beli minuman");
                System.out.println("4. Bayar");
                System.out.println("0. Keluar");
                System.out.print("Pilih: ");

                pilih = sc.nextInt();
                sc.nextLine();

                switch (pilih) {
                    case 1:
                        System.out.println("\n--- Daftar Makanan ---");
                        for (int i = 0; i < daftarMenu.size(); i++) {
                            System.out.print((i + 1) + ". ");
                            daftarMenu.get(i).infoMakanan();
                        }

                        System.out.println("\n--- Daftar Minuman ---");
                        for (int i = 0; i < daftarMinuman.size(); i++) {
                            System.out.print((i + 1) + ". ");
                            daftarMinuman.get(i).infoMinuman();
                        }
                        break;
                    case 2:
                        System.out.println("\n--- Daftar Makanan ---");
                        for (int i = 0; i < daftarMenu.size(); i++) {
                            System.out.print((i + 1) + ". ");
                            daftarMenu.get(i).infoMakanan();
                        }

                        System.out.print("\nPilih nomor makanan: ");
                        int idxMakanan = sc.nextInt() - 1;
                        System.out.print("Jumlah makanan: ");
                        int jumlahMakanan = sc.nextInt();

                        Makanan makananDipilih = (idxMakanan >= 0 && idxMakanan < daftarMenu.size())
                                ? daftarMenu.get(idxMakanan) : null;
                        PembelianMakanan pembelianMakan = new PembelianMakanan(makananDipilih, jumlahMakanan);
                        keranjangMakanan.add(pembelianMakan);

                        System.out.println("Berhasil menambahkan " + jumlahMakanan + " " + makananDipilih.getNamaMakanan() + " ke keranjang!");
                        break;
                    case 3:
                        System.out.println("\n--- Daftar Minuman ---");
                        for (int i = 0; i < daftarMinuman.size(); i++) {
                            System.out.print((i + 1) + ". ");
                            daftarMinuman.get(i).infoMinuman();
                        }

                        System.out.print("Pilih nomor minuman: ");
                        int idxMinuman = sc.nextInt() - 1;
                        System.out.print("Jumlah minuman: ");
                        int jumlahMinuman = sc.nextInt();
                        sc.nextLine();

                        Minuman minumanDipilih = (idxMinuman >= 0 && idxMinuman < daftarMinuman.size())
                                ? daftarMinuman.get(idxMinuman) : null;
                        PembelianMinuman pembelianMinum = new PembelianMinuman(minumanDipilih, jumlahMinuman);
                        keranjangMinuman.add(pembelianMinum);
                        System.out.println("Berhasil menambahkan " + jumlahMinuman + " " + minumanDipilih.getNamaMinuman() + " ke keranjang!");
                        break;

                    case 4:
                        System.out.println("\n===== STRUK PEMBELIAN =====");
                        System.out.println("Kantin    : " + namaKantin);
                        System.out.println("Pelanggan : " + namaPelanggan);

                        int total = 0;

                        System.out.println("\nMakanan:");
                        if (keranjangMakanan.isEmpty()) {
                            System.out.println("- Tidak ada pembelian makanan");
                        } else {
                            for (PembelianMakanan pm : keranjangMakanan) {
                                System.out.println("- " + pm.getMakanan().getNamaMakanan() + " x" + pm.getJumlah() + " = Rp" + pm.getTotalHarga());
                                total += pm.getTotalHarga();
                            }
                        }

                        System.out.println("\nMinuman:");
                        if (keranjangMinuman.isEmpty()) {
                            System.out.println("- Tidak ada pembelian minuman");
                        } else {
                            for (PembelianMinuman pn : keranjangMinuman) {
                                System.out.println("- " + pn.getMinuman().getNamaMinuman() + " x" + pn.getJumlah() + " = Rp" + pn.getTotalHarga());
                                total += pn.getTotalHarga();
                            }
                        }

                        System.out.println("\nTotal Harga : Rp" + total);
                        System.out.println("============================");

                        // Reset keranjang setelah pembayaran
                        keranjangMakanan.clear();
                        keranjangMinuman.clear();
                        stills = false;
                        break;

                    case 0:
                        System.out.println("Terima kasih telah berbelanja di " + namaKantin + "!");
                        stills = false;
                        break;

                    default:
                        System.out.println("Pilihan tidak valid!");
                        break;

                }

            } while (stills);

            System.out.print("\nApakah ingin melakukan transaksi lagi? (y/n): ");
            String pilihan = sc.nextLine();
            if (pilihan.equalsIgnoreCase("n")) {
                still = false;
                System.out.println("Terima kasih telah berbelanja di " + namaKantin + "!");
            } else{
                stills = true;
            }
        }

        sc.close();
    }
}
