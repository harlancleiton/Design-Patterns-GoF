package model;

//Produto concreto
public class PalioModel extends CarroModel{
    
    public PalioModel(String modelo, String marca, String placa) {
        super(modelo, marca, placa);
    }

    @Override
    public void exibeDetalhes(){
        System.out.println("Carro Palio: Marca: "+ this.getMarca()
        + " - Modelo: " + this.getModelo()
        + " - Placa: " + this.getPlaca());
    }
    
}
