/*
 * Especifica os tipos de objetos a serem criados usando uma instância protótipa
 * e cria novos objetos pela cópia desde protótipo
 * Fazer clones de objetos
 */
package pkg05.prototype;

import pkg05.prototype.prototype.Partitura;

/*
 * @author Harlan Cleiton <harlancleiton@gmail.com>
 */
public class Prototype {

    public static void main(String[] args) {
        //Carregar notas musicais
        Partitura.carregarNotas();
        //Usando as notas
        Partitura.getNota("Do").imprimirNota();
        Partitura.getNota("Fa").imprimirNota();
        Partitura.getNota("La").imprimirNota();
        Partitura.getNota("Mi").imprimirNota();
        Partitura.getNota("Re").imprimirNota();
        Partitura.getNota("Si").imprimirNota();
        Partitura.getNota("Sol").imprimirNota();
        //De novo (clone dessa vez)
        Partitura.getNota("Do").imprimirNota();
        Partitura.getNota("Fa").imprimirNota();
        Partitura.getNota("La").imprimirNota();
        Partitura.getNota("Mi").imprimirNota();
        Partitura.getNota("Re").imprimirNota();
        Partitura.getNota("Si").imprimirNota();
        Partitura.getNota("Sol").imprimirNota();
        
    }
    
}
