package produtos;

public class Produtos {

	protected String marca;
	protected double precocusto;
	
	public Produtos(String marca, double precocusto)
	{
		this.marca = marca ;
		this.precocusto = precocusto ;
	}	
	
	public double precoFinal(){
		return precocusto;
	} 
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double  getPrecocusto() {
		return precocusto;
	}
	public void setPrecocusto(double precocusto) {
		this.precocusto = precocusto;
	}

	public String toString()
	{
			return "";
	}
	
}


