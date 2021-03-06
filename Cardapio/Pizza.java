package Cardapio;

public class Pizza extends Cardapio {
	
	private double valorSabor;
	private double valorBorda;
	public double valorFinal;
	
	//METODO CONST. SUBCLASSE PIZZASALGADA
	public Pizza(int idSabor) {
		super(idSabor);
	}
	
	//METODOS MENU -> DEFINIΓΓES
	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
		
	}
	
	public double getValorFinal() {
		return valorFinal;
	}
	
	public double getValorSabor() {
		return valorSabor;
	}

	public void setValorSabor(double valorSabor) {
		this.valorSabor = valorSabor;
	}

	public double getValorBorda() {
		return valorBorda;
	}

	public void setValorBorda(double valorBorda) {
		this.valorBorda = valorBorda;
	}

	public void billingPizza(int idSabor) {
		
		this.obterIdSabor(idSabor);		
		
		for (int i = 0; i < idSabor; i++) {
			
			int addValor = 25+(5*i);
			this.valorSabor = addValor;
			setValorSabor(this.valorSabor);
				
		}
		System.out.println("Valor da Pizza R$: "+ getValorSabor());
		
	}
	
	public void menuPizza () {
		System.out.println("π|-------------[Menu Pizzas]--------------π|");
		System.out.println("π|-----Escolha um sabor para a pizza------π|");
		System.out.println("π|-[1]Mozzarella-----------------R$ 25,00-π|");
		System.out.println("π|-[2]Margherita-----------------R$ 30,00-π|");
		System.out.println("π|-[3]Peperoni-------------------R$ 35,00-π|");
		System.out.println("π|-[4]Havaiana-------------------R$ 40,00-π|");
		System.out.println("π|----------------------------------------π|");
		
	}
	
	public void menuBorda () {
			
		System.out.println("π|---------[Menu Bordas]----------π|");
		System.out.println("π|-Escolha um sabor para a borda--π|");
		System.out.println("π|-[1]Sem Borda-------- +R$ 00,00-π|");
		System.out.println("π|-[2]Catupiry--------- +R$ 05,00-π|");
		System.out.println("π|-[3]Cheddar---------- +R$ 10,00-π|");
		System.out.println("π|--------------------------------π|");
			
	}
	
	public void billingBorda(int idBorda) {
		
		this.obterIdBorda(idBorda);		
		
		for (int i = 0; i < idBorda; i++) {
			
			int addValor = (5*i);
			this.valorBorda = addValor;
			setValorBorda(this.valorBorda);
				
		}
		System.out.println("Valor da Borda +R$: "+getValorBorda());
		
	}	
	
	
	
	public void obterIdSabor(int idSabor) {
		this.setIdSabor(idSabor);
	}
	
	
	public void obterIdBorda (int idBorda) {
		this.setIdBorda(idBorda);
		
	}
	
}