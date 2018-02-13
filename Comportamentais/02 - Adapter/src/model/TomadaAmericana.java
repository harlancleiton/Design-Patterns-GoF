/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Harlan
 */
public class TomadaAmericana extends TomadaModel<PlugAmericano> {
    
    public String conecta(PlugAmericano plugAmericano){
        return plugAmericano.obtemEletricidade() + getNomeRede();
    }
    
    public String getNomeRede(){
        return "tomada americana.";
    }
    
}
