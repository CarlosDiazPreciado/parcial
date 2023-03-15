package com.example.parical;

public class multiplicar {
    private int n1, n2, multiplicacion;

    public void setDatos(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    private int multiplicacion(){
        multiplicacion = n1 * n2;
        return multiplicacion;
    }

    public int getMultiplicacion(){
        return multiplicacion();
    }
}

