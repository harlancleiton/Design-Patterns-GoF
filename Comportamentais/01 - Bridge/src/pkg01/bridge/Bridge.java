/*
 * Os padrões estruturais se preocupam com a composição das classes e seus
 * objetos. O conceito de herença é fortemente utilizado para compor interfaces
 * e definir maneiras para compor objetos e obter novas funcionalidades
 * O padrão Bridge desacopla uma abstração da sua implementação, de modo que as
 * duas possam variar independentemente. Separa a interface do objeto de sua
 * implementação.
 */
package pkg01.bridge;

import bridge.ProfessorImpGraduacao;
import bridge.ProfessorImpPosGraduacao;
import pkg01.model.Professor;
import pkg01.model.ProfessorGraduacao;
import pkg01.model.ProfessorPosGaduacao;

/**
 *
 * @author Harlan Cleiton <harlancleiton@gmail.com>
 */
public class Bridge {
    
    public static void main(String[] args) {
        Professor professorGraduacao = new ProfessorGraduacao(new ProfessorImpGraduacao());
        professorGraduacao.op();
        
        Professor professorPosGraduacao = new ProfessorPosGaduacao(new ProfessorImpPosGraduacao());
        professorPosGraduacao.op();
    }
}
