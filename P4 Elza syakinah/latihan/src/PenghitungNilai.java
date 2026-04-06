import java.util.Scanner;

public class PenghitungNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah kehadiran (maksimal 21): ");
        int kehadiran = scanner.nextInt();
    
        if (kehadiran > 21 || kehadiran < 0) {
            System.out.println("Error: Jumlah kehadiran harus antara 0-21!"); 
            return;
        }
        System.out.print("Masukkan bobot kehadiran (%): ");
        double bobotKehadiran = scanner.nextDouble();
        
        System.out.print("Masukkan bobot tugas (%): ");
        double bobotTugas = scanner.nextDouble();
        
        System.out.print("Masukkan bobot UTS (%): ");
        double bobotUTS = scanner.nextDouble();
        
        System.out.print("Masukkan bobot UAS (%): ");
        double bobotUAS = scanner.nextDouble();
    
        if (Math.abs(bobotKehadiran + bobotTugas + bobotUTS + bobotUAS - 100) > 0.01) {
            System.out.println("Error: Total bobot harus 100%!");
            return;
        }
        System.out.println("\n--- Input Nilai Komponen ---");
        System.out.print("Masukkan nilai tugas (0-100): ");
        double nilaiTugas = scanner.nextDouble();
        
        System.out.print("Masukkan nilai UTS (0-100): ");
        double nilaiUTS = scanner.nextDouble();
        
        System.out.print("Masukkan nilai UAS (0-100): ");
        double nilaiUAS = scanner.nextDouble();
    
        if (nilaiTugas < 0 || nilaiTugas > 100 || 
            nilaiUTS < 0 || nilaiUTS > 100 || 
            nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Error: Nilai harus antara 0-100!");
            return;
        }
        
        double nilaiKehadiran = (double) kehadiran / 21 * 100;
        
        double nilaiAkhir = (nilaiKehadiran * bobotKehadiran / 100) +
                           (nilaiTugas * bobotTugas / 100) +
                           (nilaiUTS * bobotUTS / 100) +
                           (nilaiUAS * bobotUAS / 100);
        
        System.out.println("\n=== HASIL PERHITUNGAN NILAI ===");
        System.out.printf("Kehadiran     : %d/21 = %.1f%% (bobot %.1f%%) = %.2f\n", 
                         kehadiran, nilaiKehadiran, bobotKehadiran, nilaiKehadiran * bobotKehadiran / 100);
        System.out.printf("Tugas         : %.0f%% (bobot %.1f%%) = %.2f\n", 
                         nilaiTugas, bobotTugas, nilaiTugas * bobotTugas / 100);
        System.out.printf("UTS           : %.0f%% (bobot %.1f%%) = %.2f\n", 
                         nilaiUTS, bobotUTS, nilaiUTS * bobotUTS / 100);
        System.out.printf("UAS           : %.0f%% (bobot %.1f%%) = %.2f\n", 
                         nilaiUAS, bobotUAS, nilaiUAS * bobotUAS / 100);
        System.out.println("================================");
        System.out.printf("TOTAL NILAI   : %.2f\n", nilaiAkhir);
        
        String grade = getGrade(nilaiAkhir);
        System.out.println("GRADE         : " + grade);
        
        scanner.close();
    }
    
    private static String getGrade(double nilai) {
        if (nilai >= 90) return "A";
        else if (nilai >= 80) return "B";
        else if (nilai >= 70) return "C";
        else if (nilai >= 60) return "D";
        else return "E";
    }
}