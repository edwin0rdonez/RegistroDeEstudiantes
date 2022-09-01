
public class Pregrado extends Estudiante {
    public static final String Integer = null;
    int cantidadCreditos;

   

    
    
    public Pregrado(String nombre, int edad, String programa, String tipoEtnia, int cantidadCreditos) {
        super(nombre, edad, programa, tipoEtnia);
        this.cantidadCreditos = cantidadCreditos;
    }





    @Override
    public String toString() {
        String e = super.toString();
        return "\nEstudiante Pregrado\n"+ e + "Creditos Aprobados: " + cantidadCreditos ;
    }
    
    
    
}