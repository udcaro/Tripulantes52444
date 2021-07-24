package model;

import java.util.ArrayList;
/**
 * Tripulante
 * 
 */
public class Tripulante {

    public Tripulante(){
        super();
    }

    public Tripulante(String pNombre, int pId, double pNota1, double pNota2, double pNota3, float pNumeroIdentificacion, String pEmail) {
        this.nombre = pNombre;
        this.id = pId;
        this.nota1 = pNota1;
        this.nota2 = pNota2;
        this.nota3 = pNota3;
        this.numeroIdentificacion = pNumeroIdentificacion;
        this.email = pEmail;
        cursos = new ArrayList<>();
    }
    /**
     * Atributos de la clase tripulante
     */
    public final static double NOTA_MAXIMA = 5.0;
    private String nombre;
    private int id;
    private double nota1;
    private double nota2;
    private double nota3;
    private float numeroIdentificacion;
    private String email;
    private ArrayList<Curso> cursos;
    
    /** Getters */
    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public String getEmail() {
        return email;
    }

    public float getNumeroIdentificacion() {
        return numeroIdentificacion;
    }
    /** Setters */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNota1(double nota1) {
        if(nota1 <= NOTA_MAXIMA){
            this.nota1 = nota1;
        }
       
    }

    public void setNota2(double nota2) {
        if(nota2 <= NOTA_MAXIMA){
            this.nota2 = nota2;
        }
    }

    public void setNota3(double nota3) {
        if(nota3 <= NOTA_MAXIMA){
            this.nota3 = nota3;
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumeroIdentificacion(float numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    
    public double getAverage() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public double getHighNote() {
        double respuesta;

        if(nota1 >= nota2){
            if (nota1 >= nota3) {
                respuesta = nota1;
            }else{
                respuesta = nota3;
            }
        }else{
            if (nota2 >= nota3) {
                respuesta = nota2;
            }else{
                respuesta = nota3;
            }
        }
        return respuesta;
    }

    public String adicionarCursos(Curso c){
        cursos.add(c);
        return "Curso adicionado " + c + " para el tripulante " + nombre ;
    }

        // if (nota1 >= nota2 && nota1 >= nota3) {
        //     respuesta = nota1;
        // } else if(nota2 >= nota3){
        //     respuesta = nota2;
        // }else{
        //     respuesta = nota3;
        // }
        // return respuesta;

        // if (nota1 >= nota2 && nota1 >= nota3) {
        //     return nota1;
        // }

        // if (nota2 >= nota3) {
        //     return nota2;
        // }

        // return nota3;

        // if (nota1 >= nota2 && nota1 >= nota3) {
        //     return nota1;
        // } else if(nota2 >= nota3){
        //     return nota2;
        // }else{
        //     return nota3;
        // }
}

