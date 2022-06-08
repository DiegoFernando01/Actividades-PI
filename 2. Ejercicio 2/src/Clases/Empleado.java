package Clases;

/* Hecho por:
    - Carlos Andrés Cáceres (202126639)
    - Diego Fernando Victoria (201941366)
Fecha de elaboración: Jueves, 8 de abril de 2021
Programación interactiva - Universidad del Valle /*/

public class Empleado { //Inicio clase Empleado

    private String Facultad;
    private String nombre;
    private int Edad;
    private String genero;
    private Double Estatura;
    private Double Peso;
    private Boolean Diabetes;
    private Boolean hipetension;
    private Boolean Embarazo;
    private Boolean Obesidad;

    //private boolean ; hacer una lista de enfermedades 
    public Empleado(String _Facultad, String _nombre, int _Edad, String _genero, Double _Estatura, Double _Peso, boolean _diabetes, boolean _hipertension, boolean _Embarazo, boolean _Obesidad) { // constructor 
        this.Facultad = _Facultad;
        this.nombre = _nombre;
        this.Edad = _Edad;
        this.genero = _genero;
        this.Estatura = _Estatura;
        this.Peso = _Peso;
        this.Diabetes = _diabetes;
        this.hipetension = _hipertension;
        this.Embarazo = _Embarazo;
        this.Obesidad = _Obesidad;

    }

    public void SetFacultad(String Facultad) {
        this.Facultad = Facultad;
    }

    public String getFacultad() {
        return Facultad;
    }

    public void SetNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void SetEdad(int edad) {
        this.Edad = edad;
    }

    public int getEdad() {
        return Edad;
    }

    public void SetGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void SetEstatura(Double Estatura) {
        this.Estatura = Estatura;
    }

    public void SetPeso(Double Peso) {
        this.Peso = Peso;
    }

    public void Setdiabetes(boolean diabetes) {
        this.Diabetes = diabetes;
    }

    public boolean getDiabetes() {
        return Diabetes;
    }

    public void SetHipertencion(boolean hipertencion) {
        this.hipetension = hipertencion;
    }

    public boolean getHipertencion() {
        return hipetension;
    }

    public void SetEmbarazo(boolean Embarazo) {
        this.Embarazo = Embarazo;
    }

    public boolean getEmbarazo() {
        return Embarazo;
    }

    public void SetObesidad(boolean Obesidad) {
        this.Obesidad = Obesidad;
    }

    public boolean getObesidad() {
        return Obesidad;
    }

} //Fin clase Empleado