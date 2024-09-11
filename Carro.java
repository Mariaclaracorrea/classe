package ClasseAbstrata;

public class Carro extends Veiculos {
	
	public Carro (String placa, String modelo, String cor, int ano) {
		super(placa, modelo, cor, ano);
	}
	@Override
	public void acelerar() {
		System.out.println("o carro esta acelerendo.");
	}
	@Override
	public void frear() {
		System.out.println("o carro esta freando.");
	}
	@Override
	public void virar() {
		System.out.println("o carro esta virando");
	}
	@Override
	public void ligar() {
		System.out.println("o carro esta ligando.");
	}
	

}
