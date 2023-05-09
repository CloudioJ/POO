/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamepoo;

import Pieces.*;
import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author claud
 */
public class Combate {

	private final Peças bandeira = new Bandeira();
	private final Peças bomba1 = new Bomba();
	private final Peças espiao = new Espião();
	private final Peças soldado1 = new Soldado();
	private final Peças armeiro1 = new Armeiro();
	private final Peças marechal = new Marechal();
	private final int Blue = -16737793;
	private final int Red = -39322;
	private boolean secondClickTest;

	public boolean getSecondClickTest() {
		return secondClickTest;
	}

	public void setSecondClickTest(boolean argument) {
		this.secondClickTest = argument;
	}

	public void combate(JButton botao1, JButton botao2) {
		int nivel1 = getNivelDaPeça(botao1.getName());
		int nivel2 = getNivelDaPeça(botao2.getName());

		if (nivel2 == 0 && botao1.getBackground().getRGB() == Blue) {
			TabuleiroSet ts = new TabuleiroSet();
			Vencedor vencedor = new Vencedor();
			ts.dispose();
			vencedor.setVisible(true);
			vencedor.setarNomeVencedor(true);
		} else if (nivel2 == 0 && botao1.getBackground().getRGB() == Red) {
			TabuleiroSet ts = new TabuleiroSet();
			Vencedor vencedor = new Vencedor();
			ts.dispose();
			vencedor.setVisible(true);
			vencedor.setarNomeVencedor(false);
		} else if (nivel1 > nivel2) {
			clearButton(botao2);
		} else if (nivel1 == 3 && nivel2 == 11) {
			clearButton(botao2);
		} else if (nivel1 == 1 && nivel2 == 10) {
			clearButton(botao2);
		} else if (nivel1 == nivel2) {
			clearButton(botao1);
			clearButton(botao2);
		} else {
			clearButton(botao1);
		}
	}

	public int getNivelDaPeça(String nomeDaPeça) {
		int nivel = 0;

		switch (nomeDaPeça) {
			case "Armeiro" ->
				nivel = armeiro1.getNivel();
			case "Soldado" ->
				nivel = soldado1.getNivel();
			case "Espião" ->
				nivel = espiao.getNivel();
			case "Marechal" ->
				nivel = marechal.getNivel();
			case "Bomba" ->
				nivel = bomba1.getNivel();
			case "Bandeira" ->
				nivel = bandeira.getNivel();
		}
		return nivel;
	}

	public void clearButton(JButton botao) {
		botao.setIcon(null);
		botao.setName(null);
		botao.setBackground(null);
	}
}
