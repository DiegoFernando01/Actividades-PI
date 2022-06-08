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
    Object opcionMenuPrincipal, facultadEmpleado, generoEmpleado;
    Empleado e1 = new Empleado("", "", 0, "", Double.NaN, Double.NaN, true, true, true, true);
    Facultad List = new Facultad();
    int contadorDiabetes = 0, contadorHipertension = 0, contadorObesidad = 0, contadorEmbarazo = 0;

    /*
    public static void main(String[] args) { //Método principal
        Solucion Objeto = new Solucion();
        JOptionPane.showMessageDialog(null, "Aquí podrá consultar el estado\nde salud de sus empleados...", "Bienvenido", -1, Objeto.IconoEstadoSalud);
        Objeto.MenuPrincipal();
    } //Fin método principal
     */
    public void MenuPrincipal() { //Inicio menú principal
        do { //Inicio bucle menú principal
            opcionMenuPrincipal = JOptionPane.showInputDialog(null, "Seleccione la opción que desea realizar...", "Menú principal", -1, IconoEstadoSalud, new Object[]{"Seleccione...", "Registrar empleado", "Lista de prioridad covid", "Estadistica", "Hecho por...", "Salir"}, 0);
            if (opcionMenuPrincipal.equals("Registrar empleado")) { //Opción 1 del menú principal
                Opcion1();
            } else if (opcionMenuPrincipal.equals("Lista de prioridad covid")) { //Opción 2 del menú principal
                Opcion2();
            } else if (opcionMenuPrincipal.equals("Hecho por...")) { //Opción "Hecho por..." del menú principal
                JOptionPane.showMessageDialog(null, "Integrantes:\n - Carlos Andrés Cáceres (202126639)\n - Diego Fernando Victoria (201941366)\n\nEjercicio #2\nProgramación interactiva\nUniversidad del Valle", "Hecho por...", -1, IconoUnivalle);
            } else if (opcionMenuPrincipal.equals("Estadistica")) {
                Opcion3();
            } else if (opcionMenuPrincipal.equals("Seleccione...")) { //Opción "Seleccione..." del menú principal
                JOptionPane.showMessageDialog(null, "Debe seleccionar una opción correcta.\nVuelva a intentarlo...", "Error", 2);
            }
        } while (!opcionMenuPrincipal.equals("Salir")); //Fin bucle menú principal
        JOptionPane.showMessageDialog(null, "Gracias por usar la aplicación.", "Hasta pronto", -1, IconoEstadoSalud);
    } //Fin menú principal

    public void Opcion1() { //Inicio opción #1 para registrar al empleado
        String nombre;
        int edad;
        double estatura, peso;
        facultadEmpleado = JOptionPane.showInputDialog(null, "Selecciones la facultad a la que pertence", "Registro", -1, IconoUnivalle, new Object[]{"Seleccione...", "Artes Integradas", "Ciencias Naturales y Exactas", "Ciencias de la Administración", "Salud", "Ciencias Sociales y Económicas", "Humanidades", "Ingeniería"}, 0); //Opciones de facultades
        do {
            if (facultadEmpleado.equals("Artes Integradas")) {
                e1.SetFacultad("Artes Integradas");
            } else if (facultadEmpleado.equals("Ciencias Naturales y Exactas")) {
                e1.SetFacultad("Ciencias Naturales y Exactas");
            } else if (facultadEmpleado.equals("Salud")) {
                e1.SetFacultad("Salud");
            } else if (facultadEmpleado.equals("Ciencias Sociales y Económicas")) {
                e1.SetFacultad("Ciencias Sociales y Económicas");
            } else if (facultadEmpleado.equals("Humanidades")) {
                e1.SetFacultad("Humanidades");
            } else if (facultadEmpleado.equals("Humanidades")) {
                e1.SetFacultad("Humanidades");
            } else if (facultadEmpleado.equals("Ingeniería")) {
                e1.SetFacultad("Ingeniería");
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una opción", "Error", 2);
                facultadEmpleado = JOptionPane.showInputDialog(null, "Selecciones la facultad a la que pertence", "Registro", -1, IconoUnivalle, new Object[]{"Seleccione...", "Artes Integradas", "Ciencias Naturales y Exactas", "Ciencias de la Administración", "Salud", "Ciencias Sociales y Económicas", "Humanidades", "Ingeniería"}, 0);
            }
        } while (facultadEmpleado.equals("Seleccione..."));
        nombre = JOptionPane.showInputDialog("Porfavor Ingrese su nombre");
        e1.SetNombre(nombre);
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        e1.SetEdad(edad);
        generoEmpleado = JOptionPane.showInputDialog(null, "Selecciones su genero...", "Registro", -1, IconoUnivalle, new Object[]{"Seleccione...", "Masculino", "Femenino"}, 0);
        do {
            if (generoEmpleado.equals("Masculino")) {
                e1.SetGenero("M");
            } else if (generoEmpleado.equals("Femenino")) {
                e1.SetGenero("F");
            } else {
                JOptionPane.showMessageDialog(null, "Debe selecionar su genero", "Error", 2);
                generoEmpleado = JOptionPane.showInputDialog(null, "Selecciones su genero...", "Registro", -1, IconoUnivalle, new Object[]{"Seleccione...", "Masculino", "Femenino"}, 0);
            }
        } while (generoEmpleado.equals("Seleccione..."));
        estatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su estatura"));
        e1.SetEstatura(estatura);
        peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso"));
        e1.SetPeso(peso);
        int RDiabetes = JOptionPane.showConfirmDialog(null, " ¿ Usted sufre de Diabetes ?", "", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (RDiabetes == 0) {
            e1.Setdiabetes(true);
            contadorDiabetes++;
        } else {
            e1.Setdiabetes(false);
        }
        int RHipertension = JOptionPane.showConfirmDialog(null, " ¿ Usted sufre de Hipertensión ? ", "", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (RHipertension == 0) {
            e1.SetHipertencion(true);
            contadorHipertension++;
        } else {
            e1.SetHipertencion(false);
        }
        if (e1.getGenero().equals("F")) {
            int REmbarazo = JOptionPane.showConfirmDialog(null, " ¿ Usted Se encuentra en embarazo? ", "", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (REmbarazo == 0) {
                e1.SetEmbarazo(true);
                contadorEmbarazo++;
            } else {
                e1.SetEmbarazo(false);
            }
        }
        int RObesidad = JOptionPane.showConfirmDialog(null, " ¿ Usted sufre de Obesidad ? ", "", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (RObesidad == 0) {
            e1.SetObesidad(true);
            contadorObesidad++;
        } else {
            e1.SetObesidad(false);
        }
        if (e1.getDiabetes() == true) {
            JOptionPane.showMessageDialog(null, "Le recomendamos los sigientes pasos para su autocuidado al sufrir de Diabetes :" + "\n" + "1.Se deben tomar baños diarios con un jabón suave." + "\n" + "2.Es importante que después del baño se hidrate la piel con alguna loción o aceite suave." + "\n" + "3.No se recomienda andar descalzo y se debe utilizar zapatos cómodos para evitar rasguños." + "\n" + "4.Si hay enrojecimiento, callosidades, fisuras, úlceras o alguna infección en la piel, consulta con el médico.", "", JOptionPane.INFORMATION_MESSAGE);
        }
        if (e1.getHipertencion() == true) {
            JOptionPane.showMessageDialog(null, "Le recomendamos los sigientes pasos para su autocuidado al sufrir de Hipertensión  :" + "\n" + "1.Evita el consumo excesivo de alcohol porque aumenta la presión en tus arterias." + "\n" + "2.Realiza ejercicio por lo menos de 3 a 4 veces por semana." + "\n" + "3.Toma tus medicamentos: exactamente como tu médico te indique." + "\n" + "4.Dejar de fumar: reducirá tus factores de riesgo, y la probabilidad de complicaciones aún cuando persista tu hipertensión.", "", JOptionPane.INFORMATION_MESSAGE);
        }
        if (e1.getObesidad() == true) {
            JOptionPane.showMessageDialog(null, "Le recomendamos los sigientes pasos para su autocuidado al sufrir de obesidad  :" + "\n" + "1.Evita los alimentos ricos en grasas y azúcares." + "\n" + "2.Reduce la cantidad de alcohol que consumes." + "\n" + "3.Evita el estrés, la frustración y el aburrimiento." + "\n" + "4.Busca tratamiento médico en caso de sufrir depresión.", "", JOptionPane.INFORMATION_MESSAGE);
        }
        if (e1.getEmbarazo() == true && e1.getGenero().equals("F")) {
            JOptionPane.showMessageDialog(null, "Le recomendamos los sigientes consejos para su cuidado prenatal :" + "\n" + "1. Debes estar informada de tu tiempo de embarazo y fecha probable de parto, con el fin de estar preparada para ese momento." + "\n" + "2.Debes estar informada que sus movimientos fetales serán reconocidos por ti alrededor del quinto mes, y que su frecuencia e intensidad son un signo de salud fetal." + "\n" + "3.Debes estar en capacidad de reconocer el inicio del trabajo de parto, con fines de evitar internamientos innecesarios." + "\n" + "4.En caso de presentar fiebre, diarrea, vómitos, dolor abdominal, etc., debes acudir de inmediato al centro médico.", "", JOptionPane.INFORMATION_MESSAGE);
        }
        if (e1.getEdad() > 80) {
            List.addEmpleadoPrioridad(e1.getNombre(), e1.getFacultad());
        }
        if (e1.getEdad() <= 80 && e1.getEdad() >= 65) {
            List.addEmpleadoSegundaPrioridad(e1.getNombre(), e1.getFacultad());
        }
        if (e1.getEdad() < 65) {
            List.addEmpleadoTerceraPrioridad(e1.getNombre(), e1.getFacultad());
        }
        //JOptionPane.showMessageDialog(null, "Nombre: "+e1.getNombre()+"\n"+"Diabetes :"+e1.getDiabetes());
        JOptionPane.showMessageDialog(null, "Se a registrado exitosamente", "", JOptionPane.INFORMATION_MESSAGE);
    } //Fin opción #1

    public void Opcion2() { //Inicio opción #2
        String acum = "";
        int indice = 0;
        if (List.getTamaño() != 0) {
            for (int i = 0; i < List.getTamaño(); i++) {
                indice = indice + 1;
                String aux = indice + ". " + List.getEmpleado(i) + "\n";
                acum = acum + aux;
            }
            JOptionPane.showMessageDialog(null, acum);
        } else {
            JOptionPane.showMessageDialog(null, "No se encuentra ningún usuario registrado en el momento... ", "Error", 2);
        }
    } //Fin opción #2

    public void Opcion3() { //Inicio opcion# 3
        int Poblacion = List.getTamaño(), a = 100;
        if (Poblacion == 0) {
            JOptionPane.showMessageDialog(null, "No tenemos a empleados registrados", "Error", 2);
        } else {
            int porcentajeDiabetes = (contadorDiabetes * 100) / Poblacion;
            int porcentajeHipertension = (contadorHipertension * 100) / Poblacion;
            int porcentajeEmberazo = (contadorEmbarazo * 100) / Poblacion;
            int porcentajeObesidad = (contadorObesidad * 100) / Poblacion;
            JOptionPane.showMessageDialog(null, "Se han registrado hasta ahora un total de " + Poblacion + " empleados" + "\n" + porcentajeDiabetes + "%" + " : Diabeticos" + "\n" + porcentajeHipertension + "% : Hipertensos" + "\n" + porcentajeEmberazo + "% : Embarazadas" + "\n" + porcentajeObesidad + "% : Obesos");
        }
    } //Fin opción #3

} //Fin clase Solución