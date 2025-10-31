Shuja Ahmad Tariq
240541608

  import java.util.Scanner;

public class GeometrikHesaplayici {
    public static void main(String[] args) {
        // Sabit tanımlama
        final double PI = 3.14159;

        // Scanner nesnesi oluşturma
        Scanner input = new Scanner(System.in);

        // Başlık
        System.out.println("=== GEOMETRIK HESAPLAYICI ===");
        System.out.print("Dairenin yaricapini girin (cm): ");
        double r = input.nextDouble();

        // Hesaplamalar
        double daireAlani = PI * r * r;
        double daireCevresi = 2 * PI * r;
        double daireCapi = 2 * r;
        double kureHacmi = (4.0 / 3.0) * PI * Math.pow(r, 3);
        double kureYuzeyAlani = 4 * PI * r * r;

        // Sonuçları düzenli şekilde yazdırma
        System.out.println("\nSONUCLAR:");
        System.out.println("----------");
        System.out.printf("Daire Alani         : %.2f cm^2%n", daireAlani);
        System.out.printf("Daire Cevresi       : %.2f cm%n", daireCevresi);
        System.out.printf("Daire Capi          : %.2f cm%n", daireCapi);
        System.out.printf("Kure Hacmi          : %.2f cm^3%n", kureHacmi);
        System.out.printf("Kure Yuzey Alani    : %.2f cm^2%n", kureYuzeyAlani);

        // Scanner kapatma
        input.close();
    }
}

=== GEOMETRIK HESAPLAYICI ===
Dairenin yaricapini girin (cm): 5.0

SONUCLAR:
----------
Daire Alani         : 78.54 cm^2
Daire Cevresi       : 31.42 cm
Daire Capi          : 10.00 cm
Kure Hacmi          : 523.60 cm^3
Kure Yuzey Alani    : 314.16 cm^2

