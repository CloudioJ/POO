/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamepoo;

import Pieces.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.util.Random;

//import java.awt.Component;
//import java.awt.event.ActionListener;
//import javax.swing.JComboBox;
//import javax.swing.JPanel;
/**
 *
 * @author Seaowol
 */
public class RandomPlacement {

    private final Peças bandeiraEnemy = new Bandeira();
    private final Peças bomba1Enemy = new Bomba();
    private final Peças bomba2Enemy = new Bomba();
    private final Peças espiaoEnemy = new Espião();
    private final Peças soldado1Enemy = new Soldado();
    private final Peças soldado2Enemy = new Soldado();
    private final Peças soldado3Enemy = new Soldado();
    private final Peças armeiro1Enemy = new Armeiro();
    private final Peças armeiro2Enemy = new Armeiro();
    private final Peças marechalEnemy = new Marechal();

    private final Peças[] vetorPeças = new Peças[10];

    public void Shuffle() {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Random randomNumber = new Random();
        for (int i = 0; i < 10; i++) {
            int paraTrocar = randomNumber.nextInt(10);
            int temp = array[paraTrocar];
            array[paraTrocar] = array[i];
            array[i] = temp;
        }

        vetorPeças[array[0]] = bandeiraEnemy;
        vetorPeças[array[1]] = bomba1Enemy;
        vetorPeças[array[2]] = bomba2Enemy;
        vetorPeças[array[3]] = espiaoEnemy;
        vetorPeças[array[4]] = soldado1Enemy;
        vetorPeças[array[5]] = soldado2Enemy;
        vetorPeças[array[6]] = soldado3Enemy;
        vetorPeças[array[7]] = armeiro1Enemy;
        vetorPeças[array[8]] = armeiro2Enemy;
        vetorPeças[array[9]] = marechalEnemy;
    }

    public void RandomAIPlace(ActionEvent menuClick, JButton[] buttonArray, boolean visible) {
        this.Shuffle();
        ImageIcon icon = new ImageIcon(new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB));
        if (visible == true) {
            for (int i = 0; i < 10; i++) {
                buttonArray[i].setName(vetorPeças[i].getPatente());
                buttonArray[i].setIcon(new ImageIcon(vetorPeças[i].getIcon()));
            }
        } else {
            for (int i = 0; i < 10; i++) {
                buttonArray[i].setName(vetorPeças[i].getPatente());
                buttonArray[i].setIcon(new ImageIcon(vetorPeças[i].getIcon()));
            }
        }
    }
}
