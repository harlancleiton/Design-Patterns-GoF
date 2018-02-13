/*
 * @author Harlan Cleiton <harlancleiton@gmail.com>
 */

package builder;

import model.CarroModel;
import model.CarroPalioModel;

public class PalioBuilder extends CarroBuilder{
    private CarroPalioModel palioModel = new CarroPalioModel();
    
    @Override
    public void setarPlaca(String placa){
        palioModel.setPlaca(placa);
        System.out.println("Placa do Palio setada.");
    }
    
    @Override
    public CarroModel getCarroModel(){
        System.out.println("Carro Palio pronto!");
        return palioModel;
    }
}
