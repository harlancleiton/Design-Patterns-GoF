package factory;

import model.CarroModel;
import model.PalioModel;

//Fábrica concreta
public class PalioFactory extends CarroFactory{

    @Override
    public CarroModel getCarro(String marca, String modelo, String placa) {
        return new PalioModel(modelo, marca, placa);
    }
    
}
