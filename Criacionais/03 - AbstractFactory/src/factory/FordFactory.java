package factory;

import model.CarroModel;
import model.CarroFiestaModel;

//Fábrica concreta
public class FordFactory extends CarroFactory{

    @Override
    public CarroModel getCarro(String modelo, String placa) {
        if(modelo.equals("Fiesta"))
            return new CarroFiestaModel(placa);
        else if(modelo.equals("Ka"))
            return new CarroFiestaModel(placa);
        else
            return null;
    }
    
}
