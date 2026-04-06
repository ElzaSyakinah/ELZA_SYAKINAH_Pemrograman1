import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Input NIM : ");
        String NIM = input.nextLine();

        System.out.println("Input Nama : ");
        String nama = input.nextLine();

        System.out.println("Input Alamat : ");
        String alamat = input.nextLine();

        System.out.println("Input Usia : ");
        int umur = input.nextInt();
        input.nextLine();

        System.out.println("Input Tanggal Lahir : ");
        String Lahir = input.nextLine();

        System.out.println("NIM : " + NIM);
        System.out.println("NAMA : " + nama);
        System.out.println("ALAMAT : " + alamat);
        System.out.println("USIA : " + umur);
        System.out.println("TANGGAL LAHIR : " + Lahir);

        input.close();
    }
}