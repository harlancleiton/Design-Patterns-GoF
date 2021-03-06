package model;

//Produto abstrato
public abstract class CarroModel {
    private String modelo;
    private String marca;
    private String placa;
    
    public CarroModel (String placa){
        this.setModelo(modelo);
        this.setMarca(marca);
        this.setPlaca(placa);
    }

    public abstract void exibeDetalhes();
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}