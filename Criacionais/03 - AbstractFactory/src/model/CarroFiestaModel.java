package model;

//Produto concreto
public class CarroFiestaModel extends CarroModel{
    
    public CarroFiestaModel(String placa) {
        super(placa);
        setMarca("Ford");
        setModelo("Fiesta");
    }
    
    @Override
    public void exibeDetalhes(){
        System.out.println("Carro Fiesta: Marca: "+ this.getMarca()
        + " - Modelo: " + this.getModelo()
        + " - Placa: " + this.getPlaca());
    }
}