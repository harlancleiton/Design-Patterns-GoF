package model;

//Produto concreto
public class CarroPalioModel extends CarroModel{
    
    public CarroPalioModel(String placa) {
        super(placa);
        setMarca("Fiat");
        setModelo("Bravo");
    }

    @Override
    public void exibeDetalhes(){
        System.out.println("Carro Palio: Marca: "+ this.getMarca()
        + " - Modelo: " + this.getModelo()
        + " - Placa: " + this.getPlaca());
    }
    
}