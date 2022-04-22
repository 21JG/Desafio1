package com.Calculadora.app;

import com.Calculadora.dominio.Calculadora;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppCalculadora {

    public static List<Integer> agregarNumeros(List<Integer> lista) {
        int opcion = 0;
        while (opcion == 0) {
            int n = Integer.parseInt((JOptionPane.showInputDialog("Ingrese un numero")));
            lista.add(n);
            opcion = JOptionPane.showOptionDialog(null, "Desea ingresar un nuevo numero?",
                    null, 0, 0, null, Arrays.asList("Si", "No").toArray(),
                    null);
        }
        return lista;
    }

    public static List<Integer> agregarNumerosDivision(List<Integer> lista) {
        int opcion = 0;
        while (opcion == 0) {
            int n = Integer.parseInt((JOptionPane.showInputDialog("Ingrese un numero")));
            if (n == 0){
                JOptionPane.showMessageDialog(null, "Ingrese un numero diferente de cero");
            } else {
                lista.add(n);
            }
            opcion = JOptionPane.showOptionDialog(null, "Desea ingresar un nuevo numero?",
                    null, 0, 0, null, Arrays.asList("Si", "No").toArray(),
                    null);
        }
        return lista;
    }

    public static void main(String[] args) {

        final int SUMA = 0, RESTA = 1, MULTIPLICACION = 2, DIVISION = 3, SALIR = -1;


        Calculadora calculadora = new Calculadora();
        List numeros = new ArrayList();


        int resultado;
        float resultadoDecimal;
        JCheckBox redondeo = new JCheckBox("Redondear");



        while (true){

            int opcionElegida = JOptionPane.showOptionDialog(null, "Hola!\nQue desea hacer?", "Calculadora",
                    0, 3, null, Arrays.asList("Sumar", "Restar", "Multiplicar", "Dividir", redondeo).toArray(),
                    "Sumar");

            switch (opcionElegida){
                case SALIR:
                    System.exit(0);

                case SUMA:
                    agregarNumeros(numeros);
                    JOptionPane.showMessageDialog(null, resultado = calculadora.sumar(numeros));
                    numeros.clear();
                    break;

                case RESTA:
                    agregarNumeros(numeros);
                    JOptionPane.showMessageDialog(null, resultado = calculadora.restar(numeros));
                    numeros.clear();
                    break;

                case MULTIPLICACION:
                    agregarNumeros(numeros);
                    JOptionPane.showMessageDialog(null, resultado = calculadora.multiplicar(numeros));
                    numeros.clear();
                    break;

                case DIVISION:
                    agregarNumerosDivision(numeros);
                    resultadoDecimal = calculadora.dividir(numeros);
                    if (redondeo.isSelected()){
                        JOptionPane.showMessageDialog(null, Math.round(resultadoDecimal));
                    } else
                        JOptionPane.showMessageDialog(null, resultadoDecimal);
                    numeros.clear();
                    break;
            }
        }
    }
}
