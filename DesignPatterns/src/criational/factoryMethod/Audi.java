package criational.factoryMethod;

public class Audi implements Fabrica {
	public Carro fabricarCarro() {
		return new A4();
	}

}
