package IkinciHafta;
import java.util.Scanner;
public class PalindromSayi {
    static boolean isPalindrome(int girilenDeger){
        int girilenDegerKopya = girilenDeger;
        int tersi = 0,sonSayi;

        while(girilenDegerKopya !=0){
            System.out.println("\n=========================");
            sonSayi = girilenDegerKopya % 10;
            System.out.println("\nKontrol edilecek sayının ters değerinin ilk sayısı:"+sonSayi);
            tersi = (tersi*10) + sonSayi;
            System.out.println("\nKontrol edilecek sayının tersinin basamak değeri:"+tersi);
            girilenDegerKopya /=10;

        }
        if (girilenDeger==tersi){
            return true;
        }else{
            return false;
        }

    }

    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Kontrol edilecek sayı:");
        int girilenDeger= input.nextInt();
        System.out.println(isPalindrome(girilenDeger));

    }
}
