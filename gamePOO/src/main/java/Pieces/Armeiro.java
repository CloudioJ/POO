/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pieces;

/**
 *
 * @author claud
 */
public class Armeiro extends Peças{
    public Armeiro(){
        super("Armeiro", 3, true);
    }
    
    @Override
    public int combat(Peças peça2){
        if(getNivel() >= peça2.getNivel() || peça2.getNivel() == 11){
            return getNivel();
        }
        return peça2.getNivel();
    }
}
