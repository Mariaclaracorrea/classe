package ClasseAbstrata;

public class Moto extends Veiculos {

	public Moto (String placa, String modelo, String cor, int ano) {
			super(placa, modelo, cor, ano);
		}
		@Override
		public void acelerar() {
			System.out.println("a moto esta acelerendo.");
		}
		@Override
		public void frear() {
			System.out.println("a moto esta freando.");
		}
		@Override
		public void virar() {
			System.out.println("a moto esta virando");
		}
		@Override
		public void ligar() {
			System.out.println("a moto esta ligando.");
		}
		
	
	}
	

