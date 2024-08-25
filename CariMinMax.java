import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a, b, c, min, max;
            // Input tiga bilangan
            System.out.print("Masukkan bilangan pertama: ");
            a = input.nextInt();
            System.out.print("Masukkan bilangan kedua: ");
            b = input.nextInt();
            System.out.print("Masukkan bilangan ketiga: ");
            c = input.nextInt();
            // Inisialisasi min dan max dengan nilai a
            min = a;
            max = a;
            // Mencari nilai minimum
            if (b < min) {
                min = b;
            }   if (c < min) {
                min = c;
            }   // Mencari nilai maksimum
            if (b > max) {
                max = b;
            }   if (c > max) {
                max = c;
            }   // Menampilkan hasil
            System.out.println("Nilai minimum: " + min);
            System.out.println("Nilai maksimum: " + max);
        }
    }
}