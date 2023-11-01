package entity;

import java.util.ArrayList;
import java.util.List;

public class Materia {

    private String nombre;
    private List<Materia> matCorrelativas ;

    public Materia() {
    }

    public Materia( String nombre) {

        this.nombre = nombre;
        this.matCorrelativas = new ArrayList<> (  );
    }



    public String nombre() {
        return nombre;
    }

    public void agregarCorrelativa(Materia mat) {

        this.matCorrelativas.add(mat);
    }

    public boolean verificarExisteCorrelativa(Alumno alu){
        if(matCorrelativas.isEmpty ()) {
                    return true;
        }
           else if(matCorrelativas.equals ( alu.matAprobada )){
                 return true;
            }


        return false;
    }



    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", matCorrelativas=" + matCorrelativas +
                '}';
    }
}
