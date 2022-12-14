package KosulluIfadeler;

import java.util.Scanner;

//Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        double ortalama;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();
        if (mat >= 100 || mat <= 0) {
            mat = 0;
        }
        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();
        if (fizik >= 100 || fizik <= 0) {
            fizik = 0;
        }
        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();
        if (turkce >= 100 || turkce <= 0) {
            turkce = 0;
        }
        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();
        if (kimya >= 100 || kimya <= 0) {
            kimya = 0;
        }
        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();
        if (muzik >= 100 || muzik <= 0) {
            muzik = 0;
        }

        ortalama = (mat + fizik + turkce + kimya + muzik) / 5;


        if (ortalama <= 55) {
            System.out.println("Kaldınız.");
        } else {
            System.out.println("Geçtiniz");
        }
        System.out.println("Ortalamanız : " + ortalama);
    }
}
