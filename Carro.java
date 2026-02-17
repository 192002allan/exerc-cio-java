package aualafernanda1;

public class Carro {

	
	//Atributos
	String nome;
	String marca;
	int ano;
	int vel;
	
	//Metodos
	void acelerar(int aceleraçao) {
		vel+=aceleraçao;
		
	}
	void freiar (int reduzir ) {
		vel-=reduzir;
		
	}
	void buzinar () {
		System.out.println("biiiiiiiiiiii");
	}
	
}
