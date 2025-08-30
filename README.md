# Kantin Hemat - Simple Cashier Program

A simple Java-based program that simulates a food and beverage purchasing system in a canteen. Users can view the menu, select items, and print a payment receipt.

---

## 🍱 Main Features
- Display list of food & drink menus
- Purchase food and drinks with quantity
- Automatic stock check (if stock is insufficient, purchase is not allowed)
- Display payment receipt
- Allow repeat transactions

---

## 📦 Class Structure
- `KantinHemat.java` – Main program
- `Makanan.java` – Stores food data (code, name, price, stock)
- `Minuman.java` – Stores drink data
- `PembelianMakanan.java` – Stores food purchases + calculates total
- `PembelianMinuman.java` – Stores drink purchases + calculates total

---

## 🖥 How to Run
1. Make sure Java and the compiler are installed.
2. Compile all files:
   ```bash
   javac *.java
3. Run the program
   ```bash
   java KantinHemat
