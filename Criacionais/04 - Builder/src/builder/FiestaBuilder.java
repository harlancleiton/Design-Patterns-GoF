/*
 * @author Harlan Cleiton <harlancleiton@gmail.com>
 */

package builder;

import model.CarroFiestaModel;
import model.CarroModel;

public class FiestaBuilder extends CarroBuilder{
    private CarroFiestaModel fiestaModel = new CarroFiestaModel();
    
    @Override
    public void setarPlaca(String placa){
        fiestaModel.setPlaca(placa);
        System.out.println("Placa do Fiesta setada.");
    }
    
    @Override
    public CarroModel getCarroModel(){
        System.out.println("Carro Fiesta pronto!");
        return fiestaModel;
    }
}
