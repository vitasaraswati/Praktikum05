import java.util.Scanner;

public class TugasKelompok {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

    String namaRoti;
    double jumlahBarang, hargaBarang, totalHarga, totalBayar, kembalian, hargaSetelahDiskon;
    
    System.out.println("List daftar nama roti : Roti Abon, Roti Pizza, Roti Moy, Roti Sosis, Roti Milky Cheese");
    System.out.print("Masukkan nama roti yang dibeli pelanggan : ");
    namaRoti = sc.nextLine ();

    if (namaRoti.toLowerCase().equals("roti abon")){
        hargaBarang = 7500;
    } else 
    if (namaRoti.toLowerCase().equals("roti pizza")){
        hargaBarang = 6500; 
    } else 
    if (namaRoti.toLowerCase().equals("roti moy")){
        hargaBarang = 7000;
    } else 
    if (namaRoti.toLowerCase().equals("roti sosis")){
        hargaBarang = 7000;
    } else
    if (namaRoti.toLowerCase().equals("roti milky cheese")){
        hargaBarang = 6000;
    } else {
    System.out.println("Roti belum terdaftar");
    return;
    }

    System.out.println("Harga roti : " + hargaBarang);
    System.out.print("Masukkan jumlah roti : " );
    jumlahBarang = sc.nextInt ();

    totalHarga = hargaBarang * jumlahBarang; 
    System.out.println("Total Harga yang harus dibayar : " + totalHarga);

    if (totalHarga >= 50000 && totalHarga <= 100000) {
        hargaSetelahDiskon = totalHarga - (totalHarga * 0.10);
    } else 
    if (totalHarga >= 100000 && totalHarga <= 150000) {
        hargaSetelahDiskon = totalHarga - (totalHarga * 0.20);
    } else 
    if (totalHarga > 100000) {
        hargaSetelahDiskon = totalHarga - (totalHarga * 0.30);
    } else {
        hargaSetelahDiskon = totalHarga - (totalHarga * 0.00);
    }

    System.out.println("Total Harga Setelah Diskon : " + hargaSetelahDiskon);
    System.out.println("Jumlah pembayaran pembeli : ");
    totalBayar = sc.nextInt();

    kembalian = totalBayar - hargaSetelahDiskon;

    System.out.println("Kembalian : " +kembalian);
}
    }
