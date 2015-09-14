
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
public class Pilha {
    
    private int dados[];
    private int tamanho;
    
    public Pilha(int capacidade){
        dados = new int[capacidade];
        tamanho = 0;
    }
    
    public void adiciona(int e){
        if(tamanho == dados.length){
            JOptionPane.showMessageDialog(null, "A Pilha está cheia", "ERRO!!!", JOptionPane.ERROR_MESSAGE);
        } else {
            dados[tamanho] = e;
            tamanho++;
        }
    }
    
    public int remove(){
        int r = 0;
        if(tamanho == 0){
            JOptionPane.showMessageDialog(null, "A Pilha está vazia", "ERRO!!!", JOptionPane.ERROR_MESSAGE);
        } else {
            r = dados[tamanho-1];
            tamanho--;
        }
        return r;
    }
    
    public void percorre(){
        String saida = "";
        if(tamanho == 0){
            JOptionPane.showMessageDialog(null, "A Pilha está vazia", "ERRO!!!", JOptionPane.ERROR_MESSAGE);
        } else {
            for(int i = 0; i<tamanho; i++)
                saida = saida + dados[i] + "\n";
            JOptionPane.showMessageDialog(null, saida, "ITENS DA PILHA", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
