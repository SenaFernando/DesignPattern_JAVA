package criational.factoryMethod;

public class Honda implements Fabrica {
	public Carro fabricarCarro() {
		return new Civic();
	}

}
