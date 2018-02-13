package model;

public class CarroBravoModel extends CarroModel{

    public CarroBravoModel(String placa) {
        super(placa);
        setMarca("Fiat");
        setModelo("Bravo");
    }

    @Override
    public void exibeDetalhes(){
        System.out.println("Carro Fiesta: Marca: "+ this.getMarca()
        + " - Modelo: " + this.getModelo()
        + " - Placa: " + this.getPlaca());
    }
}