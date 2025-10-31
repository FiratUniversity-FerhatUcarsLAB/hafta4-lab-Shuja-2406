Shuja Ahamd Tariq
  240541608

import java.util.Scanner;

public class MaasBordrosu {
    public static void main(String[] args) {
        // Sabitler
        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;
        final int AYLIK_TOPLAM_SAAT = 160;
        final int AYLIK_CALISMA_SAATI = 176; // 22 gün * 8 saat
        final int AYLIK_GUN_SAYISI = 22;

        // Scanner nesnesi
        Scanner input = new Scanner(System.in);

        // Başlık
        System.out.println("=== MAAŞ BORDROSU HESAPLAMA ===");

        // Kullanıcıdan verileri alma
        System.out.print("Çalışanın adını ve soyadını giriniz: ");
        String adSoyad = input.nextLine();

        System.out.print("Aylık brüt maaşı giriniz (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Haftalık çalışma saati: ");
        int haftalikSaat = input.nextInt();

        System.out.print("Mesai saati sayısı: ");
        int mesaiSaat = input.nextInt();

        // --- GELİRLER ---
        double mesaiUcreti = (brutMaas / AYLIK_TOPLAM_SAAT) * mesaiSaat * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        // --- KESİNTİLER ---
        double sgk = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgk + gelirVergisi + damgaVergisi;

        // --- NET MAAŞ ---
        double netMaas = toplamGelir - toplamKesinti;

        // --- İSTATİSTİKLER ---
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / AYLIK_CALISMA_SAATI;
        double gunlukNetKazanc = netMaas / AYLIK_GUN_SAYISI;

        // --- SONUÇLARI YAZDIRMA ---
        System.out.println("\n=== MAAŞ BORDROSU ===");
        System.out.printf("Çalışan Adı Soyadı : %s%n", adSoyad);
        System.out.printf("Brüt Maaş          : %.2f TL%n", brutMaas);
        System.out.printf("Mesai Ücreti       : %.2f TL%n", mesaiUcreti);
        System.out.printf("Toplam Gelir       : %.2f TL%n", toplamGelir);
        System.out.println("----------------------------");
        System.out.printf("SGK Kesintisi      : %.2f TL%n", sgk);
        System.out.printf("Gelir Vergisi      : %.2f TL%n", gelirVergisi);
        System.out.printf("Damga Vergisi      : %.2f TL%n", damgaVergisi);
        System.out.printf("Toplam Kesinti     : %.2f TL%n", toplamKesinti);
        System.out.println("----------------------------");
        System.out.printf("Net Maaş           : %.2f TL%n", netMaas);
        System.out.println("----------------------------");
        System.out.printf("Kesinti Oranı      : %.2f%%%n", kesintiOrani);
        System.out.printf("Saatlik Net Kazanç : %.2f TL%n", saatlikNetKazanc);
        System.out.printf("Günlük Net Kazanç  : %.2f TL%n", gunlukNetKazanc);

        // Scanner kapatma
        input.close();
    }
}


=== MAAŞ BORDROSU HESAPLAMA ===
Çalışanın adını ve soyadını giriniz: Shuja Ahmad Tariq
Aylık brüt maaşı giriniz (TL): 20000
Haftalık çalışma saati: 40
Mesai saati sayısı: 10

=== MAAŞ BORDROSU ===
Çalışan Adı Soyadı : Shuja Ahmad Tariq
Brüt Maaş          : 20000.00 TL
Mesai Ücreti       : 1875.00 TL
Toplam Gelir       : 21875.00 TL
----------------------------
SGK Kesintisi      : 3062.50 TL
Gelir Vergisi      : 3281.25 TL
Damga Vergisi      : 166.04 TL
Toplam Kesinti     : 6509.79 TL
----------------------------
Net Maaş           : 15365.21 TL
----------------------------
Kesinti Oranı      : 29.76%
Saatlik Net Kazanç : 87.32 TL
Günlük Net Kazanç  : 698.42 TL

