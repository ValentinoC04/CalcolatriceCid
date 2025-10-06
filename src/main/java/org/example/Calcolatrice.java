package org.example;

public class Calcolatrice {
    public Calcolatrice() {
    }
    protected int  Addizione(int a, int b) {
        return a + b;
    }
    protected int  Sotttrazione(int a, int b) {
        return a - b;
    }

    protected float Divisione(float a,float b){
        if(b==0){
            System.out.println("Errore!");
            return 0;
        }
        else
            return a/b;
    }

    protected float Moltiplicazione(double a,double b){
        return (float) (a*b);
    }
}
