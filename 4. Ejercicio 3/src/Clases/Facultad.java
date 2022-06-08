/* Hecho por:
    - Carlos Andrés Cáceres (202126639)
    - Diego Fernando Victoria (201941366)
Fecha de elaboración: Jueves, 8 de abril de 2021
Programación interactiva - Universidad del Valle /*/
package Clases;

import java.util.LinkedList;

public class Facultad { //Inicio clase Facultad

    LinkedList<String> ListaCovid = new LinkedList();

    public void addEmpleadoPrioridad(String nombre, String facultad) {
        ListaCovid.addFirst(nombre + " - " + facultad);
    }

    public void addEmpleadoSegundaPrioridad(String nombre, String facultad) {
        ListaCovid.add(nombre + " - " + facultad);
    }

    public void addEmpleadoTerceraPrioridad(String nombre, String facultad) {
        ListaCovid.addLast(nombre + " - " + facultad);
    }

    public int getTamaño() {
        return ListaCovid.size();
    }

    public String getEmpleado(int indice) {
        return ListaCovid.get(indice);
    }

} //Fin clase Facultad
