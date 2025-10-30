 /*
 * Ad Soyad: [Shuja Ahmad Tariq]
 * Ogrenci No: [240541608]
 * Tarih: [30-10-2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
            // Sabit tanımlama
        final double MAX_GPA = 4.00;

        // Scanner nesnesi oluşturma
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan bilgileri alma
        System.out.print("Adinizi giriniz: ");
        String ad = input.next();

        System.out.print("Soyadinizi giriniz: ");
        String soyad = input.next();

        System.out.print("ogrenci numaranizi giriniz: ");
        int ogrenciNo = input.nextInt();

        System.out.print("Yasinizi giriniz: ");
        int yas = input.nextInt();

        System.out.print("Not ortalamanizi (0.00 - 4.00) giriniz: ");
        double gpa = input.nextDouble();
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.println();
        
        // Ad
        Shuja 
        
        // Soyad
        Tariq
        
        // Ogrenci No
        240541608
        
        // Yas
        20
        
        // GPA
        3.16
        
        // Bilgileri ekrana yazdirin
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        
        // COZUMUNUZU BURAYA YAZIN
                System.out.println("\n--- OGRENCI BILGILERI ---");
        System.out.printf("Ad Soyad        : %s %s%n", ad, soyad);
        System.out.printf("Ogrenci No      : %d%n", ogrenciNo);
        System.out.printf("Yas             : %d%n", yas);
        System.out.printf("GPA             : %.2f / %.2f%n", gpa, MAX_GPA);
        
        
        
        
        // Scanner'i kapatin (önemli pratik)
         // Scanner kapatma
        input.close();
        
    }
}
