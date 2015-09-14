/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;

/**
 *
 * @author paulocampanha
 */
public class Principal {
    
    public static void main(String args[]){
        
        Pilha pilha = new Pilha(4);
        
        int opt = 0;
        
        while(opt!=9){
            opt = Integer.parseInt(JOptionPane.showInputDialog("          MENU DA FILA\n\n"
                    + " 1 - Adiciona item na Fila\n"
                    + " 2 - Remove item da Fila\n"
                    + " 3 - Percorre a fila\n"
                    + " 9 - Sair\n"));
            
            switch(opt){
                case 1:
                    pilha.adiciona(Integer.parseInt(JOptionPane.showInputDialog("Digite um número para a pilha")));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Número removido: " + pilha.remove(), "REMOVER DA PILHA", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    pilha.percorre();
                    break;
                case 9:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida", "MENU DA PILHA", JOptionPane.ERROR_MESSAGE);
                    
            }
        }
    }
    
}
