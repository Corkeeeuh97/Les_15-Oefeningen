package Oefeningen;

/**
 *
 * @author CVDC
 */
import java.util.Scanner;
public class Oefening2 {
    public static void main(String[] args) {
        System.out.println("Geef getallen in eindig met 0");
        Scanner scan = new Scanner(System.in);
        int g=1;
        int[] a = new int[20];
        for (int i = 0; g!=0; i++) {
            g=scan.nextInt();
            a[i]=g;
            }
        //Zoekfunctie
        System.out.println("Geef een zoekgetal in");
        int zoekgetal = scan.nextInt();
        int aantal = 0;
        boolean gevonden=false;
        for (int j = 0; j < 20; j++) {
            if(a[j]==zoekgetal){
                gevonden=true;
                aantal++;
            }
        }
        if (gevonden==true) {
            System.out.println("Het getal "+zoekgetal+" is "+aantal+" aantal keer gevonden");
        }
        else{
            System.out.println("Het getal is niet gevonden");
        }
    }
}
