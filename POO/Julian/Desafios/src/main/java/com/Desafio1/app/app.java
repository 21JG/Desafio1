package com.Desafio1.app;

import com.Desafio1.dominio.Procesos;
import javax.swing.*;

public class app {
    public static void main(String[] args) {
        Procesos juego = new Procesos();
        final String DIRECTIVO = "Directivo", PROFESOR = "Profesor", ESTUDIANTE = "Estudiante";
        int continuar = 0;

        while (continuar == 0) {
            String opcionElegida = juego.seleccionarOpcionDelJugador();
            String computadora = juego.seleccionarOpcionDePc();
            if (opcionElegida == "Invalido"){
                break;
            }
            JOptionPane.showMessageDialog(null, "Has escogido: " + opcionElegida + "\nLa computadora escogio: " + computadora,
                    "Resultado", 1);

            switch (opcionElegida) {
                case DIRECTIVO:
                    switch (computadora) {
                        case DIRECTIVO:
                            juego.empate();
                            break;

                        case PROFESOR:
                            juego.victoria();
                            break;

                        case ESTUDIANTE:
                            juego.derrota();
                            break;
                    }
                    break;

                case PROFESOR:
                    switch (computadora) {
                        case DIRECTIVO:
                            juego.derrota();
                            break;

                        case PROFESOR:
                            juego.empate();
                            break;

                        case ESTUDIANTE:
                            juego.victoria();
                            break;
                    }
                    break;

                case ESTUDIANTE:
                    switch (computadora) {
                        case DIRECTIVO:
                            juego.victoria();
                            break;

                        case PROFESOR:
                            juego.derrota();
                            break;

                        case ESTUDIANTE:
                            juego.empate();
                            break;
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Seleccione una opcion valida");
            }

            continuar = JOptionPane.showConfirmDialog(null, "Desea jugar de nuevo?", "Continuar?",0);
        }
    }
}
