import java.util.Scanner;

public class TugasArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya elemen: ");
        int banyakElemen = sc.nextInt();

        int[] data = new int[banyakElemen];

        for (int i = 0; i < banyakElemen; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            data[i] = sc.nextInt();
        }

        int nilaiTertinggi = data[0];
        int nilaiTerendah = data[0];

        int total = 0;

        for (int i = 0; i < banyakElemen; i++) {
            if (data[i] > nilaiTertinggi) {
                nilaiTertinggi = data[i];
            }
            if (data[i] < nilaiTerendah) {
                nilaiTerendah = data[i];
            }
            total += data[i];
        }

        double rataRata = (double) total / banyakElemen;

        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("Nilai rata-rata: " + rataRata);
    }
}
