package criational.Prototype;

public abstract class CarroPrototipo {
	//Propriedades da classe
	private double valorCompra = 0;
	//Métodos Get/Set da classe
	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	
	//Métodos Abstratos da Classe
	public abstract String exibirInfo();
	
	public abstract CarroPrototipo clonar();
	
}
