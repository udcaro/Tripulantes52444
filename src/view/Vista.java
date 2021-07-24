package view;

import java.net.Socket;

import model.Curso;
import model.Formador;


public class Vista {
    public static void main(String[] args){
        Curso cursoFrances = new Curso(52441, "Frances 101", 'N', 07400, "Guillermo");
        Curso cursoItaliano = new Curso(52442, "Italiano 102", 'T', 95678, "Maria");
        Formador profesor = new Formador("Carlitos", 321654);
        System.out.println(profesor.getCodigo());

        System.out.println(cursoFrances.getFormador().getNombre());
        System.out.println(cursoFrances.getCodigo());
        System.out.println(cursoFrances.getJornada());
        System.out.println(cursoFrances.getName());
        System.out.println(cursoItaliano.getName());
        System.out.println(cursoFrances.getFormador());
        System.out.println(cursoFrances.getFormador().getNombre());
        System.out.println(cursoFrances.getFormador().getCodigo());
        System.out.println(cursoItaliano.getFormador().getNombre());
        cursoFrances.setName("hola");
    }
    
}
