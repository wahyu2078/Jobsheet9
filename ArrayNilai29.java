import java.util.Scanner;

public class ArrayNilai29 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            String status = (nilaiAkhir[i] > 70) ? "lulus" : "tidak lulus";
            System.out.println("Mahasiswa ke-" + i + " " + status);
        }
    }
}
