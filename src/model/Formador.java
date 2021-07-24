package model;

public class Formador {
    private String nombre;
    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Formador(String pnombre, int pcodigo) {
        super();
        this.codigo = pcodigo;
        this.nombre = pnombre;
        
    }

    
    
}
