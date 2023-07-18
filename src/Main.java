import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        System.out.print(sayi + " ");
        sayi = cikarEkle(sayi);
        System.out.print(sayi + " ");
    }

    public static int cikarEkle(int sayi) {
        if (sayi <= 0) {
            return sayi + 5;
        } else {
            System.out.print((sayi - 5) + " ");
            return cikarEkle(sayi - 5);
        }
    }
}