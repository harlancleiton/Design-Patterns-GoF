/*
 * Separar a construção de um objeto complexo da sua representação de modo
 * que o mesmo processo de construção possa criar diferentes representações
 * O padrão Builder é comparado com o AbstractFactory, pois ambos podem ser
 * utilizados para construção de objetos complexos, a principal diferença
 * entre eles é que o Builder constrói objetos complexos passo a passo, enquanto
 * o AbstractFactory constrói famílias de objetos, simples ou complexas, de uma
 * só vez
*/

package pkg04.builder;

import builder.CarroBuilder;
import builder.FiestaBuilder;
import builder.Montadora;
import builder.PalioBuilder;
import model.CarroFiestaModel;
import model.CarroModel;

public class Builder {
    public static void main(String[] args) {
        Montadora montadora = new Montadora();
        
        CarroBuilder fiestaBuilder = new FiestaBuilder();
        montadora.montarCarroBuilder(fiestaBuilder, "FST-1234");
        CarroModel fiesta = fiestaBuilder.getCarroModel();
        fiesta.exibeDetalhes();
        
        CarroBuilder palioBuilder = new PalioBuilder();
        montadora.montarCarroBuilder(palioBuilder, "PLO-1234");
        CarroModel palio = palioBuilder.getCarroModel();
        palio.exibeDetalhes();
    }
}