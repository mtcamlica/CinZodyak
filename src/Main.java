import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dogumYili;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen doğum yılınızı giriniz: ");
        dogumYili = input.nextInt();

        if (dogumYili % 12 == 0) {
            System.out.print("Çin Zodyağı Burcunuz : Maymun");
        } else if (dogumYili % 12 == 1) {
            System.out.print("Çin Zodyağı Burcunuz : Horoz");
        } else if (dogumYili % 12 == 2) {
            System.out.print("Çin Zodyağı Burcunuz : Köpek");
        } else if (dogumYili % 12 == 3) {
            System.out.print("Çin Zodyağı Burcunuz : Domuz");
        } else if (dogumYili % 12 == 4) {
            System.out.print("Çin Zodyağı Burcunuz : Fare");
        } else if (dogumYili % 12 == 5) {
            System.out.print("Çin Zodyağı Burcunuz : Öküz");
        } else if (dogumYili % 12 == 6) {
            System.out.print("Çin Zodyağı Burcunuz : Kaplan");
        } else if (dogumYili % 12 == 7) {
            System.out.print("Çin Zodyağı Burcunuz : Tavşan");
        } else if (dogumYili % 12 == 8) {
            System.out.print("Çin Zodyağı Burcunuz : Ejderha");
        } else if (dogumYili % 12 == 9) {
            System.out.print("Çin Zodyağı Burcunuz : Yılan");
        } else if (dogumYili % 12 == 10) {
            System.out.print("Çin Zodyağı Burcunuz : At");
        } else if (dogumYili % 12 == 11) {
            System.out.print("Çin Zodyağı Burcunuz : Koyun");
        }
    }
}
