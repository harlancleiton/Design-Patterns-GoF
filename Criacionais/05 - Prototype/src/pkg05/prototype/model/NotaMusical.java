/*
 * @author Harlan Cleiton <harlancleiton@gmail.com>
 */

package pkg05.prototype.model;

public abstract class NotaMusical implements Cloneable{
    
    @Override
    public NotaMusical clone(){
        Object clone = null;
        try{
            clone = super.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (NotaMusical) clone;
    }
    
    public abstract void imprimirNota();
}
