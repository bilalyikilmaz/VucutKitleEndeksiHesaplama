import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        // Değişkenler
        double  boy, endeks;
        int kilo;

        // Kullanıcıdan Veri Girişi
        Scanner veri = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = veri.nextDouble();
        System.out.print("LLütfen kilonuzu giriniz : ");
        kilo = veri.nextInt();

        //Hesaplamalar
        endeks = kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : "+endeks);

    }
}
