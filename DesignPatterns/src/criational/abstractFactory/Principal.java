package criational.abstractFactory;

public class Principal {
	public static void main(String[]arg) {
		//Declaração de variáveis
		Fabrica objFabrica = null;
		CarroSedan objCarroSedan = null;
		CarroHatch objCarroHatch= null;
		
		//Processamento
		objFabrica = new Toyota();
		objCarroSedan = objFabrica.fabricarSedan();
		objCarroHatch = objFabrica.fabricarHatch();
		objCarroSedan.exibirInfo();
		objCarroHatch.exibirInfo();
		
		objFabrica = new Ford();
		objCarroSedan = objFabrica.fabricarSedan();
		objCarroHatch = objFabrica.fabricarHatch();
		objCarroSedan.exibirInfo();
		objCarroHatch.exibirInfo();
	}

}
