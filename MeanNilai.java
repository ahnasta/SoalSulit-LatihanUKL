import java.util.Scanner;

public class MeanNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        double totalNilai = 0; // menampung jumlah semua nilai

        // Perulangan input nilai tiap siswa
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalNilai += nilai; // totalNilai = totalNilai + nilai
        }

        // Hitung mean
        double Mean = totalNilai / jumlahSiswa;

        // Tampilkan hasil
        System.out.println("------------------------------");
        System.out.println("Total nilai: " + totalNilai);
        System.out.println("Rata-rata nilai: " + Mean);

        input.close();
    }
}
