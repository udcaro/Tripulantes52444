package model;

import java.util.ArrayList;

public class Curso {
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

    public String agregarTripulante(Tripulante t){
        tripulantes.add(t);
        return "Tripulante agregado al curso " + nombre;
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

    public void setName(String name) {
        this.name = name;
    }

    public Formador getFormador() {
        return formador;
    }
}
