import model.Curso;
import model.Tripulante;

public class App {
    public static void main(String[] args) throws Exception {
        Curso programacion1 = new Curso(1234, "Fundamentos de programación", 'M', 7400, "Dev 1");       
        System.out.println(programacion1.getName());
        Tripulante t1 = new Tripulante();
        t1.setNota1(4);
        t1.setNota2(4.2);
        t1.setNota3(5);
        Tripulante t2 = new Tripulante();
        t2.setNota1(3.4);
        t2.setNota2(3.2);
        t2.setNota3(4.5);
        Tripulante t3 = new Tripulante();
        t3.setNota1(3.0);
        t3.setNota2(4.0);
        t3.setNota3(5.0);
        Tripulante t4 = new Tripulante();
        t4.setNota1(4.1);
        t4.setNota2(4.7);
        t4.setNota3(3.1);
        Tripulante t5 = new Tripulante();
        t5.setNota1(3.3);
        t5.setNota2(4.4);
        t5.setNota3(5);
        System.out.println(programacion1.agregarTripulante(t1));
        System.out.println(programacion1.agregarTripulante(t2));
        System.out.println(programacion1.agregarTripulante(t3));
        System.out.println(programacion1.agregarTripulante(t4));
        System.out.println(programacion1.agregarTripulante(t5));
        for (Tripulante desarrollador : programacion1.getTripulantes()){
            System.out.println(desarrollador.getHighNote());
        }
        
    }
}
