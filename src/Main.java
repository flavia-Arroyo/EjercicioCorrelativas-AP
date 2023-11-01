import entity.Alumno;
import entity.Inscripcion;
import entity.Materia;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //CREO ALUMNO
        Alumno alu = new Alumno ("Marcos", "Castro");
        Alumno alu2 = new Alumno ("Mariela", "Gimenez" ) ;
        //CREO LAS MATERIAS
        Materia mat = new Materia ("Algoritmo y Estructura de Datos");

       Materia mat2 = new Materia("Paradigma de Programacion");

        Materia mat3 = new Materia("Diseño de Sistemas");

        //agrego correlativas
        mat2.agregarCorrelativa ( mat );

        mat3.agregarCorrelativa ( mat2 );


        //agrego materias aprobadas a los alumnos
        alu2.agregarMatAprobada ( mat );


        //SOLICITAR INSCRIPCION
        System.out.println ("  -----------INSCRIPCION 1---------------" );
        System.out.println ("------Caso 1 : alumno:  marcos castro  Inscripcion a :  Diseño en Sistemas-------" );



        //primer caso de inscripcion
        Inscripcion inscripcion = new Inscripcion (mat3, alu);
        //primer caso de inscripcion
        if(inscripcion.aprobada ( )){
            System.out.println ( "Alumno  " + inscripcion.alu ().nombre ()+ " " + inscripcion.alu().apellido () );
            System.out.println ( "Inscripcion a la materia: " + inscripcion.mat ().nombre () + "  APROBADA!!") ;

        }else{
            System.out.println ( "Alumno  " + inscripcion.alu ().nombre ()+ " " + inscripcion.alu().apellido () );
            System.out.println ( "Inscripcion a la materia: " + inscripcion.mat ().nombre () + "   RECHAZADA!!") ;
        }

        //2DO caso de inscripcion
        //SOLICITAR INSCRIPCION
        System.out.println (" " );
        System.out.println (" " );

        System.out.println ("  -----------INSCRIPCION 2---------------" );
        System.out.println ("-----------caso 2 : alumno:  Marcos Castro  Inscripcion a : Algoritmo y estructura de datos -------" );

        Inscripcion inscr2 = new Inscripcion(mat, alu);
        //caso de inscripcion
        if(inscr2.aprobada ( )){
            System.out.println ( "Alumno  " + inscr2.alu ().nombre ()+ " " + inscr2.alu().apellido () );
            System.out.println ( "Inscripcion a la materia: " + inscr2.mat ().nombre () + " APROBADA!!") ;
        }else{
            System.out.println ( "Alumno  " + inscr2.alu ().nombre ()+ " " + inscr2.alu().apellido () );
            System.out.println ( "Inscripcion a la materia: " + inscr2.mat ().nombre () + "  RECHAZADA!!") ;
        }

        //2DO caso de inscripcion
        //SOLICITAR INSCRIPCION
        System.out.println (" " );
        System.out.println (" " );

        System.out.println ("  -----------INSCRIPCION 3---------------" );
        System.out.println ("-----------caso 3 : alumno: Mariela Gimenez  Inscripcion a : Paradigma de Programacion -------" );

        Inscripcion insc3 = new Inscripcion(mat2, alu2);
        // caso de inscripcion
        if(insc3.aprobada ( )){
            System.out.println ( "Alumno  " + insc3.alu ().nombre ()+ " " + insc3.alu().apellido () );
            System.out.println ( "Inscripcion a la materia: " + insc3.mat ().nombre () + " APROBADA!!") ;
        }else{
            System.out.println ( "Alumno  " + insc3.alu ().nombre ()+ " " + insc3.alu().apellido () );
            System.out.println ( "Inscripcion a la materia: " + insc3.mat ().nombre () + "  RECHAZADA!!") ;
        }

        System.out.println (" " );
        System.out.println (" " );

        System.out.println ("  -----------INSCRIPCION 4---------------" );
        System.out.println ("-----------caso 4: alumno: Mariela Gimenez  Inscripcion a : Diseño de Sistemas -------" );

        Inscripcion inscr4 = new Inscripcion(mat3, alu2);
        // caso de inscripcion
        if(inscr4.aprobada ( )){
            System.out.println ( "Alumno  " + inscr4.alu ().nombre ()+ " " + inscr4.alu().apellido () );
            System.out.println ( "Inscripcion a la materia: " + inscr4.mat ().nombre () + " APROBADA!!") ;
        }else{
            System.out.println ( "Alumno  " + inscr4.alu ().nombre ()+ " " + inscr4.alu().apellido () );
            System.out.println ( "Inscripcion a la materia: " + inscr4.mat ().nombre () + "  RECHAZADA!!") ;
        }












    }
}