import java.util.Scanner;

public class HitungGajiKaryawan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data dari pengguna
        System.out.print("Masukkan Golongan Karyawan (A/B/C): ");
        char golongan = input.next().toUpperCase().charAt(0);

        System.out.print("Masukkan Jumlah Jam Lembur: ");
        int jamLembur = input.nextInt();

        double gajiPokok = 0;
        double persenLembur = 0;

        // Statemen IF untuk menentukan Gaji Pokok berdasarkan Golongan
        if (golongan == 'A') {
            gajiPokok = 5000000;
        } else if (golongan == 'B') {
            gajiPokok = 6500000;
        } else if (golongan == 'C') {
            gajiPokok = 9500000;
        } else {
            System.out.println("Golongan yang dimasukkan tidak valid!");
            input.close();
            return;
        }

        // Statemen IF untuk menentukan persentase Uang Lembur
        if (jamLembur == 1) {
            persenLembur = 0.30;
        } else if (jamLembur == 2) {
            persenLembur = 0.32;
        } else if (jamLembur == 3) {
            persenLembur = 0.34;
        } else if (jamLembur == 4) {
            persenLembur = 0.36;
        } else if (jamLembur >= 5) {
            persenLembur = 0.38;
        } else {
            persenLembur = 0; // Jika jam lembur 0 atau negatif
        }

        // Operator Perhitungan
        double gajiLembur = gajiPokok * persenLembur;
        double totalPenghasilan = gajiPokok + gajiLembur;

        // Output ke Layar
        System.out.println("\n--- RINCIAN PENGHASILAN ---");
        System.out.println("Gaji Pokok        : Rp. " + (long) gajiPokok);
        System.out.println("Gaji Lembur       : Rp. " + (long) gajiLembur);
        System.out.println("Total Penghasilan : Rp. " + (long) totalPenghasilan);

        input.close();
    }
}