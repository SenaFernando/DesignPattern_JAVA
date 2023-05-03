package criational.Prototype;

public class Porsche911 extends CarroPrototipo{
	// M�todos Construtores da Classe
	public Porsche911(Porsche911 objPorsche911) {
		setValorCompra(objPorsche911.getValorCompra());
	}
	// M�todos Sobrescritos da Classe
	
	public Porsche911() {
	
}
	public String exibirInfo() {
		return "Fabricante: Porsche\n" +
			   "Modelo: 911" +
			   "Valor: R$ " + getValorCompra() + "\n";
	}
	public CarroPrototipo clonar() {
		return new Porsche911(this);
	}

}
