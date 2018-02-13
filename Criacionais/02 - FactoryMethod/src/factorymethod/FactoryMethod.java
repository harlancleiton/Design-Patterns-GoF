/*
 * Define uma interface para criar um objeto, mas deixa as subclasses decidirem
 * que classe instanciar
 * Deve-se ter uma classe/produto abstrata e n classes/produtos concretos
 * Deve-se ter uma classe/fábrica com o método de criação do produto
 * A vantagem é poder criar um produto sem saber como ele é criado, basta
 * informar os dados necessários para poder cria-los
*/

package factorymethod;

import factory.CarroFactory;
import factory.FiestaFactory;
import factory.PalioFactory;
import model.CarroModel;

public class FactoryMethod {

    public static void main(String[] args) {
        
        /*
         * Cria as variáveis com os produtos/fábricas abstratas, e as subclasses
         * decidem qual classe instanciar
         */
        
        CarroFactory palioFactory = new PalioFactory();
        CarroFactory fiestaFactory = new FiestaFactory();
        
        CarroModel palio = palioFactory.getCarro("Ford", "Palio 2017", "NOZ-1092");
        CarroModel fiesta = fiestaFactory.getCarro("Ford", "Fiesta 2016", "ZTO-1590");
        
        palio.exibeDetalhes();
        System.out.println("\n");
        fiesta.exibeDetalhes();
    }
}