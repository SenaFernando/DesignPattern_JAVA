package criational.abstractFactory;

public class Toyota implements Fabrica {
	public CarroSedan fabricarSedan() {
		return new Corolla();
	}
	
	public CarroHatch fabricarHatch() {
		return new Etios();
	}

}
