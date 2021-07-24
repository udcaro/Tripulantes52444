package model;

import java.util.ArrayList;

public class Curso {
    public final static int MAXIMO_TRIPULANTES = 4;
    private int codigo;
    private String nombre;
    private char jornada;

    private Formador formador;

    private ArrayList<Tripulante> tripulantes;


    public Curso(int pcodigo, String pnombre, char pjornada, int fCodigo, String fNombre){
        super();
        this.codigo = pcodigo;
        this.nombre = pnombre;
        this.jornada = pjornada;
        formador = new Formador(fNombre, fCodigo);
        tripulantes = new ArrayList<>();
    }

    public ArrayList<Tripulante> getTripulantes() {
        return tripulantes;
    }

    public int getCodigo() {
        return codigo;
    }

    public char getJornada() {
        return jornada;
    }

    public String getName() {
        return nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setJornada(char jornada) {
        this.jornada = jornada;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public Formador getFormador() {
        return formador;
    }

    public String agregarTripulante(Tripulante t){
        if(tripulantes.size() == MAXIMO_TRIPULANTES){
            return "No se pueden agregar más de " + MAXIMO_TRIPULANTES + " Tripulantes";
        }
        tripulantes.add(t);
        return "Tripulante agregado al curso " + nombre;
    }

    public double calcularPromedioCurso() throws Exception{
        if(tripulantes.size()==0){
            throw new Exception("No hay tripulantes registrados en el curso");
        }
        double total = 0.0;
        for (Tripulante tripulante : tripulantes){
            total += tripulante.getAverage();
        }
        return total/tripulantes.size();
    }
}
