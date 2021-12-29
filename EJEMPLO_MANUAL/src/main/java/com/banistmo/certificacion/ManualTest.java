package com.banistmo.certificacion;

import javax.swing.*;

import static org.junit.Assert.assertEquals;

public class ManualTest {

    private ManualTest(){}

    private static final String FORMATO_MENSAJE = "El paso \"%s\"  fue ejecutado correctamente?";
    private static final String MOTIVO_EJECUCION_INCORRECTA = "Ingrese la razon por la cual la prueba no se ejecuto correctamente";

    public static void validate(String paso, String nombreEscenario) {
        int esperado = 1;
        String razon = "";
        String[] opciones = {"No", "Si"};
        int opcionSeleccionada = JOptionPane.showOptionDialog(new JFrame(), String.format(FORMATO_MENSAJE, paso),
                nombreEscenario, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, opciones, opciones[0]);
        if(opcionSeleccionada == 0) {
            razon = JOptionPane.showInputDialog(MOTIVO_EJECUCION_INCORRECTA);
        }
        assertEquals(razon, esperado, opcionSeleccionada);
    }
}
