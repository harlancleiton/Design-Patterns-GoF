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
public class TomadaBrasileira extends TomadaModel<PlugBrasileiro> {
    
    public String conecta(PlugBrasileiro plugBrasileiro){
        return plugBrasileiro.obtemEletricidade() + getNomeRede();
    }
    
    public String getNomeRede(){
        return "tomada brasileira.";
    }
}
