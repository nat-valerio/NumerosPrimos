package com.example.numprimos;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimosTeste {
    Primos p;

    @Before
    public void Setup(){
        p = new Primos();
    }

    @Test
    public void CalculaNumerosPares(){

        boolean valorEsperado = false;
        int num = 4;
        boolean valorReal;

        valorReal = p.calculaPrimos(num);

        assertEquals(valorEsperado, valorReal);
    }

    @Test
    public void CalculaNumerosImpares3(){

        boolean valorEsperado = true;
        int num = 3;
        boolean valorReal;

        valorReal = p.calculaPrimos(num);

        assertEquals(valorEsperado, valorReal);
    }

    @Test
    public void CalculaNumerosImpares5(){

        boolean valorEsperado = true;
        int num = 5;
        boolean valorReal;

        valorReal = p.calculaPrimos(num);

        assertEquals(valorEsperado, valorReal);
    }

    @Test
    public void CalculaNumerosImpares7(){

        boolean valorEsperado = true;
        int num = 7;
        boolean valorReal;

        valorReal = p.calculaPrimos(num);

        assertEquals(valorEsperado, valorReal);
    }

    //Numeros divisiveis por 2
    @Test
    public void Calcula6(){

        boolean valorEsperado = false;
        int num = 6;
        boolean valorReal;

        valorReal = p.calculaPrimos(num);

        assertEquals(valorEsperado, valorReal);
    }

    @Test
    public void Calcula8(){

        boolean valorEsperado = false;
        int num = 8;
        boolean valorReal;

        valorReal = p.calculaPrimos(num);

        assertEquals(valorEsperado, valorReal);
    }

    //Numeros divisiveis por 3
    @Test
    public void Calcula33(){

        boolean valorEsperado = false;
        int num = 33;
        boolean valorReal;

        valorReal = p.calculaPrimos(num);

        assertEquals(valorEsperado, valorReal);
    }

    @Test
    public void Calcula63(){

        boolean valorEsperado = false;
        int num = 63;
        boolean valorReal;

        valorReal = p.calculaPrimos(num);

        assertEquals(valorEsperado, valorReal);
    }

    @Test
    public void Calcula99(){

        boolean valorEsperado = false;
        int num = 99;
        boolean valorReal;

        valorReal = p.calculaPrimos(num);

        assertEquals(valorEsperado, valorReal);
    }

    //Numeros diviseis por 5
    @Test
    public void Calcula15(){

        boolean valorEsperado = false;
        int num = 15;
        boolean valorReal;

        valorReal = p.calculaPrimos(num);

        assertEquals(valorEsperado, valorReal);
    }

    @Test
    public void Calcula55(){

        boolean valorEsperado = false;
        int num = 55;
        boolean valorReal;

        valorReal = p.calculaPrimos(num);

        assertEquals(valorEsperado, valorReal);
    }

    @Test
    public void Calcula95(){

        boolean valorEsperado = false;
        int num = 95;
        boolean valorReal;

        valorReal = p.calculaPrimos(num);

        assertEquals(valorEsperado, valorReal);
    }

    //Numeros divisiveis por 7
    @Test
    public void Calcula49(){

        boolean valorEsperado = false;
        int num = 49;
        boolean valorReal;

        valorReal = p.calculaPrimos(num);

        assertEquals(valorEsperado, valorReal);
    }

    @Test
    public void Calcula77(){

        boolean valorEsperado = false;
        int num = 77;
        boolean valorReal;

        valorReal = p.calculaPrimos(num);

        assertEquals(valorEsperado, valorReal);
    }

    @Test
    public void Calcula91(){

        boolean valorEsperado = false;
        int num = 91;
        boolean valorReal;

        valorReal = p.calculaPrimos(num);

        assertEquals(valorEsperado, valorReal);
    }

    //Excecao
    @Test
    public void CalculaZero(){

        boolean valorEsperado = false;
        int num = 0;
        boolean valorReal;

        valorReal = p.calculaPrimos(num);

        assertEquals(valorEsperado, valorReal);
    }

    @Test
    public void CalculaUm(){

        boolean valorEsperado = false;
        int num = 1;
        boolean valorReal;

        valorReal = p.calculaPrimos(num);

        assertEquals(valorEsperado, valorReal);
    }

    @Test
    public void CalculaDois(){

        boolean valorEsperado = true;
        int num = 2;
        boolean valorReal;

        valorReal = p.calculaPrimos(num);

        assertEquals(valorEsperado, valorReal);
    }
}
