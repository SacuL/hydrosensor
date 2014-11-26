package br.ufjf.hydronode.live.gui;

import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

public class GUIGrafico extends Window {

	private static final long serialVersionUID = -586007363669255483L;

	private Textbox textoTeste;

	public void onCreate() {
		textoTeste = (Textbox) getFellow("textoTeste");
		textoTeste.setText("Olá mundo!");
	}

}
