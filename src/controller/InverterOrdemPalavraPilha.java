package controller;;

public class InverterOrdemPalavraPilha {
	public Object[] pilha;
	public int posicao;
	
	public InverterOrdemPalavraPilha(){
		this.posicao = -1;
		this.pilha = new Object[20];
	}
	
	public boolean vazio() {
		if(this.posicao == -1){
			return true;
		}
		else{
			return false;
		}
	}
	
	public int tamanho(){
		if(this.vazio()){
			return 0;			
		}
		else{
		return this.posicao+1;
		}
	}
		
		public Object ultimoValor(){
			if(this.vazio()){
				return null;
			}
			else{
				return this.pilha[this.posicao];
			}
	}
		
		public Object desempilhar(){
			if(vazio()){
				return null;
			}
			return this.pilha[this.posicao--];
		}
		
		public void empilhar(Object valor){
			if(this.posicao<this.pilha.length-1){
				this.pilha[++posicao]=valor;
			}
		}
}
