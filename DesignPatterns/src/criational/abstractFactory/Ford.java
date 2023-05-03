package criational.abstractFactory;

public class Ford implements Fabrica {
	public CarroSedan fabricarSedan() {
		return new Fusion();
	}
 public CarroHatch fabricarHatch() {
	 return new Focus();
 }
}
