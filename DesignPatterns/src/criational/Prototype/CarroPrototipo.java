package criational.Prototype;

public abstract class CarroPrototipo {
	//Propriedades da classe
	private double valorCompra = 0;
	//M�todos Get/Set da classe
	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	
	//M�todos Abstratos da Classe
	public abstract String exibirInfo();
	
	public abstract CarroPrototipo clonar();
	
}
