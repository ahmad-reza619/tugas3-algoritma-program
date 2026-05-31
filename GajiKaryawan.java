import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long[] gaji = {5000000, 6500000, 9500000};

        int[] persenLembur = {30, 32, 34, 36, 38};

        System.out.print("Masukkan Nama Karyawan : ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Golongan (A/B/C) : ");
        String golongan = scanner.nextLine().toUpperCase();

        System.out.print("Masukkan Jumlah Jam Lembur : ");
        int jamLembur = scanner.nextInt();

        int indexGaji;
        if (golongan.equals("A")) {
            indexGaji = 0;
        } else if (golongan.equals("B")) {
            indexGaji = 1;
        } else if (golongan.equals("C")) {
            indexGaji = 2;
        } else {
            System.out.println("Golongan tidak valid! Program dihentikan.");
            scanner.close();
            return;
        }

        long gajiPokok = gaji[indexGaji];

        int indexLembur;
        if (jamLembur == 1) {
            indexLembur = 0;
        } else if (jamLembur == 2) {
            indexLembur = 1;
        } else if (jamLembur == 3) {
            indexLembur = 2;
        } else if (jamLembur == 4) {
            indexLembur = 3;
        } else {
            indexLembur = 4;
        }

        long gajiLembur = 0;
        long totalGaji = gajiPokok;

        if (jamLembur > 0) {
            gajiLembur = gajiPokok * persenLembur[indexLembur] / 100;
            totalGaji = gajiPokok + gajiLembur;
        }

        System.out.println("\n========== SLIP GAJI KARYAWAN ==========");
        System.out.println("Nama Karyawan  : " + nama);
        System.out.println("Golongan       : " + golongan);
        System.out.println("Gaji Pokok     : Rp. " + String.format("%,d", gajiPokok));
        System.out.println("Jam Lembur     : " + jamLembur + " Jam");
        if (jamLembur > 0) {
            System.out.println("Persen Lembur  : " + persenLembur[indexLembur] + "%");
            System.out.println("Gaji Lembur    : Rp. " + String.format("%,d", gajiLembur));
        } else {
            System.out.println("Gaji Lembur    : Rp. 0 (Tidak Lembur)");
        }
        System.out.println("----------------------------------------");
        System.out.println("Total Gaji     : Rp. " + String.format("%,d", totalGaji));
        System.out.println("========================================");

        scanner.close();
    }
}
