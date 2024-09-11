package ClasseAbstrata;

public class Onibus extends Veiculos {
	
	public Onibus (String placa, String modelo, String cor , int ano) {
		super(placa, modelo, cor , ano);
	}
	@Override
	public void acelerar() {
		System.out.println("o onibus esta acelerendo.");
	}
	@Override
	public void frear() {
		System.out.println("o onibus esta freando.");
	}
	@Override
	public void virar() {
		System.out.println("o onibus esta virando");
	}
	@Override
	public void ligar() {
		System.out.println("o onibus esta ligando.");
	}
	

}



