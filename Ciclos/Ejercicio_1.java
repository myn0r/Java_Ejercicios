package Ciclos;

import javax.swing.JOptionPane;;

public class Ejercicio_1 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe el número"));
        int resultado;

        while (numero >= 0) {
            resultado = (int) Math.pow(numero, 2);
            JOptionPane.showMessageDialog(null, "La potencia de " + numero + " es " + resultado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Escribre otro número"));
        }

    }
}