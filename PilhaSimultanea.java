
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
public class PilhaSimultanea {
    
    private int dados[];
    private int tamanho;
    private int fim;
    private int inicio;
    
    public PilhaSimultanea(int capacidade){
        dados = new int[capacidade];
        tamanho = 0;
        inicio = 0;
        fim = capacidade-1;
    }
    
    public void adiciona(int e){
        if(tamanho == dados.length){
            JOptionPane.showMessageDialog(null, "A Pilha está cheia", "ERRO!!!", JOptionPane.ERROR_MESSAGE);
        } else {
            if(tamanho % 2 == 0){
                dados[inicio] = e;
                inicio++;
            } else{
                dados[fim] = e;
                fim--;
            }
                
            tamanho++;
        }
    }
    
    public void percorre(){
        String saida = "";
        if(tamanho == 0){
            JOptionPane.showMessageDialog(null, "A Pilha está vazia", "ERRO!!!", JOptionPane.ERROR_MESSAGE);
        } else {
            for(int i = 0; i<6; i++)
                
                saida = saida + dados[i] + "\n";
            JOptionPane.showMessageDialog(null, saida, "ITENS DA PILHA", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
