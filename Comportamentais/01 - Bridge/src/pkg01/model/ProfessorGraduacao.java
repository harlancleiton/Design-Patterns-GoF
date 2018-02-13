package pkg01.model;

import bridge.Implementador;

public class ProfessorGraduacao extends Professor{
    
    public ProfessorGraduacao(Implementador implementador) {
        super(implementador);
    }

    @Override
    public void op() {
        implementador.opImplementador();
    }

}
