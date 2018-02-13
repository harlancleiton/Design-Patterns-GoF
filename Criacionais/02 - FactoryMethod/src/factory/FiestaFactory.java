package factory;

import model.CarroModel;
import model.FiestaModel;

//Fábrica concreta
public class FiestaFactory extends CarroFactory{

    @Override
    public CarroModel getCarro(String marca, String modelo, String placa) {
        return new FiestaModel(modelo, marca, placa);
    }
    
}
