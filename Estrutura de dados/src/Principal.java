/*3) Implemente em JAVA uma nova estrutura de dados do tipo PILHA que guarde, 
 * simultaneamente na mesma estrutura de dados, 
 * duas pilhas sem aumentar a quantidade de vetores.*/

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {	        
	   
		Metodos metodos = new Metodos();
		int z=0;
		int DigitoMenu=0;
		
		
		DigitoMenu = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para adicionar dados na Pilha\n"+
				"Digite 2 para remover um item da Pilha\n"+
				"Digite 3 para mostrar os elementos das Pilhas\n"+
				"Digite 4 para obter o topo das Pilhas\n" +
				"Digite 9 para fechar a aplicação"));
			
		
		while (DigitoMenu != 9){
			switch(DigitoMenu) {		
			
				case 1:					
					metodos.empilha(z);
					break;
				case 2:
					metodos.desempilha();
					break;
				case 3:
					metodos.mostra(); 
					break;
				case 4:
					metodos.obtemTopo();
					break;
				case 9:
					System.exit(0);	
					break;
				default:
					JOptionPane.showMessageDialog(null,"Digite uma das opções  que estão descritas");
			}	
		}

	}
}
