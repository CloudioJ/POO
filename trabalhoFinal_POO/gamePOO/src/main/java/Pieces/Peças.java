/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pieces;

/**
 *
 * @author claud
 */
public class Peças {
    private String patente;
    private int nivel;
    private boolean anda;
    
    public Peças(String patente, int nivel, boolean anda){
        this.patente = patente;
        this.nivel = nivel;
        this.anda = anda;
    }
    
    public String getPatente(){
        return this.patente;
    }
    public int getNivel(){
        return this.nivel;
    }

    public String getIcon(){
        return "F:\\POO Claudio 100%\\POO-main\\trabalhoFinal_POO\\gamePOO\\src\\main\\resources\\" + getPatente() + ".png";
    }
    
    public String getIconEnemy(){
        return "F:\\POO Claudio 100%\\POO-main\\trabalhoFinal_POO\\gamePOO\\src\\main\\resources\\circulo.png";
    }
    
    public int combat(Peças peça2){
        if (getNivel() >= peça2.getNivel()){
            return getNivel();
        }
        return peça2.getNivel();
    }
}
