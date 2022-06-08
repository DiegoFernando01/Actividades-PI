/* Hecho por:
    - Carlos Andrés Cáceres (202126639)
    - Diego Fernando Victoria (201941366)
Fecha de elaboración: Jueves, 8 de abril de 2021
Programación interactiva - Universidad del Valle /*/

package Clases;

import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Solucion { //Inicio clase Solución

    Icon IconoEstadoSalud = new ImageIcon(getClass().getResource("/Imagenes/Estado de salud.png"));
    Icon IconoUnivalle = new ImageIcon(getClass().getResource("/Imagenes/Univalle.png"));
    Object opcionMenuPrincipal;

    public static void main(String[] args) { //Método principal
        Solucion Objeto = new Solucion();
        JOptionPane.showMessageDialog(null, "Aquí podrá consultar el estado\nde salud de sus empleados...", "Bienvenido", -1, Objeto.IconoEstadoSalud);
        Objeto.MenuPrincipal();
    } //Fin método principal

    public void MenuPrincipal() { //Inicio menú principal
        do { //Inicio bucle menú principal
            opcionMenuPrincipal = JOptionPane.showInputDialog(null, "Seleccione la opción que desea realizar...", "Menú principal", -1, IconoEstadoSalud, new Object[]{"Seleccione...", "Opción #1", "Opción #2", "Hecho por...", "Salir"}, 0);
            if (opcionMenuPrincipal.equals("Opción #1")) { //Opción 1 del menú principal
                Opcion1();
            } else if (opcionMenuPrincipal.equals("Opción #2")) { //Opción 2 del menú principal
                Opcion2();
            } else if (opcionMenuPrincipal.equals("Hecho por...")) { //Opción "Hecho por..." del menú principal
                JOptionPane.showMessageDialog(null, "Integrantes:\n - Carlos Andrés Cáceres (202126639)\n - Diego Fernando Victoria (201941366)\n\nEjercicio #2\nProgramación interactiva\nUniversidad del Valle", "Hecho por...", -1, IconoUnivalle);
            } else if (opcionMenuPrincipal.equals("Seleccione...")) { //Opción "Seleccione..." del menú principal
                JOptionPane.showMessageDialog(null, "Debe seleccionar una opción correcta.\nVuelva a intentarlo...", "Error", 2);
            }
        } while (!opcionMenuPrincipal.equals("Salir")); //Fin bucle menú principal
        JOptionPane.showMessageDialog(null, "Gracias por usar la aplicación.", "Hasta pronto", -1, IconoEstadoSalud);
    } //Fin menú principal

    public void Opcion1() { //Inicio opción #1

    } //Fin opción #1
    
    public void Opcion2() { //Inicio opción #2
        
    } //Fin opción #2

} //Fin clase Solución
