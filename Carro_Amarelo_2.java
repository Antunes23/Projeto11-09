package Dia21_08;

public class Carro_Amarelo_2 {

	public static void main(String[] args) {

		Carro_Amarelo carro1 = new Carro_Amarelo();
		Carro_Amarelo carro2 = new Carro_Amarelo();
		Carro_Amarelo carro3 = new Carro_Amarelo();
		Carro_Amarelo carro4 = new Carro_Amarelo();



		//Atributos

		//Carro 1
		carro1.setmarca("Lamborghini");
		carro1.setmodelo("V12");
		carro1.setvalor(387858800);
		carro1.setcombustivel("flex");
		carro1.setcor("Cinza");


		//Carro 2
		carro2.setmarca("Jaguar");
		carro2.setmodelo("F-PACE");
		carro2.setvalor(61295000);
		carro2.setcombustivel("flex");
		carro2.setcor("Branco");


		//Carro 3
		carro3.setmarca("Rolls Royce");
		carro3.setmodelo("Spectre");
		carro3.setvalor(569000000);
		carro3.setcombustivel("flex");
		carro3.setcor("Branco");


		//Carro 4
		carro4.setmarca("Porsche");
		carro4.setmodelo("917 KH Coupé");
		carro4.setvalor(145710000);
		carro4.setcombustivel("flex");
		carro4.setcor("Preto");





		//Métodos


		//Carro1

		carro1.setaceleracao("Acelerar");
		carro1.setdesaceleracao("Freiar");
		carro1.setre("Dar ré");

		//Carro2

		carro2.setaceleracao("Acelerar");
		carro2.setdesaceleracao("Freiar");
		carro2.setre("Dar ré");

		//Carro3

		carro3.setaceleracao("Acelerar");
		carro3.setdesaceleracao("Freiar");
		carro3.setre("Dar ré");

		//Carro4

		carro4.setaceleracao("Acelerar");
		carro4.setdesaceleracao("Freiar");
		carro4.setre("Dar ré");



		// Apresentando os atributos na tela CARRO 1

		System.out.println("----------- CARRO 1 ATRIBUTOS -------------------");
		System.out.println(carro1.getmarca());
		System.out.println(carro1.getmodelo());
		System.out.println(carro1.getvalor());
		System.out.println(carro1.getcombustivel());
		System.out.println(carro1.getcor());


		// Apresentando os métodos na tela CARRO 1

		System.out.println("-------------- CARRO 1 MÉTODOS -------------------");
		System.out.println(carro1.getaceleracao());
		System.out.println(carro1.getdesacelerar());
		System.out.println(carro1.getre());







		// Apresentando os atributos na tela CARRO 2

		System.out.println("----------- CARRO 2 ATRIBUTOS  -------------------");
		System.out.println(carro2.getmarca());
		System.out.println(carro2.getmodelo());
		System.out.println(carro2.getvalor());
		System.out.println(carro2.getcombustivel());
		System.out.println(carro2.getcor());


		// Apresentando os métodos na tela CARRO 2

		System.out.println("-------------- CARRO 2 MÉTODOS -------------------");
		System.out.println(carro2.getaceleracao());
		System.out.println(carro2.getdesacelerar());
		System.out.println(carro2.getre());


		
		
		
		
		
		

		// Apresentando os atributos na tela CARRO 3

		System.out.println("----------- CARRO 3 ATRIBUTOS -------------------");
		System.out.println(carro3.getmarca());
		System.out.println(carro3.getmodelo());
		System.out.println(carro3.getvalor());
		System.out.println(carro3.getcombustivel());
		System.out.println(carro3.getcor());


		// Apresentando os métodos na tela CARRO 3

		System.out.println("-------------- CARRO 3 MÉTODOS -------------------");
		System.out.println(carro3.getaceleracao());
		System.out.println(carro3.getdesacelerar());
		System.out.println(carro3.getre());


		
		
		

		// Apresentando os atributos na tela CARRO 4

		System.out.println("----------- CARRO 4 ATRIBUTOS -------------------");
		System.out.println(carro4.getmarca());
		System.out.println(carro4.getmodelo());
		System.out.println(carro4.getvalor());
		System.out.println(carro4.getcombustivel());
		System.out.println(carro4.getcor());


		// Apresentando os métodos na tela CARRO 4

		System.out.println("-------------- CARRO 4 MÉTODO -------------------");
		System.out.println(carro4.getaceleracao());
		System.out.println(carro4.getdesacelerar());
		System.out.println(carro4.getre());
	}

}
