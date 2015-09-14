
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulocampanha
 */
public class Principal {
    
    public static void main(String args[]){
        PilhaSimultanea pilhaSimultanea = new PilhaSimultanea(6);

        int opt = 0;

        while(opt != 9){
            opt = Integer.parseInt(JOptionPane.showInputDialog("          MENU DA FILA\n\n"
                    + " 1 - Adiciona item na Fila\n"
                    + " 2 - Percorre a fila\n"
                    + " 9 - Sair\n"));

            switch(opt){
                case 1:
                    pilhaSimultanea.adiciona(Integer.parseInt(JOptionPane.showInputDialog("Digite um número para a pilha")));
                    break;
                case 2:
                    pilhaSimultanea.percorre();
                    break;
                case 9:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida", "MENU DA PILHA", JOptionPane.ERROR_MESSAGE);

            }
        }
    }
}
