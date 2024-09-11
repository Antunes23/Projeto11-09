package Dia21_08;

public class Aviao2 {

	public static void main(String[] args) {


		Aviao aviao1 = new Aviao();
		Aviao aviao2 = new Aviao();
		Aviao aviao3 = new Aviao();
		Aviao aviao4 = new Aviao();



		//Atributos


		aviao1.setcor("Branco");
		aviao1.setasas(5);
		aviao1.setjanelas(16);
		aviao1.setrodas(5);


		aviao2.setcor("Preto");
		aviao2.setasas(5);
		aviao2.setjanelas(16);
		aviao2.setrodas(5);


		aviao3.setcor("Azul");
		aviao3.setasas(5);
		aviao3.setjanelas(16);
		aviao3.setrodas(5);


		aviao4.setcor("Amarelo");
		aviao4.setasas(5);
		aviao4.setjanelas(16);
		aviao4.setrodas(5);




		//Métodos



		aviao1.setaceleracao("Aceleracao");
		aviao1.setdesaceleracao("Desacerelacao");
		aviao1.setpousar("pousar");
		aviao1.setviraresquerda("VirarEsquerda");


		aviao2.setaceleracao ("Aceleração");
		aviao2.setdesaceleracao("Desaceleracao");
		aviao2.setpousar("Pousar");
		aviao2.setviraresquerda("Virar Esquerda");


		aviao3.setaceleracao("Aceleração");
		aviao3.setdesaceleracao("Desacerelação");
		aviao3.setpousar("Pousar");
		aviao3.setviraresquerda("Virar Esquerda");

		aviao4.setaceleracao("Aceleração");
		aviao4.setdesaceleracao("Desacerelação");
		aviao4.setpousar("Pousar");
		aviao4.setviraresquerda("Virar Esuqerda");




		System.out.println("------------- AVIÃO 1 ATRIBUTOS ---------------------");
		System.out.println(aviao1.getcor());
		System.out.println(aviao1.getasas());
		System.out.println(aviao1.getjanelas());
		System.out.println(aviao1.getrodas());




		System.out.println("--------------AVIÃO 1 MÉTODOS -----------------");
		System.out.println(aviao1.getaceleracao());
		System.out.println(aviao1.getdesaceleracao());
		System.out.println(aviao1.getpousar());
		System.out.println(aviao1.getviraresquerda());




		System.out.println("------------- AVIÃO 2 ATRIBUTOS ---------------------");
		System.out.println(aviao2.getcor());
		System.out.println(aviao2.getasas());
		System.out.println(aviao2.getjanelas());
		System.out.println(aviao2.getrodas());




		System.out.println("--------------AVIÃO 2 MÉTODOS -----------------");
		System.out.println(aviao2.getaceleracao());
		System.out.println(aviao2.getdesaceleracao());
		System.out.println(aviao2.getpousar());
		System.out.println(aviao2.getviraresquerda());




		System.out.println("------------- AVIÃO 3 ATRIBUTOS ---------------------");
		System.out.println(aviao3.getcor());
		System.out.println(aviao3.getasas());
		System.out.println(aviao3.getjanelas());
		System.out.println(aviao3.getrodas());




		System.out.println("--------------AVIÃO 3 MÉTODOS -----------------");
		System.out.println(aviao3.getaceleracao());
		System.out.println(aviao3.getdesaceleracao());
		System.out.println(aviao3.getpousar());
		System.out.println(aviao3.getviraresquerda());




		System.out.println("------------- AVIÃO 4 ATRIBUTOS ---------------------");
		System.out.println(aviao4.getcor());
		System.out.println(aviao4.getasas());
		System.out.println(aviao4.getjanelas());
		System.out.println(aviao4.getrodas());




		System.out.println("--------------AVIÃO 4 MÉTODOS -----------------");
		System.out.println(aviao4.getaceleracao());
		System.out.println(aviao4.getdesaceleracao());
		System.out.println(aviao4.getpousar());
		System.out.println(aviao4.getviraresquerda());




	}

}
