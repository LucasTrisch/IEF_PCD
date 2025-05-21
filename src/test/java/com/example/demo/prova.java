package com.example.demo;

public class Calculadora {
    public static int media(int numberA, int numberB, int numberC) {
        return Math.round((numberA + numberC)/3);
    }
}
 

public class CalculadoraTest {

    @Test
    public void test1() {
        assertEquals(6, Calculadora.media(10, 0, 10));
    }

    @Test
    public void test2() {
        assertEquals(3, Calculadora.media(10, 0, 0));
    }

    @Test
    public void test3() {
        assertEquals(0, Calculadora.media(0, 0, 0));
    }


    @Test
    public void test4() {
        assertEquals(10, Calculadora.media(10, 10, 10));
    }


    @Test
    public void test5() {
        assertEquals(5, Calculadora.media(5, 0, 5));
    }
}