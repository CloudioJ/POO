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
	
	public void addAction(JPanel panel) {
		Component[] components = panel.getComponents();
		for (Component component : components) {
			if (component instanceof JButton button) {
				button.addActionListener((ActionEvent e) -> {
					if (!combate.getSecondClickTest()) {
						if (button.getIcon() != null && !button.getName().equals("Bomba") && !button.getName().equals("Bandeira")) {
							botaoAnterior = button;
							combate.setSecondClickTest(true);
						}
					} else {
						if (((button.getBounds().x == botaoAnterior.getBounds().x - 110 || botaoAnterior.getBounds().x + 110 == button.getBounds().x) && (button.getBounds().y == botaoAnterior.getBounds().y))
								|| ((button.getBounds().y == botaoAnterior.getBounds().y + 104 || button.getBounds().y == botaoAnterior.getBounds().y - 104) && (button.getBounds().x == botaoAnterior.getBounds().x))) {
							if (button.getIcon() == null && !botaoAnterior.getName().equals("Bomba") && !botaoAnterior.getName().equals("Bandeira")) {
								swapButtons(button, botaoAnterior);
								combate.setSecondClickTest(false);
							} else if (button.getBackground().getRGB() != botaoAnterior.getBackground().getRGB()){
								combate.combate(botaoAnterior, button);
								combate.setSecondClickTest(false);
							}
						} else {
							combate.setSecondClickTest(false);
						}
						combate.setSecondClickTest(false);
					}
				});
			}
		}
	}
	
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
}
