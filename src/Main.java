import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double armut = 2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00,toplam,armutKilo,elmaKilo,domatesKilo,muzKilo,patlicanKilo;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo : ");
        armutKilo = input.nextDouble();

        System.out.print("Elma Kaç Kilo : ");
        elmaKilo = input.nextDouble();

        System.out.print("Domates Kaç Kilo : ");
        domatesKilo = input.nextDouble();

        System.out.print("Muz Kaç Kilo : ");
        muzKilo = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo : ");
        patlicanKilo = input.nextDouble();

        toplam = (armut*armutKilo)+(elma*elmaKilo)+(domates*domatesKilo)+(muz*muzKilo)+(patlican*patlicanKilo);
        System.out.print("Toplam Tutar : " +toplam + " TL");
    }
}