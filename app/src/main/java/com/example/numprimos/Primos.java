package com.example.numprimos;

public class Primos{

    public static boolean calculaPrimos(int numb) {
        for (int i = 2; i < numb; i++) {
            if (numb % i == 0)
                return false;
        }
        return true;
    }
}
