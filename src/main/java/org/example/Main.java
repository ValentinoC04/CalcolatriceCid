package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calcolatrice c=new Calcolatrice();
        Scanner s=new Scanner(System.in);
        System.out.println("Cosa vuoi fare ? Addizione(A) o Sottrazione(S)?");
        String risposta=s.nextLine();
        if(risposta.equals("A")){
            System.out.println("Dammi il valore di del primo numero");
            int a=s.nextInt();
            System.out.println("Dammi il valore di del secondo  numero");
            int b=s.nextInt();
            System.out.println("Il risultato è: "+c.Addizione(a,b));
        }
        else if(risposta.equals("S")){
            System.out.println("Dammi il valore di del primo numero");
            int a=s.nextInt();
            System.out.println("Dammi il valore di del secondo  numero");
            int b=s.nextInt();
            System.out.println("Il risultato è: "+c.Sotttrazione(a,b));
        }
    }
}