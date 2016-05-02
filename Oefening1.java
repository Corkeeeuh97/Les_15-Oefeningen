package Oefeningen;

import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.util.Scanner;
public class Oefening1 {
    public static void main(String[] args) {
        System.out.println("Hoeveel studenten zal hier ingeven");
        Scanner scan = new Scanner(System.in);
        InputStreamReader ireader = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(ireader);
        int n=scan.nextInt();//aantal personen inscannen
        String[] nm=new String[n]; // array voor de namen
        int[] a=new int[n]; // array voor de punten 
        int mx=0;int gm=0;int mxnr=0;//Int voor Maximum , Gemiddelde , en de plaats van de maximum om de persoon weer te vinden
        for (int i = 0; i < n; i++) {
            System.out.println("Geef de naam in");
            try {
            nm[i] = b.readLine();//naam in array    
            } catch (Exception e) {
            }
            
            System.out.println("Geef het cijfer");
            a[i] = scan.nextInt();//punt in array
            if(a[i]>mx){mx=a[i];mxnr=i;}//maximumberekeingmodule
            gm=gm+a[i];//gemiddeldeberekingmodulde           
        }
        gm=gm/n;//gemiddelde berekenen
        System.out.println("Het gemiddelde is "+gm+". Het maximum is "+mx+" van "+nm[mxnr]);//maximum en naam uit de table daarvan halen 
        System.out.println("");
        for (int j = 0; j < n; j++) {
            System.out.println(nm[j]+" : "+a[j]);//output genereren
        }
    }
}
