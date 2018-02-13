/*
 * @author Harlan Cleiton <harlancleiton@gmail.com>
 */

package pkg01.model;

import bridge.Implementador;

public abstract class Professor {
    protected Implementador implementador;
    protected Professor(Implementador implementador){
        this.implementador=implementador;
    }
    public abstract void op();
}
