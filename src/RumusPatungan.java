import java.util.Scanner;

public class RumusPatungan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total biaya: ");
        double totalBiaya = input.nextDouble();

        System.out.print("Masukkan jumlah orang: ");
        int jumlahOrang = input.nextInt();

        System.out.print("Masukkan persentase tip: ");
        double persentaseTip = input.nextDouble();

        double totalBiayaPerOrang = hitungBiayaPerOrang(totalBiaya, jumlahOrang, persentaseTip);
        System.out.println("Setiap orang harus membayar: " + totalBiayaPerOrang);
    }

    public static double hitungBiayaPerOrang(double totalBiaya, int jumlahOrang, double persentaseTip) {
        double totalBiayaDitambahTip = totalBiaya * (1 + persentaseTip / 100);
        return totalBiayaDitambahTip / jumlahOrang;
    }
}