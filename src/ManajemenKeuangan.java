import java.util.Scanner;

public class ManajemenKeuangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan Usia: ");
        int usia = scanner.nextInt();
        
        System.out.print("Masukkan Jumlah Uang yang Dimiliki (Rp): ");
        double uangDimiliki = scanner.nextDouble();
        
        System.out.print("Masukkan Rata-rata Pengeluaran Harian (Rp): ");
        double pengeluaranHarian = scanner.nextDouble();

        double usiaDouble = (double) usia;
        int uangInt = (int) uangDimiliki;

        double sisaUang30Hari = uangDimiliki - (pengeluaranHarian * 30);
        double bulanBertahan = uangDimiliki / (pengeluaranHarian * 30);
        
        String statusKeuangan;
        if (bulanBertahan < 1) {
            statusKeuangan = "PERINGATAN: Keuangan Anda kurang stabil!";
        } else if (bulanBertahan > 6) {
            statusKeuangan = "Keuangan Anda dalam kondisi aman.";
        } else {
            statusKeuangan = "Keuangan Anda dalam kondisi cukup stabil.";
        }

        boolean lebihDari30 = usia > 30;
        boolean lebihDari30DanUangBanyak = usia > 30 && uangDimiliki > 10_000_000;
        boolean kurangDari30AtauUangCukup = usia < 30 || uangDimiliki > 5_000_000;

        System.out.println("\nApakah usia lebih dari 30? " + lebihDari30);
        System.out.println("Apakah usia > 30 dan uang > 10 juta? " + lebihDari30DanUangBanyak);
        System.out.println("Apakah usia < 30 atau uang > 5 juta? " + kurangDari30AtauUangCukup);

        System.out.print("\nMasukkan jumlah hutang (Rp): ");
        double hutang = scanner.nextDouble();
        
        double hutangAbsolut = Math.abs(hutang);
        double pengeluaranHarianBulat = Math.ceil(pengeluaranHarian);
        int bonusTakTerduga = (int) (Math.random() * (1_000_000 - 100_000 + 1) + 100_000);
        
        System.out.println("\n=== LAPORAN KEUANGAN PRIBADI ===");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Uang yang dimiliki: Rp" + uangInt);
        System.out.println("Pengeluaran harian rata-rata: Rp" + (int) pengeluaranHarian);
        System.out.println("Sisa uang dalam 30 hari: Rp" + (int) sisaUang30Hari);
        System.out.println("Estimasi bulan bertahan: " + String.format("%.1f", bulanBertahan) + " bulan");
        System.out.println("Status Keuangan: " + statusKeuangan);
        System.out.println("Nilai absolut dari hutang: Rp" + (int) hutangAbsolut);
        System.out.println("Pengeluaran harian setelah pembulatan: Rp" + (int) pengeluaranHarianBulat);
        System.out.println("Bonus tak terduga: Rp" + bonusTakTerduga);

        double totalSetelahPengeluaranDanBonus = sisaUang30Hari + bonusTakTerduga;
        System.out.println("Total uang yang dimiliki setelah pengeluaran dan bonus: Rp" + (int) totalSetelahPengeluaranDanBonus);

        scanner.close();
    }
}