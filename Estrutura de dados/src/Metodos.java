import javax.swing.JOptionPane;

public class Metodos {	
	
	
	private Dados dados[] = new Dados[4];	
	private static int topo;
	


	public void Pilha (int capacidade){		
		dados = new Dados[capacidade];        
        topo = -1;
    }
	  
    public boolean cheia(){
        return topo == dados.length-1;
    }
   
    
    public boolean vazia(){
        return topo == -1;
    }
    
    public void  construtor(){
    	 for (int i=0;i<4;i++){
         	dados[i] = new Dados();
         }
    }
    
    public void empilha (int e){    	 
    	construtor();
    	if (cheia()){
             System.out.println("ERRO! Pilha Cheia");
        } else {
        	e = Integer.parseInt(JOptionPane.showInputDialog("Digite"
        	+ " um valor inteiro para ser empilhado"));
        	topo++;
        	System.out.println(topo);
        	dados[topo].pilha1 = e;
        	dados[topo].pilha2 = dados[topo].pilha1;    
        }
  }
        
    
   
    public int desempilha(){
        int resp = -1;
        if (vazia()){
            System.out.println("ERRO! Pilha Vazia");
        } else
        {
            resp = dados[topo].pilha1;
            int resp2 = dados[topo].pilha2;
            topo--;
        }
        return resp;
    }


    public String mostra(){
        String resp = "Elementos da Pilha nº1\n";
        String resp2 = "Elementos da Pilha nº2\n";
        for (int i=topo;i>=0;i--){
            resp = resp + "\n" + dados[i].pilha1;
            resp2 = resp2 + "\n" + dados[i].pilha2;
        }
        System.out.println(resp + "\n\n" + resp2);
        return resp;
    }
    
    
    public int obtemTopo(){
        if(vazia()){
            System.out.println("ERRO! Pilha Vazia");
            return -1;
        }
        return dados[topo].pilha1;
    }
    
}