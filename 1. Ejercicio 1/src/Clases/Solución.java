/* Miércoles, 3 de marzo de 2021
Hecho por: Carlos Andrés Cáceres - Diego Fernando Victoria
Códigos: 202126639 - 202125877
Programación interactiva - Universidad del Valle
 */

package Clases;

import javax.swing.*;

public class Solución {
    
    static int suma, promedio, espacio, moda;
    static int[] datosglobales = new int[50];

    public static void main(String[] args) { //Método principal
        JOptionPane.showMessageDialog(null, "Solución Ejercicio 1\nHecho por: Diego Fernando Victoria\n                      Carlos Andrés Cáceres", "Ejercicio 1", JOptionPane.INFORMATION_MESSAGE);
        Metodo1();
        Metodo2();
        Metodo3();
        Metodo4();
        JOptionPane.showMessageDialog(null, "Fin de la solución Ejercicio 1", "Ejercicio 1", JOptionPane.INFORMATION_MESSAGE);
    } //Fin método principal

    public static void Metodo1() { //Inicio solución Punto #1
        //Este método lee n cantidad de datos ingresador por el usuario, y los suma
        int i = 0;
        espacio = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos datos ingresará?", "Punto #1", JOptionPane.QUESTION_MESSAGE));
        int datos[] = new int[espacio];
        do {
            datos[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor #" + (i + 1) + " que desea guardar...", "Punto #1", JOptionPane.QUESTION_MESSAGE));
            i++;
        } while (i < espacio);
        for (int j = 0; j < datos.length; j++) {
            suma = datos[j] + suma;
            datosglobales[j] = datos[j];
        }
        JOptionPane.showMessageDialog(null, "La suma de todos los valores ingresados es: " + suma, "Punto #1", JOptionPane.INFORMATION_MESSAGE);
    } //Fin solución Punto #1

    public static void Metodo2() { //Inicio solución Punto #2
        //Este método, halla el promedio de los datos ingresados en el Método #1
        promedio = (suma / espacio);
        JOptionPane.showMessageDialog(null, "El promedio de los valores ingresados es: " + promedio, "Punto #2", JOptionPane.INFORMATION_MESSAGE);
    } //Fin solución Punto #2

    public static void Metodo3() { //Inicio solución Punto #3
        //Este método calcula cuál es el número mayor de los datos ingresados
        int num = datosglobales[0];
        for (int i = 1; i < espacio; i++) {
            if (datosglobales[i] > num) {
                num = datosglobales[i];
            }
        }
        JOptionPane.showMessageDialog(null, "El máximo de los valores ingresados es: " + num, "Punto #3", JOptionPane.INFORMATION_MESSAGE);
    } //Fin solución Punto #3

    public static void Metodo4() { //Inicio solución Punto #4
        //Este método calcula la moda de los datos ingresados
        int numRepeticiones = 0;
        for (int i = 0; i < espacio; i++) {
            int cantidad = 0;
            for (int j = 0; j < espacio; j++) {
                if (datosglobales[i] == datosglobales[j]) {
                    cantidad++;
                }
            }
            if (cantidad > numRepeticiones) {
                moda = datosglobales[i];
                numRepeticiones = cantidad;
            }
        }
        JOptionPane.showMessageDialog(null, "La moda de los valores ingresados es: " + moda, "Punto #4", JOptionPane.INFORMATION_MESSAGE);
    } //Fin solución Punto #4
}