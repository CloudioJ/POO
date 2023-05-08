/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamepoo;

import Pieces.*;
import java.awt.event.ActionEvent;
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

	private final Peças[] vetorPeças = new Peças [10];
	
	public void Shuffle() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Random randomNumber = new Random();
		for (int i = 0; i <10; i++) {
			int paraTrocar = randomNumber.nextInt(10);
			int temp = array[paraTrocar];
			array[paraTrocar] = array[i];
			array[i] = temp;
		}
		
		vetorPeças [array[0]] = bandeiraEnemy;
		vetorPeças [array[1]] = bomba1Enemy;
		vetorPeças [array[2]] = bomba2Enemy;
		vetorPeças [array[3]] = espiaoEnemy;
		vetorPeças [array[4]] = soldado1Enemy;
		vetorPeças [array[5]] = soldado2Enemy;
		vetorPeças [array[6]] = soldado3Enemy;
		vetorPeças [array[7]] = armeiro1Enemy;
		vetorPeças [array[8]] = armeiro2Enemy;
		vetorPeças [array[9]] = marechalEnemy;
	}
	
	public void RandomAIPlace(ActionEvent menuClick, JButton[] buttonArray) {
                this.Shuffle();
//		buttonArray[0]  = vetorPeças[0];
		buttonArray[0].setName(vetorPeças[0].getPatente());
		buttonArray[0].setIcon(new ImageIcon(vetorPeças[0].getIcon()));
		// Atribuir os atributos da peça pro butão
//		buttonArray[1]  = vetorPeças[1];
		buttonArray[1].setName(vetorPeças[1].getPatente());
		buttonArray[1].setIcon(new ImageIcon(vetorPeças[1].getIcon()));
		// Atribuir os atributos da peça pro butão
//		buttonArray[2]  = vetorPeças[0];
		buttonArray[2].setName(vetorPeças[2].getPatente());
		buttonArray[2].setIcon(new ImageIcon(vetorPeças[2].getIcon()));
		// Atribuir os atributos da peça pro butão
//		buttonArray[3]  = vetorPeças[0];
		buttonArray[3].setName(vetorPeças[3].getPatente());
		buttonArray[3].setIcon(new ImageIcon(vetorPeças[3].getIcon()));
		// Atribuir os atributos da peça pro butão
//		buttonArray[4]  = vetorPeças[0];
		buttonArray[4].setName(vetorPeças[4].getPatente());
		buttonArray[4].setIcon(new ImageIcon(vetorPeças[4].getIcon()));
		// Atribuir os atributos da peça pro butão
//		buttonArray[5]  = vetorPeças[0];
		buttonArray[5].setName(vetorPeças[5].getPatente());
		buttonArray[5].setIcon(new ImageIcon(vetorPeças[5].getIcon()));
		// Atribuir os atributos da peça pro butão
//		buttonArray[6]  = vetorPeças[0];
		buttonArray[6].setName(vetorPeças[6].getPatente());
		buttonArray[6].setIcon(new ImageIcon(vetorPeças[6].getIcon()));
		// Atribuir os atributos da peça pro butão
//		buttonArray[7]  = vetorPeças[0];
		buttonArray[7].setName(vetorPeças[7].getPatente());
		buttonArray[7].setIcon(new ImageIcon(vetorPeças[7].getIcon()));
		// Atribuir os atributos da peça pro butão
//		buttonArray[8]  = vetorPeças[0];
		buttonArray[8].setName(vetorPeças[8].getPatente());
		buttonArray[8].setIcon(new ImageIcon(vetorPeças[8].getIcon()));
		// Atribuir os atributos da peça pro butão
//		buttonArray[9]  = vetorPeças[0];
		buttonArray[9].setName(vetorPeças[9].getPatente());
		buttonArray[9].setIcon(new ImageIcon(vetorPeças[9].getIcon()));
	}
}