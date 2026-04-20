import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner simpan = new Scanner(System.in);
        int ulangMenu;

        // simpan data
        String nama = "";
        int umur = 0;
        String jurusan = "";
        String reguler = "";

        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Pilih Jurusan");
            System.out.println("2. Biodata");
            System.out.print("Pilih menu: ");
            int menu = simpan.nextInt();
            simpan.nextLine();

            if (menu == 1) {
                char jawab;

                do {
                    // pilih jurusan
                    System.out.println("\n=== PILIH JURUSAN ===");
                    System.out.println("1. Teknik Informatika");
                    System.out.println("2. Akuntansi");
                    System.out.println("3. Manajemen");
                    System.out.println("4. Hukum");

                    System.out.print("Input pilihan jurusan: ");
                    int pilihan = simpan.nextInt();

                    if (pilihan == 1) {
                        jurusan = "Teknik Informatika";
                    } else if (pilihan == 2) {
                        jurusan = "Akuntansi";
                    } else if (pilihan == 3) {
                        jurusan = "Manajemen";
                    } else if (pilihan == 4) {
                        jurusan = "Hukum";
                    } else {
                        jurusan = "Tidak tersedia";
                    }

                    // pilih reguler
                    System.out.println("\n=== PILIH REGULER ===");
                    System.out.println("1. Reg A");
                    System.out.println("2. Reg B");
                    System.out.println("3. Reg CK");
                    System.out.println("4. Reg CS");

                    System.out.print("Input pilihan reguler: ");
                    int reg = simpan.nextInt();

                    if (reg == 1) {
                        reguler = "Reg A";
                    } else if (reg == 2) {
                        reguler = "Reg B";
                    } else if (reg == 3) {
                        reguler = "Reg CK";
                    } else if (reg == 4) {
                        reguler = "Reg CS";
                    } else {
                        reguler = "Tidak tersedia";
                    }

                    // tampil data
                    System.out.println("\n=== DATA ===");
                    System.out.println("Jurusan : " + jurusan);
                    System.out.println("Reguler : " + reguler);
                    System.out.println("Nama    : " + nama);
                    System.out.println("Umur    : " + umur);

                    System.out.print("\nGanti jurusan? (Y/N): ");
                    jawab = simpan.next().charAt(0);

                } while (jawab == 'Y' || jawab == 'y');

                ulangMenu = 1;

            } else if (menu == 2) {
                char edit;

                do {
                    System.out.println("\n=== BIODATA ===");

                    System.out.print("Input nama: ");
                    nama = simpan.nextLine();

                    System.out.print("Input umur: ");
                    umur = simpan.nextInt();
                    simpan.nextLine();

                    // tampil data
                    System.out.println("\n=== DATA ===");
                    System.out.println("Jurusan : " + jurusan);
                    System.out.println("Reguler : " + reguler);
                    System.out.println("Nama    : " + nama);
                    System.out.println("Umur    : " + umur);

                    System.out.print("\nEdit nama / umur? (Y/N): ");
                    edit = simpan.next().charAt(0);
                    simpan.nextLine();

                } while (edit == 'Y' || edit == 'y');

                ulangMenu = 1;

            } else {
                System.out.println("Menu tidak tersedia");
                ulangMenu = 1;
            }

        } while (ulangMenu == 1);

        System.out.println("Program selesai");
        simpan.close();
    }
}