package singleton.Singleton;

public class CachorroSingleton {
    /*
     * 1º Passo declarar o construtor como privado
     * 2º Passo criar uma variável privada e estática do tipo da classe
     * 3º Passo criar um método estático que retorne o tipo da classe
     * O objetivo é instanciar o objeto apenas uma vez e garanti um ponto de acesso global
    */
    
    private static CachorroSingleton cachorroSingleton;
    
    private CachorroSingleton(){}
    
    public static CachorroSingleton getInstance(){
        if(cachorroSingleton==null)
            cachorroSingleton = new CachorroSingleton();
        return cachorroSingleton;
    }
    
    public void andar(){
        System.out.println("cachorro.andar()");
    }
    
}
