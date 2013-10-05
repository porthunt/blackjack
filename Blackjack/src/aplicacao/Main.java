package aplicacao;

import javax.swing.*;

import paineis.*;

import frames.Menu;


public class Main {

	public static void main(String[] args) {
		Menu f = new Menu();
		String nativeLF = UIManager.getSystemLookAndFeelClassName();
		try {
			UIManager.setLookAndFeel(nativeLF);
		} catch (InstantiationException e) {
		} catch (ClassNotFoundException e) {
		} catch (UnsupportedLookAndFeelException e) {
		} catch (IllegalAccessException e) {
		}
	}
}
