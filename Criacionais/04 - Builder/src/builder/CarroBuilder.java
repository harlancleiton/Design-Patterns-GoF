/*
 * @author Harlan Cleiton <harlancleiton@gmail.com>
 */

package builder;

import model.CarroModel;

public abstract class CarroBuilder {
    //Aqui definimos o passo a passo da montagem do produto
    public abstract void setarPlaca(String placa);
    public abstract CarroModel getCarroModel();
}
