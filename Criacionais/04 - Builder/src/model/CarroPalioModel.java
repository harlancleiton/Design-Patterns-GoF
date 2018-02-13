package model;

//Produto concreto
public class CarroPalioModel extends CarroModel{

    @Override
    public void exibeDetalhes(){
        System.out.println("Carro Palio: Placa: " + this.getPlaca());
    }
    
}