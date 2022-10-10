import java.util.Scanner;



public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama : ");
        String nama = scanner.nextLine();
        System.out.print("NIM : ");
        String nim = scanner.nextLine();
        System.out.print("Masukan nilai Tubes : ");
        int tubes = scanner.nextInt();
        System.out.print("Masukan nilai Quiz : ");
        int quiz = scanner.nextInt();
        System.out.print("Masukan nilai Tugas: ");
        int tugas = scanner.nextInt();
        System.out.print("Masukan nilai UTS: ");
        int uts = scanner.nextInt();
        System.out.print("Masukan nilai UAS: ");
        int uas= scanner.nextInt();

        double result = (0.3*tubes)+(0.1*quiz)+(0.1*tugas)+(0.25*uts)+(0.25*uas);

        System.out.println("\n===NILAI MAHASISWA===");

        System.out.println("Nama : "+nama);
        System.out.println("NIM  : "+nim);
        System.out.println("Nilai Matakuliah Pemograman Beroientasi Objek : "+result);

    }
}
