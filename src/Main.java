import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double hamTutar,KDVOne=0.18,KDVTwo=0.08,KDVTutari,KDVliToplamTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Tutarı Giriniz : ");
        hamTutar = input.nextDouble();
        KDVTutari = hamTutar<1000?hamTutar*KDVOne:hamTutar*KDVTwo;
        KDVliToplamTutar = hamTutar+KDVTutari;

        System.out.println("Ham Tutar : "+hamTutar);
        System.out.println("KDV Oranı : "+ (hamTutar<1000?KDVOne:KDVTwo));
        System.out.println("KDV Tutarı : "+KDVTutari);
        System.out.println("Toplam Tutar : "+KDVliToplamTutar);
    }
}