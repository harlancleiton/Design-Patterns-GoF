/*
 * @author Harlan Cleiton <harlancleiton@gmail.com>
 */

package builder;

public class Montadora {
    public CarroBuilder montarCarroBuilder(CarroBuilder carroBuilder, String placa){
        carroBuilder.setarPlaca(placa);
        
        return carroBuilder;
    }
}
