package abstractfactory;

import factory.FiatFactory;
import factory.FordFactory;
import model.CarroBravoModel;
import model.CarroModel;

/*
 * Fornece uma interface para criação de famílias de objetos relacionados
 * ou dependentes sem especificar suas classes concretas
 * Cria uma instância de várias familias de classes, ou seja, existe apenas
 * uma fábrica e esta fica responsável por instanciar toda a família de produtos
 * Usado em família de produtos bem definidas
*/

public class AbstractFactory {

    public static void main(String[] args) {
        FiatFactory fiatFactory = new FiatFactory();
        FordFactory fordFactory = new FordFactory();
        
        CarroModel bravo = fiatFactory.getCarro("Bravo", "BRV-1234");
        CarroModel fiesta = fordFactory.getCarro("Fiesta", "FST-1234");
        CarroModel palio = fiatFactory.getCarro("Palio", "PLO-1234");
        CarroModel ka = fordFactory.getCarro("Ka", "KA-1234");
        
        bravo.exibeDetalhes();
        fiesta.exibeDetalhes();
        palio.exibeDetalhes();
        ka.exibeDetalhes();
    }
    
}
