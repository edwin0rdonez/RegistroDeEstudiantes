/**
 * Posgrado1
 */
public class Posgrado extends Estudiante {

    String modalidad;

    

    public Posgrado(String nombre, int edad, String programa, String tipoEtnia, String modalidad) {
        super(nombre, edad, programa, tipoEtnia);
        this.modalidad = modalidad;
    }



    @Override
    public String toString() {
        String e = super.toString();
        return "\nEstudiante Posgrado\n" + e + "Modalidad: " + modalidad ;
    }



   
    
    
}