package factory;

import model.CarroBravoModel;
import model.CarroModel;
import model.CarroPalioModel;

//Fábrica concreta
public class FiatFactory extends CarroFactory{

    @Override
    public CarroModel getCarro(String modelo, String placa) {
        if(modelo.equals("Palio"))
            return new CarroPalioModel(placa);
        else if(modelo.equals("Bravo"))
            return new CarroBravoModel(placa);
        else
            return null;
    }
    
}
