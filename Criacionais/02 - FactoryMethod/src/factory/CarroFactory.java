package factory;

//Fábrica abstrata
import model.CarroModel;

public abstract class CarroFactory {
    public abstract CarroModel getCarro(String marca, String modelo, String placa);
}
