package com.Calculadora.dominio;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class Calculadora {
    public int sumar(List<Integer> lista){
        int resultado = 0;
        for (int i = 0; i < lista.size(); i++) {
            resultado = resultado + lista.get(i);
        }
        return resultado;
    }

    public int restar(List<Integer> lista){
        int resultado = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            resultado = resultado - lista.get(i);
        }
        return resultado;
    }

    public int multiplicar(List<Integer> lista){
        int resultado = 1;
        resultado = lista.stream().reduce((x,y) -> x*y).get();
        return resultado;
    }

    public float dividir(List<Integer> lista){
        float resultado = lista.get(0);

        resultado = lista.stream().reduce((x,y) -> x/y).get();
//        for (int i = 1; i < lista.size(); i++) {
//            resultado = resultado / lista.get(i);
//        }
        return resultado;
    }


}
