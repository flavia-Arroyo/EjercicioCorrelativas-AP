package entity;

import java.util.List;

public class Inscripcion {

    private Materia mat;
    private Alumno alu;

    public Inscripcion() {
    }

    public Inscripcion(Materia mat, Alumno alu) {
        this.mat = mat;
        this.alu = alu;
    }

    public Materia mat() {
        return mat;
    }

    public Inscripcion setMat(Materia mat) {
        this.mat = mat;
        return this;
    }

    public Alumno alu() {
        return alu;
    }

    public Inscripcion setAlu(Alumno alu) {
        this.alu = alu;
        return this;
    }

    public boolean aprobada(){


        if(this.mat.verificarExisteCorrelativa (alu)){

            return true;

        }

        return false;


    }

}
