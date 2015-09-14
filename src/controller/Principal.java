package controller;

import javax.swing.JOptionPane;

public class Principal {
	static String a;
	public static void main(String[] args) {

		a = JOptionPane.showInputDialog(null, "Insira uma palavra.");
		String mostra = "Menu Inicial:"
				+ "\n1: FILA."
				+ "\n2: Pilha.";
		String b = JOptionPane.showInputDialog(mostra);
		switch (b){
			case "1" :
				fila(a.length());
				break;
			case "2":
				pilha();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Insira um valor válido.");
				break;
		}
		
		


	}
	
	public static void pilha(){
		InverterOrdemPalavraPilha p = new InverterOrdemPalavraPilha();
		for (int i=0;i<a.length();i++){
			p.empilhar(a.charAt(i));
		}
		while(p.vazio()==false){
			System.out.println(p.desempilhar());
		}
	}
	
	public static void fila(int capacidade){
		InverterOrdemPalavraFila f = new InverterOrdemPalavraFila(capacidade);
		
		for (int i=(a.length()-1);i>-1;i--){
			f.adiciona(Character.toString(a.charAt(i)));
		}
		System.out.println(f.percorre());
	}

}

