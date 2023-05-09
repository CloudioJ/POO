/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamepoo;

import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 *
 * @author claud
 */
public class ButtManager {
	private final Combate combate = new Combate();
	private JButton botaoAnterior = new JButton();
	private boolean dica = false;
	
//	public void addAction(JPanel panel) {
//		Component[] components = panel.getComponents();
//		for (Component component : components) {
//			if (component instanceof JButton button) {
//				button.addActionListener((ActionEvent e) -> {
//					
//					if (dica){
//						checkForBomba()
//					}
//					if (!combate.getSecondClickTest()) {
//						if (button.getIcon() != null && !button.getName().equals("Bomba") && !button.getName().equals("Bandeira")) {
//							botaoAnterior = button;
//							combate.setSecondClickTest(true);
//						}
//					} else {
//						if (((button.getBounds().x == botaoAnterior.getBounds().x - 110 || botaoAnterior.getBounds().x + 110 == button.getBounds().x) && (button.getBounds().y == botaoAnterior.getBounds().y))
//								|| ((button.getBounds().y == botaoAnterior.getBounds().y + 104 || button.getBounds().y == botaoAnterior.getBounds().y - 104) && (button.getBounds().x == botaoAnterior.getBounds().x))) {
//							if (button.getIcon() == null && !botaoAnterior.getName().equals("Bomba") && !botaoAnterior.getName().equals("Bandeira")) {
//								swapButtons(button, botaoAnterior);
//								combate.setSecondClickTest(false);
//							} else if (button.getBackground().getRGB() != botaoAnterior.getBackground().getRGB()){
//								combate.combate(botaoAnterior, button);
//								combate.setSecondClickTest(false);
//							}
//						} else {
//							combate.setSecondClickTest(false);
//						}
//						combate.setSecondClickTest(false);
//					}
//				});
//			}
//		}
//	}
	
	public void swapButtons(JButton botao1, JButton botao2) {
		botao1.setIcon(botao2.getIcon());
		botao1.setName(botao2.getName());
		botao1.setBackground(botao2.getBackground());
		combate.clearButton(botao2);
	}
	
	public void removeItens(JComboBox fonte, JPanel panel) {
		Component[] components = panel.getComponents();
		for (Component component : components) {
			if (component instanceof JComboBox comboBox) {
				if (!comboBox.equals(fonte)) {
					comboBox.removeItem(fonte.getSelectedItem().toString());
				}
			}
		}
	}
	
	public void adicionarItens(JComboBox fonte, JPanel panel) {
		Component[] components = fonte.getComponents();
		for (Component component : components) {
			if (component instanceof JComboBox comboBox) {
				if (!comboBox.equals(fonte)) {
					comboBox.addItem(fonte.getSelectedItem().toString());
				}
			}
		}
	}
	
	public void checkForBomba(JButton[][] buttonMatrix, JButton button){
		int x = 0, contador = 0;
		switch(button.getBounds().x){
			case 8:
				x = 0;
				break;
			case 118:
				x = 1;
				break;
			case 228:
				x = 2;
				break;
			case 338:
				x = 3;
				break;
			case 448:
				x = 4;
				break;
		}
		
		for (int i = 0; i < 5; i++){
			if(buttonMatrix[x][i].getName().equals("Bomba") && buttonMatrix[x][i].getBackground().getRGB() != -16737793){
				contador++;
			}
		}
		
		if (contador > 0){
			System.out.println("Existem " + contador + " bombas nesta coluna.");
		} else {
			System.out.println("Não existem bombas nesta coluna.");
		}
	}
}
