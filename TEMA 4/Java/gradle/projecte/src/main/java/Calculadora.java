package com.ieseljust.edd;

public class Calculadora {

    private float lastResult;
    private String lastOp;

    public float getLastResult(){
        return this.lastResult;
    }

    public String getLastOp(){
        return this.lastOp;
    }

    public float suma(final float op1, final float op2) {
        final float result = op1 + op2;
        this.lastResult = result;
        this.lastOp = "Suma";

        return result;
    }

    public float resta(final float op1, final float op2) {
        final float result = op1 - op2;
        this.lastResult = result;
        this.lastOp = "Resta";

        return result;
    }

    public float multiplica(final float op1, final float op2) {
        // Fem els càlculs
        final float result = op1 * op2;

        // Actualitzem els atributs de la classe
        this.lastResult = result;
        this.lastOp = "Multiplica";

        // I finalment retornem els resultats
        return result;
    }

    public float divideix(final float op1, final float op2) {
        // Fem els càlculs
        final float result = op1 / op2;

        // Actualitzem els atributs de la classe
        this.lastResult = result;
        this.lastOp = "Divideix";

        // I finalment retornem els resultats
        return result;
    }

    public float mitja(float op1, float op2) {
        // Fem el calcul
        float result=op1+op2/2;
        return result;
    }

    public boolean menor(float n1, float n2){

        return(n1<n2);
    }
}