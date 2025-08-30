# Kantin Hemat - Program Kasir Sederhana

Program sederhana berbasis Java yang mensimulasikan sistem pembelian makanan dan minuman di kantin. Pengguna bisa melihat menu, memilih barang, dan mencetak struk pembayaran.

---

## 🍱 Main Features
- Tampilkan daftar menu makanan & minuman
- Beli makanan dan minuman dengan jumlah
- Cek stok otomatis (jika stok tidak cukup, tidak bisa beli)
- Tampilkan struk pembayaran
- Bisa melakukan transaksi ulang

---

## 📦 Class Structure
- `KantinHemat.java` – Program utama (main)
- `Makanan.java` – Menyimpan data makanan (kode, nama, harga, stok)
- `Minuman.java` – Menyimpan data minuman
- `PembelianMakanan.java` – Menyimpan pembelian makanan + hitung total
- `PembelianMinuman.java` – Menyimpan pembelian minuman + hitung total

---

## 🖥 Cara Menjalankan
1. Pastikan Java dan kompiler sudah terinstall.
2. Kompilasi semua file:
   ```bash
   javac *.java
3. Run the program
   ```bash
   java KantinHemat
