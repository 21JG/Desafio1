package com.Desafio1.dominio;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Procesos {
    private Random aux = new Random();
    private List<String> opciones = Arrays.asList("Directivo", "Profesor", "Estudiante");
    private int indice = aux.nextInt(opciones.size());
    Marcador marcador = new Marcador();

    public String seleccionarOpcionDelJugador(){
        String opcionElegida = (String) JOptionPane.showInputDialog(null, "Escoge tu opcion", "Juego",
                3, null, opciones.toArray(),null);
        if (opcionElegida == null){
            opcionElegida = "Invalido";
        }
        return opcionElegida;
    }

    public String seleccionarOpcionDePc(){
        indice = aux.nextInt(opciones.size());
        String computadora = opciones.get(indice);
        return computadora;
    }

    public void victoria(){
        marcador.setVictoria(marcador.getVictoria() + 1);
        JOptionPane.showMessageDialog(null,
                "Has ganado! \n\nEmpates: " + marcador.getEmpate() + "\nVictorias: " + marcador.getVictoria() + "\nDerrotas: " + marcador.getDerrota(),
                "Resultado",1);
    }

    public void empate(){
        marcador.setEmpate(marcador.getEmpate() + 1);
        JOptionPane.showMessageDialog(null,
                "Has empatado! \n\nEmpates: " + marcador.getEmpate() + "\nVictorias: " + marcador.getVictoria() + "\nDerrotas: " + marcador.getDerrota(),
                "Resultado",1);
    }

    public void derrota(){
        marcador.setDerrota(marcador.getDerrota() + 1);
        JOptionPane.showMessageDialog(null,
                "Has perdido! \n\nEmpates: " + marcador.getEmpate() + "\nVictorias: " + marcador.getVictoria() + "\nDerrotas: " + marcador.getDerrota(),
                "Resultado",1);
    }
}
