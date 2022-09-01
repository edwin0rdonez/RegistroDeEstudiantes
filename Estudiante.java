
public class Estudiante {
    private String nombre;
    private int edad;
    private String programa;
    private String tipoEtnia;

    public Estudiante(String nombre, int edad, String programa, String tipoEtnia){
        this.nombre = nombre;
        this.edad = edad;
        this.programa = programa;
        this.tipoEtnia = tipoEtnia;
    }

    @Override
    public String toString() {
        return   " \nnombre: " + nombre + "\nedad: " + edad+ "\nprograma: " + programa + "\ntipoEtnia: " + tipoEtnia + "\n"
                ;
    }

   
    
    
}        