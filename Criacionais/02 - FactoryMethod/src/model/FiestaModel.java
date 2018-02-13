package model;

//Produto concreto
public class FiestaModel extends CarroModel{
    
    public FiestaModel(String modelo, String marca, String placa) {
        super(modelo, marca, placa);
    }
    
    @Override
    public void exibeDetalhes(){
        System.out.println("Carro Fiesta: Marca: "+ this.getMarca()
        + " - Modelo: " + this.getModelo()
        + " - Placa: " + this.getPlaca());
    }
}
