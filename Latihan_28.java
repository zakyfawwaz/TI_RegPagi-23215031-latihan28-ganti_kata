import java.util.Scanner;

public class Latihan_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menampilkan judul program
        System.out.println("=====Program Mengganti Kata=====");
        
        // Input kalimat dari user
        System.out.print("Masukkan Kalimat : ");
        String kalimat = input.nextLine();

        // Input kata yang ingin diganti
        System.out.print("Ganti Kata : ");
        String kataLama = input.nextLine();

        // Input kata pengganti
        System.out.print("Menjadi Kata : ");
        String kataBaru = input.nextLine();

        // Mengganti kata dalam kalimat
        String kalimatBaru = kalimat.replace(kataLama, kataBaru);

        // Menampilkan hasil
        System.out.println("\n=====Hasil Formatting====");
        System.out.println("Kalimat awal : " + kalimat);
        System.out.println("Kalimat baru : " + kalimatBaru);
        
        input.close();
    }
}
