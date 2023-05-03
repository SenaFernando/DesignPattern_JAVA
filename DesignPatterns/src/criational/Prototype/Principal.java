package criational.Prototype;

public class Principal {
	public static void main(String[]args) {
		Porsche911 prototipoPorsche911 = new Porsche911();
		
		CarroPrototipo objCarroNovo = prototipoPorsche911.clonar();
		objCarroNovo.setValorCompra (1500000);
		
		CarroPrototipo objCarroUsado = prototipoPorsche911.clonar();
		objCarroUsado.setValorCompra (300000);
		
		System.out.println(objCarroNovo.exibirInfo());
		System.out.println(objCarroUsado.exibirInfo());
	}

}
