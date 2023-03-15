package com.example.parical;

public class potencia {
    public int poten(int b, int p) {
        if (p == 1)
            return b;
        else if (p == 0)
            return 0;
        else
            return b * poten(b, p - 1);
    }

}
