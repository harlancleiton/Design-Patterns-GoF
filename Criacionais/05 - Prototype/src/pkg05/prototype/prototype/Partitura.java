/*
 * @author Harlan Cleiton <harlancleiton@gmail.com>
 */

package pkg05.prototype.prototype;

import java.util.Hashtable;
import pkg05.prototype.model.*;

public class Partitura {
    private static Hashtable<String, NotaMusical> notaMap = new Hashtable<String, NotaMusical>();
    
    public static void carregarNotas(){
        //Adicionando todas as notas à estrutura hashtable
        Do notaDo = new Do();
        notaMap.put("Do", notaDo);
        
        Fa notaFa = new Fa();
        notaMap.put("Fa", notaFa);
        
        La notaLa = new La();
        notaMap.put("La", notaLa);
        
        Mi notaMi = new Mi();
        notaMap.put("Mi", notaMi);
        
        Re notaRe = new Re();
        notaMap.put("Re", notaRe);
        
        Sol notaSol = new Sol();
        notaMap.put("Sol", notaSol);
        
        Si notaSi = new Si();
        notaMap.put("Si", notaSi);
    }
    
    public static NotaMusical getNota(String nome){
        NotaMusical notaMusical = notaMap.get(nome);
        return notaMusical.clone();
    }
}
