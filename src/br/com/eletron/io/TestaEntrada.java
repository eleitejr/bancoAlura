package br.com.eletron.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

class TestaEntrada {
	public static void main(String[] args) throws IOException {
		String entrada = JOptionPane.showInputDialog("Nome do arquivo de entrada: ");
		InputStream is = new FileInputStream(entrada);
		InputStreamReader isr = new InputStreamReader(is);
		try (BufferedReader br = new BufferedReader(isr)) {

			String s = br.readLine(); // primeira linha

			while (s != null) {
				System.out.println(s);
				s = br.readLine();
			}


			br.close();
		}

	}
}