package model;

//Produto concreto
public class CarroFiestaModel extends CarroModel{
    
    @Override
    public void exibeDetalhes(){
        System.out.println("Carro Fiesta: Placa: " + this.getPlaca());
    }
}