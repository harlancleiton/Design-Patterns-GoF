package model;

public class CarroKaModel extends CarroModel{

    public CarroKaModel(String placa) {
        super(placa);
    }

    @Override
    public void exibeDetalhes(){
        System.out.println("Carro Fiesta: Marca: "+ this.getMarca()
        + " - Modelo: " + this.getModelo()
        + " - Placa: " + this.getPlaca());
    }
}