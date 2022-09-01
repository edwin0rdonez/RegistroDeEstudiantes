

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Registro {
    static List<Estudiante> estudiantes = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){

            String con = sc.nextLine();
            procesarComandos(con);
        }
    }

    
    public Registro() {

    }// lista que guarda el registro estudiantes


    public static void procesarComandos(String comando) {
        String[] Datos = comando.split("&");
        switch (Datos[0]) {
            case "1":
               agregarEstudiante(Datos);
               break;
            case "2":
                listarEstudiantes();
                break;
            case "3":
                System.exit(0);


        }
    }
    public static void agregarEstudiante(String[] Datos) {
        Estudiante e = null;
        if(Datos[1].equals("Pregrado")){

           e = new Pregrado(Datos[2], Integer.parseInt(Datos[3]) , Datos[4], Datos[5],Integer.parseInt(Datos[6]));
        }
        else{
            e = new Posgrado(Datos[2], Integer.parseInt(Datos[3]) , Datos[4], Datos[5],Datos[6]);
        }
        estudiantes.add(e);
    }
    public static void listarEstudiantes() {
        System.out.println("***Listado de estudiantes***");
        for (Estudiante e: estudiantes) {
            System.out.println(e.toString());

        }
        
    }
    
}