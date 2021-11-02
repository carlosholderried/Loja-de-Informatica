package produtos;

public class Notebooks extends Produtos {

	protected double memoria; 
	protected double tela;
	
	
	public Notebooks(String marca, double precocusto) {
		super(marca, precocusto);
		// TODO Auto-generated constructor stub
	}


	
	
	public double getMemoria() {
		return memoria;
	}
	public void setMemoria(double memoria2) {
		this.memoria = memoria2;
	}
	
	
	public double  getTela() {
		return tela;
	}
	public void setTela(double tela2) {
		this.tela = tela2;
	} 
	
	@Override
	public double precoFinal(){
		return 1.2 * precocusto;
	} 
	
	
	@Override
	public String toString()
	{
		return super.toString() + " \n Notebook " + memoria + " de ram e " + tela + " polegadas";							
	}	
    
	
	
}
