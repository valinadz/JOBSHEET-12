import java.util.Scanner;

public class Kubus22 {

    public static void main(String[] args) {
        int n, t;

        System.out.print("Masukkan jumlah mahasiswa: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        System.out.print("Masukkan jumlah tugas: ");
        t = input.nextInt();

        int[][] nilaiTugas = new int[n][t];

        inputNilai(nilaiTugas, input);

        tampilNilai(nilaiTugas);

        int hariTinggi = cariNilaiTinggi(nilaiTugas);
        System.out.println("Nilai tertinggi terdapat pada hari ke-" + hariTinggi);

        tampilMahasiswaTinggi(nilaiTugas);
    }

    public static void inputNilai(int[][] nilaiTugas, Scanner input) {
        for (int i = 0; i < nilaiTugas.length; i++) {
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                System.out.print("Masukkan nilai tugas minggu ke-" + (j + 1) + " untuk mahasiswa ke-" + (i + 1) + ": ");
                nilaiTugas[i][j] = input.nextInt();
            }
        }
    }

    public static void tampilNilai(int[][] nilaiTugas) {
        System.out.println("Data nilai tugas " + nilaiTugas.length + " mahasiswa:");
        for (int i = 0; i < nilaiTugas.length; i++) {
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                System.out.print(nilaiTugas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int cariNilaiTinggi(int[][] nilaiTugas) {
        int nilaiTinggi = nilaiTugas[0][0];
        int hariTinggi = 1;
        for (int i = 0; i < nilaiTugas.length; i++) {
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                if (nilaiTugas[i][j] > nilaiTinggi) {
                    nilaiTinggi = nilaiTugas[i][j];
                    hariTinggi = j + 1;
                }
            }
        }
        return hariTinggi;
    }

    public static void tampilMahasiswaTinggi(int[][] nilaiTugas) {
        int nilaiTinggi = nilaiTugas[0][0];
        int mahasiswaTinggi = 0;
        for (int i = 0; i < nilaiTugas.length; i++) {
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                if (nilaiTugas[i][j] > nilaiTinggi) {
                    nilaiTinggi = nilaiTugas[i][j];
                    mahasiswaTinggi = i;
                }
            }
        }
        System.out.println("Mahasiswa dengan nilai tertinggi adalah mahasiswa ke-" + (mahasiswaTinggi + 1) + " dengan nilai minggu ke-" + (nilaiTinggi -1));
    }
}
