/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pieces;

/**
 *
 * @author claud
 */
public class Espião extends Peças{
    public Espião(){
        super("Espião",1, true);
    }
    
    @Override
    public int combat(Peças peça2){
        if(peça2.getNivel() == 10){
            return getNivel();
        }
        
        return peça2.getNivel();
    }
}
