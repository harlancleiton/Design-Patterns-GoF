package pkg01.model;

import bridge.Implementador;

public class ProfessorPosGaduacao extends Professor{

    public ProfessorPosGaduacao(Implementador implementador) {
        super(implementador);
    }

    @Override
    public void op() {
        implementador.opImplementador();
    }

}
